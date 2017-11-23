package com.linhtran;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(isValidHour(hour)){
            this.hour = hour;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(isValidMinuteSecond(minute)){
            this.minute = minute;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(isValidMinuteSecond(second)){
            this.second = second;
        } else {
            throw new IllegalArgumentException();
        }

    }



    public void setTime(int hour, int minute, int second){

        boolean isValidTime = isValidHour(hour) && isValidMinuteSecond(minute) && isValidMinuteSecond(second);
        if(isValidTime){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public MyTime nextHour(){
        if(this.hour == 23){
            this.hour = 0;
        } else {
            this.hour++;
        }
        return this;
    }

    public MyTime previousHour(){
        if(this.hour == 0){
            this.hour = 23;
        } else {
            this.hour--;
        }
        return this;
    }

    public MyTime nextMinute(){
        if(this.minute == 59){
            this.minute = 0;
            nextHour();
        } else {
            this.minute++;
        }
        return this;
    }

    public MyTime previousMinute(){
        if(this.minute == 0){
            this.minute = 59;
            previousHour();
        } else {
            this.minute--;
        }
        return this;
    }


    public MyTime nextSecond(){
        if(this.second == 59){
            this.second = 0;
            nextMinute();
        } else {
            this.second++;
        }
        return this;
    }

    public MyTime previousSecond(){
       if(this.second == 0){
           this.second = 59;
           previousMinute();
       }else {
           this.second--;
       }
       return this;
    }

    @Override
    public String toString() {
        String time = "";
        time = addTimeValueToString(time,this.hour);
        time +=":";
        time = addTimeValueToString(time,this.minute);
        time +=":";
        time = addTimeValueToString(time,this.second);
        return time;
    }

    private String addTimeValueToString(String s, int value){
        if(value < 10){
            s += "0"+value;
        }else {
            s += value;
        }
        return s;
    }

    private boolean isValidHour(int hour){
        if(hour >= 0 && hour < 24){
            return true;
        }
        return false;
    }

    private boolean isValidMinuteSecond(int value){
        if(value>= 0 && value < 60){
            return true;
        }
        return false;
    }

//    public static void main(String[] args) {
//        MyTime time = new MyTime(19,23,30);
//        System.out.println(time.previousSecond().toString());
//        time.setTime(13,35,0);
//        System.out.println(time.previousSecond().toString());
//        time.setTime(13,0,0);
//        System.out.println(time.previousSecond().toString());
//        time.setTime(0,0,0);
//
//    }
}
