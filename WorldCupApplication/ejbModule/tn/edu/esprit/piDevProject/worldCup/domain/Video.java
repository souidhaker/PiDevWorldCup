package tn.edu.esprit.piDevProject.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Video
 *
 */
@Entity

public class Video implements Serializable {

	private int videoId;
	private String videoName;
	private String videoDescription;
	private int VideoRates;
	private static final long serialVersionUID = 1L;

	public Video() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoDescription() {
		return videoDescription;
	}

	public void setVideoDescription(String videoDescription) {
		this.videoDescription = videoDescription;
	}

	public int getVideoRates() {
		return VideoRates;
	}

	public void setVideoRates(int videoRates) {
		VideoRates = videoRates;
	}
	public Video(String videoName, String videoDescription, int videoRates) {
		super();
		this.videoName = videoName;
		this.videoDescription = videoDescription;
		VideoRates = videoRates;
	}
   
}
