Algoritmo enc3Ninos
	Definir ninas, ninos, total Como Entero
	Definir p_ninos, p_ninas Como Real
	
	Escribir "Ingrese el total de alumnos en el curso"
	Leer total
	Escribir "Ingrese la cantidad de ni�as"
	Leer ninas
	
	ninos = total-ninas	
	p_ninos = (ninos/total)*100
	
	p_ninas = 100-p_ninos
	
	Escribir "El porcentaje de ni�os es: ",p_ninos,"% y el porcentaje de ni�as es: ",p_ninas,"%" 
FinAlgoritmo
