Algoritmo sin_titulo
	Definir contPar, contImpar, sumPar, sumImpar, num, totalNum Como Entero
	Definir promPar, promImpar Como Real
	
	sumPar = 0
	sumImpar = 0
	contPar = 0
	contImpar = 0
	totalNum = 10
	
	Hacer
		Escribir "Ingrese el número entero positivo, cantidad restante: ", totalNum
		Leer num
		
		si num mod 2 == 0 Entonces
			sumPar = sumPar + num
			contPar = contPar + 1
		SiNo
			sumImpar = sumImpar + num
			contImpar = contImpar + 1
		FinSi
		totalNum = totalNum - 1
	Mientras Que totalNum > 0
	
	promPar = sumPar / contPar
	Escribir "El promedio o media de los números pares es: ", promPar
	promImpar = sumImpar / contImpar
	Escribir "El promedio o media de los números pares es: ", promImpar
FinAlgoritmo
