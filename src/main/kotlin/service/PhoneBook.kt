//Abdul Hadi Hakimzadah
//991615882

package sheridan.hakimzaa.service

class PhoneBook   {

    private val contacts = mutableListOf<Contact>()

    fun addContact(name: String, phoneNumber: String) {
        val contact = contacts.find {it.name == name}
        if (contact != null) {
            contact.phoneNumbers.add(phoneNumber)
        }
        else {
            contacts.add(Contact(name, mutableListOf(phoneNumber)))
        }
    }

    fun searchByName(name: String): List<Contact> {
        return contacts.filter { it.name.contains(name, ignoreCase = true) }
    }

    fun searchByPhoneNumber(phoneNumber: String): List<Contact> {
        return contacts.filter { it.phoneNumbers.contains(phoneNumber) }
    }

    fun modifyContact(name: String, newName: String?, newPhoneNumber: String?) {
        val contact = contacts.find{it.name == name}
        if (contact != null) {
            newName?.let { contact.name = it}
            newPhoneNumber?.let {
                contact.phoneNumbers.removeIf {number -> number == it}
                contact.phoneNumbers.add(it)
            }
        } else {
            println("No contact was found")
        }

    }

    fun displayContacts(){
        if(contacts.isEmpty()){
            println("No contacts found")
        }
        else {
            for (contact in contacts){
                println("${contact.name}: ${contact.phoneNumbers}")
            }
        }
    }
}