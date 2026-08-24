Algoritmo CobroEstacionamiento
	Definir horas Como Entero
	Definir total_pagar Como Real
	Escribir 'Ingrese la cantidad de horas en el estacionamiento:'
	Leer horas
	Si horas<=0 Entonces
		Escribir 'Error: El número de horas debe ser mayor a cero.'
	SiNo
		Si horas<=2 Entonces
			total_pagar <- horas*30
		SiNo
			Si horas<=5 Entonces
				total_pagar <- 60+(horas-2)*25
			SiNo
				Si horas<=10 Entonces
					total_pagar <- 135+(horas-5)*20
				SiNo
					total_pagar <- 380
				FinSi
			FinSi
		FinSi
		Escribir 'El total a pagar por ', horas, ' hora(s) es: $', total_pagar
	FinSi
FinAlgoritmo
