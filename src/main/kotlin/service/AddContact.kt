package sheridan.hakimzaa.service

import sheridan.hakimzaa.validatePhoneNumber
import java.util.*

class AddContact(private val phoneBook: PhoneBook) {

    fun execute() {
        val scanner = Scanner(System.`in`)
        print("Enter Name: ")
        val name = scanner.nextLine().trim()
        print("Enter Phone Number: ")
        val phoneNumber = scanner.nextLine().trim()
        if (validatePhoneNumber(phoneNumber)) {
            phoneBook.addContact(name, phoneNumber)
            println("Contact Added!")
        }
        else {
            println("Invalid Phone Number, Please re-enter a valid 10 digit phone number")
        }
    }
}