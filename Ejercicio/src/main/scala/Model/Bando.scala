package Model

abstract class Bando (var tesoro: Int = 0, var reserva: Int = 0){

  def sumarTesoro(monto: Int):Unit = {
    tesoro+= monto
  }
  def sumarRecursos(monto: Int):Unit = {
    reserva+= monto
  }
}
