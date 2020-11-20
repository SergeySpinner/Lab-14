package com.jetbrains;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class TimeCheck {
    private LocalDateTime firstDate = LocalDateTime.of(2020,06,01, 00,00,00);

    public String getTime() {
        return "Elapsed time since session start: " +
                ChronoUnit.MONTHS.between(this.firstDate, LocalDateTime.now()) + " months "
        + ChronoUnit.DAYS.between(this.firstDate,LocalDateTime.now())%30 + " days "
                + ChronoUnit.HOURS.between(this.firstDate,LocalDateTime.now())%24 + " hours "
                + ChronoUnit.MINUTES.between(this.firstDate,LocalDateTime.now())%60 + " minutes "
                + ChronoUnit.SECONDS.between(this.firstDate,LocalDateTime.now())%60 + " seconds";
    }
}
