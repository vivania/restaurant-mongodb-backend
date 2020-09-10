package com.restaurant.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Document(collection = "eat")
public class Restaurant {
	
	
	@Field(value = "_id")
	private String id;
	@Field(value = "name")
	private String name;
	@Field(value = "CP")
	private String codePostal;
	@Field(value = "adresse")
	private String adresse;
	@Field(value = "type")
	private String typeRestau;
	@Field(value = "latitude")
	private String latitude;
	@Field(value = "longitude")
	private String longitude;
	@Field(value = "telephone")
	private String telephone;
	@Field(value = "prix")
	private String prix;
	@Field(value = "specialite1")
	private String specialite1;
	@Field(value = "specialite2")
	private String specialite2;
	@Field(value = "specialite3")
	private String specialite3;
	

}
