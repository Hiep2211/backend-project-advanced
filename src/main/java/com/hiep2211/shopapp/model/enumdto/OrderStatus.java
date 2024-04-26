package com.hiep2211.shopapp.model.enumdto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@RequiredArgsConstructor
public enum OrderStatus {

    awaitingPayment("Chờ thanh toán / Waiting payment"),
    NEW("Mới / New"),
    inProgress("Đang thực hiện / inprocess"),
    paid("Đã thanh toán / Paid"),
    canceled("Đã hủy / Canceled"),
    courierSearch("Tìm kiếm chuyển phát/ courierSearch"),
    courierFound("Tìm thấy chuyển phát / CourierFound"),
    deliveryInProgress("Đơn hàng đang được vận chuyển / DeliveryInProcess"),
    awaitingConfirmation("Chờ xác nhận / awaitingConfirmation"),
    delivered("Đã giao hàng/Delivered");

    OrderStatus(String title) {
        this.title = title;
    }
    private String title;

}
