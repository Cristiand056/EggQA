Algoritmo sin_titulo
	Definir vector1, i, ingreso Como Entero
	Dimension vector1[20]
	
	Para i<-0 Hasta 19 Hacer
		vector1[i] = Aleatorio(0,100)
		Escribir Sin Saltar " ", vector1[i]," "
	FinPara
	Escribir ""
	Escribir "La diverencia entre elnumero menor y el numero mayor del arreglo es: ",Diferencia(vector1)
	
FinAlgoritmo
SubProceso resultado <- Diferencia(vector)
	Definir resultado, i, mayor, menor Como Entero
	mayor = 0
	menor = 0
	Para i<-0 Hasta 19 Hacer
		si vector[i] > mayor Entonces
			mayor = vector[i]
		FinSi
		
		si menor == 0 Entonces
			menor = vector[i]
		FinSi
		
		si menor <> 0 y vector[i] < menor Entonces
			menor = vector[i]
		FinSi
	FinPara
	Escribir mayor, " ", menor
	resultado = mayor - menor
FinSubProceso
	