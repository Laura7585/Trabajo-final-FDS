/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

import java.time.LocalDate;

/**
 *
 * @author Laura
 */
public class Factura {
    
    private LocalDate date;
    private Vendedor seller;
    private int soldProductCode;
    private int soldAmount;
    private int wayToPay;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Vendedor getSeller() {
        return seller;
    }

    public void setSeller(Vendedor seller) {
        this.seller = seller;
    }

    public int getSoldProductCode() {
        return soldProductCode;
    }

    public void setSoldProductCode(int soldProductCode) {
        this.soldProductCode = soldProductCode;
    }

    public int getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(int soldAmount) {
        this.soldAmount = soldAmount;
    }

    public int getWayToPay() {
        return wayToPay;
    }

    public void setWayToPay(int wayToPay) {
        this.wayToPay = wayToPay;
    }
    
    
}
