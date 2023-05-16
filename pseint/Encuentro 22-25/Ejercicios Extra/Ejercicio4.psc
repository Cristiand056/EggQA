Algoritmo sin_titulo
	Definir matriz1, matriz2, matriz3  Como Entero
	
	Dimension matriz1(3,3)
	Dimension matriz2(3,3)
	Dimension matriz3(3,3)
	Escribir "Matriz 1"
	CrearMatriz(matriz1, 3, 3)
	MostrarMatriz(matriz1, 3, 3)
	Escribir "Matriz 2"
	CrearMatriz(matriz2, 3, 3)
	MostrarMatriz(matriz2, 3, 3)
	Escribir "Multiplicaión de las matrices"
	MuliplicarNatrices(matriz1, matriz2, matriz3, 3, 3)
	MostrarMatriz(matriz3, 3, 3)
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
SubProceso MostrarMatriz(matriz, M, N)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			Escribir Sin Saltar " ",Matriz[i,j]
		FinPara
		Escribir ""
	FinPara
FinSubProceso
SubProceso MuliplicarNatrices(matriz1, matriz2, matriz3 Por Referencia, M, N)
	definir retorno, i, j, z, sum, mul Como Entero
	sum = 0
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			Para z<-0 Hasta 2 Hacer
				mul = matriz1[i, z] * matriz2[z, j]
				sum = sum + mul
			FinPara
			matriz3[i,j] = sum
			sum = 0
		FinPara	
	FinPara	
FinSubProceso
	