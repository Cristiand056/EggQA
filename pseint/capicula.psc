Algoritmo capicula
	Definir num, der, izq Como Entero
	
	Escribir "Ingrese el n�mero de tres cifras"
	Leer num
	
	der = trunc(num/100)
	izq = num % 10
	Escribir der, " ", izq
	
	si der == izq Entonces
		Escribir "Es capic�la"
	FinSi
	si der <> izq Entonces
		Escribir "No es Capic�la"
	FinSi
	
FinAlgoritmo
