package com.seshagiri.entity;



import com.seshagiri.util.CategoryEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Category")
@Data()
@NoArgsConstructor
@Setter()
@Getter
public class Category {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@Column(name = "name")
	private String name;
	@Enumerated(EnumType.STRING)
	@Column(name = "type")
	private CategoryEnum categoryEnum;
	

}
