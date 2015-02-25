import org.lwjgl.util.vector.Vector4f;



public class tessaract 
{
  //This is a list of all possible blocks
	enum TessaractType
	{
	Vacuum(0),
	Air(1),
	Bedrock(2),
	Stone(3),
	Dirt(4),
	Grass(5),
	Sand(6),
	Lava(7),
	Water(8),
	Ore(9),
	Wood(10),
	Leaves(11),
	Sandstone(12),
	Cobblestone(13)
	;
	private String type = new String("Air");
	private int tessType = 0;
	
	
	//empty constructor. defaults to air if not defined
	private TessaractType(){tessType = 0; type = "Vacuum";}
	
	private TessaractType(int ttype)
	{
		
	tessType = ttype;

	switch (ttype) 
	{
    case 0:
    	type = "Air";
    	break;
    case 1:
    	type = "Bedrock";
    	break;
    case 2:
    	type = "Stone";
    	break;
    case 3:
    	type = "Dirt";
    	break;
    case 4:
    	type = "Grass";
    	break;
    case 5:
    	type = "Sand";
    	break;
    case 6:
    	type = "Lava";
    	break;
    case 7:
    	type = "Water";
    	break;
    case 8:
    	type = "Ore";
    	break;
    case 9:
    	type = "Wood";
    	break;
    case 10:
    	type = "Leaves";
    	break;
    case 11:
    	type = "Sandstone";
    	break;
    case 12:
    	type = "Cobblestone";
    	break; 	
    default: 
    	type = "Air";
    break;
    }
	
	}//end constructor
	
	private TessaractType(String ttype)
	{
	type = ttype;
	switch (type) 
	{
	case "Vacuum":
		tessType = 0;
		break;
    case "Air":
    	tessType = 1;
    	break;
    case "BedRock":
    	tessType = 2;
    	break;
    case "Stone":
    	tessType = 3;
    	break;
    case "Dirt":
    	tessType = 4;
    	break;
    case "Grass":
    	tessType = 5;
    	break;
    case "Sand":
    	tessType = 6;
    	break;
    case "Lava":
    	tessType = 7;
    	break;
    case "Water":
    	tessType = 8;
    	break;
    case "Ore":
    	tessType = 9;
    	break;
    case "Wood":
    	tessType = 10;
    	break;
    case "Leaves":
    	tessType = 11;
    	break;
    case "Sandstone":
    	tessType = 12;
    	break;
    case "Cobblestone":
    	tessType = 13;
    	break; 	
    default: 
    	type = "Vacuum";
    	tessType = 0;
    break;
    }
	
	}
	
	final String getTypeString()
	{
		return type;
	}
	
	final int getTypeint()
	{
		return tessType;
	}
	
	}//end enum
	

	//What type of block is this instance? TypeOfTess tells!
	private TessaractType TypeOfTess;
	  
	private boolean isVisible = false;
	
	//fourth variable is for angle of block
	private Vector4f tessPosition = new Vector4f(1.0f,1.0f,1.0f,0.0f);
	private int radiusLocation = 1;
	
	//private Texture text;
	
	public tessaract()
	{
	 TypeOfTess = TessaractType.Vacuum;
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

	public TessaractType getType()
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
	
}
