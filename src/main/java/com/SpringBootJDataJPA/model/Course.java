package com.SpringBootJDataJPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "crstab")
public class Course {
	@Id
	@Column(name = "cid")
	private Integer crsId;
	@Column(name = "cname")
	private String crsName;
	@Column(name = "cfee")
	private Double crsFee;
}
