package com.example.dubbo.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/15.
 */
public class DubboDemoDto implements Serializable {

    public DubboDemoDto() {
        super();
    }

    public DubboDemoDto(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
