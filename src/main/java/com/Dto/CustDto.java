package com.Dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustDto 
{
		@NotNull(message="name should not be null")
		@Size(min=8, max=20,message="name should be min 8 max 20")
		private String name;
		@Pattern(regexp = "^[0-9]+[a-zA-Z0-9]+[a-zA-Z0-9]$")
		private String password;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
}
