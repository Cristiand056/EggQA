Algoritmo sin_titulo
	
	Borrar Pantalla
	
	Menu()
	
FinAlgoritmo


SubProceso Menu()
	Definir seleccion Como Entero
	Definir _salir Como Logico
	_salir = Falso
	Escribir "--- MENU ---"
	SaltoLinea()
	seleccion = Selector()
	
	Borrar Pantalla
	
	Segun seleccion Hacer
		1: CalcularMuro()
			Volver()
		2: CalcularViga()
			Volver()
		3: CalcularColumna()
			Volver()
		4: CalcularContrapisos()
			Volver()
		5: CalcularTecho()
			Volver()
		6: CalcularPisos()
			Volver()
		7: CalcularPintura()
			Volver()
		8: CalcularIluminacion()
			Volver()
		9: Salir(_salir)
		De Otro Modo:
			OpcionInvalida()
	FinSegun
	
	
FinSubProceso

SubProceso return = Selector()
	Definir return Como Entero
	Escribir "Ingrese la opción deseada:"
	SaltoLinea()
	Escribir "  1. Calcular muro de ladrillo"
	Escribir "  2. Calcular viga de hormigón"
	Escribir "  3. Calcular columnas de hormigón"
	Escribir "  4. Calcular contrapisos"
	Escribir "  5. Calcular techo"
	Escribir "  6. Calcular pisos"
	Escribir "  7. Calcular pintura"
	Escribir "  8. Calcular iluminación"
	Escribir "  9. Salir"
	SaltoLinea()
	Leer return
FinSubProceso

SubProceso CalcularMuro()
	Escribir "--- CALCULAR MURO DE LADRILLO ---"
	SaltoLinea()
	
	definir espesorArg como entero;
	definir largoArg, altoArg, cemento, arena, ladrillos como real;
	Hacer
		escribir "¿Cual es el espesor de su muro?";
		escribir "20 0 30 cm";
		leer espesorArg;
	Mientras Que espesorArg <> 20 y espesorArg <> 30
	escribir "Ingrese el largo en m";
	leer largoArg;
	escribir "Ingrese el alto en m";
	leer altoArg;
	Borrar Pantalla
	escribir "La superficie del muro es ",calcularSuperficie(espesorArg,largoArg,altoArg), " m2";
	si espesorArg = 20 Entonces
		cemento = 15.2 * calcularSuperficie(espesorArg,largoArg,altoArg);
		arena = 0.115 * calcularSuperficie(espesorArg,largoArg,altoArg);
		ladrillos = 120 * calcularSuperficie(espesorArg,largoArg,altoArg);
	SiNo
		cemento = 10.9 * calcularSuperficie(espesorArg,largoArg,altoArg);
		arena = 0.09 * calcularSuperficie(espesorArg,largoArg,altoArg);
		ladrillos = 90 * calcularSuperficie(espesorArg,largoArg,altoArg);
	FinSi
	SaltoLinea
	Escribir "Se necesitarán:"
	SaltoLinea
	
	Escribir "Cemento --------> " cemento " kg"
	Escribir "Arena ----------> " arena " m3"
	Escribir "Ladrillos ------> " ladrillos
	
FinSubProceso

SubProceso CalcularViga()
	Escribir "--- CALCULAR VIGA DE HORMIGÓN ---"
	SaltoLinea()
	
	definir kgCemento, m3Arena, m2Piedra, mHierro8, mHierro4, largoViga Como Real
		
	Escribir "Ingrese el largo de la viga (m)"
	Leer largoViga
	
	kgCemento = 9 * largoViga
	m3Arena = 0.02 * largoViga
	m2Piedra = 0.02 * largoViga
	mHierro8 = 4 * largoViga
	mHierro4 = 3 * largoViga
	
	SaltoLinea()
	Escribir "Se necesitarán:"
	SaltoLinea()
	
	Escribir "Cemento --------> " kgCemento " kg"
	Escribir "Arena ----------> " m3Arena " m3"
	Escribir "Piedra ---------> " m2Piedra "m2"
	Escribir "Hierro del 8 ---> " mHierro8 " m"
	Escribir "Hierro del 4 ---> " mHierro4 " m"
FinSubProceso

//  Nos debe pedir el largo de la columna. Por metro lineal de columna se necesitarán: 7.5 kg de
//	cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro del 4.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso CalcularColumna()
	Escribir "--- CALCULAR COLUMNA ---"
	SaltoLinea()
	
	Definir largo, cemento, arena, piedra, hierro10, hierro4 Como Real	
	
	Escribir "Ingrese el largo de la columna (m): " Sin Saltar
	Leer largo
	
	cemento = 7.5 * largo
	arena = 0.016 * largo
	piedra = 0.016 * largo
	hierro10 = 6 * largo
	hierro4 = 3 * largo
	
	SaltoLinea()
	Escribir "Se necesitarán:"
	SaltoLinea()
	
	Escribir "Cemento --------> " cemento " kg"
	Escribir "Arena ----------> " arena " m3"
	Escribir "Piedra ---------> " piedra " m2"
	Escribir "Hierro del 10 --> " hierro10 " m"
	Escribir "Hierro del 4 ---> " hierro4 " m"
	
