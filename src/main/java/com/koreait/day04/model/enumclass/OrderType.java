package com.koreait.day04.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderType {

    ALL(0,"묶음배송", "모든 상품을 묶어서 배송"),
    EACH(1,"개별", "모든 상품을 각각 준비되는대로 배송");

    private Integer id;
    private String title;
    private String description;
}
