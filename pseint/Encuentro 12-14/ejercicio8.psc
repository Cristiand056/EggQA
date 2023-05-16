Algoritmo sin_titulo	
	si login() Entonces
		Escribir "Bienvenido"
	SiNo
		Escribir "Error al acceder"
	FinSi
	
FinAlgoritmo

funcion retorno <- login() 	
	Definir cont Como Entero
	Definir inUser, inPassword, userDB, paswordDB Como Caracter
	definir retorno, acces1, loginUser Como Logico
	
	retorno = Falso
	
	userDB = "usuario1"
	paswordDB = "asdasd"
	
	cont = 0
	
	Hacer
		Escribir "Ingrese su usuario"
		leer inUser
		si inUser == userDB Entonces
			Escribir "Ingrese su contrseña"
			leer inPassword
			si inPassword == paswordDB Entonces
				retorno = Verdadero
			SiNo
				Escribir "Contraseña incorrecta"
				cont = cont + 1
			FinSi
			
		SiNo
			Escribir "El usuario no existe"
			cont = cont + 1
		FinSi
		
		si cont == 2 Entonces
			retorno = Falso
		FinSi
	Mientras Que cont < 3 Y !retorno
	
FinFuncion

	