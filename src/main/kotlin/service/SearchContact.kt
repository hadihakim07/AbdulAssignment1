//Abdul Hadi Hakimzadah
//991615882

package sheridan.hakimzaa.service

import java.util.*

class SearchContact(private val phoneBook: PhoneBook) {

    fun execute(){
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
            else -> println("Invalid Input please select option 1 or 2")
        }
    }

    private fun displayResults(results: List<Contact>) {
        if (results.isNotEmpty()) {
            results.forEach { println("${it.name}: ${it.phoneNumbers.joinToString(", ")}")}
        }
        else {
            println("No Contacts found!")
        }
    }
}