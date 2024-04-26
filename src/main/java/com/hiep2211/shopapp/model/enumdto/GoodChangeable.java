package com.hiep2211.shopapp.model.enumdto;


import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public enum  GoodChangeable {

    CHANGEABLE("Được hoàn trả / changeable"), UNCHANGEABLE("Không hoàn trả / unchangeable");

    GoodChangeable(String title){
        this.title = title;
    }
    private String title;
}

