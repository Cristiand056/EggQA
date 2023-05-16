Algoritmo sin_titulo
	Definir formato Como Caracter
	definir ventas Como Real
	Dimension formato(8, 6), ventas(8, 6)
	InicializarMatriz(formato, 8, 6)
	CrearFormato(formato, 8, 6)
	MostrarMatriz(formato, 8, 6)
	CrearValores(ventas, 8, 6)
	MostrarMatriz(ventas, 8, 6)
	LlenarFormato(formato, ventas, 8, 6)
	MostrarMatriz(formato, 8, 6)
FinAlgoritmo
SubProceso InicializarMatriz(matriz Por Referencia, M, N)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			matriz[i, j] = "                    "
		FinPara
	FinPara
FinSubProceso
SubProceso CrearFormato(formato Por Referencia, M, N)
	
	formato[0,1] = "          Vendedor 1"
	formato[0,2] = "          Vendedor 2"
	formato[0,3] = "          Vendedor 3"
	formato[0,4] = "          Vendedor 4"
	formato[0,5] = "     Total V. x Zona"
	formato[1,0] = "Zona 1              "
	formato[2,0] = "Zona 2              "
	formato[3,0] = "Zona 3              "
	formato[4,0] = "Zona 4              "
	formato[5,0] = "Zona 5              "
	formato[6,0] = "Total V. Vendendor  "
	formato[7,0] = "Total Ventas        "
	
FinSubProceso
SubProceso MostrarMatriz(matriz, M, N)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			Escribir Sin Saltar " ",Matriz[i,j]
		FinPara
		Escribir ""
	FinPara
FinSubProceso	

SubProceso CrearValores(matriz Por Referencia, M, N)
	Definir i, j, z, k, cont , sumSemana, masVendido, totalZona, sum1, sum2,sum3, sum4, sum5, sum6 Como Entero
	sumSemana = 0
	masVendido = 0
	totalZona = 0
	cont = 1
	sum1 = 0
	sum2 = 0
	sum3 = 0
	sum4 = 0
	sum5 = 0
	sum6 = 0
	masVendido = 0
	Para i<-0 Hasta M-1 Hacer
		Para j<-0 Hasta N-1 Hacer
			si i == 0 o j == 0
				matriz[i, j] = 0
			FinSi
			si i == 7 o j <> 1 
				matriz[i, j] = 0
			FinSi
			si i < 6 y j >= 1 y i >=1 y j<5 Entonces
				Escribir "Ingrese las ventas en la zona ",i," del representante(Vendedor) ",j
				Leer matriz[i,j]
				totalZona = totalZona + matriz[i, j]
				
				si j == 1 Entonces
					sum1 = sum1 + matriz[i, j]
				FinSi
				si j == 2 Entonces
					sum2 = sum2 + matriz[i, j]
				FinSi
				si j == 3 Entonces
					sum3 = sum3 + matriz[i, j]
				FinSi
				si j == 4 Entonces
					sum4 = sum4 + matriz[i, j]
				FinSi
				
			FinSi	
			si j == 5 Entonces
				matriz[i, j] = totalZona
				sum5 = sum5 + matriz[i, j]
				totalZona = 0
			FinSi
			si i == 6 y j > 0 Entonces
				segun j Hacer
					1:
						matriz[i, j] = sum1
					2:
						matriz[i, j] = sum2
					3:
						matriz[i, j] = sum3
					4:
						matriz[i, j] = sum4
					5:
						matriz[i, j] = sum5
				FinSegun
			FinSi
		FinPara
		si i <> 0 y i == 7 Entonces
			Para z<-1 Hasta 5 Hacer
				masVendido = masVendido + matriz[6, z]
			FinPara
			matriz[7,1] = masVendido
		FinSi		
	FinPara
FinSubProceso
SubProceso LlenarFormato(formato Por Referencia, valores, M, N)
	Definir i, j Como Entero
	Definir aux1 Como Caracter
	aux1 = "                    "
	para i<-1 Hasta M-1 Hacer
		Para j<-1 Hasta N-1 Hacer
			si valores[i, j] == 0 Entonces
				formato[i, j] ="                    "
			SiNo
				formato[i, j] = concatenar("                ",ConvertirATexto(valores[i, j]))
			FinSi	
		FinPara
	FinPara
FinSubProceso