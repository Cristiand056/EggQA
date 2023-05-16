Algoritmo sin_titulo
	Definir n, factorial, i, j Como Entero
	Definir stringSalida, aux Como Caracter
	factorial = 1
	stringSalida = ""
	
	Escribir "Ingrese el número como entero positivo, para sacar su facotorial"
	Leer n
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		factorial = factorial * i
		si i == 1 Entonces
			stringSalida = Concatenar(stringSalida, ConvertirATexto(i))
			Escribir "!",i," = ", stringSalida
		SiNo
			aux = Concatenar("*", ConvertirATexto(i))
			stringSalida = Concatenar(stringSalida, aux)
			Escribir "!",i," = ", stringSalida, " = ", factorial
		FinSi
		
	FinPara
FinAlgoritmo
