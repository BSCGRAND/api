package ru.bscgrand.api.Models;

import javax.persistence.*;
import java.util.Set;

public class Oilfield {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Oilfield_Id")
    private Long id;
    @Column(name = "Oilfield_Name")
    private String name;
    @Column(name = "Oilfield_Bush")
    private String bush;
    @Column(name = "Oilfield_Well")
    private String well;
    @OneToMany(mappedBy = "oilfield")
    private Set<Team> teams;

    public Oilfield(String name, String bush, String well, Set<Team> teams) {
        this.name = name;
        this.bush = bush;
        this.well = well;
        this.teams = teams;
    }

    public Oilfield() {
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

    public String getBush() {
        return bush;
    }

    public void setBush(String bush) {
        this.bush = bush;
    }

    public String getWell() {
        return well;
    }

    public void setWell(String well) {
        this.well = well;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "\nOilfield{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bush='" + bush + '\'' +
                ", well='" + well + '\'' +
                ", teams=" + teams +
                '}';
    }
}
