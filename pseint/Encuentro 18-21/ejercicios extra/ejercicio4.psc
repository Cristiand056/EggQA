Algoritmo sin_titulo
	Definir notas, i, contDec, contRegu, contBuen, contExce Como Entero
	Dimension notas[100]

	Para i<-0 Hasta 99 Hacer
		notas[i] = Aleatorio(0,20)
	FinPara
	
	Buscador(notas)
FinAlgoritmo

SubProceso Buscador(vector)
	Definir i, contDec, contRegu, contBuen, contExce Como Entero
	contDec = 0
	contRegu = 0 
	contBuen = 0
	contExce = 0
	Para i<-0 Hasta 99 Hacer
		si vector[i] >= 0 y vector[i] < 6  Entonces
			contDec = contDec + 1
		FinSi
		si vector[i] >= 6 y vector[i] < 11  Entonces
			contRegu = contRegu + 1
		FinSi
		si vector[i] >= 11 y vector[i] < 16  Entonces
			contBuen = contBuen + 1
		FinSi
		si vector[i] >= 16 y vector[i] <= 20  Entonces
			contExce = contExce + 1
		FinSi
	FinPara
	
	Escribir "La cantidad de estudiantes con notas Deficientes es: ", contDec
	Escribir "La cantidad de estudiantes con notas Regulares es: ", contRegu
	Escribir "La cantidad de estudiantes con notas Buenas es: ", contBuen
	Escribir "La cantidad de estudiantes con notas Excelentes es: ", contExce
FinSubProceso
	