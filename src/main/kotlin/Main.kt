import java.lang.System.exit
import java.util.*

val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    runMenu()
}

fun mainMenu() : Int {
    print(""" 
         > ----------------------------------
         > |          GALLERY APP           |
         > ----------------------------------
         > | GALLERY MENU                   |
         > |   1) Add an artist             |
         > |   2) List all artists          |
         > |   3) Update an artist          |
         > |   4) Delete an artist          |
         > ----------------------------------
         > |   0) Exit                      |
         > ----------------------------------
         > ==>> """.trimMargin(">"))
    return scanner.nextInt()
}

fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1  -> addArtist()
            2  -> listArtists()
            3  -> updateArtist()
            4  -> deleteArtist()
            0  -> exitApp()
            else -> println("Invalid option entered: ${option}")
        }
    } while (true)
}

fun addArtist(){
    println("You chose Add Artist")
}

fun listArtists(){
    println("You chose List Artists")
}

fun updateArtist(){
    println("You chose Update Artist")
}

fun deleteArtist(){
    println("You chose Delete Artist")
}

fun exitApp(){
    println("Exiting...bye")
    exit(0)
}