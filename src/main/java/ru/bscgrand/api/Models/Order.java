package ru.bscgrand.api.Models;

import javax.persistence.*;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_Id")
    private Long id;
    @Column(name = "Order_GoodName")
    private String goodName;
    @Column(name = "Order_Amount")
    private Double amount;
    @Column(name = "Order_Unit")
    private String unit;

    @ManyToOne
    @JoinColumn(name = "Team_Id")
    private Team team;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrderStatus_Id")
    private OrderStatus orderStatus;

    public Order(String goodName, Double amount, String unit, Team team, OrderStatus orderStatus) {
        this.goodName = goodName;
        this.amount = amount;
        this.unit = unit;
        this.team = team;
        this.orderStatus = orderStatus;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "id=" + id +
                ", goodName='" + goodName + '\'' +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                ", team=" + team +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
