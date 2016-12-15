package com.example.dubbo.service;
import java.util.List;

import com.example.dubbo.dto.DubboDemoDto;
/**
 * Created by Administrator on 2016/12/15.
 */
public interface DubboDemoService {

    public DubboDemoDto getDubboDemoDto();

    public List<DubboDemoDto> findAllDubboDemoDto();

}
