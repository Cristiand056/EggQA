Algoritmo sin_titulo
	Definir matriz Como entero
	Dimension matriz(3,3)
	CrearMatrizMagica(matriz, 3, 3)
	verificarMagia(matriz, 3, 3)
FinAlgoritmo
SubProceso CrearMatrizMagica(matriz Por Referencia, M, N)
	definir retorno, i, j, num Como Entero
	Definir bandera Como Logico
	bandera = Falso
	Dimension retorno(M,N)
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			si bandera Entonces
				j = j - 1
			FinSi
			Escribir "Ingrese el número del 1 al 9"
			leer num
			si num > 9 o num < 0 Entonces
				Escribir "Número incorrecto"
				bandera = Verdadero
			SiNo
				retorno[i, j] = num 
				matriz[i, j] = retorno[i, j]
				bandera = Falso
			FinSi			
		FinPara		
	FinPara	
FinSubProceso

SubProceso  verificarMagia(matriz, M, N)
	Definir suma, sumaDiagonal ,sumaAux, i, j Como Entero
	Definir bandera Como Logico
	bandera = Falso
	suma = 0
	sumaAux = 0
	sumaDiagonal = 0
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1	Hacer
			si i == j Entonces
				sumaDiagonal = sumaDiagonal + matriz[i, j]
			FinSi
			suma = suma + matriz[i, j]
			Escribir " .... ", matriz[i, j]
		FinPara
		si i > 0 y suma <> sumaAux Entonces
			bandera = Verdadero
		FinSi
		si i == 0 Entonces
			sumaAux = suma
		FinSi
		si sumaDiagonal <> sumaAux y j == 3 y i == 3 Entonces
			bandera = Verdadero
		FinSi
		suma = 0
	FinPara
	si !bandera Entonces
		Escribir "El numero magico es ",sumaAux
	SiNo
		Escribir "Esta matriz no tiene magia"
	FinSi
FinSubProceso
	