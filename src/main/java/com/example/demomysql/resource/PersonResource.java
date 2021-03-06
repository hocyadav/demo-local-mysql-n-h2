package com.example.demomysql.resource;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demomysql.dao.PersonDao;
import com.example.demomysql.dao.PersonDao2;
import com.example.demomysql.entity.Person;

/**
 * @author HariomYadav
 * @since 30/10/20
 */
@RestController
@RequestMapping ("/v1")
public class PersonResource {
    @Autowired
    PersonDao personDao;

    @Autowired
    PersonDao2 personDao2;

    @Transactional //else we will get exception at run time
    @RequestMapping (method = RequestMethod.GET)
    public List<Person> getAllPerson() {
//                return personDao.findAll();// execute query using JPA
        return personDao2.findAll(); //execute query using hibernate
    }

    @Transactional
    @RequestMapping (method = RequestMethod.POST)
    public Person getOnePerson(@RequestBody Person person) {
//                return personDao.save(person);// JPA
        return personDao2.save(person);//hibernate entity manager
    }

    @Transactional
    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    public Optional<Person> getOnePerson(@PathVariable ("id") Integer id) {
//                return personDao.findById(id);//JPA
        return personDao2.findById(id);//Hibernate entity manager
    }

    @Transactional
    @RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
    public void deletePersonById(@PathVariable ("id") Integer id) {
        final Optional<Person> byId = personDao.findById(id);
        if (byId.isPresent()) {
            personDao.deleteById(id);
        }
    }

    @Transactional
    @RequestMapping (value = "/em/{id}", method = RequestMethod.DELETE)
    public void deletePersonByIdEM(@PathVariable ("id") Integer id) {
        personDao2.deleteById(id); // working
    }

}
