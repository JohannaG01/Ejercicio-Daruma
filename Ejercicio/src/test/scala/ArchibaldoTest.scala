import Model.{Archibaldo, Artefacto, Caterina, CollarDivino, ViejoSabio}
import org.scalatest.funsuite.AnyFunSuite

class ArchibaldoTest extends AnyFunSuite {
  val archibaldo = new Archibaldo

  def verificarStatHechiceria(valor: Int): Unit =
    assert(archibaldo.getValorHechiceria() === valor)

  def verificarStatLucha(valor: Int): Unit =
    assert(archibaldo.getValorLucha() === valor)

  def verificarStatConArtefacto(artefacto: Artefacto, valorLucha: Int, valorHechiceria: Int): Unit={
    artefacto.encontrado(archibaldo)
    verificarStatLucha(valorLucha)
    verificarStatHechiceria(valorHechiceria)
  }

  test("Obtener estadisticas base"){
    verificarStatLucha(5)
    verificarStatHechiceria(5)
  }

  test("Incrementar puntos base hechiceria"){
    archibaldo.incrementarHechiceria
    verificarStatHechiceria(6)
  }

  test("Obtener collar divino"){
    verificarStatConArtefacto(new CollarDivino(), 6, 7)
  }

  test("Encontrar un elemento"){
    new ViejoSabio().encontrado(archibaldo)
    verificarStatHechiceria(8)
    verificarStatLucha(7)
  }
}
