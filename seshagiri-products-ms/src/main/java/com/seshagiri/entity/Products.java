package com.seshagiri.entity;



import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Products")
@Data()
@NoArgsConstructor
@Setter()
@Getter
public class Products {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private double price;
	@ManyToOne(fetch =FetchType.LAZY,  targetEntity = Products.class)
	private Category category;

}
