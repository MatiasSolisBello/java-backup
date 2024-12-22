# Apuntes de Spring Boot

## Indice

[JPA](#jpa)

[Anotaciones](#anotaciones)

[Relaciones](#relaciones)

    [@OneToOne](#@OneToMany)

    [@OneToMany](#@OneToMany)

    [ManyToOne](#ManyToOne)

    [@ManyToMany](#@ManyToMany)

    [Unidireccional vs Bidireccional](#Unidireccional-vs-Bidireccional)

[CrudRepository vs JpaRepository](#CrudRepository-vs-JpaRepository)

---

## JPA
* JPA es un ORM (Object Relational Mapping) que tiene como objetivo lograr la persistencia de datos entre una aplicación desarrollada en Java y una base de datos.
* JPA busca traducir el modelado de las clases Java a un modelado relacional en una base de datos, posibilitando  al programador elegir que clases u objetos quiere persistir.
* JPA funciona mediante una serie de mapeos que se representan mediante annotations. JPA cuenta con proveedores como Eclipselink, Hibernate, entre otros.

## Anotaciones
* @Entity
* @Table: para especificar el nombre de la tabla si es diferente del nombre de la clase.
* @MappedSuperclass: para atributos comunes que deben ser **heredados** por múltiples entidades
* @Id 
   * @GeneratedValue(strategy=GenerationType.SEQUENCE): Id se genera de forma automatica y secuencial
   * @GeneratedValue(strategy=GenerationType.IDENTITY): Columna autoincremental (MySQL y PostgreSQL)
* @Basic
* @Temporal: Para fechas
   * Con hora: @Temporal(TempmporalType.TIMESTAMP)
   * Solo fecha: @Temporal(TempmporalType.DATE)
* @JsonIgnore: No muestra los datos en JSON, es efectivo con claves foraneas
* Implementar la auditoría de entidades agregando campos como @CreatedBy, @CreatedDate, @LastModifiedBy, y @LastModifiedDate para rastrear quién creó o modificó una entidad y cuándo.


## Relaciones

* Usar @OneToOne, @OneToMany, @ManyToOne, y @ManyToMany definir relaciones entre entidades.
* Usar atributo **fetch** para controlar el comportamiento de carga (LAZY o EAGER).
* Utilizar **mappedBy** aparece en el lado inverso de la relación, es decir, indica el campo en la otra entidad (la propietaria) que gestiona la relación.
* Usar atributo **cascade**  para especificar operaciones en cascada (por ejemplo CascadeType.ALL, CascadeType.PERSIST)

### @OneToOne
Relación donde una entidad está asociada con una sola instancia de otra entidad.

* Ejemplo: Un User tiene un único Passport.
* Propietaria: Usa @JoinColumn en una de las entidades para definir la clave foránea.

```java
@Entity
public class User {
    @Id @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "passport_id") // Clave foránea
    private Passport passport;
}

@Entity
public class Passport {
    @Id @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "passport")
    private User user;
}
```

### @OneToMany
Una entidad está asociada con múltiples instancias de otra entidad.

* Ejemplo: Un User puede tener muchas Order.
* Propietaria: El lado con @ManyToOne.

```java
@Entity
public class User {
    @Id @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "user") // Relación inversa
    private List<Order> orders;
}

@Entity
public class Order {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id") // Clave foránea
    private User user;
}
```

### ManyToOne
Relación inversa de @OneToMany. Múltiples entidades están asociadas con una única entidad.
* Ejemplo: Muchas Order pertenecen a un User.
* Generalmente es la entidad propietaria.

### @ManyToMany
Relación donde múltiples entidades están asociadas entre sí.

* Ejemplo: Un Student puede estar inscrito en múltiples Course, y un Course puede tener múltiples Student.
* Usa una tabla intermedia para gestionar la relación

```java
@Entity
public class Student {
    @Id @GeneratedValue
    private Long id;

    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
}

@Entity
public class Course {
    @Id @GeneratedValue
    private Long id;

    @ManyToMany(mappedBy = "courses") // Relación inversa
    private List<Student> students;
}

```

### Unidireccional vs Bidireccional

Unidireccional: Solo uno de los lados conoce la relación. Más simple pero menos flexible.
```java
@OneToMany
@JoinColumn(name = "user_id")
private List<Order> orders; // Sin necesidad de mappedBy
```
Bidireccional: Ambos lados conocen la relación. Se debe usar mappedBy en el lado inverso para evitar duplicación.

### Reglas importantes
* Entidad propietaria:
  Es quien define la clave foránea o tabla intermedia. Siempre lleva @JoinColumn o @JoinTable.

* mappedBy:
  Define el lado inverso de la relación y referencia el campo en la entidad propietaria.

* Cascada (cascade):
  Define operaciones en cascada como CascadeType.ALL, PERSIST, MERGE, etc., para que las acciones realizadas en una entidad se propaguen a las relacionadas.
```java
@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
private List<Order> orders;
```

* Cargar datos:
  Controlado con fetch:
  * FetchType.LAZY: Carga los datos relacionados solo cuando se necesitan.
  * FetchType.EAGER: Carga los datos relacionados inmediatamente.}

```java
@Entity
public class User {
    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orders;
}

@Entity
public class Order {
    @Id @GeneratedValue
    private Long id;

    private Double total;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
```


## CrudRepository vs JpaRepository
