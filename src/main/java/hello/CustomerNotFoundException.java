package hello;

public class CustomerNotFoundException extends RuntimeException {

    CustomerNotFoundException(Long id)
    {
        super("Customer Not Found with " + id);
    }
}
