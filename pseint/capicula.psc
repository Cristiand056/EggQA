Algoritmo capicula
	Definir num, der, izq Como Entero
	
	Escribir "Ingrese el número de tres cifras"
	Leer num
	
	der = trunc(num/100)
	izq = num % 10
	Escribir der, " ", izq
	
	si der == izq Entonces
		Escribir "Es capicúla"
	FinSi
	si der <> izq Entonces
		Escribir "No es Capicúla"
	FinSi
	
FinAlgoritmo
