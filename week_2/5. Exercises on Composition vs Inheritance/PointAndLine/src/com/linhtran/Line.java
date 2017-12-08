package com.linhtran;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin;    // beginning point
    private Point end;      // ending point

    // Constructors
    public Line (Point begin, Point end) {  // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);   // construct the Points here
        end = new Point(endX, endY);
    }

    // Public methods
    public String toString() {
        return "Line: from "+begin.toString()+
                " to "+end.toString();
    }

    public Point getBegin() { return this.begin; }
    public Point getEnd() { return this.end; }
    public void setBegin(Point begin) {
        if(begin != null){
            this.begin = begin;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public void setEnd(Point end) {
        if(end != null){
            this.end = end;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getBeginX() { return begin.getX(); }
    public int getBeginY() { return begin.getY(); }
    public int getEndX() { return end.getX(); }
    public int getEndY() { return end.getY(); }

    public void setBeginX(int x) { begin.setX(x); }
    public void setBeginY(int y) { begin.setY(y); }
    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }
    public void setEndX(int x) { end.setX(x); }
    public void setEndY(int y) { end.setY(y); }
    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        double squareXDiff = Math.pow((end.getX()-begin.getX()), 2);
        double squareYDiff = Math.pow((end.getY()-begin.getY()), 2);

        return Math.sqrt(squareXDiff + squareYDiff);
    } // Length of the line

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();

        return Math.atan2(yDiff, xDiff);

    } // Gradient in radians     // Math.atan2(yDiff, xDiff)
}
