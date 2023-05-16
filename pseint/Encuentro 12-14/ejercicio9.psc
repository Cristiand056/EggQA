Algoritmo sin_titulo
	Definir horasTrabajadas Como Entero
	Definir nombreTrabja, diaSemana, turno, festivo Como Caracter
	Definir salida Como Real
	
	Leer nombreTrabja
	Leer diaSemana
	leer turno
	Leer horasTrabajadas
	Leer festivo
	
	salida = DefinirSalario(nombreTrabja, diaSemana, turno, horasTrabajadas, festivo)
	
	Escribir "El trabajador, ",nombreTrabja," se le debe pagar por la labor del día ",diaSemana, " un total de ", salida
FinAlgoritmo

Funcion total <- DefinirSalario(nombreTrabja, diaSemana, turno, horasTrabajadas, festivo)
	Definir tDiurna, tNocturna Como Entero
	Definir fDiurno, fNocturno, retorno, total Como Real
	
	tDiurna = 90
	tNocturna = 125
	fDiurno = 0.1
	fNocturno = 0.15
	
	Segun turno Hacer
		"diurno":
			si festivo == "si" Entonces
				total = tDiurna * horasTrabajadas + fDiurno * tDiurna * horasTrabajadas
				
			SiNo
				total = tDiurna * horasTrabajadas
				
			FinSi
		"nocturno":
			si festivo == "si" Entonces
				total = tNocturna * horasTrabajadas + fNocturno * tNocturna * horasTrabajadas
				
			SiNo
				total = tNocturna * horasTrabajadas
				
			FinSi
		De Otro Modo:
			Escribir "Opción erronea"
	Fin Segun
FinFuncion
	