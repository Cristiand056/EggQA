Algoritmo sin_titulo
	Definir i, j, nVentas, nEmpleados Como Entero
	Definir comiciones, salarioBase, totalSalario, vVentas Como Real
	comiciones = 0
	
	Escribir "Ingrese la cantidad de empleados"
	Leer nEmpleados
	
	Para i<-1 Hasta nEmpleados Con Paso 1 Hacer
		Escribir "Ingrese el salario base del empleado no. ",i
		Leer salarioBase
		
		Escribir "Ingrese la cantidad de ventas que el empleado realizo"
		Leer nVentas
		
		Para j<-1 Hasta nVentas Con Paso 1 Hacer
			Escribir "Ingrese el valor de la venta no. ", j
			Leer vVentas
			
			comiciones = comiciones + vVentas*0.1
		FinPara
		
		totalSalario = salarioBase + comiciones
		
		Escribir "El salario final del empleado ", i," es: ",totalSalario
	Fin Para
FinAlgoritmo
