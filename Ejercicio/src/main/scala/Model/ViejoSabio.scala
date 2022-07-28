package Model

class ViejoSabio(aumentoPtoHechiceria: Int = 1) extends Elemento{
  var aumentoPtoLucha = 1

  override def encontrado(capo: Capo): Unit = {
    (0 until aumentoPtoLucha).foreach(x => capo.incrementarLucha)
    (0 until aumentoPtoHechiceria).foreach(x => capo.incrementarHechiceria)
  }
  def setPtoLucha(valor: Int) = aumentoPtoLucha = valor
}
