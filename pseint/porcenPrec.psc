Algoritmo porcenPrec
	Definir precInc, precFin, porcen Como Real
	
	Escribir "Ingrese el precio a principio de año"
	Leer precInc
	Escribir "Ingrese el precio a fin de año"
	Leer precFin
	
	porcen <- (precFin - precInc)*100/precInc
	
	Escribir "El porcentaje que subio el precio fue de un ",porcen," %" 
FinAlgoritmo
