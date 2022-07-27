import Model.{Artefacto, BandoSur, CollarDivino, EspadaDelDestino, LibroDeHechizos, Rolando, ViejoSabio}
import org.scalatest.funsuite.AnyFunSuite

class CapoTest extends AnyFunSuite{
  val bando = new BandoSur()
  val rolandoTest = new Rolando(bando = bando)

  def verificarStatHechiceria(valor: Int): Unit ={
      assert(rolandoTest.getValorHechiceria() === valor)
  }

  def verificarStatLucha(valor: Int): Unit ={
      assert(rolandoTest.getValorLucha() === valor)
  }

  def verificarStatConArtefacto(artefacto: Artefacto, valorLucha: Int, valorHechiceria: Int): Unit={
    rolandoTest.agregarArtefacto(artefacto)
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

  test("Obtener libro de hechizos"){
    verificarStatConArtefacto(new LibroDeHechizos(), 4, 5)
  }

  test("Obtener espada del destino"){
    verificarStatConArtefacto(new EspadaDelDestino(), 7, 5)
  }

  test("Encontrar un elemento"){
    rolandoTest.encontrarElemento(new ViejoSabio())
    verificarStatHechiceria(7)
    verificarStatLucha(8)
  }
}
