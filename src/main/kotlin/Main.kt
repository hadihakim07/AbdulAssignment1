package sheridan.hakimzaa

import sheridan.hakimzaa.service.DisplayContacts
import sheridan.hakimzaa.service.PhoneBook
import java.util.*

fun main() {
    val phoneBook = PhoneBook()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\nKotlin Phone book:")
        println("1. Add Contact")
        println("2. Search Contact")
        println("3. Edit Contact")
        println("4. Show all Contacts")
        println("5. Exit")
        print("Select an option between 1-5")

        when(scanner.nextLine()) {
            "1" -> AddContact(phoneBook).execute()
            "2" -> SearchContact(phoneBook).execute()
            "3" -> ModifyContact(phoneBook).execute()
            "4" -> DisplayContacts(phoneBook).execute()
            "5" -> {
                println("Exiting the Kotlin phone book. Have a great day")
                return

            }
            else -> println("Invalid input. Please select an option between 1-5")

        }
    }

}

fun validatePhoneNumber(phoneNumber: String): Boolean {
    // validating phone number using regular expression
    return phoneNumber.matches(Regex("\\d{10}"))
}