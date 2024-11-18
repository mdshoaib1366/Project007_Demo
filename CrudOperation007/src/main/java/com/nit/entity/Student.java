package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Stdu")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@SequenceGenerator(name="gen1", sequenceName = "roll_seq",initialValue = 1200, allocationSize = 3)
	@GeneratedValue(generator = "gen1" , strategy = GenerationType.SEQUENCE)
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	
	@NonNull
	private String name;
	@NonNull
	private String addr;
	@NonNull
	private Double fee;
}
