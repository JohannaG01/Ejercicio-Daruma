import Model.{Archibaldo, Armadura, Bendicion, Caterina, Rolando, ViejoSabio}
import org.scalatest.funsuite.AnyFunSuite

class EncuentroCapoTest extends AnyFunSuite {
  val rolando = new Rolando
  val caterina = new Caterina

  test("Archibaldo vs Rolando") {
    val rolandoDead = new Rolando
    val archibaldo = new Archibaldo
    archibaldo.encontrado(rolandoDead)
    assert(rolandoDead.vivo === false)
    assert(archibaldo.vivo === true)
  }

  test("Rolando encontra a Caterina"){
    caterina.encontrado(rolando)
    assert(rolando.getValorHechiceria() === 1)
    assert(rolando.getValorLucha() === 6)
    assert(rolando.artefactos.length === 1)
    assert(caterina.artefactos.isEmpty)
  }

  test("Rolando encontra armadura bendecida"){
    new Armadura(refuerzo=Some(new Bendicion)).encontrado(rolando)
    assert(rolando.artefactos.length === 2)
    assert(rolando.getValorHechiceria() === 2)
    assert(rolando.getValorLucha() === 8)
  }

  test("Rolando encontra viejoSabio"){
    new ViejoSabio().encontrado(rolando)
    assert(rolando.getValorHechiceria() === 3)
    assert(rolando.getValorLucha() === 9)
  }

  test("Rolando vs Archibaldo con items"){
    val rolando2 = new Rolando
    val caterina2 = new Caterina
    val archibaldo = new Archibaldo
    new ViejoSabio().encontrado(rolando2)
    new Armadura(refuerzo=Some(new Bendicion)).encontrado(rolando2)
    caterina2.encontrado(rolando2)
    archibaldo.encontrado(rolando2)
    assert(rolando2.getValorHechiceria() === 3)
    assert(rolando2.getValorLucha() === 9)
    assert(rolando2.vivo)
    assert(!archibaldo.vivo)
  }
}
