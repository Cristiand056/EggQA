Algoritmo sin_titulo
	definir matriz, i, j Como Entero
	
	Dimension matriz(3,3)
	
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir "Ingrese un número a la matriz"
			Leer matriz[i, j]
		FinPara
	FinPara
	MostrarMatriz(matriz, 3, 3)
	
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
	