Algoritmo sin_titulo
	Definir n, i, vector Como Entero
	
	Escribir "Cuentos números va a ingresar"
	leer n
	Dimension vector[n]
	
	para i<-0 Hasta n-1 Hacer
		leer vector[i]
	FinPara
	Buscador(vector, n)
	
FinAlgoritmo

SubAlgoritmo Buscador(vector, n)
	Definir criterioB, i Como Entero
	Definir bandera Como Logico
	
	Escribir "Ingrese el valor a buscar"
	Leer criterioB
	bandera = Falso
	para i<-0 Hasta n-1 Hacer
		si vector[i] == criterioB Entonces
			Escribir "El criterio ",criterioB," se encontro en el indice ",i
			bandera = Verdadero
		FinSi
		si !bandera	y i == n-1 Entonces
			Escribir "El criterio de busqueda ", criterioB," no se encuentra"
		FinSi
		
	FinPara
FinSubAlgoritmo
	