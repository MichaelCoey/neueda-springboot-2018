package uk.ac.belfastmet.exampletest.service;

import java.util.ArrayList;


import uk.ac.belfastmet.exampletest.domain.Cast;

public class CastService {
	
	public CastService(){
		
		super();
		
	}
	
public ArrayList<Cast> getShrekCast(){
		
		ArrayList<Cast> casts = new ArrayList<Cast>();
		
		
		Cast shrek = new Cast("Shrek","Shrek","Shrek.png");
		casts.add(shrek);
		
		Cast donkey = new Cast("Donkey","Shrek","Donkey.png");
		casts.add(donkey);
		
		Cast gingerbread = new Cast("Ginger Bread Man","Shrek","GingerBread.png");
		casts.add(gingerbread);
		
		Cast fiona = new Cast("Fiona","Shrek","Fiona.png");
		casts.add(fiona);

		
		return casts;
		
	}


public ArrayList<Cast> getToyStoryCast(){
	
	ArrayList<Cast> casts = new ArrayList<Cast>();
	

	Cast woody = new Cast("Woody","Toy Story","Woody.png");
	casts.add(woody);
			
	Cast buzz = new Cast("Buzz","Toy Story","Buzz.png");
	casts.add(buzz);
	
	Cast hamm = new Cast("Hamm","Toy Story","Ham.png");
	casts.add(hamm);
			
	Cast peep = new Cast("Bo Peep","Toy Story","BoPeep.png");
	casts.add(peep);
			
	return casts;
}

}
