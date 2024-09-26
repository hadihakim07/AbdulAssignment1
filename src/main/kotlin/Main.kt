//Abdul Hadi Hakimzadah
//991615882

package sheridan.hakimzaa

import sheridan.hakimzaa.service.*
import java.util.*

// Main file for application to run
fun main() {
    val phoneBook = PhoneBook()
    val scanner = Scanner(System.`in`)

    //Main menu for user to access phone book through different options
    while (true) {
        println("\nKotlin Phone book: \n")
        println("1. Add Contact")
        println("2. Search Contact")
        println("3. Edit Contact")
        println("4. Show all Contacts")
        println("5. Exit")
        print("Select an option between 1-5\n")

        //Utilises user input to access different functions of the main menu
        when(scanner.nextLine()) {
            "1" -> AddContact(phoneBook).execute()
            "2" -> SearchContact(phoneBook).execute()
            "3" -> ModifyContact(phoneBook).execute()
            "4" -> DisplayContacts(phoneBook).execute()
            "5" -> {
                println("Exiting the Kotlin phone book. Have a great day")
                return

            }
            //validation to ensure that the user is selecting one of the provided options
            else -> println("Invalid input. Please select an option between 1-5")

        }
    }

}

// Validation using regular expression to ensure when a phone number is inputted it
// follows the correct format
fun validatePhoneNumber(phoneNumber: String): Boolean {
    return phoneNumber.matches(Regex("\\d{10}"))
}