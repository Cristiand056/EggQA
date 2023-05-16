Algoritmo sin_titulo
	Definir frase Como Caracter
	
	leer frase
	
	Escribir BorrarRepetidos(frase)
FinAlgoritmo

SubProceso retorno <- BorrarRepetidos(frase )
	Definir retorno, aux Como Caracter
	Definir banderaA,banderaE, banderaI, banderaO, banderaU Como Logico
	Definir i Como Entero
	retorno = ""
	banderaA = Falso
	banderaE = Falso
	banderaI = Falso
	banderaO = Falso
	banderaU = Falso
	para i <- 0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		aux = Subcadena(frase,i,i)
		Segun Minusculas(aux) Hacer
			"a": 
				si !banderaA Entonces
					retorno = Concatenar(retorno, aux)
					banderaA = Verdadero
					
				SiNo
					aux=""
					retorno = Concatenar(retorno, aux)
				FinSi
				
				
			"e": 
				si !banderaE Entonces
					retorno = Concatenar(retorno, aux)
					banderaE = Verdadero
					
				SiNo
					aux=""
					retorno = Concatenar(retorno, aux)
				FinSi
			"i": 
				si !banderaI Entonces
					retorno = Concatenar(retorno, aux)
					banderaI = Verdadero
					
				SiNo
					aux=""
					retorno = Concatenar(retorno, aux)
				FinSi
			"o": 
				si !banderaO Entonces
					retorno = Concatenar(retorno, aux)
					banderaO = Verdadero
					
				SiNo
					aux=""
					retorno = Concatenar(retorno, aux)
				FinSi
			"u": 
				si !banderaU Entonces
					retorno = Concatenar(retorno, aux)
					banderaU = Verdadero
					
				SiNo
					aux=""
					retorno = Concatenar(retorno, aux)
				FinSi
			De Otro Modo:
				retorno = Concatenar(retorno, aux)
		FinSegun
	FinPara
FinSubProceso