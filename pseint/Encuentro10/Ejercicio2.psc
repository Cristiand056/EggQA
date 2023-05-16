Algoritmo sin_titulo
	Definir signo  Como Caracter
	Definir tamanio, i, j Como Entero
	
	signo = " * "
	Escribir "Ingrese el tamaño"
	Leer tamanio
	Para i<-1 Hasta tamanio Con Paso 1 Hacer
		
		Para j<-1 Hasta tamanio Con Paso 1 Hacer
			si j == 1 o j == tamanio o i == 1 o i == tamanio Entonces
				Escribir Sin Saltar signo
			SiNo
				Escribir Sin Saltar"   "
			FinSi
			
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
