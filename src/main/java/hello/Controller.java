package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    List<Customer> all() {
        return customerRepository.findAll();
    }

    @GetMapping("/customers/gender/{gender}")
    public List<Customer> getAllByGender(@PathVariable Character gender)
    {
        return customerRepository.findAllByGender(gender);
    }

    @GetMapping("/customers/email/{emailId}")
    public List<Customer> getAllByEmailId(@PathVariable String emailId)
    {
        return customerRepository.findByEmailId(emailId);
    }

    @GetMapping(value = "/customers/age")
    public List<Customer> getAllAboveAge(@RequestParam(value = "age") int age)
    {
        return customerRepository.findAllByAgeAfter(age);
    }

}
