Algoritmo operciones_basicas
	Definir elec Como caracter
	Definir n1, n2 Como Entero
	Definir re Como Real
	
	Escribir "Ingrese el primer número"
	Leer n1
	Escribir "Ingrese el segúndo número"
	Leer n2
	
	Escribir "Ingrese la primera letra de la operación matematica basica deseada"
	Leer elec
	
	elec = Minusculas(elec)
	
	Segun elec Hacer
		"s":
			re = n1 + n2
			Escribir "El resultado de la suma es: ", re
		"r":
			re = n1 - n2
			Escribir "El resultado de la resta es: ", re
		"m":
			re = n1 * n2
			Escribir "El resultado de la multiplicación es: ", re
		"d":
			si n2 == 0 Entonces
				Escribir "El número no es valido"
			SiNo
				re = n1 / n2
				Escribir "El resultado de la división es: ", re
			FinSi
		de otro modo:
			Escribir "Opción invalida"
	FinSegun
	
	
FinAlgoritmo 
