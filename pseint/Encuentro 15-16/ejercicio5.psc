Algoritmo sin_titulo
	definir frase Como Caracter
	leer frase
	
	Escribir EspacioLetras(frase)
FinAlgoritmo

SubProceso retorno<-EspacioLetras(frase)
	Definir retorno, aux Como Caracter
	Definir i Como Entero
	retorno = ""
	para i<-0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		aux = Subcadena(frase,i,i)
		si aux <> " " Entonces
			aux = Concatenar(aux," ")
			retorno = Concatenar(retorno, aux)
		SiNo
			retorno = Concatenar(retorno, aux)
		FinSi
				
	FinPara
FinSubProceso
	