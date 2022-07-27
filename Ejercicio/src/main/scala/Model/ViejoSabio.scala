package Model

class ViejoSabio extends Elemento{
  override def obtenerRecompensa(capo: Capo, bando: Bando): Unit = {
    capo.incrementarLucha
    capo.incrementarHechiceria
  }
}
