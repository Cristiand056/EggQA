// Diseña un programa que guarde una vocal secreta en una variable, debemos pedirle al usuario
// que intente adivinar la vocal secreta, e intentará tantas veces como sea necesario hasta que la
// adivine.

Algoritmo vocalSecreta
	Definir vocales, secreto, vocal Como Caracter
	Definir indice Como Entero
	
	vocales = "aeiou"
	indice = AZAR(5)
	secreto = Subcadena(vocales, indice, indice)
	
	Escribir "Intenta adivinar la vocal"
	Leer vocal
	
	Mientras vocal <> secreto Hacer
		Escribir "Incorrecto! Intenta otra vez"
		Leer vocal
	Fin Mientras
	
	Escribir "Felicidades! Adivinaste la vocal"
	
FinAlgoritmo
