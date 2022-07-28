import Model.{BandoSur, Caterina, Cofre, Rolando}
import org.scalatest.funsuite.AnyFunSuite

class BandoSurTest extends AnyFunSuite {
  val bando = BandoSur
  val rolandoTest = new Rolando
  val caterina = new Caterina
  def verificarStatTesoro(valor: Int): Unit ={
    assert(bando.tesoro === valor)
  }

  def verificarStatRecurso(valor: Int): Unit ={
    assert(bando.reserva === valor)
  }

  test("Estadistica Bando base"){
    verificarStatTesoro(100)
    verificarStatRecurso(50)
  }
  test("Estadistica Bando con recursos"){
    new Cofre().encontrado(rolandoTest)
    new Cofre().encontrado(caterina)
    verificarStatTesoro(300)
    verificarStatRecurso(50)
  }
}
