package com.lennix.spring.boot.rest.rest_demo.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void test() {
		Item item = new Item();
		item.setName("candle");
		item.setPrice(2.00);
		item.setQuantity(10);
		item.setColor("red");
		System.out.println(item.toString());
	}

}
