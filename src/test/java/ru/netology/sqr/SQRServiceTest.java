package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void от200до300() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;

        int actual = service.CeilQuad(min, max);
        assertEquals(expected, actual);
    }

    @Test
    public void от100до300() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 300;
        int expected = 8;

        int actual = service.CeilQuad(min, max);
        assertEquals(expected, actual);
    }
}