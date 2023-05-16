Algoritmo sin_titulo
	Definir n, vectorA, vectorB, vectorC, i Como Entero
	Definir op, op1 Como Caracter
	Definir salir Como Logico
	Escribir "dimensió de los vectores"
	leer n
	salir = Falso
	Dimension vectorA[n] 
	Dimension vectorB[n] 
	Dimension vectorC[n]
	
	Mientras !salir Hacer
		Escribir "ingrese A, para Llenar Vector A."
		Escribir "ingrese B, para Llenar Vector B."
		Escribir "ingrese C, para Llenar Vector C como Suma del Vector A + Vector B)."
		Escribir "ingrese D, para Llenar Vector C como Resta del Vector B + Vector A)."
		Escribir "ingrese E, para mostrar Vectores "
		Escribir "ingrese F, para salir del menú"
		Leer op
		Segun op
			"A":
				//vectorA = CrearVector(n)
				Para i<-0 Hasta n-1 Hacer
					vectorA[i] = Aleatorio(0, 20)
				FinPara
			"B":
				//vectorB = CrearVector(n)
				Para i<-0 Hasta n-1 Hacer
					vectorB[i] = Aleatorio(0, 20)
				FinPara
			"C": 
				Para i<-0 Hasta n-1 Hacer
					vectorC[i] = vectorA[i] + vectorB[i]
				FinPara
			"D":
				Para i<-0 Hasta n-1 Hacer
					vectorC[i] = vectorB[i] + vectorC[i]
				FinPara
			"E": 
				Escribir "ingrese A, para ver el Vector A"
				Escribir "ingrese B, para ver el Vector B"
				Escribir "ingrese C, para ver el Vector C"
				leer op1
				Segun op1 Hacer
					"A":
						mostrarVector(vectorA, n)
					"B":
						mostrarVector(vectorB, n)
					"C":
						mostrarVector(vectorC, n)
				FinSegun
			"F":
				salir = Verdadero
				Escribir "Adíos ",salir
		FinSegun
	FinMientras
FinAlgoritmo

//SubProceso vector <- CrearVector(n)
//	Definir vector, max, min, i Como Entero
//	Dimension vector[n]
//	
//	Para i<-0 Hasta n-1 Hacer
//		vector[i] = Aleatorio(0, 20)
//	FinPara
//FinSubProceso

SubProceso mostrarVector(vector, n)
	Definir i Como Entero
	para i<-0 Hasta n-1 Hacer
		si i == 0 Entonces
			Escribir Sin Saltar "[ ",vector[i]
		SiNo
			Escribir Sin Saltar " ", vector[i]
		FinSi
		
	FinPara
	Escribir Sin Saltar" ]"
	Escribir ""
FinSubProceso
	