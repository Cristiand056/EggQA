Algoritmo sin_titulo
	Definir n, i, vector Como Entero
	
	Escribir "Cuentos números va a ingresar"
	leer n
	Dimension vector[n]
	
	para i<-0 Hasta n-1 Hacer
		leer vector[i]
	FinPara
	Buscador(vector, n)
	
FinAlgoritmo
SubAlgoritmo Buscador(vector, n)
	Definir mayor, i Como Entero
	
	mayor = 0

	para i<-0 Hasta n-1 Hacer
		si vector[i] > mayor Entonces
			mayor = vector[i]
		FinSi
	FinPara
	Escribir "El número mayor dentro del arreglo es: ", mayor
FinSubAlgoritmo

