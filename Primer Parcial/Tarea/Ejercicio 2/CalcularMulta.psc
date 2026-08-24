Algoritmo CalcularMulta
    Definir velocidad, multa Como Entero
    Definir esCumpleanios Como Logico
    Definir velocidadEvaluar Como Real
    
    Escribir "Ingrese la velocidad:"
    Leer velocidad
    Escribir "¿Es tu cumpleaños? (Verdadero/Falso):"
    Leer esCumpleanios
    
    Si esCumpleanios Entonces
        velocidadEvaluar <- velocidad / 5
    Sino
        velocidadEvaluar <- velocidad
    FinSi
    
    Si velocidadEvaluar <= 60 Entonces
        multa <- 0
    Sino
        Si velocidadEvaluar <= 80 Entonces
            multa <- 1
        Sino
            multa <- 2
        FinSi
    FinSi
    
    Escribir "Resultado de la multa: ", multa
FinAlgoritmo