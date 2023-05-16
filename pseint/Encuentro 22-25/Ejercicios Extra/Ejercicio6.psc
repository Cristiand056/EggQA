Algoritmo sin_titulo
	Definir matriz1, vector, matriz3  Como Entero
	
	Dimension matriz1(3,3)
	Dimension vector(3)
	Dimension matriz3(3, 1)
	Escribir "Matriz"
	CrearMatriz(matriz1, 3, 3)
	MostrarMatriz(matriz1, 3, 3)
	Escribir "Vector"
	CrearVector(vector, 3)
	MostrarVector(vector, 3)
	Escribir "Multiplicaión de las matrices"
	MuliplicarMatrizPorVector(matriz1, vector, matriz3, 3, 3)
	MostrarMatriz(matriz3, 3, 1)
FinAlgoritmo
SubProceso CrearMatriz(matriz Por Referencia, M, N)
	definir retorno, i, j Como Entero
	Dimension retorno(M,N)
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			leer retorno[i, j]  
			matriz[i, j] = retorno[i, j]
		FinPara		
	FinPara	
FinSubProceso
SubProceso CrearVector(vector Por Referencia, M)
	definir i Como Entero	
	Para i<-0 Hasta M-1 Hacer		
			leer vector[i]			
	FinPara			
FinSubProceso
SubProceso MostrarVector(vector, M)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Hacer
		
		Escribir Sin Saltar " ",vector[i]
		
	FinPara
	Escribir ""
FinSubProceso
SubProceso MostrarMatriz(matriz, M, N)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			Escribir Sin Saltar " ",Matriz[i,j]
		FinPara
		Escribir ""
	FinPara
FinSubProceso
SubProceso MuliplicarMatrizPorVector(matriz1, vector, matriz3 Por Referencia, M, N)
	definir retorno, i, j, z, sum, mul Como Entero
	sum = 0
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			Para z<-0 Hasta 2 Hacer
				mul = matriz1[i, z] * vector[z]
				sum = sum + mul
			FinPara
			matriz3[i,0] = sum
			sum = 0
		FinPara	
	FinPara	
FinSubProceso
