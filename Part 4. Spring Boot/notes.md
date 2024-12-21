# Apuntes de Spring Boot

## Indice

[jpa](#jpa)

[Anotaciones](#anotaciones)

[Relaciones](#relaciones)

[CrudRepository vs JpaRepository](#CrudRepository-vs-JpaRepository)

---

## JPA
* JPA es un ORM (Object Relational Mapping) que tiene como objetivo lograr la persistencia de datos entre una aplicación desarrollada en Java y una base de datos.
* JPA busca traducir el modelado de las clases Java a un modelado relacional en una base de datos, posibilitando  al programador elegir que clases u objetos quiere persistir.
* JPA funciona mediante una serie de mapeos que se representan mediante annotations. JPA cuenta con proveedores como Eclipselink, Hibernate, entre otros.

## Anotaciones
* @Entity
* @Id 
   * @GeneratedValue(strategy=GenerationType.SEQUENCE): Id se genera de forma automatica y secuencial
* @Basic
* @Temporal: Para fechas
   * Con hora: @Temporal(TempmporalType.TIMESTAMP)
   * Solo fecha: @Temporal(TempmporalType.DATE)
* @JsonIgnore


## Relaciones


## CrudRepository vs JpaRepository