Algoritmo sin_titulo
	Definir n Como Entero
	leer n
	///Escribir ContadorDigitos(n)
	si Capicua(n) Entonces
		Escribir "El número es Capicúa"
	SiNo
		Escribir "El número no es Capicúa"
	FinSi
FinAlgoritmo

Funcion retorno <- ContadorDigitos(n)
	Definir retorno, aux como entero
	retorno = 1
	aux = n
	Hacer
		retorno = retorno + 1
		aux = trunc(aux/10)
	Mientras Que trunc(aux/10) <> 0	
FinFuncion

SubProceso retorno<-Capicua(n)
	Definir i, p, aux, aux1, cont Como Entero
	Definir retorno Como Logico
	
	retorno = Falso
	cont = ContadorDigitos(n)
	
	p=cont-1
	aux = n
	aux1 = n
	para i<-1 Hasta (cont-1)/2 Con Paso 1 Hacer
		///Escribir "izqui ", trunc(aux/10^p)
		///Escribir "dere ", aux1 mod 10
		si trunc(aux/10^p) == aux1 mod 10 Entonces
			retorno = Verdadero
		SiNo
			retorno = Falso
		FinSi
		aux = aux mod 10^p
		aux1 = trunc(aux1/10)
		p = p - 1		
	FinPara
FinSubProceso
	