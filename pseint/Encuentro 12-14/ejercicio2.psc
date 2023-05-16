Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "ingrese el número a revisar"
	leer num
	si Verificar(num) Entonces
		Escribir "El número es par"
	SiNo
		Escribir "El número es impar"
	FinSi
FinAlgoritmo

Funcion retorno <- Verificar(num) 
	Definir retorno Como logico	
	retorno = num mod 2 == 0	
FinFuncion
