package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required.")
    @Size(max = 50, message = "Location must be under 50 characters.")
    private String location;


    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
