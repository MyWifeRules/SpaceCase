import org.lwjgl.util.vector.Vector3f;
import java.util.Random;

public class hyperChunk {
	
	int radiusLocation = 1;
    Random randy = new Random();
	tessaract[] tessArray;
	static int workingX = 0;//which x are we generating on?
	static int workingY = 0;
	static int workingZ = 0;
	
	
	public hyperChunk(){
		tessArray = new tessaract[20];
		generateHyperChunk(); 
	}
	
	public hyperChunk(int radLocation){
		
		radiusLocation = radLocation;
		
	}
	
	public void generateHyperChunk(){
		
		//makes all the blocks in the hyperChunk.
		//right now uses simple randomization to 
		//choose what blocks to make
		
		
		for(int i =0; i< 20; i++){
			
		
		int ran = randy.nextInt(101);
		//need to figure out how to position them maybe 5x5x5?
		System.out.println("i = " +i);
		System.out.println("ran = " + ran);
		
		if(ran <= 5){
			tessArray[i] = new tessaract(TessaractType.Ore, workingX,workingY, workingZ, 0,1);			
		System.out.println("Block "+i+ " is Ore");
		}
		if(ran >5 & ran <= 30){
			tessArray[i] = new tessaract(TessaractType.Stone, workingX,workingY, workingZ, 0,1);
			System.out.println("Block "+i+ " is Stone");
		}
		if(ran > 30 & ran <= 50){

			tessArray[i] = new tessaract(TessaractType.Cobblestone, workingX,workingY, workingZ, 0,1);
			System.out.println("Block "+i+ " is cobblestone");
		}
		if(ran > 50 & ran <= 75){

			tessArray[i] = new tessaract(TessaractType.Dirt, workingX,workingY, workingZ, 0,1);
			System.out.println("Block "+i+ " is Dirt");
		}
		if(ran > 75 & ran <=100){

			tessArray[i] = new tessaract(TessaractType.Air, workingX,workingY, workingZ, 0,1);
			System.out.println("Block "+i+ " is Air");
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
	
	public tessaract addTess(){
		tessaract tempTess = null; 
		int ran = randy.nextInt(101);
		//need to figure out how to position them maybe 5x5x5?
		if(ran <= 5){
			tempTess = new tessaract(TessaractType.Ore, workingX,workingY, workingZ, 0,1);			
		System.out.println("Block tempTess is Ore");
		}
		if(ran >5 & ran <= 30){
			tempTess = new tessaract(TessaractType.Stone, workingX,workingY, workingZ, 0,1);
			System.out.println("Block tempTess is Stone");
		}
		if(ran > 30 & ran <= 50){

			tempTess = new tessaract(TessaractType.Cobblestone, workingX,workingY, workingZ, 0,1);
			System.out.println("Block tempTess is cobblestone");
		}
		if(ran > 50 & ran <= 75){

			tempTess = new tessaract(TessaractType.Dirt, workingX,workingY, workingZ, 0,1);
			System.out.println("Block tempTess is Dirt");
		}
		if(ran > 75 & ran <=100){

			tempTess = new tessaract(TessaractType.Air, workingX,workingY, workingZ, 0,1);
			System.out.println("Block tempTess is Air");
		}
		if(tempTess != null){
			return tempTess;
		}
		else{tempTess = new tessaract(TessaractType.Ore, workingX,workingY, workingZ, 0,1);}
		return tempTess;
	}
	
}//end class
