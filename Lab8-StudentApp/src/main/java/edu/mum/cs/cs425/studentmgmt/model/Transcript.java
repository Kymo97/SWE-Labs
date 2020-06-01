package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Transcript {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long transcriptId;
	
	private String degreeTitle;

	
	public Transcript() {
	}
	public Transcript(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	public long getTranscriptId() {
		return transcriptId;
	}
	@Override
	public String toString() {
		return "Transcript [transcriptId=" + transcriptId + ", degreeTitle=" + degreeTitle + "]";
	}
	
	
}
