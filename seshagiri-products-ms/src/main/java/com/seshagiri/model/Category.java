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
public class Category implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 611546631817442287L;
	
	private String id;
	private String name;
	private String type;

}
