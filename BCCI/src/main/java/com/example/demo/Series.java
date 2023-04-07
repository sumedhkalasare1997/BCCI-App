package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Series {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int s_id;
	String s_name;
	String start_date;
	String end_date;
	String team1;
	String team2;
	
	@ManyToMany
	List<Matches> matches;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public List<Matches> getMatches() {
		return matches;
	}

	public void setMatches(List<Matches> matches) {
		this.matches = matches;
	}

	public Series(int s_id, String s_name, String start_date, String end_date, String team1, String team2,
			List<Matches> matches) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.team1 = team1;
		this.team2 = team2;
		this.matches = matches;
	}

	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Series [s_id=" + s_id + ", s_name=" + s_name + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", team1=" + team1 + ", team2=" + team2 + ", matches=" + matches + "]";
	}
	

}
