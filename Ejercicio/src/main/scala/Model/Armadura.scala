package Model

class Armadura(valorLucha: Int = 2, valorHechiceria: Int = 0, refuerzo: Option[Refuerzo])extends Artefacto(valorLucha, valorHechiceria){
  override def getValorLucha(capo: Capo): Int = refuerzo.map(_.getValorLucha() + valorLucha).getOrElse(valorLucha)
  //match {
   // case Some(value: Int) => value
   // case None => valorLucha
  //}
  override def getValorHechiceria(capo: Capo): Int = refuerzo.map(x => x.getValorHechiceria(capo)) match {
    case Some(value: Int) => value
    case None => valorHechiceria
  }
}
