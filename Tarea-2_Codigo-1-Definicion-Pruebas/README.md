## 1. Comprobación de ejecución del código
¿El código compila y se ejecuta correctamente?

✔ Sí, el código se ejecuta correctamente y no presenta errores de compilación ni de ejecución si el usuario introduce datos válidos.

### Observaciones:

Usa Scanner correctamente.

El flujo de control funciona como se espera.

No valida entradas (si el usuario introduce letras donde se espera un número, el programa fallará con InputMismatchException).


## 2. Pruebas del camino básico

### 2.1 --- Grafo de flujo del método ---
![GrafoDelFlujo](FlujoDeMetodo.png)

###  2.2  --- Complejidad ciclomática ---

* Formula:
    - V(G)=D+1

```
Siguiendo esta formula.
        Estructura                      Decisiones
- if (personaje == 1)	                    1
- if (accion == 1)	                        1
- else if (accion == 2)	                    1
- else if (personaje == 2)	                1
- if (accion == 1 && esDeDia)	            2
- else if (accion == 1 && !esDeDia)	        2
- else if (accion == 2)	                    1
- else if (personaje == 3)	                1
- Total decisiones (D)	                    10
--> 𝑉(𝐺)=10+1 =11

                ¿Cumple el requisito (< 9)?

                        NO
```
### 2.3 --- Conjunto básico de caminos independientes ---

```
🧭 5. Conjunto básico de caminos independientes

Número de caminos = Complejidad ciclomática = 11

Ejemplos representativos:

Personaje inválido

Guerrero → Atacar

Guerrero → Defender

Guerrero → Usar objeto

Mago → Atacar de día

Mago → Atacar de noche

Mago → Defender

Mago → Usar objeto

Arquero

Guerrero con acción inválida

Mago con acción inválida
```

### 2.4 --- Casos de prueba ---

```
🧪 6. Casos de prueba (ejemplos)
ID	Personaje	Acción	Día	   Resultado esperado
TC-01	1	        1	true	Guerrero ataca
TC-02	1	        2	false	Guerrero defiende
TC-03	2	        1	true	Bola de fuego
TC-04	2	        1	false	Hechizo de sombras
TC-05	2	        3	true	Pocion
TC-06	3	        1	true	Arquero prepara arco
TC-07	9	        1	true	Personaje no válido
```



## 3. Particiones de equivalencia (incluyendo valores límite)

```
Entrada personaje

Válidos: {1, 2, 3}

Inválidos: {≤0, ≥4}

Valores límite:

0 ❌

1 ✅

3 ✅

4 ❌

Entrada accion

Válidos: {1, 2, 3}

Inválidos: {≤0, ≥4}

Valores límite:

0 ❌

1 ✅

3 ✅

4 ❌

Entrada esDeDia

true

false

(No tiene valores límite al ser booleano)
```
## [>>Vovler a listado de ejercicios<<](../README.md)