package com.green.beadalyo.lmy.doneorder.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class DoneOrderByUserPkDto{
    private Long userPk;
    private Integer size;
    private Integer page;
    private Integer startIndex;
}
