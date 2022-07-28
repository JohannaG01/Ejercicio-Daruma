import Model.{BandoSur, Cofre, ComuloCarbon, Rolando, ViejoSabio}
import org.scalatest.funsuite.AnyFunSuite

class ElementoTest extends AnyFunSuite {
  val bando = BandoSur
  val rolandoTest = new Rolando

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
    new Cofre().encontrado(rolandoTest)
    verificarStatTesoro(200)
    verificarStatRecurso(50)
  }

  test("Verificar encontrar comulo de carbon"){
    new ComuloCarbon().encontrado(rolandoTest)
    verificarStatTesoro(200)
    verificarStatRecurso(100)
  }

  test("Verificar encontrar viejo sabio"){
    new ViejoSabio().encontrado(rolandoTest)
    verificarStatLucha(4)
    verificarStatHechiceria(2)
  }
}
