Algoritmo sin_titulo
	Definir dia, mes, anio Como Entero
	
	leer dia
	Leer  mes
	leer anio
	
	diaAnterior(dia, mes, anio)
	
	Escribir "dia= ",dia,", mes= ",mes," año= ",anio
FinAlgoritmo

SubProceso diaAnterior (dia Por Referencia, mes Por Referencia, anio Por Referencia)
	Segun mes 
		1:
			si dia == 1 Entonces
				dia= 31
				mes= 12 
				anio= anio-1
			SiNo
				dia= dia-1
				mes= mes 
				anio= anio
			FinSi
		2:
			si dia == 1 Entonces
				dia= 31
				mes= mes-1
				anio= anio
			SiNo
				si dia == 29 y anio mod 4 == 0 Entonces
					dia= dia-1
					mes= mes 
					anio= anio
				FinSi
				si dia > 1 y dia <= 28 Entonces
					Escribir dia= dia-1
					mes= mes
					anio= anio
				FinSi
			FinSi
		3:
			si dia == 1 y anio mod 4 == 0 Entonces
				dia= 29
				mes= mes-1 
				anio=anio
			SiNo
				si dia == 1 Entonces
					dia= 28
					mes= mes -1
					anio= anio
				SiNo
					si dia > 1 y dia <= 31 Entonces
						dia= dia-1
						mes= mes
						anio= anio
					FinSi
				FinSi
			FinSi
		4:
			si dia == 1 Entonces
				dia= 31
				mes= mes -1 
				anio= anio
			SiNo
				si dia > 1 y dia <= 30 Entonces
					dia= dia-1
					mes= mes
					anio= anio
				FinSi
			FinSi
		5:
			si dia == 1 Entonces
				dia= 30
				mes= mes -1
				anio= anio
			SiNo
				si dia > 1 y dia <= 31 Entonces
					dia= dia-1
					mes= mes
					anio= anio
				FinSi
			FinSi
		6:
			si dia == 1 Entonces
				dia= 31
				mes= mes -1
				anio= anio
			SiNo
				si dia > 1 y dia <= 30 Entonces
					dia= dia-1
					mes= mes
					anio= anio
				FinSi
			FinSi
		7:
			si dia == 1 Entonces
				dia= 30
				mes= mes -1
				anio= anio
			SiNo
				si dia > 1 y dia <= 31 Entonces
					dia= dia-1
					mes= mes
					anio= anio
				FinSi
			FinSi
		8:
			si dia == 1 Entonces
				dia= 31
				mes= mes -1
				anio= anio
			SiNo
				si dia > 1 y dia <= 30 Entonces
					dia= dia-1
					mes= mes
					anio= anio
				FinSi
			FinSi
		9:
			si dia == 1 Entonces
				dia= 31
				mes= mes -1
				anio= anio
			SiNo
				si dia > 1 y dia <= 30 Entonces
					dia= dia-1
					mes= mes
					anio= anio
				FinSi
			FinSi
		10:
			si dia == 1 Entonces
				dia= 30
				mes= mes -1
				anio= anio
			SiNo
				si dia > 1 y dia <= 31 Entonces
					dia= dia-1
					mes= mes
					anio= anio
				FinSi
			FinSi
		11:
			si dia == 1 Entonces
				dia= 31
				mes= mes -1
				anio= anio
			SiNo
				si dia > 1 y dia <= 30 Entonces
					dia= dia-1
					mes= mes
					anio= anio
				FinSi
			FinSi
		12:
			si dia == 1 Entonces
				dia= 30
				mes= mes -1
				anio= anio
			SiNo
				si dia > 1 y dia <= 31 Entonces
					dia= dia-1
					mes= mes
					anio= anio
				FinSi
			FinSi
		De Otro Modo:
			Escribir "Fecha incorrecta"
		
	FinSegun
FinSubProceso
	