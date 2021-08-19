package com.example.controldefacturas;

import android.provider.BaseColumns;

public class InvoiceContract {

    public static abstract class InvoiceEntry implements BaseColumns{

        public static final String TABLE_NAME = "invoice";
        public static final String ID = "id";
        public static final String NIT = "nit";

        public static final String INVOICE_NUM = "invoice_num";
        public static final String AUTH_NUM = "auth_num";
        public static final String DATE = "date";
        public static final String TOTAL_REAL = "total_real";
        public static final String TOTAL_PAYED = "total_payed";

        public static final String CONTROL_CODE = "control_code";
        public static final String CLIENT_CODE = "client_code";
    }
}
