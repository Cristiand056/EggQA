Funcion retorno <- Sumar ( num1, num2 Por Referencia )
	Definir retorno Como Entero
	retorno = num1 + num2
FinFuncion

Algoritmo Prueba
		Definir num1, num2, resultado Como Entero
		Escribir "Ingrese el primer número a sumar"
		leer num1
		Escribir "Ingrese el segundo número a sumar"
		leer num2
		
		resultado = Sumar(num1,num2)
		Escribir "El resultado de la suma es: " resultado
FinAlgoritmo