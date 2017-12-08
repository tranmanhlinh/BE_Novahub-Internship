package com.linhtran;

public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(isValidHour(hour)){
            this.hour = hour;
        }else {
            System.out.printf("Hour is not valid.");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(isValidMinuteSecond(minute)){
            this.minute = minute;
        } else {
            System.out.println("Minute is not valid.");
        }

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(isValidMinuteSecond(second)){
            this.second = second;
        } else {
            System.out.println("Second is not valid.");
        }

    }



    public void setTime(int hour, int minute, int second){

        boolean isValidTime = isValidHour(hour) && isValidMinuteSecond(minute) && isValidMinuteSecond(second);
        if(isValidTime){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.printf("Time is not valid.");
        }
    }

    public Time nextSecond(){
        int nextHour = this.hour;
        int nextMinute = this.minute;
        int nextSecond = this.second;

        if(this.second == 59){
            nextSecond = 0;
            if(this.minute == 59){
                nextMinute = 0;
                if(this.hour == 23){
                    nextHour = 0;
                    }else {
                    nextHour++;
                    }
                } else {
                nextMinute++;
            }
        } else {
            nextSecond++;
        }
        return new Time(nextHour, nextMinute, nextSecond);
    }

    public Time previousSecond(){
        int preHour = this.hour;
        int preMinute = this.minute;
        int preSecond = this.second;

        if(this.second == 0){
            preSecond = 59;
            if(this.minute == 0){
                preMinute = 59;
                if(this.hour == 0){
                    preHour = 23;
                }else {
                    preHour--;
                }
            }else {
                preMinute--;
            }
        }else {
            preSecond--;
        }

        return new Time(preHour, preMinute, preSecond);
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
}
