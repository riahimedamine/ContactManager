package GestionContact;

import javax.jws.WebService;

@WebService
public interface GestionContactService {
    String addContact(Contact contact);
    Contact getContact(String name);
    String updateContact(Contact contact);
    String deleteContact(String name);
}
