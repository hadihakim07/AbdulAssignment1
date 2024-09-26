//Abdul Hadi Hakimzadah
//991615882

package sheridan.hakimzaa.service

import sheridan.hakimzaa.validatePhoneNumber
import java.util.*

class ModifyContact(private val phoneBook: PhoneBook) {

    fun execute(){
        val scanner = Scanner(System.`in`)
        print("Enter Name of Contact to edit: ")
        val name = scanner.nextLine().trim()
        print("Enter New Name (or press enter to bypass): ")
        val newName = scanner.nextLine().takeIf { it.isNotBlank() }
        print("Enter New Phone Number (or press Enter to bypass): ")
        val newPhoneNumber = scanner.nextLine().takeIf { it.isNotBlank() }
        if (newPhoneNumber != null && !validatePhoneNumber(newPhoneNumber)) {
            println("Incorrect phone number format")
        } else{
            phoneBook.modifyContact(name, newName, newPhoneNumber)
            println("Successfully edited contact")
        }
    }
}