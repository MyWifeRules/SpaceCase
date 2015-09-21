import org.lwjgl.util.vector.Vector3f;
import java.util.Random;

public class hyperChunk {
	
	int radiusLocation = 1;
    Random randy = new Random();
	tessaract[] tessArray;
	
	public hyperChunk(){
		
	}
	
	public hyperChunk(int radLocation){
		
		radiusLocation = radLocation;
		
	}
	
	public void generateHyperChunk(){
		
		//makes all the blocks in the hyperChunk.
		//right now uses simple randomization to 
		//choose what blocks to make
		for(int i =-1; i< 10; i++){
			
		
		int ran = randy.nextInt(101);
		//need to figure out how to position them maybe 5x5x5?
		if(ran <= 5){
			tessArray[i] = new tessaract(TessaractType.Ore, 1,1,0,0,1);			
		}
		if(ran >5 & ran <= 30){
			tessArray[i] = new tessaract(TessaractType.Stone,1,1,0,0,1);
		}
		if(ran > 30 & ran <= 50){

			tessArray[i] = new tessaract(TessaractType.Cobblestone,1,1,0,0,1);
		}
		if(ran > 50 & ran <= 75){

			tessArray[i] = new tessaract(TessaractType.Dirt,1,1,0,0,1);
		}
		if(ran > 75 & ran <=100){

			tessArray[i] = new tessaract(TessaractType.Air,1,1,0,0,1);	
		}
		}
	}
	
	public tessaract[] getTesses(){
		return tessArray;
	}
	
}//end class
