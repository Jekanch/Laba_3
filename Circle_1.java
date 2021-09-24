package ru.mirea.gibo0119.pr3;

import java.util.Arrays;

public class Circle_1 {

        private Circle_1[] circles;
        private int circleCount = circles.length;

        public Circle_1 getMaxCircle(Circle_1[] circles) {
            Circle_1 tempCircle = circles[0];
            for (int i = 1; i < circleCount; i++) {
                if (tempCircle.getSquare(tempCircle.getRadius()) < circles[i].
                        getSquare(circles[i].getRadius())) {
                    tempCircle = circles[i];
                }
            }
            return tempCircle;
        }

        public Circle_1 getMinCircle(Circle_1[] circles) {
            Circle_1 tempCircle = circles[0];
            for (int i = 1; i < circleCount; i++) {
                if (tempCircle.getSquare(tempCircle.getRadius()) > circles[i].
                        getSquare(circles[i].getRadius())) {
                    tempCircle = circles[i];
                }
            }
            return tempCircle;
        }

        public void sort (Circle_1[] circles) {
            Arrays.sort(circles);
        }
    }
