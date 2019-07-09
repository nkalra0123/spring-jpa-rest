package hello;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "people")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    List<Customer> findAllByGender(Character gender);

    Customer findByEmailId(String emailId);

    List<Customer> findAllByAgeAfter(Integer age);

}
