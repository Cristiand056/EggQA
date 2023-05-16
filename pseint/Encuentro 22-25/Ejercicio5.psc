Algoritmo sin_titulo
	Definir matriz, frase Como Caracter
	Dimension matriz(3,3)
	leer frase
	CrearMatrizConLaFrase(matriz, 3, 3, frase)
	MostrarMatriz(matriz, 3, 3)
FinAlgoritmo
SubProceso CrearMatrizConLaFrase(matriz Por Referencia, M, N, frase)
	definir i, j, cont1 Como Entero
	Definir retorno Como Caracter
	Dimension retorno(M,N)
	cont1 = 0

	Para i<-0 Hasta M-1 Hacer
		
		Para j<-0 Hasta N-1	Hacer
			retorno[i, j] = Subcadena(frase,cont1,cont1) 
			matriz[i, j] = retorno[i, j]
			cont1 = cont1 + 1
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