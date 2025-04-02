## Requerimientos de soft.

>> Ciclo de desarrollo
Es todo el proceso de entender que se va a desarrollar y como se puede seguir manteniendo.

## Static
### Atributos estaticos
Son todos aquellos que no necesitan una instancia para poder ser ejecutados

El Hash es como partir en trozos una frase o palabra. Esta es muy comun en las contraseñas, porque lo que estas almacenan es el password hasheado y la gran diferencia que tiene con el encriptamiento es que algo encriptado se puede recuperar la palabra o frase original.
En el hash no, no se puede revertir

### Metodos estaticos
Esto para el tipo de acciones que no queremos que cambien a lo largo de a ejecucion del programa

Java es de tipado fuerte. Es decir que hay que especificar que tipo de datos es cada variable. 

## Clase abstracta
>> Es una clase que nunca queremos instanciar, es como un repositorio de metodos

### Niveles de alcance en Java
##### Alcance de clase
Variables declaradas dentro de la clase pero fuera de los metodos y existen mientras exista el metodo

``` 
private String name; // Alcance de clase (visible en toda la clase)
```

##### Alcance de metodo
Variables delcaradas dentro de un metodo y no son globales. 
```
public void metodo() {
    int contador = 0; // Alcance de método
}
```

##### Alcance de bloque 
Variables declaradas dentro de bloques como for, if, while
```
for(int i=0; i<10; i++) { // 'i' tiene alcance de bloque
    System.out.println(i);
}
```

### Sobrecarga de metodos - overloading
Agrupar metodos con la misma funcionalidad pero con diferentes parametros bajo el mismo nombre