Algoritmo sin_titulo
	Definir signo  Como Caracter
	Definir tamanio, i, j, aux Como Entero
	
	signo = " . "
	Escribir "Ingrese el tamaño de la escalera invertida"
	Leer tamanio
	aux = tamanio
	Para i<-1 Hasta tamanio Con Paso 1 Hacer
		
		Para j<-1 Hasta aux Con Paso 1 Hacer
			
			Escribir Sin Saltar signo
			
		FinPara
		aux = aux - 1
		Escribir ""
	FinPara
FinAlgoritmo
