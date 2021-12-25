package com.step;

public class Square extends Shape{
    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public double getSurface() {
        return this.side * this.side;
    }
}
