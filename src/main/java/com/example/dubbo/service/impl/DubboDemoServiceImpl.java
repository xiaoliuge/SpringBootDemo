package com.example.dubbo.service.impl;
import java.util.ArrayList;
import java.util.List;

import com.example.dubbo.dto.DubboDemoDto;
import com.example.dubbo.service.DubboDemoService;
/**
 * Created by Administrator on 2016/12/15.
 */
public class DubboDemoServiceImpl implements DubboDemoService {

    @Override
    public DubboDemoDto getDubboDemoDto() {
        return new DubboDemoDto(1, "张三");
    }

    @Override
    public List<DubboDemoDto> findAllDubboDemoDto() {
        List<DubboDemoDto> list = new ArrayList<DubboDemoDto>();
        list.add(new DubboDemoDto(1, "张三"));
        list.add(new DubboDemoDto(2, "李四"));
        return list;
    }

}
