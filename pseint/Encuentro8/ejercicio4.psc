Algoritmo sin_titulo
	Definir num, sum Como Entero
	Definir eleccion Como Caracter
	
	sum = 0
	
	Hacer
		Escribir "Ingrese un n�mero entero positivo"
		Leer num
		
		sum = sum + num
			
		Escribir "si ingrese (no), para finalizar"
		Leer eleccion
		
	Mientras Que eleccion <> "no"
	
	Escribir "La sumatoria de los n�meros es: ", sum
FinAlgoritmo