FinSubProceso

SubProceso CalcularContrapisos()
	Escribir "--- CALCULAR CONTRAPISOS ---"
	SaltoLinea()
	
	Definir espesor, ancho, largo, volumen, cemento, arena, piedra Como Real
    Escribir "Ingrese el espesor del contrapiso (en metros):"
    Leer espesor
    Escribir "Ingrese el ancho del contrapiso (en metros):"
    Leer ancho
    Escribir "Ingrese el largo del contrapiso (en metros):"
    Leer largo
    volumen = espesor * ancho * largo
    cemento = volumen * 105
    arena = volumen * 0.45
    piedra = volumen * 0.9
	
    SaltoLinea()
	Escribir "Se necesitarán:"
	SaltoLinea()
    Escribir "Cemento: -------> " cemento, " kg"
    Escribir "Arena: ---------> " arena, " m3"
    Escribir "Piedra: --------> " piedra, " m3"
FinSubProceso

SubProceso CalcularTecho()
	Escribir "--- CALCULAR TECHO ---"
	SaltoLinea()
	
	definir espesorArg, largoArg, altoArg, cemento, arena, piedra, hierro8, hierro6 como real;
	escribir "Ingrese el espesor en cm"
	leer espesorArg;
	escribir "Ingrese el largo en m";
	leer largoArg;
	escribir "Ingrese el alto en m";
	leer altoArg;
	escribir "La superficie del muro es ",calcularSuperficie(espesorArg,largoArg,altoArg), " m2";
	SaltoLinea
	
	cemento = 33 * calcularSuperficie(espesorArg,largoArg,altoArg);
	arena = 0.072 * calcularSuperficie(espesorArg,largoArg,altoArg);
	piedra = 0.072 * calcularSuperficie(espesorArg,largoArg,altoArg);
	hierro8 = 7 * calcularSuperficie(espesorArg,largoArg,altoArg);
	hierro6 = 4 * calcularSuperficie(espesorArg,largoArg,altoArg);
		
	SaltoLinea()
	Escribir "Se necesitarán:"
	SaltoLinea()
	
	Escribir "Cemento --------> " cemento " kg"
	Escribir "Arena ----------> " arena " m3"
	Escribir "Piedra ---------> " piedra " m2"
	Escribir "Hierro del 10 --> " hierro8 " m"
	Escribir "Hierro del 6 ---> " hierro6 " m"
FinSubProceso

SubProceso CalcularPisos()
	Escribir "--- CALCULAR PISOS ---"
	SaltoLinea()
	
	Definir ancho, largo, superficie Como Real
	
	Escribir "Ingrese el ancho del piso a calcular"
	leer ancho
	Escribir "Ingrese el largo del piso a calcular"
	leer largo
	
	superficie = ancho * largo + ancho * largo * 0.1
	
	Escribir "La superficie del piso más el 10% de tolerencia es: ",superficie," m2"
FinSubProceso

SubProceso CalcularPintura()
	Escribir "--- CALCULAR PINTURA ---"
	SaltoLinea()
	
	Definir superficie, pintura Como Real
    Escribir "Ingrese la superficie del muro a pintar (en metros cuadrados):"
    Leer superficie
    pintura = superficie / 6
   
	SaltoLinea()
	Escribir "Se necesitarán:"
	SaltoLinea()
	
	Escribir "Pintura --------> " pintura " L"
FinSubProceso

SubProceso CalcularIluminacion()
	Escribir "--- CALCULAR ILUMINACIÓN ---"
	SaltoLinea()
	
	Definir superficie, iluminacion Como Real
    Escribir "Ingrese la superficie de la habitación (en metros cuadrados):"
    Leer superficie
    iluminacion = superficie * 0.20
    Escribir "Para una habitación de ", superficie, " metros cuadrados, se necesitan al menos ", iluminacion, " metros cuadrados de iluminación natural."	
FinSubProceso

SubProceso Salir(_salir Por Referencia)
	Escribir "Hasta luego :-)"
	_salir = Verdadero
FinSubProceso

SubProceso OpcionInvalida()
	Escribir "Opción inválida. Intente nuevamente."
	SaltoLinea()
	Menu()
FinSubProceso

SubProceso Volver()
	SaltoLinea()
	Escribir "Presione cualquier tecla para volver"
	Esperar Tecla
	Borrar Pantalla
	Menu()
FinSubProceso

SubProceso SaltoLinea()
	Escribir ""
FinFuncion

SubProceso superficie <- calcularSuperficie(espesorPara, largoPara, altoPara)
	definir superficie como real;
	superficie = largoPara * altoPara;
FinSubProceso

SubProceso CalcularVolumen()	
FinSubProceso

	