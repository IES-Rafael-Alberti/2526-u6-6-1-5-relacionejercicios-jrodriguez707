package es.ies.ejercicios.u6.ej61

/**
 * Ejercicio 6.1 — Tipos de herencia, clases y subclases (RA7.a).
 *
 * TODO: Implementa aquí las clases del ejercicio.
 * Recomendación: crea subpaquetes (p. ej. `especializacion`, `extension`, etc.)
 * y añade un `main` de ejemplo que muestre polimorfismo.
 */
object Ej61

//ESPECIALIZACION
open class Vehiculo(
    val marca: String
) {
    open fun arrancar(): String {
        return "El vehiculo $marca esta arrancando"
    }
}

class Coche(
    marca: String,
    val puertas: Int
) : Vehiculo(marca) {

    override fun arrancar(): String {
        return "El coche $marca arranca con llave"
    }
}

class Moto(
    marca: String,
    val cilindrada: Int
) : Vehiculo(marca) {

    override fun arrancar(): String {
        return "La moto $marca arranca con boton"
    }
}

//EXTENSION
open class Persona(
    val nombre: String
) {
    fun presentarse(): String {
        return "Hola, soy $nombre"
    }
}

class Estudiante(
    nombre: String,
    val curso: String
) : Persona(nombre) {

    fun estudiar(): String {
        return "$nombre esta estudiando $curso"
    }
}

class Profesor(
    nombre: String,
    val asignatura: String
) : Persona(nombre) {

    fun enseniar(): String {
        return "$nombre esta enseñando $asignatura"
    }
}

//MAIN
fun main() {

    println("EJEMPLO VEHICULOS")

    val v1: Vehiculo = Coche("Toyota", 5)
    val v2: Vehiculo = Moto("Yamaha", 600)

    println(v1.arrancar())
    println(v2.arrancar())


    println("EJEMPLO PERSONAS")

    val p1: Persona = Estudiante("Carlos", "Programacion")
    val p2: Persona = Profesor("Ana", "Matematicas")

    println(p1.presentarse())
    println(p2.presentarse())

    val estudiante = Estudiante("Luis", "Base de Datos")
    println(estudiante.estudiar())

    val profesor = Profesor("Maria", "Lengua")
    println(profesor.enseniar())
}