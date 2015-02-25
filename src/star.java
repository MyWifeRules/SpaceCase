import java.util.Random;


public class star 
{
	String name = new String("Default");
	int radius = 1;
	String type = "o";
	int hotness = 1;
	/* Star types based on those defined in "Star Trek: Star Charts
	 * with a few extras added based on realistic star properties 
	 * from real life astronomy.
	 * See http://en.memory-alpha.org/wiki/Star_Trek:_Star_Charts
	 * for more details. Types are o,b,a,f,g,k,m,l,t,y in order of brightness to dimness
	 * and short life to long life, as in real astronomy.
	 * Real astrometric properties are based on the Harvard Classification
	 * System. see
	 * http://en.wikipedia.org/wiki/Stellar_classification
	 * hotness goes from 0-9 where 0 = hottest stars. This should determine
	 * the brightness and radiance of the star, along with it's type.
	 */
	
public star(boolean b, String nametypeEngorJap)
{  // true to randomize star
	if (b == true)
	{
	randomInitStar(nametypeEngorJap);
	}
}
	
 private void randomInitStar(String nameEorJ) {
	Random r = new Random();
	//create random name, radius within type range, type, hotness.
	
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
	
	 radius = r.nextInt(10000);
	 if (radius == 0){radius = r.nextInt(10000);}
	 
	 int typeNum = r.nextInt(10);
	 switch(typeNum)
	 {
	 case 0:
		 type = "o";
		 break;
	 case 1:
		 type = "b";
		 break;
	 case 2:
		 type = "a";
		 break;
	 case 3:
		 type = "f";
		 break;
	 case 4:
		 type = "g";
		 break;
	 case 5:
		 type = "k";
		 break;
	 case 6:
		 type = "m";
		 break;
	 case 7:
		 type = "l";
		 break;
	 case 8:
		 type = "t";
		 break;
	 case 9:
		 type = "y";
		 break;
	 }
	 
	 hotness = r.nextInt(9);
}

public star(String n, int r, String t, int h)
 {
	 name = n;
	 radius = r;
	 type = t;
	 hotness = h; 
 }
 
 public String getName(){
	return name; 
 }
 
 public int getRadius(){
	 return radius;
 }
 
 public String getType(){
	 return type;
 }
 
 public int getTemperature(){
	 return hotness;
 }
 
 public void setName(String n){
	 name = n;
 }
 
 public void setRadius(int r){
	 radius = r;
 }
 
 public void setType(String t){
	 type = t;
 }
 
 public void setTemperature(int h){
	 hotness = h;
 }
 
 
 
}
