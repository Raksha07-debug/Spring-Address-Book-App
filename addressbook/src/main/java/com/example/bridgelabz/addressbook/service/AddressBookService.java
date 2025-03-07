package com.example.bridgelabz.addressbook.service;

import com.example.bridgelabz.addressbook.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {
    private List<AddressBook> addressBookList = new ArrayList<>();

    public List<AddressBook> getAllContacts() {
        return addressBookList;
    }

    public AddressBook getContactById(int id) {
        return addressBookList.stream().filter(contact -> contact.getId() == id).findFirst().orElse(null);
    }
}