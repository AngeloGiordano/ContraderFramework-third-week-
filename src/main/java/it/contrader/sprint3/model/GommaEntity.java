package it.contrader.sprint3.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "gomme")
public class GommaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_gomme")
    private long id;

    @Column
    private String model;

    @Column
    private String manufacturer;

    @Column
    private double price;



    public GommaEntity () {}

    public GommaEntity(Integer idGomme, String model, String manufacturer, double price)
    {
        this.id = idGomme;
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GommaEntity that = (GommaEntity) o;
        return id == that.id &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(model, that.model) &&
                Objects.equals(manufacturer, that.manufacturer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, model, manufacturer, price);
    }

    @Override
    public String toString() {
        return "GommaEntity{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
