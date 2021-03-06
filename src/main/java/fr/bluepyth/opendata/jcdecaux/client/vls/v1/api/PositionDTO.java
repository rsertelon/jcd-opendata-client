package fr.bluepyth.opendata.jcdecaux.client.vls.v1.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PositionDTO {
	@JsonProperty("lat")
	private Double latitude;
	@JsonProperty("lng")
	private Double longitude;

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
