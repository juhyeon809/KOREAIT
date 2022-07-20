package com.koreait.day04.model.network.response;

import com.koreait.day04.model.enumclass.OrderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderGroupApiResponse {
    //사용자쪽에 전달할 내용들을 채워줄 객체를 만듦
    private Long id;
    private String status;
    private OrderType orderType;
    private String revAddress;
    private String revName;
    private String paymentType;
    private String PaymentType;
    private BigDecimal totalPrice;
    private Integer totalQuantity;
    private LocalDateTime orderAt;
    private LocalDateTime arrivalDate;
    private Long userId;
    private List<ItemApiResponse> itemApiResponseList;
}
