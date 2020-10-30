package com.example.demomysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
@RestController
@RequestMapping("/v1")
public class PersonResource {
    @Autowired
    PersonDao personDao;

    @Autowired
    PersonDao2 personDao2;

    @Transactional //else we will get exception at run time
    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getAllPerson() {
//        return personDao.findAll();// execute query using JPA
        return personDao2.findAll(); //execute query using hibernate
    }

    @Transactional
    @RequestMapping(method = RequestMethod.POST)
    public Person getOnePerson(@RequestBody Person person) {
        return personDao.save(person);
    }

    @Transactional
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Person> getOnePerson(@PathVariable("id") Integer id) {
        return personDao.findById(id);
    }

}
