import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    private int id;
    private String firstname;
    private String phone;
    private String email;
    private String password;

    // Constructors, getters, and setters
}
