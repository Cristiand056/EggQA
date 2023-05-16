Algoritmo sin_titulo
	definir nMax Como Entero
	
	Escribir "Ingrese la n maximo de la suceción Fibonacci deseada"
	leer nMax	
	Escribir Fibonacci(nMax)
	Escribir ""
FinAlgoritmo

//Funcion Fibonacci (nMax)
//	Definir f1, f2, f3, i Como Entero
//	f1 = 0
//	f2 = 1
//	
//	Para i <- 1 Hasta nMax Con Paso 1 Hacer
//		si i == nMax Entonces
//			Escribir Sin Saltar f2, ",.... "
//		SiNo
//			Escribir Sin Saltar f2, ", "
//		FinSi
//		
//		f3 = f1 + f2
//		
//		f1 = f2
//		f2 = f3
//	FinPara
//	
//	
//FinFuncion
///fibonachi recurción
Funcion retorno <- Fibonacci(n)
	Definir retorno Como entero
	si n == 1 o n == 2 Entonces
		retorno = 1
	SiNo
		retorno = Fibonacci(n-1) +Fibonacci(n-2)
	FinSi
FinFuncion
	