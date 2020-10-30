package com.example.demomysql;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getAllPerson() {
        return personDao.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Person getOnePerson(@RequestBody Person person) {
        return personDao.save(person);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Person> getOnePerson(@PathVariable("id") Integer id) {
        return personDao.findById(id);
    }

}
