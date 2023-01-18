package com.seshagiri.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data()
@NoArgsConstructor
@Setter
@Getter
public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4537857385248807507L;
	
	private String id;
	private String name;
	private Category category;
	private double price;
}
