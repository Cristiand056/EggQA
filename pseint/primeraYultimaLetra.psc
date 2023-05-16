Algoritmo primeraYultimaLetra
	Definir resp Como Caracter
	
	Escribir "Escriba su frase"
	Leer resp
	
	si Minusculas(Subcadena(resp, 0, 0)) == Minusculas(Subcadena(resp, Longitud(resp) - 1, Longitud(resp)-1)) Entonces
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
	FinSi
	
FinAlgoritmo
