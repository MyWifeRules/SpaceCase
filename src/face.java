import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

public class face {

	private Vector3f bottomLeftCoord = new Vector3f(-1,-1,1);
	private Vector3f topLeftCoord = new Vector3f(-1,1,1);
	private Vector3f topRightCoord = new Vector3f(1,1,1);
	private Vector3f bottomRightCoord = new Vector3f(1,-1,1);
			

	private Vector2f bottomLeftTextureCoord = new Vector2f(0,0);
	private Vector2f topLeftTextureCoord = new Vector2f(1,0);
	private Vector2f topRightTextureCoord = new Vector2f(1,1);
	private Vector2f bottomRightTextureCoord = new Vector2f(0,1);
	
	
	Vector3f[] positionCoord = {
	bottomLeftCoord,topLeftCoord,topRightCoord,bottomRightCoord
	};
	
	Vector2f[] textureCoord = {
			bottomLeftTextureCoord,topLeftTextureCoord,topRightTextureCoord,
			bottomRightTextureCoord
	};
	
	@SuppressWarnings("unused")
	public face(String facing)
	{
		if(facing.equalsIgnoreCase("front")){

		bottomLeftCoord = new Vector3f(-1,-1,1);
		topLeftCoord = new Vector3f(-1,1,1);
		topRightCoord = new Vector3f(1,1,1);
		bottomRightCoord = new Vector3f(1,-1,1);
				
		}
		
		if(facing.equalsIgnoreCase("left")){

		bottomLeftCoord = new Vector3f(-1,-1,-1);
		topLeftCoord = new Vector3f(-1,1,-1);
		topRightCoord = new Vector3f(-1,1,1);
		bottomRightCoord = new Vector3f(-1,-1,1);
			
		}
		

		if(facing.equalsIgnoreCase("rear")){

			bottomLeftCoord = new Vector3f(1,-1,1);
			topLeftCoord = new Vector3f(1,1,-1);
			topRightCoord = new Vector3f(-1,1,-1);
			bottomRightCoord = new Vector3f(-1,-1,-1);
			
		}
		

		if(facing.equalsIgnoreCase("right")){
			

			bottomLeftCoord = new Vector3f(1,-1,1);
			topLeftCoord = new Vector3f(1,1,1);
			topRightCoord = new Vector3f(1,1,-1);
			bottomRightCoord = new Vector3f(1,-1,-1);
			
		}
		

		if(facing.equalsIgnoreCase("top")){

			bottomLeftCoord = new Vector3f(-1,1,1);
			topLeftCoord = new Vector3f(-1,1,-1);
			topRightCoord = new Vector3f(1,1,-1);
			bottomRightCoord = new Vector3f(1,1,1);
			
		}
		

		if(facing.equalsIgnoreCase("bottom")){

			bottomLeftCoord = new Vector3f(-1,-1,-1);
			topLeftCoord = new Vector3f(-1,-1,1);
			topRightCoord = new Vector3f(1,-1,1);
			bottomRightCoord = new Vector3f(1,-1,-1);
			
		}

		Vector3f[] positionCoord = {
		bottomLeftCoord,topLeftCoord,topRightCoord,bottomRightCoord
		};
		
		Vector2f[] textureCoord = {
				bottomLeftTextureCoord,topLeftTextureCoord,topRightTextureCoord,
				bottomRightTextureCoord
		};
	}
	
	public Vector3f[] getCoords()
	{
		return positionCoord;
	}
	
	public Vector2f[] getTextureCoords(){
		return textureCoord;
	}
	
}
