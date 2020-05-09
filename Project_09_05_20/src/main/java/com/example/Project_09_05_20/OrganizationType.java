package com.example.Project_09_05_20;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OrganizationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    public String toString () {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public Integer getId () {
        return id;
    }
    public void setId (Integer id1) {
        id = id1;
    }
    public String getName () {
        return name;
    }
    public void setName (String name1) {
        name = name1;
    }
}