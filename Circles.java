package ru.mirea.gibo0119.pr3;

import java.util.Arrays;

public class Circles {
    private Circle[] circles;
    private int circleCount = circles.length;
    public Circle getMaxCircle(Circle[] circles) {
        Circle tempCircle = circles[0];
        for (int i = 1; i < circleCount; i++) {
            if (tempCircle.getSquare(tempCircle.getRadius()) < circles[i].
                    getSquare(circles[i].getRadius())) {
                tempCircle = circles[i];
            }
        }
        return tempCircle;
    }
    public Circle getMinCircle(Circle[] circles) {
        Circle tempCircle = circles[0];
        for (int i = 1; i < circleCount; i++) {
            if (tempCircle.getSquare(tempCircle.getRadius()) > circles[i].
                    getSquare(circles[i].getRadius())) {
                tempCircle = circles[i];
            }
        }
        return tempCircle;
    }
    public void sort (Circle[] circles) {
        Arrays.sort(circles);
    }
}