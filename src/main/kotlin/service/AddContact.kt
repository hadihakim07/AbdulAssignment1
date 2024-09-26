//Abdul Hadi Hakimzadah
//991615882

package sheridan.hakimzaa.service

import sheridan.hakimzaa.validatePhoneNumber
import java.util.*

class AddContact(private val phoneBook: PhoneBook) {

    fun execute() {
        //Allows user to input the name of the contact into the phone book
        val scanner = Scanner(System.`in`)
        print("Enter Name: ")

        //Allows user to input phone number for the same contact
        val name = scanner.nextLine().trim()
        print("Enter Phone Number: ")

        //inputted phone number will be through validation and will either allow the
        //contact to be added or for the user to re-input the phone number
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