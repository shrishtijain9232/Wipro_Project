package com.javatechie.aws.cicd.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    public Order(int i, String string, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	private int id;
    private String name;
    private int quantity;
    private long price;
}

