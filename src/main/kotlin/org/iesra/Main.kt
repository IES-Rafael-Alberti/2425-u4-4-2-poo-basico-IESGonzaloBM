package org.iesra

// Ejercicio 1

class CuentaBancaria(private var titular: String, private var saldo: Double = 0.0)
{
    fun ingresar(cantidad: Double)
    {
        if (cantidad <= 0) throw Exception("La cantidad no puede ser negativa o 0")

        saldo += cantidad
        println("Saldo: $saldo")
    }

    fun retirar(cantidad: Double)
    {
        if (cantidad >= saldo) throw Exception("No se pueden retirar cantidades mayores al saldo")

        saldo -= cantidad
        println("Saldo: $saldo")
    }
}


// Ejercicio 2
class Vehiculo(private var marca: String, private var modelo: String, private var kilometraje: Double = 0.0)
{
    fun registrarViaje(kilometros: Double)
    {
        // No se saben los detalles
    }

    fun detalles(): String { return "Vehiculo $marca, modelo $modelo con $kilometraje km" }
}


// Ejercicio 3
class Libro(private var titulo: String, private var autor: String)
{
    constructor(numPaginas: Int, leido: Boolean): this(titulo, autor) {
        numPaginas = 100
        leido = false
    }

    override fun toString(): String
    { return "Libro: $titulo por $autor, paginas: $numPaginas, leido: ${if (leido) "Si" else "No"}" }
}


fun main()
{

}