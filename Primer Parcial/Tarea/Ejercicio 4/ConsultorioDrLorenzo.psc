Algoritmo ConsultorioDrLorenzo
		Definir numero_cita Como Entero
		Definir costo_cita, total_tratamiento Como Real
		
		Escribir "Ingrese el número de cita:"
		Leer numero_cita
		
		Si numero_cita >= 1 Y numero_cita <= 3 Entonces
			costo_cita <- 900
			total_tratamiento <- numero_cita * 900
		Sino
			Si numero_cita >= 4 Y numero_cita <= 5 Entonces
				costo_cita <- 800
				total_tratamiento <- 2700 + (numero_cita - 3) * 800
			Sino
				Si numero_cita >= 6 Y numero_cita <= 8 Entonces
					costo_cita <- 600
					total_tratamiento <- 4300 + (numero_cita - 5) * 600
				Sino
					costo_cita <- 500
					total_tratamiento <- 6100 + (numero_cita - 8) * 500
				FinSi
			FinSi
		FinSi
		
		Escribir "El costo de la cita número ", numero_cita, " es: $", costo_cita
		Escribir "El monto total pagado por el tratamiento es: $", total_tratamiento
FinAlgoritmo

