Algoritmo sin_titulo
	Definir nombre Como Caracter
	Definir  nota, sum, cont Como Real
	Definir criterio Como Logico	
	
	Escribir "Ingrese el nombre del alumno"
	Leer nombre
	
	Mientras nombre <> "" Hacer
		criterio = Falso
		cont = 0
		sum = 0
		Mientras cont < 3 y !criterio Hacer
			Escribir "Ingrese la nota no", cont+1
			Leer nota
			si nota < 0 o nota > 10 Entonces
				criterio = Verdadero
			SiNo
				Segun cont Hacer
					0: 
						sum = sum + nota* 0.1
						cont = cont + 1
					1: 
						sum = sum + nota* 0.5
						cont = cont + 1
					2:
						sum = sum + nota* 0.4
						cont = cont + 1
				FinSegun
			FinSi
		FinMientras
		si criterio Entonces
			Escribir "Hay un error en las notas"
		SiNo
			Escribir "La nota estudiante del estudiante", nombre,", es ", sum
		FinSi
		Escribir "Ingrese el nombre del siguiente alumno"
		Leer nombre
		
	FinMientras
	
	Escribir "adios"
FinAlgoritmo
