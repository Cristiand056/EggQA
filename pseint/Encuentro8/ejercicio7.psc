Algoritmo sin_titulo
	Definir x, n Como Entero
	
	n = Aleatorio(1, 10)
	
	Hacer
		///Escribir "n ",n
		Escribir "Adivine el n�mero de 1 a 10"
		Leer x
		
		si n > x Entonces
			Escribir "El n�mero ingresado es menor "
		FinSi
		si n < x Entonces
			Escribir "El n�mero ingresado es mayor "
		FinSi
	Mientras Que x <> n
	
	Escribir "Felicidades numero adivinado, el n�mero era: ",x 
FinAlgoritmo
