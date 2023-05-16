Algoritmo sin_titulo
	Definir n Como Entero
	
	Escribir "Ingrese el número"
	leer n
	Escribir Impares(n)
	
FinAlgoritmo

Funcion retorno <- Impares(n)
	Definir retorno, control, final Como Logico
	Definir cont, p, i Como Entero
	Definir aux, div Como Real
	
	control = Verdadero
	retorno = falso
	cont = ContadorDigitos(n)
	aux = n
	p = cont-1
	para i<- 1 Hasta cont Con Paso 1 Hacer
		si trunc(aux/10^ p) mod 2 <> 0 Entonces
			retorno = Verdadero Y control
		SiNo
			control = Falso
			retorno = Falso
		FinSi
		aux = aux mod 10^ p
		p = p - 1
	FinPara
FinFuncion

Funcion retorno <- ContadorDigitos(n)
	Definir retorno, aux como entero
	retorno = 1
	aux = n
	Hacer
		retorno = retorno + 1
		aux = trunc(aux/10)
	Mientras Que trunc(aux/10) <> 0	
FinFuncion
	