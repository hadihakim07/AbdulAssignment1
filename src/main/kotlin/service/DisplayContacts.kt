//Abdul Hadi Hakimzadah
//991615882

package sheridan.hakimzaa.service

class DisplayContacts (private val phoneBook: PhoneBook){

    //this class will call upon the display contacts function from the PhoneBook class
    // it will display all contacts in the list
    fun execute(){
        phoneBook.displayContacts()
    }
}