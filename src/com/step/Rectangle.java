package com.step;

public class Rectangle extends Shape{
    double length;
    double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
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
        return 2*(this.length + this.width);
    }

    @Override
    public double getSurface() {
        return this.length * this.width;
    }
}
