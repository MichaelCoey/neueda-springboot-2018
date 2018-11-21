import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> dwarfs = new ArrayList<String>();
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Doc");
		dwarfs.add("Grumpy");
		
		ArrayList<String> dwarves = new ArrayList<String>();
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fili");
		dwarves.add("Kili");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Oin");
		dwarves.add("Bilbo");
		
		//Loop counter
		int i;
		
		//Element counter
		int j=0;
		//Loop to print elements on lines
		System.out.println("The Disney Dwarfs are:");
		for(i = 0; i < dwarfs.size(); i++)
		{
			System.out.println(dwarfs.get((j)));
			j++;
		}
		
		//Element counter
		int k=0;
		//Loop to print element on lines
		System.out.println("The Tolkien Dwarves are:");
		for(i = 0; i < dwarves.size(); i++)
		{
			System.out.println(dwarves.get((k)));
			k++;
		}
		
		
		//Brian's Way (Much cleaner)
		System.out.println("BRIANS WAY The Disney Dwarfs are:");
		for (String dwarf:dwarfs) {
			System.out.println(dwarf);
		}
		
		//Brian's Way (Much cleaner)
		System.out.println("BRIANS WAY The Tolkien Dwarfs are:");
		for (String dwarf:dwarves) {
			System.out.println(dwarf);
		}
		
		
		
		
		
		
		
	}

}
