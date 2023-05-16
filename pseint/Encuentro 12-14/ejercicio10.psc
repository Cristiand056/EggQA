Algoritmo sin_titulo
	definir n Como Entero
	leer n
	Escribir "la suma es: ", Sumador(n)
	
FinAlgoritmo

Funcion retorno <- Sumador (n)
	definir retorno Como Entero
	
	retorno = trunc(n/10) + n mod 10 
FinFuncion
	