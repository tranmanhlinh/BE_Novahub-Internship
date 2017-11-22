package com.linhtran;

public class Date {
    private int day = 12;
    private int month = 1;
    private int year = 1988;

    public Date(int day, int month, int year) {
        setDate(day, month, year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(validateDay(day, this.month, this.year)){
            this.day = day;
        } else {
            System.out.println("Invalid day.");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(validateMonth(month)){
            this.month = month;
        } else {
            System.out.println("Invalid month.");
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(validateYear(year)){
            this.year = year;
        } else {
            System.out.println("Invalid year.");
        }
    }

    public void setDate(int day, int month, int year){
        boolean isValidationDate = validateYear(year) && validateMonth(month) && validateDay(day, month, year);
        if(isValidationDate){
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Date is not valid");
        }
    }

    private boolean validateDay(int day, int month, int year){
        if(day < 1){
            return false;
        }

        boolean isLeapYear = (year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        if(isLeapYear && month == 2){
            if(day > 29) {
                return false;
            }
            return true;
        }

        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                if(day > 30) return false;
                break;

            case 2:
                if(day > 28) return false;
                break;

            default:
                if(day > 31) return false;
                break;
        }

        return true;
    }

    private boolean validateYear(int year){
        if(year > 9999 || year < 1900) {
            return false;
        }
        return true;
    }

    private boolean validateMonth(int month) {
        if(month > 12 || month < 1){
            return false;
        }

        return true;
    }


    @Override
    public String toString() {
        String date = "";
        if(this.day < 10){
            date +="0"+this.day;
        }else {
            date += this.day;
        }

        date += "/";

        if(month < 10){
            date += "0"+this.month;
        } else {
            date += this.month;
        }
        date += "/";
        date +=this.year;
        return date;

    }

}
