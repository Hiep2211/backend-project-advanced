package com.hiep2211.shopapp.utils.date.formats;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class PaymentDateFormat extends SimpleDateFormat {

    public PaymentDateFormat()
    {
        super("dd.MM.YYYY HH:mm", new Locale("vn", "VN"));
        DateFormatSymbols vietSymbol = new DateFormatSymbols(new Locale("vi", "VN"));
        setDateFormatSymbols(vietSymbol);
    }
}