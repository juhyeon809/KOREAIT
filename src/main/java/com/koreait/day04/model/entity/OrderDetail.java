package com.koreait.day04.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="seq_orderdetail",
        sequenceName = "seq_orderdetail",
        initialValue = 1, //1부터 시작해서
        allocationSize = 1 //1씩 증가
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_orderdetail")
    private Long id;
    private LocalDateTime arrivalDate;
    private String status;
    private Integer quantity;
    private BigDecimal totalPrice;
    @CreatedDate
    private LocalDateTime regDate;
//    private Long itemId;
//    private Long orderGroupId;

    @ManyToOne
    private OrderGroup orderGroup;

    @ManyToOne
    private Item item;
}
