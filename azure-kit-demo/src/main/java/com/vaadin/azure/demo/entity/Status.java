package com.vaadin.azure.demo.entity;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Status extends AbstractEntity implements Serializable {
    private String name;

    public Status() { }

    public Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
