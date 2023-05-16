Algoritmo sin_titulo
	Definir matriz, M, N Como Entero

	Dimension matriz(5,15)
	
	CrearMatrizCerosUnos(matriz,5,15)
	
	MostrarMatriz(matriz, 5,15)
FinAlgoritmo
SubProceso CrearMatrizCerosUnos(matriz Por Referencia, M, N)
	definir retorno, i, j Como Entero
	Dimension retorno(M,N)
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			si i==0 o i == M-1 o j==0 o j == N-1  Entonces
				retorno[i, j] = 1
				matriz[i, j] = retorno[i, j]
			SiNo
				retorno[i, j] = 0 
				matriz[i, j] = retorno[i, j]
			FinSi
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