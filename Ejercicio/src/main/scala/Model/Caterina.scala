package Model

class Caterina (luchaBase: Int = 2, hechiceriaBase: Int = 1, artefactos: List[Artefacto] = List(new EspadaDelDestino))
  extends Capo(luchaBase, hechiceriaBase, artefactos){
  override val bando: Bando = BandoSur
}
