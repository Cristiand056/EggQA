Algoritmo porcenPrec
	Definir precInc, precFin, porcen Como Real
	
	Escribir "Ingrese el precio a principio de a�o"
	Leer precInc
	Escribir "Ingrese el precio a fin de a�o"
	Leer precFin
	
	porcen <- (precFin - precInc)*100/precInc
	
	Escribir "El porcentaje que subio el precio fue de un ",porcen," %" 
FinAlgoritmo
