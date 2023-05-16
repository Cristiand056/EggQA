Algoritmo notas
	Definir n1, n2, n3, n4, nt Como Real
	
	Escribir "Ingrese la nota 1"
	Leer n1
	Escribir "Ingresela nota 2"
	Leer n2
	Escribir "Ingresela nota 3"
	Leer n3
	Escribir "Ingresela nota 4"
	Leer n4
	
	si n1<n2 y n1<n3 y n1< n4 Entonces
		nt = (n2 + n3 + n4)/3		
		Escribir "la nota total es: ",nt," y la nota eliminada al ser la menor fue ",n1
	SiNo
		si n2<n3 y n2<n4 Entonces
			nt = (n1 + n3 + n4)/3
			Escribir "la nota total es: ",nt," y la nota eliminada al ser la menor fue ",n2
		SiNo
			si n3<n4 Entonces
				nt = (n1 + n2 + n4)/3
				Escribir "la nota total es: ",nt," y la nota eliminada al ser la menor fue ",n3
			SiNo
				nt = (n1 + n2 + n3)/3
				Escribir "la nota total es: ",nt," y la nota eliminada al ser la menor fue ",n4
			FinSi
		FinSi
	FinSi
FinAlgoritmo
