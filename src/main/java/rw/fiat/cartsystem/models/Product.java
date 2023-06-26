package rw.fiat.cartsystem.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

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

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getIndate() {
        return indate;
    }

    public void setIndate(LocalDate indate) {
        this.indate = indate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    // Constructors, getters, and setters
}
