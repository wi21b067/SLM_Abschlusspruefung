package com.example.slm_abschlusspruefung;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DateTimeController {

        @GetMapping("/api/today")
        public LocalDate today (){
            LocalDate t = LocalDate.now();
            return t;
        }





   /* @GetMapping("api/today")
    public LocalDate getDate () {
        return getDate();
    }*/
}
