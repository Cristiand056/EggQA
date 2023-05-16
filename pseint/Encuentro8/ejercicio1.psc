Algoritmo sin_titulo
	Definir plabraIngresada, clave Como Caracter
	Definir cont Como Entero
	Definir control Como Logico 
	cont = 0
	control = Falso
	clave = "eureka"
	Hacer
		Escribir "Ingrese la clave Max 3 intentos"
		Escribir "no. de intentos ",cont+1
		Leer plabraIngresada
		control = clave == plabraIngresada
		cont = cont + 1
	Mientras Que !control Y cont < 3
	
	si control Entonces
		Escribir "Ha ingresado al sistema de manera correcta"
	SiNo
		Escribir "Número de intentos maximos alcanzados acceso denegado"
	FinSi
FinAlgoritmo
