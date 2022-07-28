package Model

class ComuloCarbon extends Elemento{
  val RESERVA_AGREGAR = 50

  override def encontrado(capo: Capo): Unit = capo.bando.sumarRecursos(RESERVA_AGREGAR)
}
