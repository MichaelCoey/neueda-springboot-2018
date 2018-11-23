package uk.ac.belfastmet.largestbuildings.service;

import java.util.ArrayList;

import uk.ac.belfastmet.largestbuildings.domain.BiggestFloorarea;
import uk.ac.belfastmet.largestbuildings.domain.BiggestFootprint;
import uk.ac.belfastmet.largestbuildings.domain.BiggestVolume;

public class BuildingService {
	
	public BuildingService() {
		
		super();
		
	}

	public ArrayList<BiggestVolume> getVolumeBuildings(){
		
		ArrayList<BiggestVolume> volumeBuildings = new ArrayList<BiggestVolume>();
		
		BiggestVolume boeingEverettFactory = new BiggestVolume("Boeing Everett Factory","United States","Everett Washington","BoeingEverettFactory.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.763882474872!2d-122.29196894883066!3d47.92160597910467!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54900164f9502991%3A0x903b231982d227fd!2sFuture+Of+Flight+Museum!5e0!3m2!1sen!2suk!4v1542975971573\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","398,000 m2","13.3 million m3","Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.");
		volumeBuildings.add(boeingEverettFactory);
		
		BiggestVolume greatMosqueOfMecca = new BiggestVolume("Great Mosque of Mecca","Saudi Arabia","Hijaz-Saudi Arabia","GreatMosqueofMecca.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3714.1621309256975!2d39.823540650446056!3d21.422871385716412!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204b74d3fb493%3A0x55d1f94f8e094785!2sMasjid+al-Haram!5e0!3m2!1sen!2suk!4v1542976277631\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","356,000 m2","8 million m3","The largest mosque in the world, the most sacred place for the Muslims, and surrounds Islam's holiest place, the Kaaba.");
		volumeBuildings.add(greatMosqueOfMecca);
		
		BiggestVolume jeanLucLagarderePlant = new BiggestVolume("Jean-Luc Lagardere Plant","France","Toulouse-Blagnac","Jean-LucLagarderePlant.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d46189.37965197137!2d0.7458477361161875!3d43.65157557868496!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x12a9656d77d70763%3A0x406f69c2f410d30!2s32270+Aubiet%2C+France!5e0!3m2!1sen!2suk!4v1542976485600\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","122,500 m2","5.6 million m3","The assembly hall of the Airbus A380, the world's largest airliner.");
		volumeBuildings.add(jeanLucLagarderePlant);
		
		BiggestVolume boeingCompositeWingCenter = new BiggestVolume("Boeing Composite Wing Center","United States","Everett Washington","BoeingCompositeWingCenter.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d171002.6515722618!2d-122.18440691539988!3d47.95734006496813!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x5490006404f52f5b%3A0x72449f271b24790!2sEverett%2C+WA%2C+USA!5e0!3m2!1sen!2suk!4v1542976797625\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","111,500 m2","3.7 million m3","Boeing's assembly site for the production of composite wings for the 777-8 and 777-9");
		volumeBuildings.add(boeingCompositeWingCenter);
		
		BiggestVolume aerium = new BiggestVolume("Aerium","Germany","Halbe, Brandenburg","Aerium.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d78462.70053515713!2d13.629607618325787!3d52.080469094107805!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47a81a9bc503ea23%3A0xf719fcad369b2d67!2s15757+Halbe%2C+Germany!5e0!3m2!1sen!2suk!4v1542977087833\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","70,000 m2","5.2 million m3","A hangar originally intended to house the construction of a giant airship, this building now houses an indoor theme park, called Tropical Islands Resort.");
		volumeBuildings.add(aerium);
		
		return volumeBuildings;
	}
	
