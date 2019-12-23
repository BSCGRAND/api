package ru.bscgrand.api.Models;

import javax.persistence.*;
import java.util.Set;

public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Team_Id")
    private Long id;
    @Column(name = "Team_Type")
    private String type;
    @Column(name = "Team_Number")
    private Integer number;

    @ManyToOne
    @JoinColumn(name = "Oilfield_Id")
    private Oilfield oilfield;

    @OneToMany(mappedBy = "team")
    private Set<Master> masters;
    @OneToMany(mappedBy = "team")
    private Set<Order> orders;

    public Team(String type, Integer number, Oilfield oilfield, Set<Master> masters, Set<Order> orders) {
        this.type = type;
        this.number = number;
        this.oilfield = oilfield;
        this.masters = masters;
        this.orders = orders;
    }

    public Team() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Oilfield getOilfield() {
        return oilfield;
    }

    public void setOilfield(Oilfield oilfield) {
        this.oilfield = oilfield;
    }

    public Set<Master> getMasters() {
        return masters;
    }

    public void setMasters(Set<Master> masters) {
        this.masters = masters;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "\nTeam{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", number=" + number +
                ", oilfield=" + oilfield +
                ", masters=" + masters +
                ", orders=" + orders +
                '}';
    }
}
