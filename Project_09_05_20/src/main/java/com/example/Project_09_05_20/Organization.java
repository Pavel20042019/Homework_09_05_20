package com.example.Project_09_05_20;
import javax.persistence.*;
@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer latitude;
    private Integer longitude;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private OrganizationType type;
    private String address;
    public String toString () {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", type='" + type.getName () + '\'' +
                ", address='" + address + '\'' +
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
    public Integer getLatitude () {
        return latitude;
    }
    public void setLatitude (Integer latitude1) {
        latitude = latitude1;
    }
    public Integer getLongitude () {
        return longitude;
    }
    public void setLongitude (Integer longitude1) {
        longitude = longitude1;
    }
    public OrganizationType getType () {
        return type;
    }
    public void setType (OrganizationType type1) {
        type = type1;
    }
    public String getAddress () {
        return address;
    }
    public void setAddress (String address1) {
        address = address1;
    }
}