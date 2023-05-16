Algoritmo sin_titulo
	definir num1, num2 Como Entero
	Definir resultado Como Logico
	
	Escribir "Ingrese el número a verificar"
	leer num1
	Escribir "Ingrese el posible multiplo"
	leer num2
	
	Escribir Multiplo(num1, num2)
FinAlgoritmo

Funcion retorno <- Multiplo (num1, num2) 
	Definir retorno Como Logico
	si num1 mod num2 == 0 Entonces
		retorno = Verdadero
	SiNo
		retorno = Falso
	FinSi
	
	
FinFuncion
