package com.restart1025.springboot.rec;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Rec implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
	private Long id;

	private Long compId;

	// 應收
	private Integer debt;

	// 已收
	private Integer receive;

	// 最後一次還款日
	private Date lastReceiveDate;

	// 到期日
	private Date debtDate;

	public Rec() {}

	public Rec(Long id, Long compId, Integer debt, Integer receive, Date lastReceiveDate, Date debtDate) {
		this.id = id;
		this.compId = compId;
		this.debt = debt;
		this.receive = receive;
		this.lastReceiveDate = lastReceiveDate;
		this.debtDate = debtDate;
	}
}