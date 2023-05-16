Algoritmo sin_titulo
	Definir frase, vector Como Caracter
	Definir i Como Entero
	Dimension vector[20]
	
	Escribir "Ingrese la frase"
	Leer frase
	
	para i<- 0 Hasta 19 Hacer
		vector[i] = Subcadena(frase,i,i)
		si i == 0 Entonces
			Escribir Sin Saltar "[ ",vector[i]
		SiNo
			Escribir Sin Saltar " ",vector[i]," "
		FinSi
	FinPara
	Escribir Sin Saltar"]"
	Escribir ""
	Cambio(vector)
FinAlgoritmo

SubProceso Cambio(vector)
	Definir ingreso, auxCadena Como Caracter
	Definir i, indice Como Entero
	
	Escribir "Ingrese el caracter a agregar"
	leer ingreso
	Escribir "Ingrese la posición en donde se agregara"
	Leer indice
	Dimension auxCadena(20)
	si vector[indice] == " " Entonces
		vector[indice] = ingreso
		Para i<-0 Hasta 19 Hacer
			si i == 0 Entonces
				Escribir Sin Saltar "[ ",vector[i]
			SiNo
				Escribir Sin Saltar " ",vector[i]," "
			FinSi
		FinPara
		Escribir Sin Saltar"]"
		Escribir ""
	SiNo
		
		Para i<-indice Hasta 19 Hacer
			
			si i == indice Entonces
				
				auxCadena[i] = ingreso
				i = i+1
				auxCadena[i] = vector[i-1]
				Escribir auxCadena[i-1]
				Escribir auxCadena[i]
			FinSi
			si i < 19 Y i <> indice Entonces
				auxCadena[i] = vector[i-1]
			FinSi
			si i == 19 Entonces
				auxCadena[i] = vector[i-1]
			FinSi
			
		FinPara
		
		Para i<-indice Hasta 19 Hacer
			vector[i] = auxCadena[i]
		FinPara
		
		Para i<-0 Hasta 19 Hacer
			si i == 0 Entonces
				Escribir Sin Saltar "[ ",vector[i]
			SiNo
				Escribir Sin Saltar " ",vector[i]," "
			FinSi
		FinPara
		Escribir Sin Saltar"]"
		Escribir ""
		
	FinSi
	
FinSubProceso
