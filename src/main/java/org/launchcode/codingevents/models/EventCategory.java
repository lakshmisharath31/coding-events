package org.launchcode.codingevents.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class EventCategory {
    @Id
    @GeneratedValue
    private int id;
    @Size(min=3,message="Name must be at least 3 characters long")
    private String name;

    public EventCategory(@Size(min=3,message="Name must be at least 3 charecters long") String name) {
        this.name = name;
    }

    public EventCategory() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
