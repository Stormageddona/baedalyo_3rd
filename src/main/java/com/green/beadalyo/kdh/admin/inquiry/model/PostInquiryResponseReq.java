package com.green.beadalyo.kdh.admin.inquiry.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.green.beadalyo.jhw.user.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostInquiryResponseReq {

    private Long inquiryPk;

    private String inquiryResponse;

}
