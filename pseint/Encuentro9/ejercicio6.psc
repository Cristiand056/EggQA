Algoritmo sin_titulo
	Definir frase, salida Como Caracter
	Definir i, n Como Entero
	Escribir "Ingrese la frase"
	Leer frase
	salida = ""
	n = Longitud(frase)
	Para i<-n Hasta 0 Con Paso -1 Hacer
		salida = Subcadena( frase ,i, i)
		
		Escribir Sin Saltar salida," "
	FinPara
FinAlgoritmo
