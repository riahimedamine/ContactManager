
package Client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddContact_QNAME = new QName("http://GestionContact/", "addContact");
    private final static QName _AddContactResponse_QNAME = new QName("http://GestionContact/", "addContactResponse");
    private final static QName _DeleteContact_QNAME = new QName("http://GestionContact/", "deleteContact");
    private final static QName _DeleteContactResponse_QNAME = new QName("http://GestionContact/", "deleteContactResponse");
    private final static QName _GetContact_QNAME = new QName("http://GestionContact/", "getContact");
    private final static QName _GetContactResponse_QNAME = new QName("http://GestionContact/", "getContactResponse");
    private final static QName _UpdateContact_QNAME = new QName("http://GestionContact/", "updateContact");
    private final static QName _UpdateContactResponse_QNAME = new QName("http://GestionContact/", "updateContactResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddContact }
     * 
     */
    public AddContact createAddContact() {
        return new AddContact();
    }

    /**
     * Create an instance of {@link AddContactResponse }
     * 
     */
    public AddContactResponse createAddContactResponse() {
        return new AddContactResponse();
    }

    /**
     * Create an instance of {@link DeleteContact }
     * 
     */
    public DeleteContact createDeleteContact() {
        return new DeleteContact();
    }

    /**
     * Create an instance of {@link DeleteContactResponse }
     * 
     */
    public DeleteContactResponse createDeleteContactResponse() {
        return new DeleteContactResponse();
    }

    /**
     * Create an instance of {@link GetContact }
     * 
     */
    public GetContact createGetContact() {
        return new GetContact();
    }

    /**
     * Create an instance of {@link GetContactResponse }
     * 
     */
    public GetContactResponse createGetContactResponse() {
        return new GetContactResponse();
    }

    /**
     * Create an instance of {@link UpdateContact }
     * 
     */
    public UpdateContact createUpdateContact() {
        return new UpdateContact();
    }

    /**
     * Create an instance of {@link UpdateContactResponse }
     * 
     */
    public UpdateContactResponse createUpdateContactResponse() {
        return new UpdateContactResponse();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContact }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddContact }{@code >}
     */
    @XmlElementDecl(namespace = "http://GestionContact/", name = "addContact")
    public JAXBElement<AddContact> createAddContact(AddContact value) {
        return new JAXBElement<AddContact>(_AddContact_QNAME, AddContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContactResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddContactResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://GestionContact/", name = "addContactResponse")
    public JAXBElement<AddContactResponse> createAddContactResponse(AddContactResponse value) {
        return new JAXBElement<AddContactResponse>(_AddContactResponse_QNAME, AddContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContact }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteContact }{@code >}
     */
    @XmlElementDecl(namespace = "http://GestionContact/", name = "deleteContact")
    public JAXBElement<DeleteContact> createDeleteContact(DeleteContact value) {
        return new JAXBElement<DeleteContact>(_DeleteContact_QNAME, DeleteContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteContactResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://GestionContact/", name = "deleteContactResponse")
    public JAXBElement<DeleteContactResponse> createDeleteContactResponse(DeleteContactResponse value) {
        return new JAXBElement<DeleteContactResponse>(_DeleteContactResponse_QNAME, DeleteContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContact }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContact }{@code >}
     */
    @XmlElementDecl(namespace = "http://GestionContact/", name = "getContact")
    public JAXBElement<GetContact> createGetContact(GetContact value) {
        return new JAXBElement<GetContact>(_GetContact_QNAME, GetContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContactResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://GestionContact/", name = "getContactResponse")
    public JAXBElement<GetContactResponse> createGetContactResponse(GetContactResponse value) {
        return new JAXBElement<GetContactResponse>(_GetContactResponse_QNAME, GetContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContact }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateContact }{@code >}
     */
    @XmlElementDecl(namespace = "http://GestionContact/", name = "updateContact")
    public JAXBElement<UpdateContact> createUpdateContact(UpdateContact value) {
        return new JAXBElement<UpdateContact>(_UpdateContact_QNAME, UpdateContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateContactResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateContactResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://GestionContact/", name = "updateContactResponse")
    public JAXBElement<UpdateContactResponse> createUpdateContactResponse(UpdateContactResponse value) {
        return new JAXBElement<UpdateContactResponse>(_UpdateContactResponse_QNAME, UpdateContactResponse.class, null, value);
    }

}
