Algoritmo GananciaUva
		
		Definir precioInicial, precioFinal, kilos, ganancia Como Real
		Definir tipo Como Caracter
		Definir tamaño Como Entero
		
		Escribir "Ingrese el precio inicial por kilo:"
		Leer precioInicial
		
		Escribir "Ingrese el tipo de uva (A o B):"
		Leer tipo
		
		Escribir "Ingrese el tamaño de la uva (1 o 2):"
		Leer tamaño
		
		Escribir "Ingrese la cantidad de kilos:"
		Leer kilos
		
		precioFinal <- precioInicial
		
		Si tipo = "A" Entonces
			Si tamaño = 1 Entonces
				precioFinal <- precioInicial + 0.20
			SiNo
				Si tamaño = 2 Entonces
					precioFinal <- precioInicial + 0.30
				FinSi
			FinSi
		SiNo
			Si tipo = "B" Entonces
				Si tamaño = 1 Entonces
					precioFinal <- precioInicial - 0.30
				SiNo
					Si tamaño = 2 Entonces
						precioFinal <- precioInicial - 0.50
					FinSi
				FinSi
			FinSi
		FinSi
		
		ganancia <- precioFinal * kilos
		
		Escribir "El precio final por kilo es: $", precioFinal
		Escribir "La cantidad que recibirá el productor es: $", ganancia
		
FinAlgoritmo
