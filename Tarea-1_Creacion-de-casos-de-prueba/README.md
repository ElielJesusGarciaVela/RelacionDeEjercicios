## [Calculadora.java <--](src/Calculadora.java)


## 🧮 Casos de Prueba – Calculadora en Java
## 🧪 CASOS DE PRUEBA – SUMA
## CP-SUM-01

Título: Sumar dos números enteros positivos
Objetivo: Verificar que la suma de dos enteros positivos sea correcta
Precondiciones: La calculadora está disponible
Entradas:

a = 5

b = 7

Pasos de ejecución:

Llamar al método sumar(5, 7)

Observar el resultado

Resultado esperado: 12
Criterios de aceptación: El resultado debe ser exactamente 12
Postcondiciones: Ninguna

## CP-SUM-02

Título: Sumar un número positivo y uno negativo
Objetivo: Validar la suma con números de distinto signo
Entradas:

a = 10

b = -3

Resultado esperado: 7
Criterios de aceptación: El resultado es correcto matemáticamente

## CP-SUM-03

Título: Sumar cero a un número
Objetivo: Verificar que sumar cero no altera el valor
Entradas:

a = 8

b = 0

Resultado esperado: 8
Criterios de aceptación: El valor permanece igual

## CP-SUM-04

Título: Sumar valores extremos
Objetivo: Verificar manejo de overflow
Entradas:

a = Integer.MAX_VALUE

b = 1

Resultado esperado: Excepción ArithmeticException
Criterios de aceptación: El sistema detecta el desbordamiento

## CP-SUM-05

Título: Suma con entradas no válidas
Objetivo: Validar manejo de datos incorrectos
Entradas:

"5 + a"

Resultado esperado: Error de entrada inválida
Criterios de aceptación: El sistema no se cae y muestra un error

## 🧪 CASOS DE PRUEBA – RESTA
## CP-RES-01

Título: Restar dos números positivos
Objetivo: Validar la resta básica
Entradas:

a = 10

b = 4

Resultado esperado: 6

## CP-RES-02

Título: Restar un número negativo de uno positivo
Objetivo: Validar resta con número negativo
Entradas:

a = 10

b = -5

Resultado esperado: 15

## CP-RES-03

Título: Restar cero a un número
Objetivo: Confirmar que el valor no cambia
Entradas:

a = 9

b = 0

Resultado esperado: 9

## CP-RES-04

Título: Restar valores extremos
Objetivo: Verificar control de overflow
Entradas:

a = Integer.MIN_VALUE

b = 1

Resultado esperado: Excepción ArithmeticException

## CP-RES-05

Título: Resta con entradas no válidas
Objetivo: Manejo de errores de entrada
Entradas:

"10 - x"

Resultado esperado: Error de entrada inválida

## 🧪 CASOS DE PRUEBA – MULTIPLICACIÓN
## CP-MUL-01

Título: Multiplicar dos números positivos
Objetivo: Verificar multiplicación básica
Entradas:

a = 4

b = 3

Resultado esperado: 12

## CP-MUL-02

Título: Multiplicar positivo por negativo
Objetivo: Validar signo del resultado
Entradas:

a = 6

b = -2

Resultado esperado: -12

## CP-MUL-03

Título: Multiplicar por cero
Objetivo: Confirmar resultado cero
Entradas:

a = 7

b = 0

Resultado esperado: 0

## CP-MUL-04

Título: Multiplicar valores extremos
Objetivo: Validar overflow
Entradas:

a = Integer.MAX_VALUE

b = 2

Resultado esperado: Excepción ArithmeticException

## CP-MUL-05

Título: Multiplicación con entradas no válidas
Objetivo: Validar manejo de error
Entradas:

"3 * !"

Resultado esperado: Error de entrada inválida

## 🧪 CASOS DE PRUEBA – DIVISIÓN
## CP-DIV-01

Título: Dividir dos números positivos
Objetivo: Verificar división básica
Entradas:

a = 8

b = 2

Resultado esperado: 4

## CP-DIV-02

Título: Dividir positivo entre negativo
Objetivo: Validar signo del resultado
Entradas:

a = 10

b = -2

Resultado esperado: -5

## CP-DIV-03

Título: Dividir entre uno
Objetivo: Confirmar que el valor no cambia
Entradas:

a = 7

b = 1

Resultado esperado: 7

## CP-DIV-04

Título: División entre cero
Objetivo: Validar manejo de error crítico
Entradas:

a = 5

b = 0

Resultado esperado:
Mensaje de error: “División entre cero no permitida”

Criterios de aceptación:
El programa no se detiene inesperadamente

## CP-DIV-05

Título: División con entradas no válidas
Objetivo: Validar manejo de entradas incorrectas
Entradas:

"7 / %"

Resultado esperado: Error de entrada inválida


## [>>Vovler a listado de ejercicios<<](../README.md)