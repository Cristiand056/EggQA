Algoritmo sin_titulo
	Definir nota1, nota2, nota3, total, promReprobados, sumReprobados, mayor, porcen Como Real
	Definir n, i, contReprobados, contIntegrador, contParcial Como Entero
	total = 0
	promReprobados = 0
	contReprobados = 0
	contIntegrador = 0
	sumReprobados = 0
	contParcial = 0
	mayor = 0
	
	Escribir "Ingrese el número de estudiantes"
	Leer n
	
	para i<-1 Hasta n Con Paso 1 Hacer
		Escribir "Ingrese la nota del trabajo práctico Integrador del estudiante no",i
		Leer nota1
	
		
		Escribir "Ingrese la nota de la Exposición del estudiante no",i
		Leer nota2
	
		
		Escribir "Ingrese la nota del parcial del estudiante no",i
		Leer nota3
		total = nota1 * 0.35 + nota2 * 0.25 + nota3 * 0.4
		
		si total < 6.5 Entonces
			contReprobados = contReprobados + 1
			sumReprobados = sumReprobados + total
		FinSi
		si nota1 > 7.5 Entonces
			contIntegrador = contIntegrador + 1
		FinSi
		si nota2 > mayor Entonces
			mayor = nota2
		FinSi
		si nota3 >= 4 y nota3 <= 7.5 Entonces
			contParcial = contParcial + 1
		FinSi
		Escribir "la nota total del estudiante no",i," es ",total
	FinPara
	
	promReprobados = sumReprobados/contReprobados
	porcen = (contIntegrador*100)/n
	Escribir "El promedio de los estudiantes reprobados es: ", promReprobados
	Escribir "Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5, es: ", porcen
	Escribir "La mayor nota obtenida en las exposiciones, es: ", mayor
	Escribir "Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5, es: ", contParcial
	
FinAlgoritmo
