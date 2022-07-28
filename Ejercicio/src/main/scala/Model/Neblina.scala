package Model

class Neblina(recompenzas: Set[Encontrable] = Set(new EspadaDelDestino, new Caterina, new Armadura(refuerzo= Some(new Bendicion)))) extends Elemento {

  override def encontrado(capo: Capo): Unit = recompenzas.foreach(_.encontrado(capo))
}
