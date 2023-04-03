package com.restart1025.springboot.comp;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Comp implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
	private Long id;
	private String compName;
}