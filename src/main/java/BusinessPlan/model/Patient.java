package BusinessPlan.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.io.Serializable;

@Table(name="Patient")
@Entity
public class Patient implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;

    public Patient() {}

    public Patient(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\tName: " + name + "\tCode: " + code;
    }
}
