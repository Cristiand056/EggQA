Algoritmo sin_titulo
	definir vector, i Como Entero
	Dimension vector[10]
	para i<-0 Hasta 9 Hacer
		leer vector[i] 
		
	FinPara
	Operador(vector)
FinAlgoritmo
SubProceso Operador (vector)
	Definir i Como Entero
	Definir sum, res, mult Como Real
	
	sum = 0
	res = 0
	mult = 1
	
	para i<-0 Hasta 9 Hacer
		sum = sum + vector[i]
		si i == 0 Entonces
			res = vector[i]
		FinSi
		res = res - vector[i]
		mult = mult * vector[i]
	FinPara
	
	Escribir "La suma de los números del arreglo es: ", sum
	Escribir "La resta de los números del arreglo es: ", res
	Escribir "La multiplicación de los números del arreglo es: ", mult
FinSubProceso
	