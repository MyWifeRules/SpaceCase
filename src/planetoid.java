import java.util.Random;


public class planetoid 
{
	String name = new String("Default");
	int radius = 1;
	String type = new String("a");
 	Random r = new Random();
	/* Planet types based on those defined in "Star Trek: Star Charts
	 * with a few extras added based on realistic planet properties 
	 * from real life astronomy.
	 * See http://en.memory-alpha.org/wiki/Star_Trek:_Star_Charts
	 * for more details. types are a-t, x,y,z.
	 * Real astrometric properties are based on our current understanding
	 * of our near interstellar neighborhood.
	 */
	
	public planetoid(boolean b, String nameEorJ){
		//true to randomly generate. false to leave default
		if(b)
		{
			randomlyGenPlanet(nameEorJ);
		}
		
	}
	
	public planetoid(String namer, int radiuser, String typer)
	{
		name = namer;
		radius = radiuser;
		type = typer;
	}
	
	public void randomlyGenPlanet(String nameEorJ){
		

		Random r = new Random();
		//create random name, radius within type range, type.
		
		if(nameEorJ == "English")
		{
		randomNameGen ranname = new randomNameGen();
		name = ranname.getRandomName(r.nextInt(16));
		}
		if(nameEorJ == "Japanese")
		{
			randomNameGen ranname = new randomNameGen();
			name = ranname.getRandomJName(r.nextInt(16));
		}
		
		 radius = r.nextInt(1000);
		 if (radius == 0){radius = r.nextInt(1000);}
		 
		 int typeNum = r.nextInt(23);
		 switch(typeNum)
		 {
		 case 0:
			 type = "a";
			 break;
		 case 1:
			 type = "b";
			 break;
		 case 2:
			 type = "c";
			 break;
		 case 3:
			 type = "d";
			 break;
		 case 4:
			 type = "e";
			 break;
		 case 5:
			 type = "f";
			 break;
		 case 6:
			 type = "g";
			 break;
		 case 7:
			 type = "h";
			 break;
		 case 8:
			 type = "i";
			 break;
		 case 9:
			 type = "j";
			 break;
		 case 10:
			 type = "k";
			 break;
		 case 11:
			 type = "l";
			 break;
		 case 12:
			 type = "m";
			 break;
		 case 13:
			 type = "n";
			 break;
		 case 14:
			 type = "o";
			 break;
		 case 15:
			 type = "p";
			 break;
		 case 16:
			 type = "q";
			 break;
		 case 17:
			 type = "r";
			 break;
		 case 18:
			 type = "s";
			 break;
		 case 19:
			 type = "t";
			 break;
		 case 20:
			 type = "x";
			 break;
		 case 21:
			 type = "y";
			 break;
		 case 22:
			 type = "z";
			 break;
		 }
		
		
	}
	
	
	
	
	
}
