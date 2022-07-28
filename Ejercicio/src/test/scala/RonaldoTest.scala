import Model.{Artefacto, CollarDivino, Rolando, ViejoSabio}
import org.scalatest.funsuite.AnyFunSuite

class RonaldoTest extends AnyFunSuite{
  val rolandoTest = new Rolando

  def verificarStatHechiceria(valor: Int): Unit =
    assert(rolandoTest.getValorHechiceria() === valor)

  def verificarStatLucha(valor: Int): Unit =
    assert(rolandoTest.getValorLucha() === valor)

  def verificarStatConArtefacto(artefacto: Artefacto, valorLucha: Int, valorHechiceria: Int): Unit={
    artefacto.encontrado(rolandoTest)
    verificarStatLucha(valorLucha)
    verificarStatHechiceria(valorHechiceria)
  }

  test("Obtener estadisticas base"){
    verificarStatLucha(3)
    verificarStatHechiceria(1)
  }

  test("Incrementar puntos base hechiceria"){
    rolandoTest.incrementarHechiceria
    verificarStatHechiceria(2)
  }

  test("Obtener collar divino"){
    verificarStatConArtefacto(new CollarDivino(), 4, 3)
  }

  test("Encontrar un elemento"){
    new ViejoSabio().encontrado(rolandoTest)
    verificarStatHechiceria(4)
    verificarStatLucha(5)
  }
}
