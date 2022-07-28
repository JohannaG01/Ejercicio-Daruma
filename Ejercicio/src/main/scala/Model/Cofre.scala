package Model

class Cofre(oro: Int = 100) extends Elemento{

  override def encontrado(capo: Capo): Unit = capo.bando.sumarTesoro(oro)
}
