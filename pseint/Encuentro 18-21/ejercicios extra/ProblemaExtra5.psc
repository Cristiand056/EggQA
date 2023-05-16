//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
//un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
//posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
//o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
//	en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
//	más cercano.
//Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición 10 es-
//taba más cerca de la posición 8 que el espacio de la posición 4. Nota: en caso del que el des-
//	plazamiento sea arreglo la izquierda y se requiera que se remueva la letra, se hará. Por ejemplo,
//	para poner un "%" en la posición 6, haríamos un desplazamiento arreglo la izquierda y borraríamos
//		la letra h
Algoritmo ProblemaExtra5
	Definir frase,arreglo,caract Como Caracter
	Definir posicion Como Entero
	Dimension arreglo[20]
	funcionInicializar(arreglo)
	Escribir "Ingrese una frase"
	//	leer frase
	frase = "Hola mundo cruel!"
	funcionAgregar(frase,arreglo)
	
	Escribir "Ingrese un carácter cualquiera"
	//	leer caract
	caract = '%'
	Escribir "En que posicion quiere agregar el caracter?"
	//	leer posicion
	posicion = 6
	Borrar Pantalla
	funcionAdicionar(arreglo,caract,posicion)
	
FinAlgoritmo


funcion funcionInicializar(arreglo)
	Definir i Como Entero
	para i=0 Hasta 19 Hacer
		arreglo[i]=''
	FinPara
	
FinFuncion
funcion funcionMostrar(vec)
	Definir i Como Entero
	para i =0 Hasta 19 Hacer
		Escribir Sin Saltar vec[i]," "
	FinPara
	Escribir ""
FinFuncion

funcion funcionAgregar(frase,arreglo)
	definir l,i Como Entero
	l = Longitud(frase) 
	//frase = 'HOLA'
	si l < 20 Entonces
		//para i = 0 Hasta 4-1 Hacer
		para i = 0 Hasta l-1 Hacer
			arreglo[i] = Subcadena(frase,i,i)
		FinPara
	sino 
		para i = 0 Hasta 19 Hacer
			arreglo[i] = Subcadena(frase,i,i)
		FinPara
	FinSi
	
FinFuncion

funcion funcionAdicionar(arreglo,caract,posicion)
	definir i Como Entero
	funcionMostrar(arreglo) 
	si posicion<20 Entonces
		si arreglo[posicion] ='' o arreglo[posicion]=" " Entonces
			arreglo[posicion] = caract
			funcionMostrar(arreglo) 
		SiNo
			funcionModificar(arreglo,caract,posicion)
		FinSi
	SiNo
		Escribir "la posicion excede lo permitido"
	FinSi
FinFuncion

funcion funcionModificar(arreglo,caract,posicion)
	definir i,n,m Como Entero
	n=posicion
	m=posicion
	funcionMostrar(arreglo)
	busquedaDerecha(arreglo,n) //busqueda arreglo la derecha
	busquedaIzquierda(arreglo,m) //busqueda arreglo la izquierda

	si abs(posicion - n) < abs(posicion - m) Entonces //caso donde el espacio esta mas cerca arreglo la derecha
		desplazarDerecha(arreglo,n,caract,posicion)
	SiNo
		desplazarIzquierda(arreglo,m,caract,posicion)
	FinSi
FinFuncion

funcion busquedaDerecha(arreglo,n Por Referencia)
	definir i Como Entero
	para i=n+1 hasta 19 Hacer
		si arreglo[i] = '' o arreglo[i] = ' ' Entonces
			n = i
			i = 19
		FinSi
	FinPara
FinFuncion
funcion busquedaIzquierda(arreglo,n Por Referencia)
	definir i Como Entero
	para i=n+1 hasta 0 Con Paso -1 Hacer
		si arreglo[i] = '' o arreglo[i] = ' ' Entonces
			n = i
			i = 0
		FinSi
	FinPara
FinFuncion


Funcion desplazarDerecha(arreglo,n,caract,posicion)
	//n posicion del espacio mas cercano a la derecha
	//n>posicion
	definir i Como entero
	definir aux Como Caracter
	Dimension aux[20]
	para i=0 hasta posicion-1 Hacer
		aux[i] = arreglo[i]
	FinPara
	aux[posicion] = caract
	para i=posicion +1 Hasta 19 Hacer
		aux[i] = arreglo[i-1]
	FinPara
	funcionMostrar(aux) 
FinFuncion
Funcion desplazarIzquierda(arreglo,m,caract,posicion)
	//m posicion del espacio mas cercano a la derecha
	//m>posicion
	definir i Como entero
	definir aux Como Caracter
	Dimension aux[20]
	para i=0 hasta posicion-1 Hacer
		aux[i] = arreglo[i+1]
	FinPara
	aux[posicion] = caract
	para i=posicion +1 Hasta 19 Hacer
		aux[i] = arreglo[i]
	FinPara
	funcionMostrar(aux) 
FinFuncion
	