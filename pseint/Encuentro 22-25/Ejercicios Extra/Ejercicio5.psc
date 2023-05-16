Algoritmo sin_titulo
	Definir col, matriz Como Entero
	Escribir "Ingrese el número de columnas"
	leer col
	Dimension matriz(3, col)
	CrearMatriz1(matriz, 3, col)
	MostrarMatriz(matriz, 3, col)
	
FinAlgoritmo
SubProceso CrearMatriz1(matriz Por Referencia, M, N)
	definir retorno, i, j Como Entero
	Dimension retorno(M,N)
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			si j < 2 Entonces
				leer retorno[i, j] 
				matriz[i, j] = retorno[i, j]
			SiNo
				matriz[i, j] = matriz[i, 0] + matriz[i, 1]
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