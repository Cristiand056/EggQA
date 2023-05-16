Algoritmo sin_titulo
	Definir vector1, vector2, i, ingreso Como Entero
	Dimension vector1[5], vector2[5]
	
	Para i<-0 Hasta 4 Hacer
		vector1[i] = Aleatorio(0,10)
		vector2[i] = Aleatorio(0,10)
	FinPara
	
	Escribir "Vector 1: "
	MostrarVector(vector1, 5)
	Escribir "Vector 2: "
	MostrarVector(vector2, 5)
	
FinAlgoritmo
SubProceso MostrarVector(vector, n)
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