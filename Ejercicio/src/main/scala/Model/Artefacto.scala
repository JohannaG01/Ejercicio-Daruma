package Model

abstract class Artefacto(valorLucha: Int, valorHechiceria: Int) extends Encontrable{

  def getValorLucha(capo: Capo): Int = valorLucha
  def getValorHechiceria(capo: Capo): Int = valorHechiceria
  def encontrado(capo: Capo): Unit = capo.agregarArtefacto(this)
}
