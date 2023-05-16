Algoritmo sin_titulo
	Definir dividendo, divisor Como Entero
	
	Escribir "Ingrese el dividendo"
	leer dividendo
	Escribir "Ingrese el divisor"
	leer divisor
	
	division(dividendo, divisor)
	
	DivisionRecur(dividendo, divisor, 0)
	
FinAlgoritmo

SubProceso division(dividendo, divisor)
	Definir resultado, cont Como Entero
	cont = 0
	Hacer
		resultado = dividendo - divisor
		cont = cont + 1
		dividendo = resultado
	Mientras Que resultado > divisor
	
	Escribir "El residuo es: ", resultado
	Escribir "El cociente es: ", cont
FinSubProceso

SubProceso DivisionRecur(dividendo, divisor, cont)
	Definir residuo Como Entero
	residuo = dividendo
		
	si residuo > divisor Entonces
		residuo = residuo - divisor
		dividendo = residuo
		cont = cont + 1
		DivisionRecur(dividendo, divisor, cont)
		
	SiNo
		Escribir "El residuo es: ", residuo
		Escribir "El cociente es: ", cont
	FinSi
		
FinSubProceso
	