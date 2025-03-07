package com.example.bridgelabz.addressbook.controller;

import com.example.bridgelabz.addressbook.model.AddressBook;
import com.example.bridgelabz.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping
    public ResponseEntity<List<AddressBook>> getAllContacts() {
        return ResponseEntity.ok(addressBookService.getAllContacts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressBook> getContactById(@PathVariable int id) {
        return ResponseEntity.ok(addressBookService.getContactById(id));
    }

    @PostMapping
    public ResponseEntity<String> addContact(@RequestBody String contact) {
        return ResponseEntity.ok("Contact added: " + contact);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateContact(@PathVariable int id, @RequestBody String contact) {
        return ResponseEntity.ok("Contact updated with ID: " + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable int id) {
        return ResponseEntity.ok("Contact deleted with ID: " + id);
    }
}
