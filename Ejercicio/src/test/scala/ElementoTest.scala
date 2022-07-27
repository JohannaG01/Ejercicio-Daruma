import Model.{BandoSur, Cofre, ComuloCarbon, Rolando, ViejoSabio}
import org.scalatest.funsuite.AnyFunSuite

class ElementoTest extends AnyFunSuite {
  val bando = new BandoSur()
  val rolandoTest = new Rolando(bando = bando)

  def verificarStatTesoro(valor: Int): Unit ={
    assert(bando.tesoro === valor)
  }

  def verificarStatRecurso(valor: Int): Unit ={
    assert(bando.reserva === valor)
  }

  def verificarStatHechiceria(valor: Int): Unit ={
    assert(rolandoTest.getValorHechiceria() === valor)
  }

  def verificarStatLucha(valor: Int): Unit ={
    assert(rolandoTest.getValorLucha() === valor)
  }

  test("Verificar encontrar cofre"){
    rolandoTest.encontrarElemento(new Cofre())
    verificarStatTesoro(100)
    verificarStatRecurso(0)
  }

  test("Verificar encontrar comulo de carbon"){
    rolandoTest.encontrarElemento(new ComuloCarbon())
    verificarStatTesoro(100)
    verificarStatRecurso(50)
  }

  test("Verificar encontrar viejo sabio"){
    rolandoTest.encontrarElemento(new ViejoSabio())
    verificarStatLucha(4)
    verificarStatHechiceria(2)
  }
}
