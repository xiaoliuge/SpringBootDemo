package com.example.syssetting.controller;

import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.controller.BaseController;
import com.example.core.dto.ResultDataDto;
import com.example.syssetting.entity.SystemConfig;
import com.example.syssetting.service.SystemConfigService;

@RestController
@RequestMapping("/syssetting")
public class SystemConfigController extends BaseController<SystemConfig> {

	@Resource
	private SystemConfigService systemConfigService;
	
	/**
	 * 查询所有实体
	 */
	@ApiOperation(value="查询所有实体", notes="findAll")
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/findAllEntitys", method = RequestMethod.GET)
	public @ResponseBody ResultDataDto findAllEntitys() {
		List list = systemConfigService.selectAll();
		return new ResultDataDto(list);
	}
}
