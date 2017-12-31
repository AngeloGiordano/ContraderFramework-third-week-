package it.contrader.sprint3.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "vehicle")
public class VehicleEntity  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idVehicle;

    @Column
    private String brand ;

    @Column
    private String model ;

    @Column
    private String fuel ;



    public VehicleEntity() { }

    public VehicleEntity(String brand, String model, String fuel)
    {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;

    }

    public long getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(long idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleEntity that = (VehicleEntity) o;
        return idVehicle == that.idVehicle &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(model, that.model) &&
                Objects.equals(fuel, that.fuel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idVehicle, brand, model, fuel);
    }

    @Override
    public String toString() {
        return "VehicleEntity{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}

