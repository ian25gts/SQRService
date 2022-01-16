package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void squareNumber() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.squareNumber (100, 200);
        assertEquals(expected, actual);
        }

}