Algoritmo sin_titulo
	Definir resp Como Caracter
	
	Escribir "Escriba su frase de 4 caracteres"
	Leer resp
	
	si Longitud(resp) == 4 Entonces
		Escribir Concatenar(resp, "!")
	SiNo
		Escribir Concatenar(resp, "?")
	FinSi
FinAlgoritmo
