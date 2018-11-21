import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		sleepy.setImage("Sleepy.png");
		
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		happy.setImage("Happy.png");
		
		Dwarf dopey = new Dwarf();
		dopey.setName("Dopey");
		dopey.setAuthor("Disney");
		dopey.setImage("Dopey.png");
		
		Dwarf bashful = new Dwarf();
		bashful.setName("Bashful");
		bashful.setAuthor("Disney");
		bashful.setImage("Bashful.png");
		
		Dwarf sneezy = new Dwarf();
		sneezy.setName("Sneezy");
		sneezy.setAuthor("Disney");
		sneezy.setImage("Sneezy.png");
		
		Dwarf doc = new Dwarf();
		doc.setName("Doc");
		doc.setAuthor("Disney");
		doc.setImage("Doc.png");
	
		Dwarf grumpy = new Dwarf();
		grumpy.setName("Grumpy");
		grumpy.setAuthor("Disney");
		grumpy.setImage("Grumpy.png");
		
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		dwarfs.add(sleepy);
		dwarfs.add(happy);
		dwarfs.add(dopey);
		dwarfs.add(bashful);
		dwarfs.add(sneezy);
		dwarfs.add(doc);
		dwarfs.add(grumpy);
		
		for(Dwarf dwarf:dwarfs)
		{
			System.out.println(dwarf.getName());
		}
		
		Dwarf thorin = new Dwarf("Thorin","Tolkien","thorin.png");
		Dwarf balin = new Dwarf("Balin","Tolkien","balin.png");
		Dwarf dwalin = new Dwarf("Dwalin","Tolkien","dwalin.png");
		Dwarf fili = new Dwarf("Fili","Tolkien","fili.png");
		Dwarf kili = new Dwarf("Kili","Tolkien","kili.png");
		Dwarf dori = new Dwarf("Dori","Tolkien","dori.png");
		Dwarf nori = new Dwarf("Nori","Tolkien","nori.png");
		Dwarf ori = new Dwarf("Ori","Tolkien","ori.png");
		Dwarf oin = new Dwarf("Oin","Tolkien","oin.png");
		Dwarf gloin = new Dwarf("Gloin","Tolkien","gloin.png");
		Dwarf bifur = new Dwarf("Bifur","Tolkien","bifur.png");
		Dwarf bufur = new Dwarf("Bufur","Tolkien","bufur.png");
		Dwarf bomur = new Dwarf("Bomur","Tolkien","bomur.png");
		
		dwarfs.add(thorin);
		dwarfs.add(balin);
		dwarfs.add(dwalin);
		dwarfs.add(fili);
		dwarfs.add(kili);
		dwarfs.add(dori);
		dwarfs.add(nori);
		dwarfs.add(ori);
		dwarfs.add(oin);
		dwarfs.add(gloin);
		dwarfs.add(bifur);
		dwarfs.add(bufur);
		dwarfs.add(bomur);
		
		for(Dwarf dwarf:dwarfs)
		{
			System.out.println(dwarf.getName());
		}
		
	}

}
