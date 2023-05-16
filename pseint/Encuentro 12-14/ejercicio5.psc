Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "ingrese el número a revisar"
	leer num
	si Verificar(num) Entonces
		Escribir "El número es primo"
	SiNo
		Escribir "El número es no es primo"
	FinSi
FinAlgoritmo

Funcion retorno <- Verificar(num) 
	Definir retorno Como logico	
	si num == 2 o num == 3 Entonces
		retorno =  num mod 1 == 0 y num mod num == 0 
	SiNo
		retorno = num mod 1 == 0 y num mod num == 0 y num mod 2 <> 0 y num mod 3 <> 0
	FinSi
	
	 
FinFuncion
