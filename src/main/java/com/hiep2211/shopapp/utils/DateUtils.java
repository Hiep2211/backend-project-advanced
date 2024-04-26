package com.hiep2211.shopapp.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Component
public class DateUtils {

    @Autowired
    DateFormats dateFormats;

    public String getVietnamDate(Date date)
    {
        return dateFormats.getVietnamDateFormat().format(date);
    }

    public String getPaymentDate(Date date)
    {
        return dateFormats.getPaymentDateFormat().format(date);
    }

    public Date addMinutes(Date date, Integer value)
    {
        GregorianCalendar calen = new GregorianCalendar();
        calen.setTime(date);
        calen.add(Calendar.MINUTE, value);
        return calen.getTime();
    }
}