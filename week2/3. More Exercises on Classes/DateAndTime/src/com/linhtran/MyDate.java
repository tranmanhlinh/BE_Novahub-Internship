package com.linhtran;

public class MyDate {
    private int day = 12;
    private int month = 1;
    private int year = 1988;

    //static variable
    private static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                  "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static String[] stringDays = {"Sunday", "Monday", "Tuesday", "Wednesday",
                                   "Thursday", "Friday", "Saturday"};
    private static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int day, int month, int year) {
        setDate(day, month, year);
    }

    public void setDate(int day, int month, int year){
        if(isValidDay(day,month,year)){
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(isValidDay(day, this.month, this.year)){
            this.day = day;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(isValidDay(this.day, month, this.year)){
            this.month = month;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(isValidDay(this.day, this.month, year)){
            this.year = year;
        } else {
            throw new IllegalArgumentException();
        }
    }

    //My date in next year
    public MyDate nextYear(){
        if(month == 2 && day == 29){
            day--;
        }
        this.year++;
        return this;
    }

    //My date in previous year
    public MyDate previousYear(){
        if(month == 2 && day==29){
            day--;
        }
        this.year--;
        return this;
    }

    //My date in next month
    public MyDate nextMonth(){
        changeDaysOfMonth(this.year);
        if(this.month == 12){
            this.month = 1;
            this.year++;
        } else {
            month++;
            if(!isValidDay(this.day, this.month, this.year)){
               this.day = daysInMonth[month-1];
            }
        }
        return this;
    }

    //My date in previous day
    public MyDate previousMonth(){
        changeDaysOfMonth(this.year);
        if(this.month == 1){
            this.month = 12;
            this.year--;
        }else {
            month--;
            if(!isValidDay(this.day, this.month, this.year)){
                this.day = daysInMonth[month-1];
            }
        }
        return this;
    }

    //My date in next day
    public MyDate nextDay(){
        changeDaysOfMonth(this.year);
        if(this.day == daysInMonth[month-1]){
            this.day = 1;
            nextMonth();
        } else {
            this.day++;
        }
        return this;
    }

    //My date in previous day
    public MyDate previousDay(){
        changeDaysOfMonth(this.year);
        if(this.month == 1 && this.day == 1){
            this.day = 31;
            this.month = 12;
            this.year--;
        }else if(this.day == 1){
            this.day = daysInMonth[month-2];
            previousMonth();
        } else {
            this.day--;
        }
        return this;
    }


    @Override
    public String toString() {
        return stringDays[getDayOfWeek(day, month, year)]+" "+day+" "+strMonths[month-1]+" "+year;
    }

    //------------------------------------------------------------------------------------
    //Private method
    private static boolean isValidYear(int year){
        if(year > 9999 || year < 100) {
            return false;
        }
        return true;
    }

    private static boolean isValidMonth(int month) {
        if(month > 12 || month < 1){
            return false;
        }

        return true;
    }

    private static void changeDaysOfMonth(int year){
        if(isLeapYear(year)){
            daysInMonth[1] = 29;
        } else {
            daysInMonth[1] = 28;
        }
    }

    //------------------------------------------------------------------------

    //Static method
    public static boolean isLeapYear(int year){
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }


    public static boolean isValidDay(int day, int month, int year){
        if(!isValidYear(year)){
            return false;
        }
        if(!isValidMonth(month)){
            return false;
        }

        changeDaysOfMonth(year);

        if(day > 0 && day <= daysInMonth[month-1]){
            return true;
        }
        return false;
    }
    //Get week day: sunday-->0, monday-->1...saturday-->6
    public static int getDayOfWeek(int day, int month, int year){
        int sum = 0;
        int[] numberNonLeap = {0,3,3,6,1,4,6,2,5,0,3,5};
        int[] numberLeap = {6,2,3,6,1,4,6,2,5,0,3,5};
        switch ((year/100)%4){
            case 1:
                sum += 4;
                break;
            case 2:
                sum += 2;
                break;
            case 0:
                sum +=6;
                break;
        }
        sum += (year%100) + (year%100)/4;
        if(isLeapYear(year)){
            sum += numberLeap[month-1];
        } else {
            sum += numberNonLeap[month-1];
        }

        return (sum + day)%7;

    }

}
