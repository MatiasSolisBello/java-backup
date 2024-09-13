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

[POO](#poo)

   [Clases abstractas](#clases-abstractas)

    [Interfaces](#interfaces)

    [Sobrecarga de metodos](#sobrecarga-de-metodos)

    [Sobreescritura de metodos](#sobreescritura-de-metodos)

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
option = Integer.parseInt(sn.nextLine());
switch(option){
    case 1:
        System.out.println("Opcion 1");
        break;
    case 2:
        System.out.println("Opcion 1");
        break;
}
```

### Operador ternario

Son condicionales en una sola linea

```java
variable = (condicion) ? valor_si_verdadero : valor_si_falso
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

Es cuando una clase tiene dos metodos llamados igual, pero con distintos parametros de entrada.

### Sobreescritura de metodos

Metodo de una clase hija que tambien es declarado como metodo abstracto en la clase abstracta(@Override). Hace uso de herencia y polimorfismo
