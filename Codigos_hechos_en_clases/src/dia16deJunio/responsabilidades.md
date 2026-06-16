# RESPONSABILIDADES

## Single Responsability Principle (SRP)
* que cada clase solo tiene su unica responsabilidad
* si una clase tiene varias responsabilidades, separarlas en otras clases o interfaces
* agrega mas seguridad a las clases al hacer que cada clasetenga su propia responsabilidad

## Open/Close Principle (OCP)
* Cerrada a modificacion, abierta para extenderla
* facilidad de agregar cosas pero la base esta lista
* tan facil como hacer un override para sobreescribir los metodos de las clases agregadas

## Liskov Substition Principle (LSP)
* que las subclases no hagan excepciones a un metodo que esta en la clase padre
* La idea es que los hijos nomas tengan sus metodos exclusivos, no hacer que el padre los tenga
* un ejemplo para verlo es que si tenemos el padre Aves(), que no tenga el metodo volar ya que hay aves que no vuelan como los pinguinos.

## Interface Segregation Principle (ISP)
* Que las interfaces no tengan tantos metodos, mejor hacer varias interfaces
* se hace para modificar y encontrar errores mas facil
* 