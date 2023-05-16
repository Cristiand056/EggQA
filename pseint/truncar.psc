Algoritmo truncar
	Definir in, cent, dec, uni como Real
	
	leer in
	
	cent <- in/100
	dec <- (in%100)/10
	uni <- in%10
	
	Escribir "la centena es: ",trunc(cent), " la decena es: ",trunc(dec)," la unidad es: ",trunc(uni)
FinAlgoritmo
