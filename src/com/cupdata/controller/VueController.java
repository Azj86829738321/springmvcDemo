package com.cupdata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vue")
public class VueController {
	@RequestMapping("find")
      public String find(String name,String password) {
		return "你好!"+name;
    	  
      }
}
