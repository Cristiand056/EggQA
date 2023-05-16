Algoritmo voltearNumero
	Definir numIn, numOut Como Entero
	
	Escribir "Ingrese el número de dos cifras" 
	Leer numIn
	
	numOut <- (numIn%10)*10+trunc(numIn/10)
	
	Escribir "El número invertido es: ", numOut
	
	
FinAlgoritmo
