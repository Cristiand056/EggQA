Algoritmo sin_titulo
	Definir cont, num, mayor, menor, sum Como Entero
	Definir prom Como Real
	cont = 0
	mayor = 0
	menor = 0
	sum = 0
	
	Hacer
		Escribir "Ingrese un n�mero entero positivo"
		Escribir "si ingresa el n�mero 0 se finalizara el programa"
		Leer num
		si num <> 0 Entonces
			sum = sum + num
			si num > mayor Entonces
				mayor = num
			FinSi
			si menor == 0 Entonces
				menor = num
			SiNo
				si num < menor Entonces
					menor = num
				FinSi
			FinSi
			cont = cont + 1
		FinSi
		
	Mientras Que num <> 0
	
	si cont <> 0 Entonces
		prom = sum/cont
	SiNo
		prom = 0
	FinSi	
	
	Escribir "El n�mero mayor es: ", mayor
	Escribir "El n�mero menor es: ",menor
	Escribir "El promedio de los n�meros es: ", prom
FinAlgoritmo
