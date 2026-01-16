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
class Libro(var titulo: String, var autor: String)
{

    var leido: Boolean = false
    var numPaginas: Int = 0

    constructor(titulo: String, autor: String, numPaginas: Int, leido: Boolean): this(titulo, autor) {
        this.numPaginas = numPaginas
        this.leido = leido
    }

    override fun toString(): String
    { return "Libro: $titulo por $autor, paginas: $numPaginas, leido: ${if (leido) "Si" else "No"}" }
}


// Ejercicio 4
class Estudiante(private val nombre: String)
{
    var nota: Double = 0.0

    fun setNota(nota: Double) { if (nota in 0.0..10.0) this.nota = nota }

    override fun toString(): String { return "Estudiante: $nombre, nota $nota" }
}


class Producto(private var nombre: String, private var precio: Double, private var stock: Int)
{
    init {
        if (precio < 0.0 || stock < 0) throw Exception("Precio invalido")
    }

    fun vender(cantidad: Int) { if (cantidad > 0) stock -= cantidad }

    fun rebastecer(cantidad: Int) { if (cantidad > 0) stock += cantidad }

    override fun toString(): String { return "roducto: $nombre, Precio: $precio€, Stock: $stock" }
}

fun main()
{


}