Algoritmo sin_titulo
	Definir n, cont, num Como Entero
	Definir div Como Real
	Definir bandera Como Logico
	cont = 0
	bandera = Falso
	Leer n
	num = n
	Mientras !bandera Hacer		
		div = num/10
		cont = cont + 1
		si trunc(div) == 0 Entonces
			bandera = Verdadero
		FinSi
		num = trunc(div)
	FinMientras
	
	Escribir "numero de digitos es: ",cont
FinAlgoritmo
