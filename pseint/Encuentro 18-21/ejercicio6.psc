Algoritmo sin_titulo
	Definir frase, vector Como Caracter
	Definir i Como Entero
	Dimension vector[20]
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
	Definir ingreso Como Caracter
	Definir i, indice Como Entero
	Escribir "Ingrese el caracter a agregar"
	leer ingreso
	Escribir "Ingrese la posición en donde se agregara"
	Leer indice
	
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
		Escribir "No se puede realizar el cambio ya que ese espacio no esta vacio"
	FinSi
	
FinSubProceso
	