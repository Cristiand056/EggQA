Algoritmo califica
	Definir calPar1, calPar2, calPar3, promPar, exaFin, trabFin, total Como Real
	
	Escribir "Ingrese la calificaci�n parcial 1"
	leer calPar1
	
	Escribir "Ingrese la calificaci�n parcial 2"
	leer calPar2
	
	Escribir "Ingrese la calificaci�n parcial 3"
	leer calPar3
	
	Escribir "Ingrese la calificaci�n del examen final"
	leer exaFin
	
	Escribir "Ingrese la calificaci�n del trabajo final"
	leer trabFin
	
	promPar <- (calPar1+calPar2+calPar3)/3 
	total <- promPar*0.55 + exaFin*0.3 +trabFin*0.15
	
	Escribir "La califiaci�n total es: ",total
FinAlgoritmo
