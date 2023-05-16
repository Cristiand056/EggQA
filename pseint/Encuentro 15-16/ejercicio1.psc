Algoritmo sin_titulo
	Definir  a, b Como Entero
	
	a = 5
	b = 6
	Escribir "A = ",a," y B = ",b
	Cambio(a, b)
	Escribir "A = ",a," y B = ",b
FinAlgoritmo

SubProceso Cambio(a Por Referencia, b Por Referencia)
	Definir aux Como Entero
	aux = a
	a = b
	b = aux
FinSubProceso
	