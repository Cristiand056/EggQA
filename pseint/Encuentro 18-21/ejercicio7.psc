Algoritmo sin_titulo
	Definir n Como Entero
	
	leer n 
	
	crearArreglos(n)
	
FinAlgoritmo

SubProceso crearArreglos(n)
	definir i, vectorA, vectorB, alea Como Entero
	Dimension vectorA[n], vectorB[n]

	para i<-0 Hasta n-1 Hacer
		vectorA[i] = Aleatorio(0, 100)
		vectorB[i] = Aleatorio(0, 100)
	FinPara
	
	si Comparador(vectorA, vectorB, n) Entonces
		Escribir "Todos sus valores son iguales"
	SiNo
		Escribir "Todos sus valores no son iguales"
	FinSi
FinSubProceso

Funcion retorno <- Comparador(vectorA, vectorB, n)
	Definir retorno Como Logico
	Definir i Como Entero
	
	para i<-0 Hasta n-1 Hacer
		si vectorA[i] == vectorB[i] Entonces
			retorno = Verdadero
			i = n
		SiNo
			retorno = Falso
		FinSi
	FinPara
	
	
	
FinFuncion
	