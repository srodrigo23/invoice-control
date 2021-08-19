package com.example.controldefacturas;

import java.util.ArrayList;
import java.util.List;

public class SetInvoice {

    private List<Invoice> invoices;


    public SetInvoice() {
        this.invoices = new ArrayList<>();
    }

    public void addInvoice(Invoice inv){
        this.invoices.add(inv);
    }

    public double getTotalSet(){
        double ans = 0;
        for(Invoice inv : this.invoices ){
            ans = ans + inv.getTotalPayed();
        }
        return ans;
    }
}
