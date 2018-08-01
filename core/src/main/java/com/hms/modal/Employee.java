package com.hms.modal;


import javax.persistence.*;
import java.io.Serializable;

/**
 * persistence layer.
 *
 * @Entity is used to mark this class as an entity bean.
 * @Table is used to specify the table to persist data.
 * @Id is used to specify the identifier property of entity bean.
 * @GeneratedValue is used to specify the primary key generation strategy.
 * @Column to specify the columns in the db
 */

@Entity
@Table(name = "EMP_TBL")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String telephone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
