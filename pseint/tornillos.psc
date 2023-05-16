Algoritmo tornillos
	Definir torSinDefectos, torConDefectos Como Entero
	
	Escribir "Ingrese el número de los tornillo con defectos"
	Leer torConDefectos
	Escribir "Ingrese el número de los tornillo sin defectos"
	Leer torSinDefectos
	
	si torConDefectos > 200 Entonces
		si torSinDefectos > 10000 Entonces
			Escribir "la eficiencia del operario es de grado 7"
		SiNo
			Escribir "la eficiencia del operario es de grado 5"
		FinSi
	SiNo
		si torSinDefectos > 10000 Entonces	
			Escribir "la eficiencia del operario es de grado 8"
		SiNo
			Escribir "la eficiencia del operario es de grado 6"
		FinSi
	FinSi
FinAlgoritmo
