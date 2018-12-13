package uk.ac.belfastmet.mlaapi.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.mlaapi.domain.AllMembersAPI;
import uk.ac.belfastmet.mlaapi.domain.AllMembersList;
import uk.ac.belfastmet.mlaapi.domain.Member;

@Controller
@RequestMapping("")
public class MLAController {
	
	@GetMapping("")
	public String home() {
		
		return "index.html";
		
	}
	
	@GetMapping("/mlas/{constituencyId}")
	public String belfast(@PathVariable("constituencyId") String constituencyId, Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		String allMembersForConsituencyOne = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembersByConstituencyId&constituencyId="+constituencyId;
		
		AllMembersAPI allMembersAPI = restTemplate.getForObject(allMembersForConsituencyOne, AllMembersAPI.class);
		
		AllMembersList allMembersList = allMembersAPI.getAllMembersList();
		
		ArrayList<Member> memberList = allMembersAPI.getAllMembersList().getMember();
		
		Logger logger = LoggerFactory.getLogger(MLAController.class);
		logger.info(memberList.toString());
		
		model.addAttribute("members", memberList);
		
		String pageTitle = memberList.get(0).getConstituencyName();
		String bannerName = memberList.get(0).getConstituencyName();
		
		model.addAttribute("pageTitle", pageTitle);
		model.addAttribute("bannerName",bannerName);
		
		return "mlas.html";
	}

}
