package com.green.beadalyo.gyb.dto;

import com.green.beadalyo.gyb.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalTime;

@Data
public class RestaurantInsertDto
{

    //유저 정보
    private User user ;
    //가게 이름
    private String name ;
    //사업자 번호
    private String regiNum ;
    //사업장 주소
    private String resAddr ;
    //위도(X)
    private Double resCoorX ;
    //경도(Y)
    private Double resCoorY ;
    //개점 시간
    private LocalTime openTime ;
    //폐점 시간
    private LocalTime closeTime ;
    //음식점 사진
    private String resPic ;

}
