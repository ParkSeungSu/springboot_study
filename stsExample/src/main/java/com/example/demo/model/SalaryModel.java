package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class SalaryModel {
	
	private int id;
	
	@NonNull
	@Builder.Default
	private String name = "NULL NAME";
	
	private String email;
}
