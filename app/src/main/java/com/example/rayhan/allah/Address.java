package com.example.rayhan.allah;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Rayhan on 3/22/2018.
 */

@Entity
public class Address {

    @PrimaryKey(autoGenerate = true)
    public int addressId;


    public String street;
    public String state;
    public String city;

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", postCode=" + postCode +
                '}';
    }

    @ColumnInfo(name = "post_code")
    public int postCode;
}