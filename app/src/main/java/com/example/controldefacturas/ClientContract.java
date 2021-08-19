package com.example.controldefacturas;

import android.provider.BaseColumns;

public class ClientContract {
    public static abstract class ClientEntry implements BaseColumns {
        public static final String TABLE_NAME = "client";
        public static final String ID = "id";

        public static final String NAME = "name";
        public static final String CI = "ci";
        public static final String NIT = "nit";
    }
}
