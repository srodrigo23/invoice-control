package com.example.controldefacturas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * TODO: to continue database skill follow this website
 * https://www.develou.com/android-sqlite-bases-de-datos/
 *
 */

public class InvoicesDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Invoices.db";

    public InvoicesDbHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE " +
                        InvoiceContract.InvoiceEntry.TABLE_NAME + " ("
                        + InvoiceContract.InvoiceEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                        + InvoiceContract.InvoiceEntry.ID + " TEXT NOT NULL,"
                        + InvoiceContract.InvoiceEntry.NIT + " TEXT NOT NULL,"
                        + InvoiceContract.InvoiceEntry.INVOICE_NUM + " TEXT NOT NULL,"
                        + InvoiceContract.InvoiceEntry.AUTH_NUM + " TEXT NOT NULL,"
                        + InvoiceContract.InvoiceEntry.DATE + " TEXT NOT NULL,"
                        + InvoiceContract.InvoiceEntry.TOTAL_REAL + " REAL NOT NULL,"
                        + InvoiceContract.InvoiceEntry.TOTAL_PAYED + " REAL NOT NULL,"
                        + InvoiceContract.InvoiceEntry.CONTROL_CODE + " TEXT NOT NULL,"
                        + InvoiceContract.InvoiceEntry.CLIENT_CODE + " TEXT NOT NULL,"
                        + "UNIQUE (" + InvoiceContract.InvoiceEntry.ID + "))");

        db.execSQL(
                "CREATE TABLE " +
                        ClientContract.ClientEntry.TABLE_NAME + " ("
                        + ClientContract.ClientEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                        + ClientContract.ClientEntry.ID + " TEXT NOT NULL,"
                        + ClientContract.ClientEntry.NAME + " TEXT NOT NULL,"
                        + ClientContract.ClientEntry.CI + " TEXT NOT NULL,"
                        + ClientContract.ClientEntry.NIT + " TEXT NOT NULL,"
                        + "UNIQUE (" + ClientContract.ClientEntry.ID + "))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
