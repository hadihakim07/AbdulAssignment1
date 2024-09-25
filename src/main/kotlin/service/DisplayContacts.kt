package sheridan.hakimzaa.service

class DisplayContacts (private val phoneBook: PhoneBook){

    fun execute(){
        phoneBook.displayContacts()
    }
}