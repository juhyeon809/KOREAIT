package com.koreait.day04.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor //매개변수가 가득찬 생성자
@NoArgsConstructor //매개변수가 비어있는 생성자
@Entity
@SequenceGenerator( //시퀀스를 특정 필드에 연결
        name="seq_adminuser",
        sequenceName = "seq_adminuser",
        initialValue = 1, //1부터 시작해서
        allocationSize = 1 //1씩 증가
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class AdminUser {
    @Id //필드
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_adminuser") //시퀀스 벨류를 연결해줄 제너레이트 타입
    private Long id;
    private String userid;
    private String userpw;
    private String name;
    private String status;
    @LastModifiedDate
    private LocalDateTime lastLoginAt;
    @CreatedBy
    private String create_by;
    @CreatedDate
    private LocalDateTime regDate;

}
