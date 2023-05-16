Algoritmo sin_titulo
	definir matriz, i, j, factorBusqueda Como Entero
	
	Dimension matriz(5,5)
	
	CrearMatriz(matriz, 5, 5)
	
	Escribir "Ingrese el número a buscar"
	leer factorBusqueda
	
	BuscarNumero(matriz, factorBusqueda, 5, 5)
//	MostrarMatriz(matriz, 5, 5)
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
//SubProceso MostrarMatriz(matriz, M, N)
//	Definir i, j Como Entero
//	Para i<-0 Hasta M-1 Hacer
//		Para j<-0 Hasta N-1 Hacer
//			Escribir Sin Saltar " ",Matriz[i,j]," "
//		FinPara
//		Escribir ""
//	FinPara
//FinSubProceso
SubProceso BuscarNumero(matriz, factorBusqueda, M, N)
	definir i, j Como Entero
	Definir bandera Como Logico
	bandera = Falso
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			si matriz[i, j] == factorBusqueda Entonces
				Escribir "El número ", factorBusqueda," se encontro en las cordenadas [",i,", ",j,"]"," de la matriz"
				bandera = Verdadero
			FinSi
		FinPara
	FinPara
	si !bandera Entonces
		Escribir "El número ",factorBusqueda," no se encontro dentro de la matriz"
	FinSi
FinSubProceso
	