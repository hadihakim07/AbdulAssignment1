//Abdul Hadi Hakimzadah
//991615882

package sheridan.hakimzaa.service

import sheridan.hakimzaa.validatePhoneNumber
import java.util.*

class ModifyContact(private val phoneBook: PhoneBook) {

    fun execute(){
        //Allows user to input name of existing contact to edit
        val scanner = Scanner(System.`in`)
        print("Enter Name of Contact to edit: ")

        //Allows user to input new name for the contact or skip the name change
        val name = scanner.nextLine().trim()
        print("Enter New Name (or press enter to bypass): ")

        //Allows user to input new phone number for the contact or skip the change
        val newName = scanner.nextLine().takeIf { it.isNotBlank() }
        print("Enter New Phone Number (or press Enter to bypass): ")

        //Puts the new number through the validator and confirms it follows
        //the correct format for a phone number and updates the contact if it is
        val newPhoneNumber = scanner.nextLine().takeIf { it.isNotBlank() }
        if (newPhoneNumber != null && !validatePhoneNumber(newPhoneNumber)) {
            println("Incorrect phone number format")
        } else{
            phoneBook.modifyContact(name, newName, newPhoneNumber)
            println("Successfully edited contact")
        }
    }
}