package Model

abstract class Bando{
  var tesoro: Int
  var reserva: Int

  def sumarTesoro(monto: Int):Unit = {
    tesoro+= monto
  }
  def sumarRecursos(monto: Int):Unit = {
    reserva+= monto
  }
}
