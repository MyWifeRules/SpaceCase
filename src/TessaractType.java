

public class TessaractType{
	static int Vacuum = (0),
			Air = (1),
			Bedrock = (2),
			Stone=(3),
			Dirt=(4),
			Grass=(5),
			Sand=(6),
			Lava=(7),
			Water=(8),
			Ore=(9),
			Wood=(10),
			Leaves=(11),
			Sandstone=(12),
			Cobblestone=(13);
	//This is a list of all possible blocks
	
			private String type = new String("Vacuum");
			private int tessType = 0;
		
		//empty constructor. defaults to vacuum if not defined
		private TessaractType(){tessType = 0; type = "Vacuum";}
		
		private TessaractType(int ttype)
		{
			
		tessType = ttype;

		switch (ttype) 
		{
		case 0:
			type = "vacuum";
			tessType = 0;
	    case 1:
	    	type = "Air";
			tessType = 1;
	    	break;
	    case 2:
	    	type = "Bedrock";
			tessType = 2;
	    	break;
	    case 3:
	    	type = "Stone";
			tessType = 3;
	    	break;
	    case 4:
	    	type = "Dirt";
			tessType = 4;
	    	break;
	    case 5:
	    	type = "Grass";
			tessType = 5;
	    	break;
	    case 6:
	    	type = "Sand";
			tessType = 6;
	    	break;
	    case 7:
	    	type = "Lava";
			tessType = 7;
	    	break;
	    case 8:
	    	type = "Water";
			tessType = 8;
	    	break;
	    case 9:
	    	type = "Ore";
			tessType = 9;
	    	break;
	    case 10:
	    	type = "Wood";
			tessType = 10;
	    	break;
	    case 11:
	    	type = "Leaves";
			tessType = 11;
	    	break;
	    case 12:
	    	type = "Sandstone";
			tessType = 12;
	    	break;
	    case 13:
	    	type = "Cobblestone";
			tessType = 13;
	    	break; 	
	    default: 
	    	type = "Vacuum";
			tessType = 0;
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
		
}//end 
		

