Algoritmo sin_titulo
	definir matriz, i, j Como Entero
	Dimension matriz(5,5)
	CrearMatrizConCerosDiagonales(matriz, 5, 5)
	MostrarMatriz(matriz, 5, 5)
FinAlgoritmo
SubProceso CrearMatrizConCerosDiagonales(matriz Por Referencia, M, N)
	definir retorno, i, j Como Entero
	Dimension retorno(M,N)
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			si i==j Entonces
				retorno[i, j] = 0
				matriz[i, j] = retorno[i, j]
			SiNo
				retorno[i, j] = Aleatorio(0, 10) 
				matriz[i, j] = retorno[i, j]
			FinSi			
		FinPara		
	FinPara	
FinSubProceso
SubProceso MostrarMatriz(matriz, M, N)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			Escribir Sin Saltar " ",Matriz[i,j]," "
		FinPara
		Escribir ""
	FinPara
FinSubProceso