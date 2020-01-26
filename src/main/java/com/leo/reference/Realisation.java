package com.leo.reference;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Realisation {

	private RealisationType type;
	private String description;
	private String imagePath;
}
