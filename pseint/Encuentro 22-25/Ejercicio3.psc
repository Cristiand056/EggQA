Algoritmo sin_titulo
	definir matriz, i, j, factorBusqueda,n, m Como Entero
	Escribir "Ingrese el n de la matris"
	Leer n
	Escribir "Ingrese el m de la matris"
	Leer m
	
	Dimension matriz(n,m)
	
	CrearMatriz(matriz, n, m)
	
	Escribir "Matriz creada: "
	MostrarMatriz(matriz, n, m)
	
	Escribir "La suma de los elementos de la matriz creada es: ", SumarMatriz(matriz, n, m)
	
FinAlgoritmo

SubProceso CrearMatriz(matriz Por Referencia, M, N)
	definir retorno, i, j Como Entero
	Dimension retorno(M,N)
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			retorno[i, j] = Aleatorio(0, 10) 
			matriz[i, j] = retorno[i, j]
		FinPara		
	FinPara	
FinSubProceso

SubAlgoritmo sum <- SumarMatriz(matriz, M, N)
	definir sum, i, j Como Entero
	sum = 0
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			sum = sum + matriz[i, j]
		FinPara		
	FinPara
FinSubAlgoritmo

SubProceso MostrarMatriz(matriz, M, N)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			Escribir Sin Saltar " ",Matriz[i,j]," "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	