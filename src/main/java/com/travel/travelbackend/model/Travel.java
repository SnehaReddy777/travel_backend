package com.travel.travelbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "topplaces")
public class Travel {
	   
	    @Id 
	    private String id; 
	    private String placename;
        private String description;
	    private String besttimetovisit;
	    private String howtoreach;
	    private String attractions;
	    private String averagetemperature;
	    private String country;
	    private String state;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPlacename() {
			return placename;
		}
		public void setPlacename(String placename) {
			this.placename = placename;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getBesttimetovisit() {
			return besttimetovisit;
		}
		public void setBesttimetovisit(String besttimetovisit) {
			this.besttimetovisit = besttimetovisit;
		}
		public String getHowtoreach() {
			return howtoreach;
		}
		public void setHowtoreach(String howtoreach) {
			this.howtoreach = howtoreach;
		}
		public String getAttractions() {
			return attractions;
		}
		public void setAttractions(String attractions) {
			this.attractions = attractions;
		}
		public String getAveragetemperature() {
			return averagetemperature;
		}
		public void setAveragetemperature(String averagetemperature) {
			this.averagetemperature = averagetemperature;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		@Override
		public String toString() {
			return "Travel [id=" + id + ", placename=" + placename + ", description=" + description
					+ ", besttimetovisit=" + besttimetovisit + ", howtoreach=" + howtoreach + ", attractions="
					+ attractions + ", averagetemperature=" + averagetemperature + ", country=" + country + ", state="
					+ state + "]";
		}
		
	    
}
