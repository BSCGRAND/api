package ru.bscgrand.api.Models;

import javax.persistence.*;
import java.time.LocalDate;

public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderStatus_Id")
    private Long id;
    @Column(name = "OrderStatus_IsSent")
    private Boolean isSent;
    @Column(name = "OrderStatus_DateOfSent")
    private LocalDate dateOfSent;
    @Column(name = "OrderStatus_IsInWork")
    private Boolean isInWork;
    @Column(name = "OrderStatus_DateOfInWork")
    private LocalDate dateOfInWork;
    @Column(name = "OrderStatus_IsReceived")
    private Boolean isRecieved;
    @Column(name = "OrderStatus_DateOfReceiving")
    private LocalDate dateOfReceiving;

    @OneToOne(mappedBy = "orderstatus")
    private Order order;

    public OrderStatus(Boolean isSent, LocalDate dateOfSent, Boolean isInWork, LocalDate dateOfInWork, Boolean isRecieved, LocalDate dateOfReceiving, Order order) {
        this.isSent = isSent;
        this.dateOfSent = dateOfSent;
        this.isInWork = isInWork;
        this.dateOfInWork = dateOfInWork;
        this.isRecieved = isRecieved;
        this.dateOfReceiving = dateOfReceiving;
        this.order = order;
    }

    public OrderStatus() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getSent() {
        return isSent;
    }

    public void setSent(Boolean sent) {
        isSent = sent;
    }

    public LocalDate getDateOfSent() {
        return dateOfSent;
    }

    public void setDateOfSent(LocalDate dateOfSent) {
        this.dateOfSent = dateOfSent;
    }

    public Boolean getInWork() {
        return isInWork;
    }

    public void setInWork(Boolean inWork) {
        isInWork = inWork;
    }

    public LocalDate getDateOfInWork() {
        return dateOfInWork;
    }

    public void setDateOfInWork(LocalDate dateOfInWork) {
        this.dateOfInWork = dateOfInWork;
    }

    public Boolean getRecieved() {
        return isRecieved;
    }

    public void setRecieved(Boolean recieved) {
        isRecieved = recieved;
    }

    public LocalDate getDateOfReceiving() {
        return dateOfReceiving;
    }

    public void setDateOfReceiving(LocalDate dateOfReceiving) {
        this.dateOfReceiving = dateOfReceiving;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "\nOrderStatus{" +
                "id=" + id +
                ", isSent=" + isSent +
                ", dateOfSent=" + dateOfSent +
                ", isInWork=" + isInWork +
                ", dateOfInWork=" + dateOfInWork +
                ", isRecieved=" + isRecieved +
                ", dateOfReceiving=" + dateOfReceiving +
                ", order=" + order +
                '}';
    }
}
