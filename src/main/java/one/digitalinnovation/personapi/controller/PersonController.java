package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.dto.MensageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping
    @ResponseStatus()
    public MensageResponseDTO createPerson(@RequestBody  Person person) {

        return personService.createPerson(person);
    }
}
