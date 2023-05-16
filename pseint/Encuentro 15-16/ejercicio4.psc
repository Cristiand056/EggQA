Algoritmo sin_titulo
	Definir frase Como Caracter
	
	Escribir "Ingrese su frase a códificar"
	leer frase
	
	Escribir Codificador(frase)
	
	
FinAlgoritmo

SubProceso retorno <- Codificador(frase )
	Definir retorno, aux Como Caracter
	Definir i Como Entero
	retorno = ""
	para i <- 0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		aux = Subcadena(frase,i,i)
		Segun Minusculas(aux) Hacer
			"a": 
				aux = "@"
				retorno = Concatenar(retorno, aux)
			"e": 
				aux = "#"
				retorno = Concatenar(retorno, aux)
			"i": 
				aux = "$"
				retorno = Concatenar(retorno, aux)
			"o": 
				aux = "%"
				retorno = Concatenar(retorno, aux)
			"u": 
				aux = "*"
				retorno = Concatenar(retorno, aux)
			De Otro Modo:
				retorno = Concatenar(retorno, aux)
		FinSegun
	FinPara
FinSubProceso
	