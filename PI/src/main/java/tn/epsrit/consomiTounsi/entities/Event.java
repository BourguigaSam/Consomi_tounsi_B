package tn.epsrit.consomiTounsi.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "evetnsss")
public class Event {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	@Column(name = "eventName")
	private String eventname;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "startDate")
	private Date startdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "sndsDate")
	private Date endsdate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEndsdate() {
		return endsdate;
	}

	public void setEndsdate(Date endsdate) {
		this.endsdate = endsdate;
	}


	
}
