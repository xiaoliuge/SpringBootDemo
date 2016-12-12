package com.example.redis.controller;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.controller.BaseRedisController;
import com.example.core.dto.Pair;
import com.example.core.dto.ResultDataDto;
import com.example.redis.dto.DemoSessionDto;
import com.example.redis.entity.DemoRedis;
import com.example.redis.service.DemoRedisService;
/**
 * Created by Administrator on 2016/12/12.
 */
@RestController
@RequestMapping(value="/demoRedis")
public class DemoRedisController extends BaseRedisController<DemoRedis> {

    @Resource
    private DemoRedisService demoRedisService;

    /**
     * 查询所有Session
     */
    @ApiOperation(value="查询所有Session", notes="getEntityById")
    @RequestMapping(value = "/getSesstion", method = RequestMethod.GET)
    public @ResponseBody ResultDataDto getEntityById(HttpSession httpSession) {

        Enumeration<String> sessionkeys = httpSession.getAttributeNames();

        List<Pair<String, String>> list = new ArrayList<Pair<String,String>>();
        while (sessionkeys.hasMoreElements()) {
            String key = (String) sessionkeys.nextElement();
            list.add(new Pair<String, String>(key, httpSession.getAttribute(key).toString()));
        }
        return ResultDataDto.addSuccess().setDatas(list);
    }

    /**
     * 新增测试Session
     */
    @ApiOperation(value="新增测试Session", notes="getEntityById")
    @RequestMapping(value = "/addSesstion", method = RequestMethod.GET)
    public @ResponseBody ResultDataDto addEntity(HttpSession httpSession) {
        DemoSessionDto session = new DemoSessionDto();
        session.setKey("testKey");
        session.setValue("testValue");
        httpSession.setAttribute(session.getKey(), session.getValue());
        return ResultDataDto.addAddSuccess();
    }

}
