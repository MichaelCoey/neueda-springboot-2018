package uk.ac.belfastmet.mlaapi.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersList {
	
	@JsonProperty("Member")
	ArrayList<Member> member;

	@Override
	public String toString() {
		return "AllMembersList [member=" + this.member.toString() + "]";
	}
	
	
}
