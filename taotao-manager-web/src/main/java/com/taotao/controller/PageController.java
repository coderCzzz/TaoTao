package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.service.ItemService;

import taotao.common.pojo.EasyUIDataGridResult;

@Controller
public class PageController {
/**
 * 展示首页
 * 
 */
	
@RequestMapping("/")
public String showIndex(){
	return "index";
}
/**
 * 展示菜单
 */
@RequestMapping("/{page}")
public String showItemList(@PathVariable String page){
	return page;
}
}
