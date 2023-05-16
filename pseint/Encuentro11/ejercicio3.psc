Algoritmo sin_titulo
	Definir password, user, inPassword, inUser, op2 Como Caracter
	Definir cont, op, nbotellas, i, random, valorbotellas, saldo  Como Entero	 
	Definir login, salida Como Logico
	
	cont = 0
	login = Falso
	salida = Falso
	user = "Albus_D"
	password = "caramelosDeLimon"
	saldo = 1500
	
	Repetir
		Escribir "ingrese el usuario intento no ",cont+1
		Leer inUser
		
		login = user == inUser 
		
		Escribir "ingrese la contraseña del usuario "
		Leer inPassword
		
		login = password == inPassword
		
		cont = cont + 1
		
	Mientras Que cont < 3 y !login
	
	si login y cont<3 Entonces
		
		Mientras !salida Hacer
			Escribir "Menu Principal"
			Escribir "Ingrese 1, para Ingresar botellas"
			Escribir "Ingrese 2, para Consultar saldo"
			Escribir "Ingrese 3, para salir"
			leer op
			Segun op Hacer
				1:
					Escribir "Ingrese la cantidad de botellas"
					Leer nbotellas
					para i<-1 Hasta nbotellas Con Paso 1 Hacer
						Escribir "ingreso botella no ",i
						
					FinPara
					random = Aleatorio(100, 3000)
					si random < 500 Entonces
						valorbotellas = 50
					FinSi
					si random > 500 y random <= 1500 Entonces
						valorbotellas = 125
					FinSi
					si random >1500 Entonces
						valorbotellas = 200 
					FinSi
					
					Escribir "El valor de las botellas es ", valorbotellas, " con un peso de ",random,"g"
					Escribir "desea aceptar, escriba si, de lo contrario ingrese no"
					Leer op2
					si op2 == "si" Entonces
						Escribir "el valor de las botellas se ha acreditado a su saldo"
						saldo = saldo + valorbotellas
						Escribir "el nuevo saldo es ", saldo
					SiNo
						Escribir "transacción cancelada, devolviendo material, retire sus botellas"
						Escribir "adios"
						Escribir ""
					FinSi
				2:
					Escribir "El saldo del usario ", inUser, " es ",saldo 
					Escribir ""
				3:
					Escribir "Adios"
					Escribir ""
					salida = Verdadero
				De Otro Modo:
					Escribir "opción equivocada"
					Escribir ""
			Fin Segun
		FinMientras
		
	SiNo
		Escribir "Usuario o Contraseña incorrectas"
	FinSi
	
FinAlgoritmo
