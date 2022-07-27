package Model

abstract class Refuerzo(valorLucha: Int, valorHechiceria: Int) {

  def getValorLucha(): Int = valorLucha
  def getValorHechiceria(capo: Capo): Int = valorHechiceria
}
