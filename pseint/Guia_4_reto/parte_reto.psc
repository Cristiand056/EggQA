Algoritmo sin_titulo
	//VigaHormigon()
	calcularPisos()
FinAlgoritmo

SubProceso VigaHormigon()
	definir kgCemento, m3Arena, m2Piedra, mHierro8, mHierro4, largoViga Como Real
	
	Escribir "Ingrese el largo de la viga en metros"
	Leer largoViga
	
	kgCemento = 9 * largoViga
	m3Arena = 0.02 * largoViga
	m2Piedra = 0.02 * largoViga
	mHierro8 = 4 * largoViga
	mHierro4 = 3 * largoViga
	
	Escribir "El total de materiales para la viga de hormigon serian los siguiente: "
	Escribir kgCemento," kg de cemento, ",m3Arena," m3 de arena, ",m2Piedra," m2 de piedra, ",mHierro8," m de hierro del 8 y ",mHierro4," m de hierro del 4"
FinSubProceso

SubAlgoritmo calcularPisos()
	Definir ancho, largo, superficie Como Real
	
	Escribir "Ingrese el ancho del piso a calcular"
	leer ancho
	Escribir "Ingrese el largo del piso a calcular"
	leer largo
	
	superficie = ancho * largo + ancho * largo * 0.1
	
	Escribir "La superficie del piso más el 10% de tolerencia es: ",superficie," m2"
	
FinSubAlgoritmo
	