Algoritmo sin_titulo
	Definir n, i, j Como Entero
	Definir stringSalida, aux Como Caracter
	stringSalida = ""

	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "Ingrese el número no ",i, "debe ser entre 1 a 20"
		Leer n	
		si n >= 0 y n<=20 Entonces
			Para j<-1 Hasta n Hacer
				stringSalida = Concatenar(stringSalida, "*")			
			FinPara
			Escribir n," ", stringSalida
			stringSalida = ""
		SiNo
			Escribir "Número erroneo"
		FinSi		
	FinPara
FinAlgoritmo
