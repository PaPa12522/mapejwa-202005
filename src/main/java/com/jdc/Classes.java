package com.jdc;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class Classes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private LocalDate startDate;
	private LocalTime startTime;
	private LocalTime endTime;
	private double months;
	private int fees;
	
	private Days days;
	@ManyToOne
	private Course course;
	@ManyToOne
	private Teacher teacher;
	@OneToMany
	private List<Teacher>teachers;
	
	
	public enum Days{
		MON,TUE,WED,THU,FRI,SAT,SUN
	}
}
