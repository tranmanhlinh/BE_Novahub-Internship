package com.linhtran;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 0){
            this.year = year;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        if(fee > 0){
            this.fee = fee;
        } else {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public String toString() {
        return "Student["+super.toString()+", " +
                "program="+this.program+
                ", year="+this.year+
                ", fee="+this.fee + "]";
    }
}
