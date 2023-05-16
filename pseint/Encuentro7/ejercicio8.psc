Algoritmo sin_titulo
	Definir num, cont, aux Como Entero
	Definir div Como Real
	Definir bandera Como Logico 
	
	Escribir "Ingrese un número entero positivo"
	Leer num
	
	bandera = Falso
	cont = 0
	Mientras !bandera Hacer
		div = num/10
		cont = cont + 1
		si trunc(div) == 0 Entonces
			bandera = Verdadero 
		FinSi
		
		num = trunc(div)
	FinMientras
	
	Escribir "La cantidad de digitos del número es: ", cont
FinAlgoritmo
