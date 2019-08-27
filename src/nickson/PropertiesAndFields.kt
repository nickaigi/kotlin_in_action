package nickson

/* Declaring properties
 * - properties in Kotlin can be mutable (var) or read-only (val)
 * - to use a property, refer to it by its name
 *
 *      var <propertyName>[: <PropertyType>] [= <property_initializer> ][<getter>][<setter>]
 *
 * - The initializer, getter and setter are optional.
 * - Property type is optional if it can be inferred from the initializer (or from the getter return type)
 * */

class Address {
    var name: String = "Nickson K"
    var street: String = "Luthuli Ave"
    var city: String = "Nairobi"
    var county: String = "Nairobi"
}

fun copyAddress(address: Address) : Address {
    var result = Address() // there is no 'new' keyword in Kt
    result.name = address.name
    result.street = address.street
    result.city = address.city
    result.county = address.county
    return result
}

// Let's describe a useless bag
class Bag {
    val color: String = "Black"
    val size: Int = 0
    val isEmpty: Boolean
        get() = this.size == 0
    }
}

/* using a setter
 * - by convention, the parameter passed to a setter is known as 'value'
 *      var stringRepresentaion: String
 *          get() = this.toString()
 *          set(value) = {
 *              setDataFromString(value) // parses the string and assigns values to other properties
 *          }
 * */

fun main() {
    var allByDefault: Int?
    var initialized = 1
    // read-only property declaration uses 'val' value, does not allow a setter
    val simple: Int?     // has type Int, default getter, must be initialized in constructor
    val inferredType = 1 // has type Int and a default getter

    var bag = Bag()
    println("Bag: ${bag.size}, ${bag.isEmpty}")
}