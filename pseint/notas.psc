Algoritmo notas
	Definir num1, num2, num3 Como Reales
	Definir log Como Logico
	
	log = Falso
	
	Escribir "Ingrese la nota no 1"
	Leer num1
	
	Escribir "Ingrese la nota no 2"
	Leer num2
	
	Escribir "Ingrese la nota no 3"
	Leer num3
	
	SI num1 < 0 o num1 > 10 o num2 < 0 o num2 > 10  o num3 < 0 o num3 > 10 Entonces
		log = Verdadero
	FinSi
	
	si !log Entonces
		Escribir "Las notas estan dentro del parametro"
	SiNo
		Escribir "Las notas estan fuera del parametro"
	FinSi
FinAlgoritmo
