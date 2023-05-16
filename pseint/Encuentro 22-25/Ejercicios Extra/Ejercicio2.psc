Algoritmo sin_titulo
	Definir matriz, M, N Como Entero
	Leer M
	Leer N
	Dimension matriz(M,N)
	
	CrearMatriz(matriz, M, N)
	Escribir "Matriz Original"
	MostrarMatriz(matriz, M, N)
	Escribir "Matriz Transpuesta"
	Transpuesta(matriz, M, N)
	
FinAlgoritmo
SubProceso MostrarMatriz(matriz, M, N)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			Escribir Sin Saltar " ",Matriz[i,j]
		FinPara
		Escribir ""
	FinPara
FinSubProceso
SubProceso CrearMatriz(matriz Por Referencia, M, N)
	definir retorno, i, j Como Entero
	Dimension retorno(M,N)
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			retorno[i, j] = Aleatorio(0, 100) 
			matriz[i, j] = retorno[i, j]
		FinPara		
	FinPara	
FinSubProceso
SubProceso Transpuesta(matriz Por Referencia, M, N)
	Definir matrizAux, i, j Como Entero
	Dimension matrizAux(M, N)
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			matrizAux[j, i] = matriz[i, j] 
		FinPara
		
	FinPara
	MostrarMatriz(matrizAux, M, N)
FinSubProceso
	