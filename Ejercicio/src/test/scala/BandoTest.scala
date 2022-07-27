import Model.{BandoSur, Cofre, Rolando}
import org.scalatest.funsuite.AnyFunSuite

class BandoTest extends AnyFunSuite {
  val bando = new BandoSur()
  val rolandoTest = new Rolando(bando = bando)
  def verificarStatTesoro(valor: Int): Unit ={
    assert(bando.tesoro === valor)
  }

  def verificarStatRecurso(valor: Int): Unit ={
    assert(bando.reserva === valor)
  }

  test("Estadistica Bando base"){
    verificarStatTesoro(0)
    verificarStatRecurso(0)
  }
  test("Estadistica Bando con recursos"){
    rolandoTest.encontrarElemento(new Cofre())
    verificarStatTesoro(100)
    verificarStatRecurso(0)
  }
}
