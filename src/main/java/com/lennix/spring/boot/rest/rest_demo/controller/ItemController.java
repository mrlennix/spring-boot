package com.lennix.spring.boot.rest.rest_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lennix.spring.boot.rest.rest_demo.models.Item;

@RestController
public class ItemController {
	
	@RequestMapping(value="/item",method=RequestMethod.POST)
	@ResponseBody
	public  ResponseEntity<Item> postItem(@RequestBody Item item) {
		return ResponseEntity.ok(item);
		
	}

}
