package com.hiep2211.shopapp.utils;

import com.hiep2211.shopapp.utils.date.formats.PaymentDateFormat;
import com.hiep2211.shopapp.utils.date.formats.VietnamDateFormat;
import org.springframework.stereotype.Component;

@Component
public class DateFormats {

    private static final VietnamDateFormat vietnamDateFormat = new VietnamDateFormat();
    private static final PaymentDateFormat paymentDateFormat = new PaymentDateFormat();

    public com.hiep2211.shopapp.utils.date.formats.PaymentDateFormat getPaymentDateFormat(){ return  paymentDateFormat;}

    public com.hiep2211.shopapp.utils.date.formats.VietnamDateFormat getVietnamDateFormat(){ return vietnamDateFormat;}
}
