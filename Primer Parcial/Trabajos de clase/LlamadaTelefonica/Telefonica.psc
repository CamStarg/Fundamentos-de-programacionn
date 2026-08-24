Algoritmo Telefonica
    Definir duracion Como Entero
    Definir dia, turno Como Caracter
    Definir costo_base, impuesto, total Como Real
	
    // ----- Entrada de datos (sin validaciones complejas) -----
    Escribir "Ingrese la duracion de la llamada en minutos:"
    Leer duracion
	
    Escribir "Ingrese el dia (domingo / habil):"
    Leer dia
    dia = Minusculas(dia)
	
    Si dia = "habil" Entonces
        Escribir "Ingrese el turno (matutino / vespertino):"
        Leer turno
        turno = Minusculas(turno)
    Sino
        turno = "NO APLICA"
    FinSi
	
    // ----- Cálculo del costo base -----
    Si duracion <= 5 Entonces
        costo_base = duracion * 1.0
    Sino
        Si duracion <= 8 Entonces
            costo_base = 5 * 1.0 + (duracion - 5) * 0.8
        Sino
            Si duracion <= 10 Entonces
                costo_base = 5 * 1.0 + 3 * 0.8 + (duracion - 8) * 0.7
            Sino
                costo_base = 5 * 1.0 + 3 * 0.8 + 2 * 0.7 + (duracion - 10) * 0.5
            FinSi
        FinSi
    FinSi
	
    // ----- Cálculo del impuesto -----
    Si dia = "domingo" Entonces
        impuesto = costo_base * 0.03
    Sino   // día hábil
        Si turno = "matutino" Entonces
            impuesto = costo_base * 0.15
        Sino
            Si turno = "vespertino" Entonces
                impuesto = costo_base * 0.10
            Sino
                impuesto = 0
            FinSi
        FinSi
    FinSi
	
    total = costo_base + impuesto
	
    // ----- Salida con desglose (incluye día y turno) -----
    Escribir "=============================="
    Escribir "      DESGLOSE DE PAGO"
    Escribir "=============================="
    Escribir "Dia: ", dia
    Escribir "Turno: ", turno
    Escribir "Duracion: ", duracion, " min"
    Escribir "Costo base (sin impuesto): $", costo_base
    Escribir "Impuesto aplicado:          $", impuesto
    Escribir "Total a pagar:              $", total
    Escribir "=============================="
FinAlgoritmo
