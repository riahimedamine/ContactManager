package GUI;

import Client.Contact;
import Client.GestionContactService;
import Client.GestionContactServiceImplService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactClientGUI extends JFrame {
    private JTextField nameField, emailField, lastNameField, phoneNumberField, resultField;
    private GestionContactService service;

    public ContactClientGUI() {
        super("Contact Management Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);

        // Initialize the ContactService client
        service = new GestionContactServiceImplService().getGestionContactServiceImplPort();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        nameField = new JTextField(20);
        emailField = new JTextField(20);
        lastNameField = new JTextField(20);
        phoneNumberField = new JTextField(20);
        resultField = new JTextField(20);
        resultField.setEditable(false);

        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Last Name:"));
        panel.add(lastNameField);
        panel.add(new JLabel("Phone Number:"));
        panel.add(phoneNumberField);

        JButton addButton = new JButton("Add Contact");
        JButton searchButton = new JButton("Search Contacts");
        JButton updateButton = new JButton("Update Contact");
        JButton deleteButton = new JButton("Delete Contact");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addContact();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchContacts();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateContact();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteContact();
            }
        });

        panel.add(addButton);
        panel.add(searchButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(resultField);

        add(panel);
        setVisible(true);
    }

    private void addContact() {
        String name = nameField.getText();
        String email = emailField.getText();
        String lastName = lastNameField.getText();
        int phoneNumber = Integer.parseInt(phoneNumberField.getText());

        Contact contact = new Contact();
        contact.setName(name);
        contact.setEmail(email);
        contact.setLastName(lastName);
        contact.setPhoneNumber(phoneNumber);

        String result = service.addContact(contact);
        resultField.setText(result);
    }

    private void searchContacts() {
        String name = nameField.getText();

        if (!name.isEmpty()) {
            Contact contact = service.getContact(name);
            if (contact != null) {
                resultField.setText(contact.toString());
            } else {
                resultField.setText("Contact not found");
            }
        } else {
            resultField.setText("Please enter name for search");
        }
    }

    private void updateContact() {
        String name = nameField.getText();
        Contact contact = service.getContact(name);

        if (contact != null) {
            String result = service.updateContact(contact);
            resultField.setText(result);
        } else {
            resultField.setText("Contact not found");
        }
    }

    private void deleteContact() {
        String name = nameField.getText();
        String result = service.deleteContact(name);
        resultField.setText(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContactClientGUI();
            }
        });
    }
}
