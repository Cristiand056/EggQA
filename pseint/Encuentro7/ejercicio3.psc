Algoritmo sin_titulo
	Definir  prom Como Real
	Definir indice, entrada, sum Como Entero
	
	indice = 0
	sum = 0
	
	Escribir "Ingrese un número, si es -1 terminara el proceso, el -1 no se tendra en cuenta en el promedio"
	leer entrada
	
	Mientras entrada >= 0 Hacer
		sum = sum + entrada
		indice = Indice + 1
		
		Escribir "Ingrese un número, si es -1 terminara el proceso, el -1 no se tendra en cuenta en el promedio"
		leer entrada
		
	FinMientras
	
	si indice <> 0 Entonces
		prom = sum/indice
	SiNo
		prom = 0
	FinSi
	
	
	Escribir "el promedio de los numeros ingresados es: ", prom
FinAlgoritmo
