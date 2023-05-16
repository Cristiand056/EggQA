Algoritmo encuentro9_guia_1
//	Escribir una estructura PARA que le solicite al usuario varios números y al finalizar muestre el
	//		mayor número ingresado.
	
	Definir num, i, cant_num, max Como Entero
	
	cant_num = Aleatorio(5,10)
	max = 0
	
	Escribir "Ingrese ", cant_num, "numeros"
	
	Para i = 1 Hasta cant_num Con Paso 1 Hacer
		
		Escribir "Ingrese numeros"
		Leer num
		Si num > max Entonces
			max = num
		FinSi
		
	FinPara
	
	Escribir "El numero maximo ingresado es igual a: ", max
	
	
FinAlgoritmo
