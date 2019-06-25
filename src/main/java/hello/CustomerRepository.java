package hello;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    List<Customer> findAllByGender(Character gender);

    List<Customer> findByEmailId(String emailId);

}
