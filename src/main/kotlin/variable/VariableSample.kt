package org.assignment.variable

class VariableSample {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val name : String = "Flature"
            val org = "Studio"
            var age = 12

            age = 15

            println("name is $name")
            println("org is $org")
            println("age is $age")
        }
    }
}