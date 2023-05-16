Algoritmo sin_titulo
	definir frase, letra Como Caracter
	Definir resultado Como Entero
	Escribir "Ingrese la frase en donde buscar"
	leer frase
	Escribir "Ingrese la letra a buscar"
	leer letra
	
	resultado = Encontrar(frase, letra)
	
	Escribir "La cantidad de veces que la letra ", letra, " se encuentra en la frase es: ", resultado
FinAlgoritmo

Funcion retorno <- Encontrar(frase, letra)	
	Definir retorno, i Como Entero
	retorno = 0
	para i<- 1 Hasta Longitud(frase) Con Paso 1 Hacer
		si subcadena(frase, i, i) == letra Entonces
			retorno = retorno + 1
		FinSi
	FinPara
FinFuncion
	