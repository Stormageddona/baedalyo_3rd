package com.green.beadalyo.lhn.Review.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.green.beadalyo.jhw.user.entity.User;
import com.green.beadalyo.lhn.Review.entity.Review;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReportPostReq {
    private long reviewPk;
    private String reportTitle;
    private String reportContent;

    @JsonIgnore
    private User user;
    @JsonIgnore
    private Review review;
}
