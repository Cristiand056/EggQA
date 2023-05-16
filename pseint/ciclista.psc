Algoritmo ciclista
	Definir T, HH, MM, SS, aux como Entero
	
	Escribir "Ingrese el iempo de llegada en segundos"
	leer T
	
	HH <- trunc(T/3600)
	aux <- T%3600
	MM <- trunc(aux/60)
	SS <- aux%60
	
	Escribir HH, " ", MM, " ",SS
FinAlgoritmo
