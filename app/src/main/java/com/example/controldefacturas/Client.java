package com.example.controldefacturas;

import java.util.UUID;

public class Client {

    private String id;
    private String name;
    private String ci;
    private String nit;

    public Client(String name, String ci, String nit) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.ci = ci;
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
