import Model.{Artefacto, Caterina, CollarDivino, ViejoSabio}
import org.scalatest.funsuite.AnyFunSuite

class CaterinaTest extends AnyFunSuite {
  val caterina = new Caterina

  def verificarStatHechiceria(valor: Int): Unit =
    assert(caterina.getValorHechiceria() === valor)

  def verificarStatLucha(valor: Int): Unit =
    assert(caterina.getValorLucha() === valor)

  def verificarStatConArtefacto(artefacto: Artefacto, valorLucha: Int, valorHechiceria: Int): Unit={
    artefacto.encontrado(caterina)
    verificarStatLucha(valorLucha)
    verificarStatHechiceria(valorHechiceria)
  }

  test("Obtener estadisticas base"){
    verificarStatLucha(5)
    verificarStatHechiceria(1)
  }

  test("Incrementar puntos base hechiceria"){
    caterina.incrementarHechiceria
    verificarStatHechiceria(2)
  }

  test("Obtener collar divino"){
    verificarStatConArtefacto(new CollarDivino(), 6, 3)
  }

  test("Encontrar un elemento"){
    new ViejoSabio().encontrado(caterina)
    verificarStatHechiceria(4)
    verificarStatLucha(7)
  }
}
