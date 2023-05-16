Algoritmo nafta
	
	Definir horaUso, naftaCom, total, totalBase, precNafta, minUso Como Real
	precNafta = 40
	minUso = 5.20
	totalBase = 400
	Escribir "Cuantas horas ha tenido el vehiculo"
	Leer horaUso
	
	SI horaUso <= 2 Entonces
		Escribir "Total ha pagar es: ", totalBase
	SiNo
		Escribir "Ingrese los litros de nafta gastados"
		Leer naftaCom
		
		total = naftaCom*precNafta+horaUso*60*minUso
		Escribir "Total ha pagar es: ", total, " pesos"
	FinSi
	
	
FinAlgoritmo
