Algoritmo sin_titulo
	definir matriz Como Caracter
	Dimension matriz(9, 12)
	InicializarMatriz(matriz, 9, 12)
	//ImprimirMatriz(matriz,9,12)
	LlenarMatriz(matriz)
	ImprimirMatriz(matriz,9,12)
	AcomodarPlabra(matriz)
	Escribir "Matriz Acomodada"
	Escribir ""
	ImprimirMatriz(matriz, 9, 12)
FinAlgoritmo
SubProceso InicializarMatriz(matriz Por Referencia, M, N)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			matriz[i, j] = "*"
		FinPara
	FinPara
FinSubProceso
SubProceso ImprimirMatriz(matriz, M, N)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			Escribir Sin Saltar " ",Matriz[i,j]
		FinPara
		Escribir ""
	FinPara
FinSubProceso	
SubProceso AgregarPalabra(matriz Por Referencia, palabra, fila)
	Definir i Como Entero
	Para i<-0 Hasta 11
		
		matriz[fila, i] = Subcadena(palabra,i,i)
		si matriz[fila, i]=="" Entonces
			matriz[fila,i] = "*"
		FinSi
	FinPara
FinSubProceso
SubProceso columna <- BuscarR(matriz, fila)
	Definir criterio Como Caracter
	Definir i, columna Como Entero
	Definir bandera Como Logico
	bandera = Falso
	criterio = "R"
	para i<-0 Hasta 11 Hacer
		si matriz[fila, i] == criterio y !bandera Entonces
			columna = i
			bandera = Verdadero
		FinSi
	FinPara
FinSubProceso
SubProceso AcomodarPlabra(matriz Por Referencia)
 	Definir vectorAuxiliar Como Caracter
	Definir i, j, r, diferencia, cont Como Entero
	Dimension vectorAuxiliar(12)
	Para i<-0 Hasta 8 Hacer
		r = BuscarR(matriz, i)
		//Escribir "R", r, "fila ",i
		diferencia = abs(r-5)
		//Escribir "Diferencia ",diferencia
		InicializarVector(vectorAuxiliar)
		cont = 0
		si r <> 5 Entonces
			Para j<-0 Hasta 11 Hacer
				vectorAuxiliar[j] = matriz[i,j]			
				matriz[i,j] = "*"
				//Escribir "Vector auxiliar ", vectorAuxiliar[j]
			FinPara
				
			Para j<-diferencia Hasta 11 Hacer
				//Escribir "vector ",vectorAuxiliar[cont]
				si vectorAuxiliar[cont] == ""  Entonces
					matriz[i,j] = "*"
					
				SiNo
					matriz[i,j] = vectorAuxiliar[cont]
					
				FinSi
				
				cont = cont + 1
			FinPara
		FinSi
	FinPara
FinSubProceso
SubProceso LlenarMatriz(matriz Por Referencia)
	Definir i,j Como Entero
	Definir frase Como Caracter
	para i<-0 Hasta 8 Hacer
		Escribir "Frase fila ",i+1
		leer frase
		frase = Mayusculas(frase)
		AgregarPalabra(matriz, frase, i)
	FinPara
FinSubProceso
SubProceso InicializarVector(vectorAuxiliar Por Referencia)
	definir i Como Entero
	Para i<-0 Hasta 11
		vectorAuxiliar[i] = "*"
	FinPara
FinSubProceso
	