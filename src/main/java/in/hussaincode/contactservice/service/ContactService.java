package in.hussaincode.contactservice.service;

import in.hussaincode.contactservice.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUsers(Long userId);
}
