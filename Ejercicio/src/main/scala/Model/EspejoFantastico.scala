package Model

class EspejoFantastico(valorLucha: Int = 0, valorHechiceria: Int = 0) extends Artefacto(valorLucha,valorHechiceria) {

  def getMejorArtefacto(capo: Capo): Option[Artefacto] = {
    //Option(capo.artefactos
    //.filter(x => !x.isInstanceOf[EspejoFantastico])
      //.maxBy (x => x.getValorHechiceria(capo) + x.getValorLucha(capo)))

    capo.artefactos.filter(x => !x.isInstanceOf[EspejoFantastico]) match {
      case Nil => None
      case listArtefactos @ _ => Some(listArtefactos.maxBy(x => x.getValorLucha(capo) + x.getValorHechiceria(capo)))
    }
  }

  override def getValorLucha(capo: Capo): Int = {
    getMejorArtefacto(capo).map(x => x.getValorLucha(capo)) match {
      case Some(valor: Int) => valor
      case None => valorLucha
    }
  }

  override def getValorHechiceria(capo: Capo): Int = {
    getMejorArtefacto(capo).map(x => x.getValorHechiceria(capo)) match {
      case Some(valor: Int) => valor
      case None => valorHechiceria
    }
  }
}
