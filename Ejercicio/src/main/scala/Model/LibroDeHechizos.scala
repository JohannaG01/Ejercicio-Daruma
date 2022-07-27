package Model

class LibroDeHechizos(valorLucha: Int = 0, valorHechiceria: Int = 0) extends Artefacto(valorLucha,valorHechiceria){

  override def getValorHechiceria(capo: Capo): Int = capo.hechiceriaBase
}
