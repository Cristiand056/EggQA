Algoritmo sin_titulo
	Definir dias Como Entero
	
	Escribir "Ingrese los d�as"
	leer dias
	
	TemperaturaMedia(dias)
FinAlgoritmo

SubProceso TemperaturaMedia(dias)
	Definir i Como Entero
	Definir TempMin, TempMax, TempMedia Como Real
	
	para i<-1 Hasta dias Con Paso 1 Hacer
		Escribir "Ingrese la maxima temperatura del d�a ", i
		Leer TempMax
		Escribir "Ingrese la minima temperatura del d�a ", i
		Leer TempMin
		
		TempMedia = (TempMax + TempMin) / 2
		
		Escribir "La temperatura media del d�a ",i," es: ",TempMedia
	FinPara
FinSubProceso
	