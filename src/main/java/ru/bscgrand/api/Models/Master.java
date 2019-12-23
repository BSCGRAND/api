package ru.bscgrand.api.Models;

import javax.persistence.*;

public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Master_Id")
    private Long id;
    @Column(name = "Master_Name")
    private String fullname;
    @Column(name = "Master_Mobile")
    private String mobilePhone;

    @ManyToOne
    @JoinColumn(name = "Team_Id", nullable = false)
    private Team team;

    public Master(String fullname, String mobilePhone, Team team) {
        this.fullname = fullname;
        this.mobilePhone = mobilePhone;
        this.team = team;
    }

    public Master() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "\nMaster{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", team=" + team +
                '}';
    }
}
