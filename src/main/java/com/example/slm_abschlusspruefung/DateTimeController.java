package com.example.slm_abschlusspruefung;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class DateTimeController {

        @GetMapping("/api/today")
        public LocalDate today (){
            LocalDate t = LocalDate.now();
            return t;
        }

        @GetMapping("/api/now")
        public LocalTime now (){
        LocalTime n = LocalTime.now();
        return n;
        }
@GetMapping("api/now/")
    public String getDateRequest (@RequestParam String format) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalTime now = LocalTime.now();
        return dtf.format(now);
    }







   /* @GetMapping("api/today")
    public LocalDate getDate () {
        return getDate();
    }*/
}
