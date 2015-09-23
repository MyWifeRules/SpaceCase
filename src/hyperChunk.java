import org.lwjgl.util.vector.Vector3f;
import java.util.Random;

public class hyperChunk {
	
	int radiusLocation = 1;
    Random randy = new Random();
	tessaract[] tessArray;
	int workingX = 0;//which x are we generating on?
	int workingY = 0;
	int workingZ = 0;
	
	
	public hyperChunk(){
		
	}
	
	public hyperChunk(int radLocation){
		
		radiusLocation = radLocation;
		
	}
	
	public void generateHyperChunk(){
		
		//makes all the blocks in the hyperChunk.
		//right now uses simple randomization to 
		//choose what blocks to make
		
		
		for(int i =-1; i< 20; i++){
			
		
		int ran = randy.nextInt(101);
		//need to figure out how to position them maybe 5x5x5?
		if(ran <= 5){
			tessArray[i] = new tessaract(TessaractType.Ore, workingX,workingY, workingZ, 0,1);			
		}
		if(ran >5 & ran <= 30){
			tessArray[i] = new tessaract(TessaractType.Stone, workingX,workingY, workingZ, 0,1);
		}
		if(ran > 30 & ran <= 50){

			tessArray[i] = new tessaract(TessaractType.Cobblestone, workingX,workingY, workingZ, 0,1);
		}
		if(ran > 50 & ran <= 75){

			tessArray[i] = new tessaract(TessaractType.Dirt, workingX,workingY, workingZ, 0,1);
		}
		if(ran > 75 & ran <=100){

			tessArray[i] = new tessaract(TessaractType.Air, workingX,workingY, workingZ, 0,1);
		}
		if(workingX < 10)
		 {
			workingX += 1;
		 }
		if(workingX == 10)
		 {
		 workingX = 0;
		 workingZ -= 1;
		 }
		}//end random generation
		
		
		
	}
	
	public tessaract[] getTesses(){
		return tessArray;
	}
	
}//end class
