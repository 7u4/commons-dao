package com.epam.ta.reportportal.entity.widget.content;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import java.sql.Timestamp;

/**
 * @author Ivan Budayeu
 */
public class LaunchesDurationContent extends AbstractLaunchStatisticsContent {

	@JsonProperty(value = "status")
	@Column(name = "status")
	private String status;

	@Column(name = "end_time")
	@JsonProperty(value = "end_time")
	private Timestamp endTime;

	@Column(name = "duration")
	@JsonProperty(value = "duration")
	private long duration;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
}
