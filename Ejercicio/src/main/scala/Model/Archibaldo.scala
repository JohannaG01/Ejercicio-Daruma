package Model

class Archibaldo (luchaBase: Int = 3, hechiceriaBase: Int = 3, artefactos: List[Artefacto] =
List(new CollarDivino, new EspejoFantastico)) extends Capo(luchaBase, hechiceriaBase, artefactos){

  override val bando: Bando = BandoNorte
}
