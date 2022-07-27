package Model

abstract class Artefacto(valorLucha: Int, valorHechiceria: Int) {

  def getValorLucha(capo: Capo): Int = valorLucha
  def getValorHechiceria(capo: Capo): Int = valorHechiceria
}
