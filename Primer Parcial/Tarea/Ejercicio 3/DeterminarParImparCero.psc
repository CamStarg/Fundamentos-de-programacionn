Algoritmo DeterminarParImparCero
    Definir numero Como Entero
    Escribir "Ingrese un número entero:"
    Leer numero
    
    Si numero = 0 Entonces
        Escribir "El número es Neutro (Cero)."
    Sino
        Si numero MOD 2 = 0 Entonces
            Escribir "El número es Par."
        Sino
            Escribir "El número es Impar."
        FinSi
    FinSi
FinAlgoritmo