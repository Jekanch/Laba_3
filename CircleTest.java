package ru.mirea.gibo0119.pr3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circleTest = new Circle();
        circleTest.setRadius(5);
        System.out.println("S= " + circleTest.getSquare(circleTest.getRadius()));
        System.out.println("D= " + circleTest.getCircleLength(circleTest.getRadius()));
    }
}