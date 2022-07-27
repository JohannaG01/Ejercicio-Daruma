package Test

import Model.{Armadura, BandoSur, Bendicion, Cofre, CollarDivino, ComuloCarbon, CotaDeMalla, EspadaDelDestino, EspejoFantastico, Hechizo, LibroDeHechizos, Rolando, ViejoSabio}

object Test extends App{
  val bandoSur = new BandoSur()
  //Instancio a Rolando
  val rolando = new Rolando(bando = bandoSur)
  println("Rolando base")
  println(s"Valor lucha: ${rolando.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")

  //Incremento puntos base hechiceria
  rolando.incrementarHechiceria
  println("Rolando incrmenta hechiceria en 1")
  println(s"Valor lucha: ${rolando.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")

  //Rolando obtiene collar divino
  rolando.agregarArtefacto(new CollarDivino())
  println("Obtiene collar divino")
  println(s"Valor lucha: ${rolando.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")

  //Rolando obtiene libro de hechizos
  rolando.agregarArtefacto(new LibroDeHechizos())
  println("Obtiene libro de hechizos")
  println(s"Valor lucha: ${rolando.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")

  //Rolando obtiene espada del destino
  rolando.agregarArtefacto(new EspadaDelDestino())
  println("Obtiene espada del destino")
  println(s"Valor lucha: ${rolando.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")

  //Rolando obtiene una armadura sin refuerzo
  rolando.agregarArtefacto(new Armadura(refuerzo = None))
  println("Obtiene armadura sin refuerzo")
  println(s"Valor lucha: ${rolando.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")

  //Rolando obtiene una armadura con cota de malla
  rolando.agregarArtefacto(new Armadura(refuerzo = Some(new CotaDeMalla())))
  println("Obtiene armadura con cota de malla")
  println(s"Valor lucha: ${rolando.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")


  //Rolando obtiene una armadura con bendicion
  rolando.agregarArtefacto(new Armadura(refuerzo = Some(new Bendicion())))
  println("Obtiene armadura con bendicion")
  println(s"Valor lucha: ${rolando.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")

  //Rolando obtiene una armadura con Hechizo (menos de 3 de hechiceria)
  rolando.agregarArtefacto(new Armadura(refuerzo = Some(new Hechizo())))
  println("Obtiene armadura con hechizo (mmenos de 3 de hechiceria base)")
  println(s"Valor lucha: ${rolando.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")

  //Creo un Rolando de prueba con 4 de hechiceria base para probar el refuerzo Hechizo
  val rolandoTest = new Rolando(hechiceriaBase = 4, bando = bandoSur)
  println("RolandoTest base")
  println(s"Valor lucha: ${rolandoTest.getValorLucha()} valor hechiceria: ${rolandoTest.getValorHechiceria()}")
  println("----------------------------------------------------------")
  rolandoTest.agregarArtefacto(new Armadura(refuerzo = Some(new Hechizo())))
  println("Obtiene armadura con hechizo (mas de 3 de hechiceria base)")
  println(s"Valor lucha: ${rolandoTest.getValorLucha()} valor hechiceria: ${rolandoTest.getValorHechiceria()}")
  println("----------------------------------------------------------")

  //Creo un nuevo Rolando y obtiene un Espejo fantástico (deberia sumar 3 de lucha, su mejor artefacto es la espara del destino)
  val rolando2 = new Rolando(bando = bandoSur)
  println("Nuevo Rolando base")
  println(s"Valor lucha: ${rolando2.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")
  rolando2.agregarArtefacto(new EspejoFantastico())
  println("Obtiene espejo fantastico")
  println(s"Valor lucha: ${rolando2.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")
  rolando2.agregarArtefacto(new EspadaDelDestino())
  println("Obtiene espada del destino")
  println(s"Valor lucha: ${rolando2.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")

  //BandoSur recursos
  println("Bando del sur, estadisticas")
  println(s"Tesoro: ${bandoSur.tesoro} reserva: ${bandoSur.reserva}")
  println("----------------------------------------------------------")
  //Rolando se encuentra un cofre
  println("Rolando se encuentran un cofre")
  rolando.encontrarElemento(new Cofre())
  println(s"Tesoro: ${bandoSur.tesoro} reserva: ${bandoSur.reserva}")
  println("----------------------------------------------------------")
  //Rolando se encuentra un Comulo de Carbon
  println("Rolando se encuentran un Comulo de carbon")
  rolando.encontrarElemento(new ComuloCarbon())
  println(s"Tesoro: ${bandoSur.tesoro} reserva: ${bandoSur.reserva}")
  println("----------------------------------------------------------")
  //Rolando se encuentra un Viejo Sabio
  println("Rolando se encuentran un viejo sabio")
  rolando.encontrarElemento(new ViejoSabio())
  println(s"Tesoro: ${bandoSur.tesoro} reserva: ${bandoSur.reserva}")
  println(s"Valor lucha: ${rolando.getValorLucha()} valor hechiceria: ${rolando.getValorHechiceria()}")
  println("----------------------------------------------------------")


}
