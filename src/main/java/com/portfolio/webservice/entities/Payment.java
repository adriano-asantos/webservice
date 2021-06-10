package com.portfolio.webservice.entities;

import java.io.Serializable;
import java.util.Date;


public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private Date  moment;
	
	
	public Payment() {
		
	}

	public Payment(long id, Date moment) {
		super();
		this.id = id;
		this.moment = moment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
