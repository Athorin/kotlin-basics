package variables

class Numeric {

    companion object{

        private const val myDouble = 21.4

        fun run() {
            println("Is myDouble a Double? ${myDouble is Double}")
            println("myDouble is a ${myDouble::class.qualifiedName}")
            println("myDouble's javaClass is ${myDouble.javaClass}")
        }

    }
}