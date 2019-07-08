package com.wangyi.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

@Data
@ToString
public class TbTeacher implements Serializable {
    private Integer id;

    private String image;

    private String teachername;

    private String username;

    private String password;
@DateTimeFormat(pattern = "yyyy-MM-dd")
    private String createdatetime;

    private Boolean status;

    private String introduction;


}