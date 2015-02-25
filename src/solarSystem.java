import java.util.Random;


public class solarSystem 
{

	int numOfStars = 0;
	int numOfPlanets = 0;
	star[] sa = new star[4];
	planetoid[] pa = new planetoid[10];
	Random r = new Random();
	
	public solarSystem(){
		//generate a generic 4 star 10 planet solar system!
		for(int i = 0; i < 3; i++){
			sa[i] = null;
			
		}
		

		for(int i = 0; i < 9; i++){
			pa[i] = null;
			
		}
		
	}
	
	public void addRandomStar(){ 
		
		  //If array index star is default, change it to add a random star
		numOfStars ++;
		int tempint = numOfStars -1;
		  if (sa[tempint] == null)
		  {
			  int anotherTemp = r.nextInt(1);
			  if(anotherTemp == 0)
			  {

				   sa[tempint] = new star(true, "English");
			  }
			  if(anotherTemp == 1)
			  {

				   sa[tempint] = new star(true, "Japanese");
			  }
		   
		  }
		  
		
	}//end addStar
	
	public void addRandomPlanet(){
		
		numOfPlanets ++;
		int tempint = numOfStars -1;
		  if (pa[tempint] == null)
		  {
			  int anotherTemp = r.nextInt(1);
			  
			  if(anotherTemp == 0)
			  {

				   pa[tempint] = new planetoid(true, "English");
			  }
			  
			  if(anotherTemp == 1)
			  {

				   pa[tempint] = new planetoid(true, "Japanese");
			  }
		   
		  }
		  
	}
	
	public int howManyStars(){
		return numOfStars;
	}
	
	public int howManyPlanets(){
		return numOfPlanets;
	}
	
	public star[] getStars(){
		return sa;
	}
	
	public planetoid[] getPlanets(){
		return pa;
	}
	
}
