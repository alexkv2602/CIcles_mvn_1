package ru.netology.sqr;

public class SQRService {
    public static int CeilQuad(int min, int max) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int sqr = i * i;
            if (sqr < min) {
                continue;
            }
            if (sqr > max) {
                break;
            }
            counter++;
        }
        ;
        return counter;


    }
}
