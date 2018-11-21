import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args)
	{
	
	Toy woody = new Toy("Woody","Tom","Hanks");
	Toy buzz = new Toy("Buzz","Tim","Allen");
	Toy slinky = new Toy("Slinky","Jim","Varney");
	Toy ham = new Toy("Ham","John","Ratzenberger");
	Toy rex = new Toy("Rex","Wallace","Shawn");
	Toy potatohead = new Toy("Mr. Potato Head","Don","Rickies");
	
	ArrayList<Toy> toys = new ArrayList<Toy>();
	toys.add(woody);
	toys.add(buzz);
	toys.add(slinky);
	toys.add(ham);
	toys.add(rex);
	toys.add(potatohead);
	
	for(Toy toy:toys)
	{
		System.out.println(toy.getToyName() + " - " + toy.getActorFirstName() + " " + toy.getActorLastName());
	}
	
	
	}
	
	
}
