Algoritmo enc3Ninos
	Definir ninas, ninos, total Como Entero
	Definir p_ninos, p_ninas Como Real
	
	Escribir "Ingrese el total de alumnos en el curso"
	Leer total
	Escribir "Ingrese la cantidad de niñas"
	Leer ninas
	
	ninos = total-ninas	
	p_ninos = (ninos/total)*100
	
	p_ninas = 100-p_ninos
	
	Escribir "El porcentaje de niños es: ",p_ninos,"% y el porcentaje de niñas es: ",p_ninas,"%" 
FinAlgoritmo
