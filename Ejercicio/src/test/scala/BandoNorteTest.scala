import Model.{Archibaldo, BandoNorte, Cofre}
import org.scalatest.funsuite.AnyFunSuite

class BandoNorteTest extends AnyFunSuite {
  val bando = BandoNorte
  val archibaldo = new Archibaldo
  def verificarStatTesoro(valor: Int): Unit ={
    assert(bando.tesoro === valor)
  }

  def verificarStatRecurso(valor: Int): Unit ={
    assert(bando.reserva === valor)
  }

  test("Estadistica Bando base"){
    verificarStatTesoro(200)
    verificarStatRecurso(200)
  }
  test("Estadistica Bando con recursos"){
    new Cofre().encontrado(archibaldo)
    verificarStatTesoro(300)
    verificarStatRecurso(200)
  }
}
