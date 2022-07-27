package Model

class Hechizo (valorLucha: Int = 0, valorHechiceria: Int = 0) extends Refuerzo(valorLucha, valorHechiceria){
  override def getValorHechiceria(capo: Capo): Int = {
    if (capo.hechiceriaBase > 3) 2 else valorHechiceria
  }
}
