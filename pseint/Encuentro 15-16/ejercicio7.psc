Algoritmo sin_titulo
	Definir altura Como Entero
	Leer altura
	Escalera(altura)
FinAlgoritmo

SubAlgoritmo Escalera(altura)
	Definir i Como Entero
	Definir aux Como Caracter
	aux = ""
	para i<- 1 Hasta altura Hacer
		aux = Concatenar(aux, ConvertirATexto(i))
		Escribir Sin Saltar aux
		Escribir ""
	FinPara
FinSubAlgoritmo
