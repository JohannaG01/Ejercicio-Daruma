package Model

class ComuloCarbon extends Elemento{
  val RESERVA_AGREGAR = 50

  override def obtenerRecompensa(capo: Capo, bando: Bando): Unit = bando.sumarRecursos(RESERVA_AGREGAR)
}
