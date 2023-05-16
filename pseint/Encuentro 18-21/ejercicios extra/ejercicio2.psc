Algoritmo sin_titulo
	definir vector, i, n Como Entero
	leer n
	Dimension vector[n]
	para i<-0 Hasta n-1 Hacer
		leer vector[i] 
		
	FinPara
	Escribir "El promedio de los números es: ",Operador(vector, n)
FinAlgoritmo
SubProceso prom <- Operador (vector, n)
	Definir i Como Entero
	Definir sum, prom Como Real
	
	sum = 0
	
	para i<-0 Hasta n-1 Hacer
		sum = sum + vector[i]
	FinPara
	
	prom = sum/n
FinSubProceso