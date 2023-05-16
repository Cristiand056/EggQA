Algoritmo sin_titulo
	Definir i, vector, total Como Entero
	Dimension vector[4]
	Para i<-0 Hasta 3 Hacer
		vector[i] = i + 1
	FinPara
	
	//Escribir Producto(vector)
	total = 1
	Para i<-0 Hasta 3 Hacer
		total = total * (i+1)
	FinPara
	Escribir total
	
	
FinAlgoritmo


//SubProceso valorT <- Producto(vector)
//	Definir valorT, n Como Entero
//	
//	n = 4
//	si n == 1 Entonces
//		valorT = vector[n-1] * n
//	SiNo
//		valorT = Producto(Vector[n-1]) * (n) * Producto(Vector[n-2]) * (n-1)
//	FinSi
//	
//FinSubProceso
	