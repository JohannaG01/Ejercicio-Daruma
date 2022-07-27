package Model

class Cofre extends Elemento{
  val ORO_AGREGAR = 100

  override def obtenerRecompensa(capo: Capo, bando: Bando): Unit = bando.sumarTesoro(ORO_AGREGAR)
}
