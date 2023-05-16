Algoritmo sin_titulo
	Definir indice, num, interA, InterB Como Entero
	
	indice = 0
	
	Escribir "Ingrese ingrese el primer intervalo"
	leer interA
	
	Escribir "Ingrese ingrese el segundo intervalo"
	leer interB
	
	Escribir "Ingrese un número, entre los intervalos", interA," y ", InterB
	leer num
	
	Mientras num >= interA y num <= interB Hacer
		Escribir "Ingrese un número, entre los intervalos ", interA," y ", InterB
		leer num
		
		indice = indice + 1 
	FinMientras
	
	Escribir "la cantidad de números ingresdos que pertenecian al intervalo fueron: ", indice
FinAlgoritmo
