package one.digitalinnovation.personapi.service;


import one.digitalinnovation.personapi.dto.MensageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public MensageResponseDTO createPerson( Person person) {
        var savedPerson = personRepository.save(person);
        return MensageResponseDTO
                .builder()
                .message("Created Person with ID" + savedPerson.getId())
                .build();
    }
}
