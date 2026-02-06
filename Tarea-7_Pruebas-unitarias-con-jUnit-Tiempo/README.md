❌ Errores
##### 1. No existe el campo días

Si las horas superan 23 → deben convertirse en días

##### 2. La normalización es incorrecta

Normaliza minutos antes que segundos

Permite valores negativos (aunque el sistema no los admite)

Usa while (minutos < 0) cuando eso nunca debería ocurrir

##### 3. suma(Tiempo tiempo) no comprueba null

Si tiempo == null → NullPointerException no controlada

##### 4. suma(int, int, int) no normaliza

Puede dejar el objeto en estado inválido