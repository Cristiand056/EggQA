Algoritmo vocalConsonate
	Definir a Como caracter
	Definir comp Como Logico
	
	Escribir "Ingrese la letra"
	Leer a
	comp = Falso
	
	si a == "a" o a == "e " o a == "i" o a == "o" o a == "u" Entonces
		comp = Verdadero
	FinSi
	
	si comp Entonces
		Escribir "La letra es una vocal"
	FinSi
	
	si !comp Entonces
		Escribir "La letra es una consonate"
	FinSi
	
FinAlgoritmo
