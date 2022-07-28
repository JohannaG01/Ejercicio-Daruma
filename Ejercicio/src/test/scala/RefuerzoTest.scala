import Model.{BandoSur, Bendicion, CotaDeMalla, Hechizo, Refuerzo, Rolando}
import org.scalatest.funsuite.AnyFunSuite

class RefuerzoTest extends AnyFunSuite{
  val bando = BandoSur
  val rolandoTest = new Rolando

  def verificarStatHechiceria(refuerzo: Refuerzo, valor: Int): Unit ={
    assert(refuerzo.getValorHechiceria(rolandoTest) == valor)
  }

  def verificarStatLucha(refuerzo: Refuerzo, valor: Int): Unit ={
    assert(refuerzo.getValorLucha() == valor)
  }

  test("Estadistica cota de malla"){
    verificarStatHechiceria(new CotaDeMalla(),0)
    verificarStatLucha(new CotaDeMalla(),1)
  }

  test("Estadistica bendicion"){
    verificarStatHechiceria(new Bendicion(),1)
    verificarStatLucha(new Bendicion(),0)
  }

  test("Estadistica Armadura con Hechizo con capo 1 hechiceria base"){
    verificarStatHechiceria(new Hechizo(),0)
    verificarStatLucha(new Hechizo(),0)
  }

  test("Estadistica Armadura con Hechizo con capo 4 hechiceria base"){
    (0 to 3).foreach(x => rolandoTest.incrementarHechiceria)
    verificarStatHechiceria(new Hechizo(),2)
    verificarStatLucha(new Hechizo(),0)
  }
}
