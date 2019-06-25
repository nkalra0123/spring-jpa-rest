package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/getall")
    public List<Customer> getAllCustomer()
    {
        return customerRepository.findAll();
    }

    @GetMapping("/getallByGender{$gender}")
    public List<Customer> getAllByGender(@RequestParam Character gender)
    {
        return customerRepository.findAllByGender(gender);
    }

    @GetMapping("/getallByEmailId{$emailId}")
    public List<Customer> getAllByEmailId(@RequestParam String emailId)
    {
        return customerRepository.findByEmailId(emailId);
    }

}
