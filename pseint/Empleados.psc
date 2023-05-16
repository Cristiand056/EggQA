Algoritmo Empleados
	Definir op Como Entero
	Definir tVentas, sFijo, horasSemanales, vHora, salario Como Real
	Escribir "Elija el tipo de contratación"
	Escribir "Ingrese 1 si es Comisión: "
	Escribir "Ingrese 2 si es salario fijo + Comisión: "
	Escribir "Ingrese 3 si es salario fijo: "
	Leer op
	
	Segun op Hacer
		1:
			Escribir "Ingrese el total del monto de las ventas"
			Leer tVentas
			
			salario = tVentas * 0.4
			
			Escribir "El salario del empleado es: ", salario
		2: 
			Escribir "Ingrese elValor por hora"
			Leer vHora
			Escribir "Ingrese las horas trabajadas en la semana"
			Leer horasSemanales
			Escribir "Ingrese el total de ventas"
			Leer tVentas
			
			si horasSemanales <= 40 Entonces
				salario = horasSemanales * vHora + tVentas * 0.25
				Escribir "El salario del empleado es: ", salario
			SiNo
				salario = 40 * vHora + tVentas * 0.25
				Escribir "El salario del empleado es: ", salario
			FinSi
		3: 
			Escribir "Ingrese elValor por hora"
			Leer vHora
			Escribir "Ingrese las horas trabajadas en la semana"
			Leer horasSemanales
			
			si horasSemanales <= 40 Entonces
				salario = horasSemanales * vHora 
				Escribir "El salario del empleado es: ", salario
			SiNo
				salario = 40 * vHora + (horasSemanales-40)*(vHora * 0.5) 
				Escribir "El salario del empleado es: ", salario
			FinSi
			
		De Otro Modo:
			Escribir "Opción no valida"
	FinSegun
FinAlgoritmo
