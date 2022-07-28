import Model.{Neblina, Rolando}
import org.scalatest.funsuite.AnyFunSuite

class NeblinaTest extends AnyFunSuite {
  test("Rolando encuentra una neblina"){
    val rolando = new Rolando
    val neblina = new Neblina
    neblina.encontrado(rolando)
    assert(rolando.getValorLucha == 11)
    assert(rolando.getValorHechiceria== 2)
  }
}
