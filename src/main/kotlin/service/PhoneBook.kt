//Abdul Hadi Hakimzadah
//991615882

package sheridan.hakimzaa.service

class PhoneBook   {

    private val contacts = mutableListOf<Contact>()

    //function used to add contacts to the contact list
    //uses the name and phone number as requirements to be inputted so they can be added
    fun addContact(name: String, phoneNumber: String) {
        val contact = contacts.find {it.name == name}
        if (contact != null) {
            contact.phoneNumbers.add(phoneNumber)
        }
        else {
            contacts.add(Contact(name, mutableListOf(phoneNumber)))
        }
    }

    //Function used in SearchContact class to search contact list for a contact by name
    fun searchByName(name: String): List<Contact> {
        return contacts.filter { it.name.contains(name, ignoreCase = true) }
    }

    //Function used in SearchContact class to search contact list for a contact by phone number
    fun searchByPhoneNumber(phoneNumber: String): List<Contact> {
        return contacts.filter { it.phoneNumbers.contains(phoneNumber) }
    }

    //function used in ModifyContact class to search for contact using the inputted name or phone
    // number update contact name to a new name and phone number
    fun modifyContact(name: String, newName: String?, newPhoneNumber: String?) {
        val contact = contacts.find{it.name == name}
        if (contact != null) {
            newName?.let { contact.name = it}
            newPhoneNumber?.let {
                contact.phoneNumbers.removeIf {number -> number == it}
                contact.phoneNumbers.add(it)
            }
        //If contact doesn't exist returns statement indicating that
        // no contact was found with the inputted name or phone number
        } else {
            println("No contact was found")
        }

    }

    //function used by DisplayContact class to display list of contacts
    //Returns statement indicating that no contacts are found if List is empty
    fun displayContacts(){
        if(contacts.isEmpty()){
            println("No contacts found")
        }
        else {
            for (contact in contacts){
                println("\n\n${contact.name}: ${contact.phoneNumbers}")
            }
        }
    }
}