package com.example.controldefacturas;

import java.util.UUID;

public class Invoice {

    private String id;

    private String nit;
    private String invoiceNum;
    private String authNum;
    private String date;

    private double totalReal;
    private double totalPayed;

    private String controlCode;
    private String clientCode;

    public Invoice(String nit, String invoiceNum, String authNum,
                   String date, double totalReal, double totalPayed,
                   String controlCode, String clientCode) {
        this.id = UUID.randomUUID().toString();

        this.nit = nit;
        this.invoiceNum = invoiceNum;
        this.authNum = authNum;
        this.date = date;
        this.totalReal = totalReal;
        this.totalPayed = totalPayed;
        this.controlCode = controlCode;
        this.clientCode = clientCode;
    }

    public String getControlCode() {
        return controlCode;
    }

    public void setControlCode(String controlCode) {
        this.controlCode = controlCode;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getAuthNum() {
        return authNum;
    }

    public void setAuthNum(String authNum) {
        this.authNum = authNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalReal() {
        return totalReal;
    }

    public void setTotalReal(double totalReal) {
        this.totalReal = totalReal;
    }

    public double getTotalPayed() {
        return totalPayed;
    }

    public void setTotalPayed(double totalPayed) {
        this.totalPayed = totalPayed;
    }
}
