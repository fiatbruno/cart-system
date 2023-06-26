import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    private int code;
    private String name;
    private String productType;
    private double price;
    private LocalDate indate;
    private String image;

    // Constructors, getters, and setters
}
