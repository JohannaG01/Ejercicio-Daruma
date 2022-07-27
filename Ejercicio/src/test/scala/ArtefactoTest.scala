import Model.{Armadura, Artefacto, BandoSur, Bendicion, CollarDivino, CotaDeMalla, EspadaDelDestino, EspejoFantastico, Hechizo, LibroDeHechizos, Rolando}
import org.scalatest.funsuite.AnyFunSuite

class ArtefactoTest extends AnyFunSuite {
  val bando = new BandoSur()
  val rolandoTest = new Rolando(bando = bando)

  def verificarStatHechiceria(artefacto: Artefacto,valor: Int): Unit ={
    assert(artefacto.getValorHechiceria(rolandoTest) == valor)
  }

  def verificarStatLucha(artefato: Artefacto, valor: Int): Unit ={
    assert(artefato.getValorLucha(rolandoTest) == valor)
  }

  test("Estadistica Collar Divino") {
    verificarStatHechiceria(new CollarDivino(),1)
    verificarStatLucha(new CollarDivino(),1)
  }

  test("Estadistica Libro de hechizos") {
    verificarStatHechiceria(new LibroDeHechizos(),1)
    verificarStatLucha(new LibroDeHechizos(),0)
  }

  test("Estadistica Espada del destino") {
    verificarStatHechiceria(new EspadaDelDestino(),0)
    verificarStatLucha(new EspadaDelDestino(),3)
  }

  test("Estadistica Armadura sin refuerzo"){
    verificarStatHechiceria(new Armadura(refuerzo = None),0)
    verificarStatLucha(new Armadura(refuerzo = None),2)
  }

  test("Estadistica Armadura con cota de malla"){
    verificarStatHechiceria(new Armadura(refuerzo = Some(new CotaDeMalla())),0)
    verificarStatLucha(new Armadura(refuerzo = Some(new CotaDeMalla())),3)
  }

  test("Estadistica Armadura con Hechizo con capo 4 hechiceria base"){
    (0 to 3).foreach(x => rolandoTest.incrementarHechiceria)
    verificarStatHechiceria(new Armadura(refuerzo = Some(new Hechizo())),2)
    verificarStatLucha(new Armadura(refuerzo = Some(new Hechizo())),2)
  }

  test("Estadistica Espejo Fantastico para capo sin artefactos"){
    verificarStatHechiceria(new EspejoFantastico(), 0)
    verificarStatLucha(new EspejoFantastico(), 0)
  }
  test("Estadistica Espejo Fantastico capo con artefactos"){
    rolandoTest.agregarArtefacto(new EspadaDelDestino())
    rolandoTest.agregarArtefacto(new LibroDeHechizos())
    verificarStatHechiceria(new EspejoFantastico(), 0)
    verificarStatLucha(new EspejoFantastico(), 3)
  }
}
