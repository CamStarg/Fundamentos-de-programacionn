Algoritmo CobroPaqueteria
    Definir peso_gramos, zona Como Entero
    Definir costo_total Como Real
    
    Escribir "Ingrese el peso del paquete en gramos:"
    Leer peso_gramos
    
    Si peso_gramos > 5000 Entonces
        Escribir "El paquete excede el límite de 5 kg (5000g). Entrega RECHAZADA."
    Sino
        Escribir "Seleccione la zona de destino:"
        Escribir "1. América del Norte ($11/g)"
        Escribir "2. América Central ($10/g)"
        Escribir "3. América del Sur ($12/g)"
        Escribir "4. Europa ($25/g)"
        Escribir "5. Asia ($30/g)"
        Leer zona
        
        Segun zona Hacer
            1:
                costo_total <- peso_gramos * 11
            2:
                costo_total <- peso_gramos * 10
            3:
                costo_total <- peso_gramos * 12
            4:
                costo_total <- peso_gramos * 25
            5:
                costo_total <- peso_gramos * 30
            De Otro Modo:
                costo_total <- -1
        FinSegun
        
        Si costo_total = -1 Entonces
            Escribir "Error: Zona no válida."
        Sino
            Escribir "El cobro total por el paquete es: $", costo_total
        FinSi
    FinSi
FinAlgoritmo
