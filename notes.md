# Apuntes de Java

## Indice

[Fundamentos](#fundamentos)

    [Tipo de datos](#tipo-de-datos)

    [Operadores logicos y aritmeticos](#operadores-logicos-y-aritmeticos)

    [Condicionales](#condicionales)

    [Switch](#switch)

    [Operador ternario](#operador-ternario)

    [While](#while)

    [For](#for)

    [Vectores](#vectores)

    [Matrices](#matrices)

    [Convertir tipos de datos](#convertir-tipos-de-datos)

    [Enum](#enum)

[POO](#poo)

    [Clases abstractas](#clases-abstractas)
 
    [Interfaces](#interfaces)
  
    [Sobrecarga de metodos](#sobrecarga-de-metodos)
   
    [Sobreescritura de metodos](#sobreescritura-de-metodos)

[Collections](#collections)
   
    [Listas](#1-listas)

        [ArrayList](#11-arraylist)

        [LinkedLists](#12-linkedlists)

        [ArrayList vs LinkedLists](#arraylist-vs-linkedlists)

        [Stacks](#13-stacks)
    
    [Hash Map](#hash-map)
 
[Relaciones entre clases](#relaciones-entre-clases)
    [1 a 1](#1-a-1)
    [1a n](#1-a-n)

---

## Fundamentos

### Tipo de datos

![](https://lh3.googleusercontent.com/hRueCaz5s9g02I5e6Mem856vbwJVHToZSkTCTcIoe5zHRFl2L9Pty_ukgQMpz0gY3zFqI2XSz44mmka21aLNn4F6hCMIYbP9JGyoHjGD-MloF67goRJXBxL0q425gtAsGJVKo_Vc9zWaOKJVTCqIW7rpNkef-a3K6-nnMKuQ3SXavksl16AYMCr8k5D39jLtqvY-4t9i8plbfvEtzwmYj-rBekuWlDiUg1hWUzKVTMMsqIVFF16AibEAF5TUOnvV1mgoz7IownisxBYzJSHAzsKflse7-pPlVjgRy6hpUXeHerUmEXQA9doua7sg8r0NjAEEEa4FIwiHGZRzhNJzNlUkgt5a1eMssM9wgyER7o4UVsMW7IhHhB_IxxbtgKMj2lgRfNgQ7KUmUxb_J7kr1qf6OkbVDFK-W9B884-YlFnG7N0h4YbVDaUZWZLeWyUg8W8JwJPxG_B1oCDcRcujEGm1gkP7vYVBdfS9RkwU6s_P8wQdHNaLvWxWATPgYLxxhj7Ts1YHkxkW48k87gff3ms0hYe3Z3atKHy-x_SSOm0QrNXLgr-t_lOFfnk0tTwPCKNbM5BN14rKPgYuhm-fiFSSTcZMHisRzDULb_Tr3h7ADlu_FufB=w607-h882-no)

### Operadores logicos y aritmeticos

![](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTLMVGJPSWBczO2E68AySgYaWPPBfHoFosEpg&s)

![](https://www.clasesdeinformaticaweb.com/wp-content/uploads/2020/06/operadores-aritmeticos.gif)

### Condicionales

![](https://libros.catedu.es/uploads/images/gallery/2022-02/embedded-image-ff2kdq7t.png)

### Switch

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int option = 0;

        System.out.println("Seleccione una opción:");
        option = sn.nextInt();

        switch(option){
            case 1:
                System.out.println("Opcion 1");
                break;
            case 2:
                System.out.println("Opcion 2");
                break;
        }
    }
}
```

### Operador ternario

Son condicionales en una sola linea

```java
// Teoria
// variable = (condicion) ? valor_si_verdadero : valor_si_falso

int vehiculoId = 5;
String vehiculoTipo;

vehiculoTipo = (vehiculoId <= 3) ? "Auto" : "Moto";
System.out.println(vehiculoTipo);

```

### While

```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```

### For

```java
for(init; condicion; mod){

}

for(int i=0; i<=10; i++)
```

### Vectores

```java
int vector [] = new int [5];
vector[0] = 1;
```

### Matrices

```java
Double matriz [][] = new Double[4][4];
matriz[0][0] = 4
```

### Convertir tipos de datos

Double a entero y long
```java
double num = 1.97;

int numInt = (int) num; // double a entero
System.out.println(numInt); // 1

long numLong = (long) num; // double a long
System.out.println(numLong); // 1
```

String a entero y double
```java
String cant = "15"; //String es una clase
String price = "150.27";

int cantInt = Integer.parseInt(cant);
double priceDouble = Double.parseDouble(price);
System.out.println(cantInt + priceDouble);
```

Entero y double a String
```java
int age = 30;
double height = 1.67;

String ageString = String.valueOf(age);
String heightString = String.valueOf(height);
System.out.println(""+ageString+" / "+heightString);
```

### Enum
Pablabra clave utilizada para definir un tipo de dato especial que representa un conjunto fijo de constantes.
Estas constantes son valores predefinidos que representan elementos distinto de un conjunto.

Entre sus metodos estan:
* name(): Devuelve String con el nombre de la constante
* ordinal(): Devuelve un entero con la posición del enum
* values(): Devuelve un array con todos los elementos
* valesOf(String name): Obtener constante del nombre indicado

```java
enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
Days day = Days.MONDAY;
System.out.println(""+day+" / "+ day.ordinal());

System.out.println("----------------");
for (Days d : Days.values()) {
    System.out.println(d);
}
System.out.println("----------------");

```


## POO

### Clases abstractas

* Son un tipo particular de clase que no pueden ser instanciadas.
* Se usan como molde para nuevas clases usando herencia.
* Uno de sus metodos debe ser abstracto, para que las clases hijas las hereden e implementen como quieran.
* Puede ser public o protected, pero no private.
* Una clase no puede heredar de varias clases abstractas a la vez.
* Indicas es "ES/SER" de un objeto.

```java
public abstract class Figura{
    protected double x;
    protected double y;
    public abstract double calcularArea();
}

public class Cuadrado extends Figura{
    @Override
    public double calcularArea(){
        //custom mehod 
}

public class Circulo extends Figura{
    @Override
    public double calcularArea(){
        //custom method
    }
}
```

### Interfaces

* Son una coleccion de metodos abstractos con atributos constantes
* Una interfaz solamente puede extender o implementar otras interfaces (herencia multiple)
* Solo da a conocer metodos abstectos publicos
* Solo puede tener variables public static final (constantes)
* Indican que puede hacer un objeto

```java
public interface ICalculable {
    int iva = 19;
    int physicalDiscount = 14;
    int digitalDiscount = 20;

    int getTotalPurchase();
    int discount();
    int getTotal();
}
```

### Sobrecarga de metodos

Es cuando una clase tiene dos metodos llamados igual, pero con distintos parametros de entrada, ya sea por cantidad o tipo de dato entrante.

```java
public class Calculator {
    // dos integers
    public int add(int a, int b) {
        return a + b;
    }

    // tres integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // dos double
    public double add(double a, double b) {
        return a + b;
    }
}
```

### Sobreescritura de metodos

Metodo de una clase hija que tambien es declarado como metodo abstracto en la clase abstracta(@Override). Hace uso de herencia y polimorfismo.

En este ejemplo, la clase "Dog" y "Cat" heredan de "Animal"

```java
public abstract class Animal {
    public abstract void makeNoise();
}
```

```java
class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Meow! Meow!");
    }
}
```

```java
Animal genericAnimal = new Animal();
Animal dog = new Dog();
Animal cat = new Cat();
Animal cow = new Cow();

genericAnimal.makeNoise();
dog.makeNoise();
cat.makeNoise();
```


## COLLECTIONS
Son estructuras similares a los arreglos, pero con las principal caracteristica de que son "dinamicos" en tamaño y cantidad de elementos. Estas se emplean mediante la interfaz "Collection", que permite emplear distintos metodos.

Tipos de colecciones: 
* List
* Set
* Queue
* Map

### 1. Listas
Conjunto de elemenntos relacionados entre si que tienen determinado orden. Su tamaño es dinamico y existen de tipo:
* ArrayList
* LinkedLists
* Stack.

Tipos de orden que pueden tener las listas:
* FIFO (First in first out)
* LIFO (Last in first out)

#### 1.1 ArrayList
* Son una clase que se representa como una matriz dinamica que permite almacenar elementos
* Hereda de la clase AbstractList, la cual implementa la interfaz List
* Permite colecciones o duplicados
* El orden de los registros es el orden en que fueron insertados(FIFO)
* Permite indice y es de manipulacion lenta(recorre todo el arraylist para hacer el cambio).

```java
//Declarar arraylist de clase Persona(num, nombre, edad)
//List<Persona> list;
List<Persona> lista = new ArrayList<Persona>();

//Agregar elemento a la lista
lista.add(new Persona(1, "John", 23));

//Recorrer lista por indice
for(int i=0; i<lista.size(); i++){
    System.out.println(lista.get(i).getNombre());
}

//Recorrer con foreach
for(Persona p:lista){
    System.out.println(p.getNombre());
}

//recorrer la lista con una función lambda
lista.forEach(listar - >{
    System.out.println(listar + " " ) ;
}) ;

// Borrado de elementos
lista.remove(1);
```

### 1.2 LinkedLists
* Es una clase que representa a una lista doblemente enlazada
* Permite duplicados
* Mantiene orden de insercion (FIFO)
* Puede ser tratada como una lista, pila o cola
* Permite hacer inserciones o eliminaciones al principio o final de la colección

```java
//Declarar linkedList
List<Persona> lista = new LinkedLists<Persona>();

//Agregar elemento a la LinkedLists
lista.add(new Persona(1, "John", 23));

//Agregar elemento al principio LinkedLists
lista.add(0, new Persona(2, "Max", 21));

//Recorrer con foreach
for(Persona p:lista){
    System.out.println(p.getNombre());
}

// Borrado de elemento
for (Persona p : listaLinked) {
    if (p.getNombre().equals("Gabriel")) {
        lista.remove(p);
        break;
    }
}

//Obtener primer y ultimo
lista.getFirst().toSring();
lista.getLast().toSring();
```

### ArrayList vs LinkedLists

```java
//Tamaño en ambos
lista.size();

//Otros
lista.clear();
lista.isEmpty();
```

## 1.3 Stacks
Hace referencia a cuando tienes una "pila de objetos"

```java
Stack<Integer> pila = new Stack<Integer>();

// esta vacia?
pila.isEmpty();

//agregar
pila.push(1);

//recorido
for(Integer p:pila){
    sout(p);
}

pila.search(2); //Buscar por posicion
pila.pop(); //Elimina el ultimo registro
pila.peek(); //Ver ultimo elemento
```

## Hash Map
Coleccion de par llave-valor, equivalente a diccionario en Python.
	
- put(C clave, V valor: Agregar un par clave-valor a la collection Map
- get(Object clave): Devuelve el valor asociado a la clave brindada o null si la clave no existe.
- containsKey(Object clave): Verifica si el Map contiene la clave especificada
- containsValue(Object valor): Comprueba si el Map contiene el valor especificado, devuelve boolean.
- remove(Object clave): Elimina el registro asociado a la clave brindada.
- keySet(): Devuelve un conjunto de todas las claves en el Map.
- values(): Devuelve una colección de todos los valores que contiene el Map.
- clear()
- size()

```java
// Declarar Hash Map
Map<integer, String> mapEmployee = new HashMap<>();

// Agregar
mapEmployee.put(1, "John Rambo")

// contains
boolean isEmployee = mapEmployee.containsValue("John Rambo");
boolean isEmployeeKey = mapEmployee.containsKey(1);


// Devuelve valores como array/lista
mapEmployee.values();
mapEmployee.keySet();

for (integer i : mapEmployee.values()) {
  System.out.println(i);
}
```

## Relaciones entre clases

### 1 a 1
Ejemplo relación Cliente-Ticket, la relación se hace desde la segunda entidad (en este caso, ticket)
```java
public class Ticket {
    public int number;
    public int row;
    public int seat;
    public Date purchase_date;
    public Date validity_date;
    public int price;

    // Relacion con cliente, con sus getter y setters
    public Customer customer;
}
```

### 1 a n
Ejemplo relación Auto-Cliente (Un auto puede tener varios clientes) y la relación se hace desde el "1"
```java
public class Car {
    public Long id;
    public String brand;
    public String model;

    // Relación con cliente, con sus getter y setters
    public List<Customer> listCustomers;
}
```

```java
Car car = new Car();
car.setId(1L);
car.setBrand("Kia");
car.setModel("K4 Sedán 2025");

List<Customer> listCustomers = new ArrayList<Customer>();
Customer customer = new Customer();
customer.setId(35);
customer.setName("John Rambo");

listCustomers.add(customer);
car.setListCustomers(listCustomers);

```


