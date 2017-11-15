package com.example.roberto.actividad1;

/**
 * Created by roberto on 15/11/17.
 */

public class DataHolder {

    public static class MyDataHolder {
        public static String nameUser, email, address;
        public static int tlf, day, month, year;
        public static String getNameUser() {
            return nameUser;
        }
        public static String getEmail() {
            return email;
        }
        public static String getAddress() {
            return address;
        }
        public static int getTlf() {
            return tlf;
        }
        public static int getDay() {
            return day;
        }
        public static int getMonth() {
            return month;
        }
        public static int getYear() {
            return year;
        }
    }
}
