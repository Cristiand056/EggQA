Algoritmo sin_titulo
	Definir n Como Entero
	Escribir "Ingrese el numero"
	Leer n
	
	Escribir "La suma de los numeros divisores del número, ",n," es: ",SumarDivisores(n)
FinAlgoritmo

Funcion retorno <- SumarDivisores(n)
	Definir retorno, i Como Entero
	retorno = 0
	
	para i<-1 Hasta n Con Paso 1 Hacer
		si i <> n y n mod i == 0 Entonces
			retorno = retorno + i
		FinSi
	FinPara
FinFuncion
	