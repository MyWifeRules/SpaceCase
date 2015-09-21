import org.lwjgl.util.vector.Vector4f;



public class tessaract 
{
	face frontFace = new face("front");
	face leftSideFace = new face("left");
	face rearFace = new face("rear");
	face rightSideFace = new face("right");
	face topFace = new face("top");
	face bottomFace = new face("bottom");
	
	
  

	//What type of block is this instance? TypeOfTess tells!
	private int TypeOfTess;
	  
	private boolean isVisible = false;
	
	//fourth variable is for angle of block
	private Vector4f tessPosition = new Vector4f(1.0f,1.0f,1.0f,0.0f);
	private int radiusLocation = 1;
	
	//private Texture text;
	
	public tessaract()
	{
	 TypeOfTess = TessaractType.Vacuum;
	}
	
	public tessaract(int type, int x, int y, int z,int ang, int radloc)
	{
	TypeOfTess = type;
	tessPosition = new Vector4f(x,y,z,ang);
	radiusLocation = radloc;
	
	}
	public tessaract(String type, int x, int y, int z, int radloc)
	{
		switch (type) 
		{
		case "Vacuum":
			TypeOfTess = TessaractType.Vacuum;
			break;
        case "Air":
        	TypeOfTess = TessaractType.Air;
        	break;
        case "Bedrock":
        	TypeOfTess = TessaractType.Bedrock;
        	break;
        case "Stone":
        	TypeOfTess = TessaractType.Stone;
        	break;
        case "Dirt":
        	TypeOfTess = TessaractType.Dirt;
        	break;
        case "Grass":
        	TypeOfTess = TessaractType.Grass;
        	break;
        case "Sand":
        	TypeOfTess = TessaractType.Sand;
        	break;
        case "Lava":
        	TypeOfTess = TessaractType.Lava;
        	break;
        case "Water":
        	TypeOfTess = TessaractType.Water;
        	break;
        case "Ore":
        	TypeOfTess = TessaractType.Ore;
        	break;
        case "Wood":
        	TypeOfTess = TessaractType.Wood;
        	break;
        case "Leaves":
        	TypeOfTess = TessaractType.Leaves;
        	break;
        case "Sandstone":
        	TypeOfTess = TessaractType.Sandstone;
        	break;
        case "Cobblestone":
        	TypeOfTess = TessaractType.Cobblestone;
        	break;
        	        	
        default: 
        	TypeOfTess = TessaractType.Vacuum;
        break;
        	
        	
        	
		}
	}
	
	public void setActive(boolean b)
	{
	isVisible = b;
	}

	public int getType()
	{
		return TypeOfTess;
	}
	
	public boolean getVisibility()
	{
		return isVisible;
	}
	
	public void setVisibility(boolean b)
	{
		isVisible = b;
	}
	
	public Vector4f getPosition()
	{
		return tessPosition;
	}
	
	public void setPosition(float x, float y, float z, float angle)
	{
		tessPosition.set(x, y, z, angle);
	}
	
	public void setRadiusLocation(int loc)
	{
		radiusLocation = loc;
	}
	
	public int getRadiusLocation()
	{
		return radiusLocation;
	}
	public face getFace(String s)
	{
		if(s.equals("front")){
			return frontFace;
		}
		if(s.equals("left")){
			return leftSideFace;
		}
		if(s.equals("rear")){
			return rearFace;
		}
		if(s.equals("right")){
			return rightSideFace;
		}
		
		if(s.equals("top")){
			return topFace;
		}

		if(s.equals("bottom")){
			return bottomFace;
		}
		
		return null;
		
	}
}
