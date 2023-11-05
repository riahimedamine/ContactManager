package GestionContact;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "GestionContact.GestionContactService")
public class GestionContactServiceImpl implements GestionContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    @Override
    public String addContact(Contact contact) {
        contacts.put(contact.getName(), contact);
        return "Contact added successfully";
    }

    @Override
    public Contact getContact(String name) {
        return contacts.get(name);
    }

    @Override
    public String updateContact(Contact contact) {
        if (contacts.containsKey(contact.getName())) {
            contacts.put(contact.getName(), contact);
            return "Contact updated successfully";
        } else {
            return "Contact not found";
        }
    }

    @Override
    public String deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            return "Contact deleted successfully";
        } else {
            return "Contact not found";
        }
    }
}