	public ArrayList<BiggestFootprint> getFootprintBuildings()
	{
		ArrayList<BiggestFootprint> footprintBuildings = new ArrayList<BiggestFootprint>();
		
		BiggestFootprint aalsmeerFlowerAuctionBuilding = new BiggestFootprint("Aalsmeer Flower Auction Building","Netherlands","Aalsmeer","Aalsmeer.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2442.179379916782!2d4.780392851330284!3d52.258287579666145!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c5de25f43ac82d%3A0x7e6ba34cf4c92c79!2sVba+bloemenveiling!5e0!3m2!1sen!2suk!4v1542982367120\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","518,000 m2"," 740m x 700m","The auction building of the flower auction in Aalsmeer.");
		footprintBuildings.add(aalsmeerFlowerAuctionBuilding);
		
		BiggestFootprint theDubaiMall = new BiggestFootprint("The Dubai Mall","United Arab Emirates","Dubai","DubaiMall.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3610.1715091494007!2d55.27730385051848!3d25.19743798381702!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f682829c85c07%3A0xa5eda9fb3c93b69d!2sThe+Dubai+Mall!5e0!3m2!1sen!2suk!4v1542982500700\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","500,000 m2","N/A","N/A");
		footprintBuildings.add(theDubaiMall);
		
		BiggestFootprint teslaFactory = new BiggestFootprint("Tesla Factory","United States","Fremont, California","TeslaFactory.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3076.9575121216844!2d-119.44123404911092!3d39.53801247937621!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x80991fc240ba30b9%3A0x7e66b0fa4fe55cd8!2sTesla+Gigafactory!5e0!3m2!1sen!2suk!4v1542982627874\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","427,354 m2","N/A","Automobile production facility of Tesla Motors");
		footprintBuildings.add(teslaFactory);
		
		BiggestFootprint boeingEverettFactory = new BiggestFootprint("Boeing Everett Factory","United States","Everett, Washington","BoeingEverettFactory.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.763882474872!2d-122.29196894883066!3d47.92160597910467!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x54900164f9502991%3A0x903b231982d227fd!2sFuture+Of+Flight+Museum!5e0!3m2!1sen!2suk!4v1542983231076\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","398,000 m2","900m x 495m","Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.");
		footprintBuildings.add(boeingEverettFactory);
		
		BiggestFootprint daikinTexas = new BiggestFootprint("Daikin Texas Technology Park","UNited States","Waller, Texas","DaikinTexas.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3453.5934936387375!2d-95.8633176493727!3d30.0485180817919!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8646d2de861ed379%3A0xb685128a4a3f270b!2sDaikin+Texas+Technology+Park!5e0!3m2!1sen!2suk!4v1542983615219\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","393,000 m2","N/A","Factory and distribution center for heating and air conditioning products");
		footprintBuildings.add(daikinTexas);
		
		
		return footprintBuildings;
	}
	
	public ArrayList<BiggestFloorarea> getFloorareaBuildings(){
		
		ArrayList<BiggestFloorarea> floorareaBuildings = new ArrayList<BiggestFloorarea>();
		
		BiggestFloorarea globalCenter = new BiggestFloorarea("New Century Global Center","China","Chengdu","GlobalCenter.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d6870.483344056173!2d104.05631289650803!3d30.570722426416182!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x36efc666201cdf2f%3A0xa86ba68c629f9c92!2sNew+Century+Global+Center+Parking+Lot!5e0!3m2!1sen!2suk!4v1542985829219\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","1,760,000 m2");
		floorareaBuildings.add(globalCenter);
		
		BiggestFloorarea dubaiAirport = new BiggestFloorarea("Dubai International Airport Terminal 3","United Arab Emirates","Dubai","DubaiAirport.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d14434.496372687472!2d55.348744871990725!3d25.249583090681206!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f5da0b35dab73%3A0x15a80cf878932d49!2sAirport+Terminal+3!5e0!3m2!1sen!2suk!4v1542986010068\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","1,713,000 m2");
		floorareaBuildings.add(dubaiAirport);
		
		BiggestFloorarea endowment = new BiggestFloorarea("Abraj Al-Bait Endowment","Saudi Arabia","Mecca","Endowment.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3714.2658271058635!2d39.82354760044607!3d21.41879398571861!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204c82533f16f%3A0xca0cff6480eeca59!2sAbraj+Al+Bait+Mall+(Kingdom+Clock+Tower)!5e0!3m2!1sen!2suk!4v1542986172629\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","1,575,815 m2");
		floorareaBuildings.add(endowment);
		
		BiggestFloorarea centralWorld = new BiggestFloorarea("CentralWorld","Thailand","Bangkok","CentralWorld.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3875.5347097098597!2d100.53716745033397!3d13.746596590303454!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x30e29ecfc2f455e1%3A0xc4ad0280d8906604!2sCentralWorld!5e0!3m2!1sen!2suk!4v1542986288266\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","1,024,000 m2");
		floorareaBuildings.add(centralWorld);
		
		BiggestFloorarea flowerAuction = new BiggestFloorarea("Aalsmeer Flower Auction","Netherlands","Aalsmeer","Aalsmeer.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=\" width=\"300\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>","990,000 m2");
		floorareaBuildings.add(flowerAuction);
		
		
		
		return floorareaBuildings;
	}
	
	
}
