package Model

abstract class Capo(var luchaBase: Int, var hechiceriaBase: Int, var artefactos: List[Artefacto] = List(), bando: Bando){

  def agregarArtefacto(artefacto: Artefacto): Unit = {
    artefactos = artefactos :+ artefacto
  }
  def getValorLucha(): Int = {
    artefactos.foldLeft(0)(_ + _.getValorLucha(this)) + luchaBase
  }
  def getValorHechiceria(): Int = {
    artefactos.foldLeft(0)(_ + _.getValorHechiceria(this)) + hechiceriaBase
  }
  def incrementarLucha: Unit={
    luchaBase += 1
  }
  def incrementarHechiceria: Unit={
    hechiceriaBase += 1
  }
  def encontrarElemento(elemento: Elemento): Unit ={
    elemento.obtenerRecompensa(this,bando)
  }
}
