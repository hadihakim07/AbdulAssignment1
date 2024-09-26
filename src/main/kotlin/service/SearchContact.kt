//Abdul Hadi Hakimzadah
//991615882

package sheridan.hakimzaa.service

import java.util.*

//class used to search the contact list
class SearchContact(private val phoneBook: PhoneBook) {

    fun execute(){

        //Allows user to input either name or phone number to search for contact
        val scanner = Scanner(System.`in`)
        print("Search Contact: (1) Name or (2) Phone Number: \n")
        when(scanner.nextLine()){
            "1" -> {
                print("Enter Name to search: \n")
                val name = scanner.nextLine().trim()
                val results = phoneBook.searchByName(name)
                displayResults(results)
            }
            "2" -> {
                print("Enter Phone Number to search: \n")
                val phoneNumber = scanner.nextLine().trim()
                val results = phoneBook.searchByPhoneNumber(phoneNumber)
                displayResults(results)
            }

            //validation to ensure user is selecting one of the provided options
            else -> println("Invalid Input please select option 1 or 2")
        }
    }

    //Function used to display the result of the search after the user has inputted the
    // info of the specific contact by displaying their name and number
    private fun displayResults(results: List<Contact>) {
        if (results.isNotEmpty()) {
            results.forEach { println("${it.name}: ${it.phoneNumbers.joinToString(", ")}")}
        }
        //returns a statement indicating that there is no record of searched contact
        else {
            println("No Contacts found!")
        }
    }
}