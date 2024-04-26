package com.hiep2211.shopapp.utils.date.formats;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class VietnamDateFormat extends SimpleDateFormat {

    private static final long serialVersionUID = 3578411123793165937L;

    public VietnamDateFormat()
    {
        super("YYYYMMddhhmmss", new Locale("vn", "VN"));
        DateFormatSymbols vietSymbol = new DateFormatSymbols(new Locale("vn", "VN"));
        setDateFormatSymbols(vietSymbol);
    }
}

