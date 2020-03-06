package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "transcripts")
public class Transcript {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transcriptId;
	@Column(nullable = false)
	@NotNull
	@NotEmpty
	@NotBlank
	private String degreeTitle;
	public Transcript() {}
	public Transcript(String degreeTitle) {
		super();
		this.degreeTitle = degreeTitle;
	}

	public long getTranscriptId() {
		return transcriptId;
	}
	public void setTranscriptId(long transcriptId) {
		this.transcriptId = transcriptId;
	}
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	
}
