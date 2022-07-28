package Model

abstract class Capo(var luchaBase: Int, var hechiceriaBase: Int, var artefactos: List[Artefacto] = List())
  extends Encontrable
{
  var vivo = true
  val bando: Bando
  def agregarArtefacto(artefacto: Artefacto): Unit = {
    artefactos = artefactos :+ artefacto
  }

  def getValorLucha(): Int =
    artefactos.foldLeft(0)(_ + _.getValorLucha(this)) + luchaBase


  def getValorHechiceria(): Int = {
    artefactos.foldLeft(0)(_ + _.getValorHechiceria(this)) + hechiceriaBase
  }

  def incrementarLucha: Unit=
    luchaBase += 1


  def incrementarHechiceria: Unit={
    hechiceriaBase += 1
  }

  override def encontrado(capo: Capo): Unit = {
    if (capo.bando == this.bando)
      darArtefactos(capo)
    else
      luchar(capo)
  }

  def darArtefactos(capo: Capo): Unit = {
    artefactos.foreach(capo.agregarArtefacto(_))
    artefactos = List[Artefacto]()
  }

  def luchar(capo: Capo): Unit = {
    val misPuntos = getValorLucha() + getValorHechiceria()
    val puntosEnemigo = capo.getValorLucha() + getValorHechiceria()

    if (misPuntos > puntosEnemigo)
      capo.vivo = false
    else if (misPuntos < puntosEnemigo)
      vivo = false
  }

}
