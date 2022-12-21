import variables.Strings
import variables.Numeric as NumericAlias

class Menu {
    companion object{
        
        fun runMenu() {

            var option = String()

            while(option != "0") {

                printMenu()
                option = readLine().toString()

                when (option) {
                    "0" -> println("Good bye!")
                    "1" -> Strings.run()
                    "2" -> NumericAlias.run()
                    else -> {
                        print("This option not exists.")
                    }
                }
            }
        }

        fun printMenu() {
            println("\nMENU")
            println("------------------------")
            println("1. String")
            println("2. Numerics")
            println("0. Exit")
        }


    }
}