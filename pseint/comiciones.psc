Algoritmo comiciones
	Definir sueldoBase, comicion, total Como Real
	Definir  nVentas Como Entero
	
	Escribir "Ingrese su sueldo base"
	Leer sueldoBase
	Escribir "Ingrese el número de ventas"
	Leer nVentas
	
	comicion <- sueldoBase*.1
	total <- sueldoBase + comicion*nVentas
	
	Escribir "su salario total es: ",total
	
	
FinAlgoritmo
