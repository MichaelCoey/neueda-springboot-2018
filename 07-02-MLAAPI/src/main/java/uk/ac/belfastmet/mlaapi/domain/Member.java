package uk.ac.belfastmet.mlaapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Member {

    @JsonProperty("PersonId")
    private String personId;
    
    @JsonProperty("AffiliationId")
    private String affiliationId;
    
    @JsonProperty("MemberName")
    private String memberName;
    
    @JsonProperty("MemberLastName")
    private String memberLastName;
    
    @JsonProperty("MemberFirstName")
    private String memberFirstName;
    
    @JsonProperty("MemberFullDisplayName")
    private String memberFullDisplayName;
    
    @JsonProperty("MemberSortName")
    private String memberSortName;
    
    @JsonProperty("MemberTitle")
    private String memberTitle;
    
    @JsonProperty("PartyName")
    private String partyName;
    
    @JsonProperty("PartyOrganisationId")
    private String partyOrganisationId;
    
    @JsonProperty("ConstituencyName")
    private String constituencyName;
    
    @JsonProperty("ConstituencyId")
    private String constituencyId;

	@Override
	public String toString() {
		return "Member [personId=" + this.personId + ", affiliationId=" + this.affiliationId + ", memberName=" + this.memberName
				+ ", memberLastName=" + this.memberLastName + ", memberFirstName=" + this.memberFirstName
				+ ", memberFullDisplayName=" + this.memberFullDisplayName + ", memberSortName=" + this.memberSortName
				+ ", memberTitle=" + this.memberTitle + ", partyName=" + this.partyName + ", partyOrganisationId="
				+ this.partyOrganisationId + ", constituencyName=" + this.constituencyName + ", constituencyId=" + this.constituencyId
				+ "]";
	}
    
}
