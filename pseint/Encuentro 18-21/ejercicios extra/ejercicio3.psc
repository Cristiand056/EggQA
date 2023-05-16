Algoritmo sin_titulo
	Definir vectorNombres, nombre Como Caracter
	Definir vectorLongitud, i, n Como Entero
	Escribir "Ingrese la longitud"
	Leer n
	Dimension vectorNombres[n], vectorLongitud[n]
	Para i<-0 Hasta n-1 Hacer
		Escribir "nombre no ",i+1
		leer nombre
		
		vectorNombres[i] = nombre
		vectorLongitud[i] = Longitud(nombre)
	FinPara
	
	para i<-0 Hasta n-1 Hacer
		Escribir "El nombre ", vectorNombres[i], " tiene una longitud de ", vectorLongitud[i]
	FinPara
FinAlgoritmo
