package ru.netology.sqr;

public class SQRService {
    public int squareNumber (int lessLimit, int moreLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lessLimit) {
                if (i * i <= moreLimit) {
                    counter = counter +1;
                }
            }
        }
        return counter;
    }
}