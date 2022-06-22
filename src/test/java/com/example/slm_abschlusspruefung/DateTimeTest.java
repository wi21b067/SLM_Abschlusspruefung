package com.example.slm_abschlusspruefung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeTest {

    @Test
    public void testDate(){
        DateTimeController dt = new DateTimeController();
        String actual = dt.today().toString();
        String expected = LocalDate.now().toString();
        Assertions.assertEquals(expected, actual, " ");

    }
    public void testTime(){
        DateTimeController dt = new DateTimeController();
        String actual = dt.now().toString();
        String expected = LocalTime.now().toString();
        Assertions.assertEquals(expected, actual, " ");

    }

}
