package com.green.beadalyo.jhw.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;

import static com.green.beadalyo.common.globalconst.GlobalPattern.*;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class OwnerSignUpPostReq {
    @JsonIgnore
    private long userPk;
    @Schema(defaultValue = "ID")
    @NotBlank(message = "아이디를 입력해주세요.")
    @Pattern(regexp = userIdPattern, message = "아이디는 8자 이상이어야 합니다.")
    private String userId;
    @Schema(defaultValue = "비밀번호")
    @NotBlank(message = "비밀번호를 입력해주세요.")
    @Pattern(regexp = userPwPattern
            , message = "비밀번호는 특수문자와 숫자를 포함한 8자 이상이어야 합니다.")
    private String userPw;
    @Schema(defaultValue = "비밀번호 확인")
    private String userPwConfirm;
    @NotBlank(message = "이름을 입력해주세요.")
    @Schema(defaultValue = "이름")
    private String userName;
    @NotBlank(message = "닉네임을 입력해주세요.")
    @Schema(defaultValue = "닉네임")
    private String userNickname;
    @JsonIgnore
    private String userPic;
    @Schema(defaultValue = "전화번호")
    @Pattern(regexp = userPicPattern, message = "올바르지 않은 형식의 전화번호입니다.")
    private String userPhone;
    @Schema(defaultValue = "이메일")
    @Pattern(regexp = userEmailPattern, message = "유효하지 않은 형식의 이메일입니다.")
    private String userEmail;
    @JsonIgnore
    private String userRole;
    @JsonIgnore
    private Integer userLoginType;

    @Schema(defaultValue = "영업 시작 시간")
    private String openTime;
    @Schema(defaultValue = "영업 종료 시간")
    private String closeTime;
    @Schema(defaultValue = "가게 주소")
    @NotBlank(message = "주소를 입력해주세요.")
    private String addr;
    //사업장 설명
    @Schema(defaultValue = "사업장 설명")
    private String desc1 ;
    //리뷰 설명
    @Schema(defaultValue = "리뷰 설명")
    private String desc2 ;
    @Schema(defaultValue = "124.014")
    private BigDecimal coorX;
    @Schema(defaultValue = "37.017")
    private BigDecimal coorY;
    @Schema(defaultValue = "식당 이름")
    @NotBlank(message = "식당 이름을 입력해주세요.")
    private String restaurantName;
    @Schema(defaultValue = "사업자 등록번호")
    @NotBlank(message = "사업자 등록번호를 입력해주세요.")
    private String regiNum;

    @Schema(defaultValue = "인증번호 재인증")
    @NotEmpty(message = "인증번호를 입력하세요.")
    private String authNum;

}
