Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "ingrese el n�mero a revisar"
	leer num
	si Verificar(num) Entonces
		Escribir "El n�mero es par"
	SiNo
		Escribir "El n�mero es impar"
	FinSi
FinAlgoritmo

Funcion retorno <- Verificar(num) 
	Definir retorno Como logico	
	retorno = num mod 2 == 0	
FinFuncion
