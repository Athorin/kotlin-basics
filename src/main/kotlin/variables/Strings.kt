package variables

class Strings {

    companion object {
        var name: String = "Fran" // common variable that can be changed
        val surname: String = "Azorin" // val (Value) -> immutable variable, cannot be changed once the value has been created

        // Its prefer to use val wherever possible (reason why var is underlined)

        // Variables dont need to define a type (but kotlin is strongly typed language)
        var comment = "My comment" // so this is created as string

        // Multiline string
        val story = """It was a dark a storm night.
        |A foul smell crept across the city.
        |Jane wondered that time it was, and when it would be daylight."""
            .trimMargin("|") // (pipe indicate where margin stops to fit de line)

        fun run() {
            // This is a string template
            println("Hello $name ${surname.uppercase()}")
            println("The \$name variable has ${name.length} characters")
            println("Your product cost $10 or \$about10") // \$ is putted to avoid take as varible

            println(story)
        }
    }

}