package com.xz.DateStudy;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateStudyTest {
    @Test
    public void timeFormat() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.JANUARY, 01, 0, 0, 0);
        Date d = calendar.getTime();
        DateStudy ds = new DateStudy();
        String s = ds.timeFormat("yyyy-MM-dd", d);
        assertEquals(s, "2019-01-01");
    }

}