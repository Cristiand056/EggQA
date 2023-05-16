Algoritmo sin_titulo
	Definir formato Como Caracter
	definir ventas Como Real
	Dimension formato(8, 7), ventas(8, 7)
	InicializarMatriz(formato,8, 7)
	CrearFormato(formato, 8, 7)
	MostrarMatriz(formato, 8, 7)
	Escribir "Valores"
	CrearValores(ventas, 8, 7)
	MostrarMatriz(ventas, 8, 7)
	LlenarFormato(formato, ventas, 8, 7)
	Escribir "Formato Terminado"
	MostrarMatriz(formato, 8, 7)
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
	
	formato[0,1] = "               Lunes"
	formato[0,2] = "              Martes"
	formato[0,3] = "           Miercoles"
	formato[0,4] = "             Jueves "
	formato[0,5] = "            Viernes "
	formato[0,6] = "      Total Producto"
	formato[1,0] = "Producto 1          "
	formato[2,0] = "Producto 2          "
	formato[3,0] = "Producto 3          "
	formato[4,0] = "Producto 4          "
	formato[5,0] = "Producto 5          "
	formato[6,0] = "Total Semana        "
	formato[7,0] = "Producto más vendido"
	
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
	Definir i, j, z, k, cont , sumSemana, masVendido, totalProducto, sum1, sum2,sum3, sum4, sum5, sum6 Como Entero
	sumSemana = 0
	masVendido = 0
	totalProducto = 0
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
			si i < 6 y j >= 1 y i >=1 y j <6 Entonces
				Escribir "Ingrese las ventas del producto ",i," en el día ",j
				Leer matriz[i,j]
				totalProducto = totalProducto + matriz[i, j]
				
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
				si j == 5 Entonces
					sum5 = sum5 + matriz[i, j]
				FinSi
				
			FinSi	
			si j == 6 Entonces
				matriz[i, j] = totalProducto
				sum6 = sum6 + matriz[i, j]
				totalProducto = 0
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
					6: 
						matriz[i, j] = sum6
				FinSegun
			FinSi
		FinPara
		si i <> 0 y i == 7 Entonces
			Para z<-1 Hasta 5 Hacer
				para k<-1 Hasta 5 Hacer
					//Escribir Sin Saltar" prueba ", matriz[k, z]					
					si matriz[k, z] > masVendido
						//Escribir "hola entre"
						matriz[i, z] = k
						masVendido = matriz[k, z]
					FinSi
					
				FinPara
				//Escribir "rompo fila ",k
				masVendido = 0
			FinPara
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
				si i == 7  y J > 0 Entonces
					aux1=concatenar("Producto ", ConvertirATexto(valores[i, j]))
					formato[i, j] = concatenar("          ",aux1)
				SiNo
					formato[i, j] = concatenar("                ",ConvertirATexto(valores[i, j]))
				FinSi
				
			FinSi	
		FinPara
	FinPara
FinSubProceso
	