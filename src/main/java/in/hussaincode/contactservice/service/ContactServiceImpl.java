package in.hussaincode.contactservice.service;

import in.hussaincode.contactservice.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake user list
    List<Contact> contactList=List.of(
            new Contact(1L,"hssaincode@gmail.com","Hussain",13111L),
            new Contact(2L,"Haris@gmail.com","Haris",13111L),
            new Contact(3L,"Waris@gmail.com","Waris",13113L),
            new Contact(4L,"Intekhab@gmail.com","Intekhab",13114L)
    );

    @Override
    public List<Contact> getContactsOfUsers(Long userId) {
        return contactList.stream().filter(contact ->
                contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
