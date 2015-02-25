import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


public class randomNameGen 
{
	Random r = new Random();
	File f = new File("resources/star planet names.txt");
	String[] PredefNames = new String[189];
	Scanner s;
	
	
public randomNameGen(){
	
	for(int i = 0; i<100; i++)
	{
		PredefNames[i] = "a";
	}
	
}

public String getRandomName(int numberofChars)
 {
 	int a = numberofChars;
 	int rannum = 0;
 	int rannum2 = 0;
 	int rannum3 = 0;
 	StringBuffer name = new StringBuffer("");
 	for(int i = 0; i< a; i++)
 	{
 		rannum = r.nextInt(58);
 		rannum2 = r.nextInt(14);
 		rannum3 = r.nextInt(2);
 		if (rannum3 == 0)
 		{
 		switch(rannum)
 		{
 		case 0: name.append("a"); break;
 		case 1: name.append("b"); break;
 		case 2: name.append("c"); break;
 		case 3: name.append("d"); break;
 		case 4: name.append("e"); break;
 		case 5: name.append("f"); break;
 		case 6: name.append("g"); break;
 		case 7: name.append("h"); break;
 		case 8: name.append("i"); break;
 		case 9: name.append("j"); break;
 		case 10: name.append("k"); break;
 		case 11: name.append("l"); break;
 		case 12: name.append("m"); break;
 		case 13: name.append("n"); break;
 		case 14: name.append("o"); break;
 		case 15: name.append("p"); break;
 		case 16: name.append("q"); break;
 		case 17: name.append("r"); break;
 		case 18: name.append("s"); break;
 		case 19: name.append("t"); break;
 		case 20: name.append("u"); break;
 		case 21: name.append("v"); break;
 		case 22: name.append("w"); break;
 		case 23: name.append("x"); break;
 		case 24: name.append("y"); break;
 		case 25: name.append("z"); break;
 		case 26: name.append("bl"); break;
 		case 27: name.append("br"); break;
 		case 28: name.append("pr"); break;
 		case 29: name.append("dr"); break;
 		case 30: name.append("fl"); break;
 		case 31: name.append("cl"); break;
 		case 32: name.append("gl"); break;
 		case 33: name.append("sl"); break;
 		case 34: name.append("cr"); break;
 		case 35: name.append("pl"); break;
 		case 36: name.append("fr"); break;
 		case 37: name.append("gr"); break;
 		case 38: name.append("tr"); break;
 		case 39: name.append("sc"); break;
 		case 40: name.append("sk"); break;
 		case 41: name.append("st"); break;
 		case 42: name.append("sw"); break;
 		case 43: name.append("sn"); break;
 		case 44: name.append("sm"); break;
 		case 45: name.append("str"); break;
 		case 46: name.append("sh"); break;
 		case 47: name.append("th"); break;
 		case 48: name.append("tw"); break;
 		case 49: name.append("wr"); break;
 		case 50: name.append("sch"); break;
 		case 51: name.append("shr"); break;
 		case 52: name.append("sph"); break;
 		case 53: name.append("scr"); break;
 		case 54: name.append("spl"); break;
 		case 55: name.append("spr"); break;
 		case 56: name.append("squ"); break;
 		case 57: name.append("squ"); break;
 		
 		}
 		}
 		if (rannum3 == 1)
 		{
 			switch(rannum2)
 		
 	 		{
 	 		case 0: name.append("a"); break;
 	 		case 1: name.append("e"); break;
 	 		case 2: name.append("i"); break;
 	 		case 3: name.append("o"); break;
 	 		case 4: name.append("u"); break;
 	 		case 5: name.append("ai"); break;
 	 		case 6: name.append("ay"); break;
 	 		case 7: name.append("ea"); break;
 	 		case 8: name.append("ee"); break;
 	 		case 9: name.append("ey"); break;
 	 		case 10: name.append("ie"); break;
 	 		case 11: name.append("oa"); break;
 	 		case 12: name.append("oe"); break;
 	 		case 13: name.append("ow"); break;
 	 		
 	 		
 	 		}
 		}
 	}
 	return name.toString();
 }

public String getRandomJName(int numberofChars)
{
	//Generate a Japanese Style name!
	int a = numberofChars;
	int rannum = 0;
	StringBuffer name = new StringBuffer("");
	for(int i = 0; i< a; i++)
	{
		rannum = r.nextInt(104);
		switch(rannum)
		{
		case 0: name.append("a"); break;
		case 1: name.append("i"); break;
		case 2: name.append("u"); break;
		case 3: name.append("e"); break;
		case 4: name.append("o"); break;
		
		case 5: name.append("ka"); break;
		case 6: name.append("ki"); break;
		case 7: name.append("ku"); break;
		case 8: name.append("ke"); break;
		case 9: name.append("ko"); break;

		case 10: name.append("ga"); break;
		case 11: name.append("gi"); break;
		case 12: name.append("gu"); break;
		case 13: name.append("ge"); break;
		case 14: name.append("go"); break;
		
		case 15: name.append("sa"); break;
		case 16: name.append("shi"); break;
		case 17: name.append("su"); break;
		case 18: name.append("se"); break;
		case 19: name.append("so"); break;
		
		case 20: name.append("za"); break;
		case 21: name.append("ji"); break;
		case 22: name.append("zu"); break;
		case 23: name.append("ze"); break;
		case 24: name.append("zo"); break;
		
		case 25: name.append("ta"); break;
		case 26: name.append("chi"); break;
		case 27: name.append("tsu"); break;
		case 28: name.append("te"); break;
		case 29: name.append("to"); break;
		
		case 30: name.append("da"); break;
		case 31: name.append("ji"); break;
		case 32: name.append("zu"); break;
		case 33: name.append("de"); break;
		case 34: name.append("do"); break;
		
		case 35: name.append("na"); break;
		case 36: name.append("ni"); break;
		case 37: name.append("nu"); break;
		case 38: name.append("ne"); break;
		case 39: name.append("no"); break;
		
		case 40: name.append("ha"); break;
		case 41: name.append("hi"); break;
		case 42: name.append("fu"); break;
		case 43: name.append("he"); break;
		case 44: name.append("ho"); break;
		
		case 45: name.append("ba"); break;
		case 46: name.append("bi"); break;
		case 47: name.append("bu"); break;
		case 48: name.append("be"); break;
		case 49: name.append("bo"); break;
		
		case 50: name.append("pa"); break;
		case 51: name.append("pi"); break;
		case 52: name.append("pu"); break;
		case 53: name.append("pe"); break;
		case 54: name.append("po"); break;
		
		case 55: name.append("ma"); break;
		case 56: name.append("mi"); break;
		case 57: name.append("mu"); break;
		case 58: name.append("me"); break;
		case 59: name.append("mo"); break;
		
		case 60: name.append("ra"); break;
		case 61: name.append("ri"); break;
		case 62: name.append("ru"); break;
		case 63: name.append("re"); break;
		case 64: name.append("ro"); break;
		
		case 65: name.append("ya"); break;
		case 66: name.append("yu"); break;
		case 67: name.append("yo"); break;
		
		case 68: name.append("wa"); break;
		case 69: name.append("wu"); break;
		case 70: name.append("n"); break;
		
		case 71: name.append("kya"); break;
		case 72: name.append("kyu"); break;
		case 73: name.append("kyo"); break;
		
		case 74: name.append("gya"); break;
		case 75: name.append("gyu"); break;
		case 76: name.append("gyo"); break;
		
		case 77: name.append("sha"); break;
		case 78: name.append("shu"); break;
		case 79: name.append("sho"); break;
		
		case 80: name.append("ja"); break;
		case 81: name.append("ju"); break;
		case 82: name.append("jo"); break;
		
		case 83: name.append("cha"); break;
		case 84: name.append("chu"); break;
		case 85: name.append("cho"); break;
		
		case 86: name.append("nya"); break;
		case 87: name.append("nyu"); break;
		case 88: name.append("nyo"); break;
		
		case 89: name.append("hya"); break;
		case 90: name.append("hyu"); break;
		case 91: name.append("hyo"); break;
		
		case 92: name.append("bya"); break;
		case 93: name.append("byu"); break;
		case 94: name.append("byo"); break;
		
		case 95: name.append("pya"); break;
		case 96: name.append("pyu"); break;
		case 97: name.append("pyo"); break;
		
		case 98: name.append("mya"); break;
		case 99: name.append("myu"); break;
		case 100: name.append("myo"); break;
		
		case 101: name.append("rya"); break;
		case 102: name.append("ryu"); break;
		case 103: name.append("ryo"); break;
		
		}
	}
	return name.toString();
}

public String getPredefName(){
	
	int temp = r.nextInt(64);
	int howManyNames = 0;
	String name = new String("Default");
				try {
					s = new Scanner(f);
					//System.out.println("Found file");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Can't find the file for some reason");
					e.printStackTrace();
				}
			
			if (s != null)
			{
				s.useDelimiter("\\n+");
				if(s.hasNext())
				{
					for(int i = 0; i< 189; i ++)
					{
							PredefNames[i] = s.next();
							howManyNames ++;
							//System.out.println("Assigning names to array: " + PredefNames[i]);
						
					}
				}
				s.close();
			}
			
			switch(temp)
			{
			case 0: if(PredefNames[0] != null){name = PredefNames[0]; break;}
			case 1: if(PredefNames[1] != null){name = PredefNames[1]; break;}
			case 2: if(PredefNames[2] != null){name = PredefNames[2]; break;}
			case 3: if(PredefNames[3] != null){name = PredefNames[3]; break;}
			case 4: if(PredefNames[4] != null){name = PredefNames[4]; break;}
			case 5: if(PredefNames[5] != null){name = PredefNames[5]; break;}
			case 6: if(PredefNames[6] != null){name = PredefNames[6]; break;}
			case 7: if(PredefNames[7] != null){name = PredefNames[7]; break;}
			case 8: if(PredefNames[8] != null){name = PredefNames[8]; break;}
			case 9: if(PredefNames[9] != null){name = PredefNames[9]; break;}
			case 10: if(PredefNames[10] != null){name = PredefNames[10]; break;}
			case 11: if(PredefNames[11] != null){name = PredefNames[11]; break;}
			case 12: if(PredefNames[12] != null){name = PredefNames[12]; break;}
			case 13: if(PredefNames[13] != null){name = PredefNames[13]; break;}
			case 14: if(PredefNames[14] != null){name = PredefNames[14]; break;}
			case 15: if(PredefNames[15] != null){name = PredefNames[15]; break;}
			case 16: if(PredefNames[16] != null){name = PredefNames[16]; break;}
			case 17: if(PredefNames[17] != null){name = PredefNames[17]; break;}
			case 18: if(PredefNames[18] != null){name = PredefNames[18]; break;}
			case 19: if(PredefNames[19] != null){name = PredefNames[19]; break;}
			case 20: if(PredefNames[20] != null){name = PredefNames[20]; break;}
			case 21: if(PredefNames[21] != null){name = PredefNames[21]; break;}
			case 22: if(PredefNames[22] != null){name = PredefNames[22]; break;}
			case 23: if(PredefNames[23] != null){name = PredefNames[23]; break;}
			case 24: if(PredefNames[24] != null){name = PredefNames[24]; break;}
			case 25: if(PredefNames[25] != null){name = PredefNames[25]; break;}
			case 26: if(PredefNames[26] != null){name = PredefNames[26]; break;}
			case 27: if(PredefNames[27] != null){name = PredefNames[27]; break;}
			case 28: if(PredefNames[28] != null){name = PredefNames[28]; break;}
			case 29: if(PredefNames[29] != null){name = PredefNames[29]; break;}
			case 30: if(PredefNames[30] != null){name = PredefNames[30]; break;}
			case 31: if(PredefNames[31] != null){name = PredefNames[31]; break;}
			case 32: if(PredefNames[32] != null){name = PredefNames[32]; break;}
			case 33: if(PredefNames[33] != null){name = PredefNames[33]; break;}
			case 34: if(PredefNames[34] != null){name = PredefNames[34]; break;}
			case 35: if(PredefNames[35] != null){name = PredefNames[35]; break;}
			case 36: if(PredefNames[36] != null){name = PredefNames[36]; break;}
			case 37: if(PredefNames[37] != null){name = PredefNames[37]; break;}
			case 38: if(PredefNames[38] != null){name = PredefNames[38]; break;}
			case 39: if(PredefNames[39] != null){name = PredefNames[39]; break;}
			case 40: if(PredefNames[40] != null){name = PredefNames[40]; break;}
			case 41: if(PredefNames[41] != null){name = PredefNames[41]; break;}
			case 42: if(PredefNames[42] != null){name = PredefNames[42]; break;}
			case 43: if(PredefNames[43] != null){name = PredefNames[43]; break;}
			case 44: if(PredefNames[44] != null){name = PredefNames[44]; break;}
			case 45: if(PredefNames[45] != null){name = PredefNames[45]; break;}
			case 46: if(PredefNames[46] != null){name = PredefNames[46]; break;}
			case 47: if(PredefNames[47] != null){name = PredefNames[47]; break;}
			case 48: if(PredefNames[48] != null){name = PredefNames[48]; break;}
			case 49: if(PredefNames[49] != null){name = PredefNames[49]; break;}
			case 50: if(PredefNames[50] != null){name = PredefNames[50]; break;}
			case 51: if(PredefNames[51] != null){name = PredefNames[51]; break;}
			case 52: if(PredefNames[52] != null){name = PredefNames[52]; break;}
			case 53: if(PredefNames[53] != null){name = PredefNames[53]; break;}
			case 54: if(PredefNames[54] != null){name = PredefNames[54]; break;}
			case 55: if(PredefNames[55] != null){name = PredefNames[55]; break;}
			case 56: if(PredefNames[56] != null){name = PredefNames[56]; break;}
			case 57: if(PredefNames[57] != null){name = PredefNames[57]; break;}
			case 58: if(PredefNames[58] != null){name = PredefNames[58]; break;}
			case 59: if(PredefNames[59] != null){name = PredefNames[59]; break;}
			case 60: if(PredefNames[60] != null){name = PredefNames[60]; break;}
			case 61: if(PredefNames[61] != null){name = PredefNames[61]; break;}
			case 62: if(PredefNames[62] != null){name = PredefNames[62]; break;}
			case 63: if(PredefNames[63] != null){name = PredefNames[63]; break;}
			case 64: if(PredefNames[64] != null){name = PredefNames[64]; break;}
			case 65: if(PredefNames[65] != null){name = PredefNames[65]; break;}
			case 66: if(PredefNames[66] != null){name = PredefNames[66]; break;}
			case 67: if(PredefNames[67] != null){name = PredefNames[67]; break;}
			case 68: if(PredefNames[68] != null){name = PredefNames[68]; break;}
			case 69: if(PredefNames[69] != null){name = PredefNames[69]; break;}
			case 70: if(PredefNames[70] != null){name = PredefNames[70]; break;}
			case 71: if(PredefNames[71] != null){name = PredefNames[71]; break;}
			case 72: if(PredefNames[72] != null){name = PredefNames[72]; break;}
			case 73: if(PredefNames[73] != null){name = PredefNames[73]; break;}
			case 74: if(PredefNames[74] != null){name = PredefNames[74]; break;}
			case 75: if(PredefNames[75] != null){name = PredefNames[75]; break;}
			case 76: if(PredefNames[76] != null){name = PredefNames[76]; break;}
			case 77: if(PredefNames[77] != null){name = PredefNames[77]; break;}
			case 78: if(PredefNames[78] != null){name = PredefNames[78]; break;}
			case 79: if(PredefNames[79] != null){name = PredefNames[79]; break;}
			case 80: if(PredefNames[80] != null){name = PredefNames[80]; break;}
			case 81: if(PredefNames[81] != null){name = PredefNames[81]; break;}
			case 82: if(PredefNames[82] != null){name = PredefNames[82]; break;}
			case 83: if(PredefNames[83] != null){name = PredefNames[83]; break;}
			case 84: if(PredefNames[84] != null){name = PredefNames[84]; break;}
			case 85: if(PredefNames[85] != null){name = PredefNames[85]; break;}
			case 86: if(PredefNames[86] != null){name = PredefNames[86]; break;}
			case 87: if(PredefNames[87] != null){name = PredefNames[87]; break;}
			case 88: if(PredefNames[88] != null){name = PredefNames[88]; break;}
			case 89: if(PredefNames[89] != null){name = PredefNames[89]; break;}
			case 90: if(PredefNames[90] != null){name = PredefNames[90]; break;}
			case 91: if(PredefNames[91] != null){name = PredefNames[91]; break;}
			case 92: if(PredefNames[92] != null){name = PredefNames[92]; break;}
			case 93: if(PredefNames[93] != null){name = PredefNames[93]; break;}
			case 94: if(PredefNames[94] != null){name = PredefNames[94]; break;}
			case 95: if(PredefNames[95] != null){name = PredefNames[95]; break;}
			case 96: if(PredefNames[96] != null){name = PredefNames[96]; break;}
			case 97: if(PredefNames[97] != null){name = PredefNames[97]; break;}
			case 98: if(PredefNames[98] != null){name = PredefNames[98]; break;}
			case 99: if(PredefNames[99] != null){name = PredefNames[99]; break;}
			case 100: if(PredefNames[100] != null){name = PredefNames[100]; break;}
			case 101: if(PredefNames[101] != null){name = PredefNames[101]; break;}
			case 102: if(PredefNames[102] != null){name = PredefNames[102]; break;}
			case 103: if(PredefNames[103] != null){name = PredefNames[103]; break;}
			case 104: if(PredefNames[104] != null){name = PredefNames[104]; break;}
			case 105: if(PredefNames[105] != null){name = PredefNames[105]; break;}
			case 106: if(PredefNames[106] != null){name = PredefNames[106]; break;}
			case 107: if(PredefNames[107] != null){name = PredefNames[107]; break;}
			case 108: if(PredefNames[108] != null){name = PredefNames[108]; break;}
			case 109: if(PredefNames[109] != null){name = PredefNames[109]; break;}
			case 110: if(PredefNames[110] != null){name = PredefNames[110]; break;}
			case 111: if(PredefNames[111] != null){name = PredefNames[111]; break;}
			case 112: if(PredefNames[112] != null){name = PredefNames[112]; break;}
			case 113: if(PredefNames[113] != null){name = PredefNames[113]; break;}
			case 114: if(PredefNames[114] != null){name = PredefNames[114]; break;}
			case 115: if(PredefNames[115] != null){name = PredefNames[115]; break;}
			case 116: if(PredefNames[116] != null){name = PredefNames[116]; break;}
			case 117: if(PredefNames[117] != null){name = PredefNames[117]; break;}
			case 118: if(PredefNames[118] != null){name = PredefNames[118]; break;}
			case 119: if(PredefNames[119] != null){name = PredefNames[119]; break;}
			case 120: if(PredefNames[120] != null){name = PredefNames[120]; break;}
			case 121: if(PredefNames[121] != null){name = PredefNames[121]; break;}
			case 122: if(PredefNames[122] != null){name = PredefNames[122]; break;}
			case 123: if(PredefNames[123] != null){name = PredefNames[123]; break;}
			case 124: if(PredefNames[124] != null){name = PredefNames[124]; break;}
			case 125: if(PredefNames[125] != null){name = PredefNames[125]; break;}
			case 126: if(PredefNames[126] != null){name = PredefNames[126]; break;}
			case 127: if(PredefNames[127] != null){name = PredefNames[127]; break;}
			case 128: if(PredefNames[128] != null){name = PredefNames[128]; break;}
			case 129: if(PredefNames[129] != null){name = PredefNames[129]; break;}
			case 130: if(PredefNames[130] != null){name = PredefNames[130]; break;}
			case 131: if(PredefNames[131] != null){name = PredefNames[131]; break;}
			case 132: if(PredefNames[132] != null){name = PredefNames[132]; break;}
			case 133: if(PredefNames[133] != null){name = PredefNames[133]; break;}
			case 134: if(PredefNames[134] != null){name = PredefNames[134]; break;}
			case 135: if(PredefNames[135] != null){name = PredefNames[135]; break;}
			case 136: if(PredefNames[136] != null){name = PredefNames[136]; break;}
			case 137: if(PredefNames[137] != null){name = PredefNames[137]; break;}
			case 138: if(PredefNames[138] != null){name = PredefNames[138]; break;}
			case 139: if(PredefNames[139] != null){name = PredefNames[139]; break;}
			case 140: if(PredefNames[140] != null){name = PredefNames[140]; break;}
			case 141: if(PredefNames[141] != null){name = PredefNames[141]; break;}
			case 142: if(PredefNames[142] != null){name = PredefNames[142]; break;}
			case 143: if(PredefNames[143] != null){name = PredefNames[143]; break;}
			case 144: if(PredefNames[144] != null){name = PredefNames[144]; break;}
			case 145: if(PredefNames[145] != null){name = PredefNames[145]; break;}
			case 146: if(PredefNames[146] != null){name = PredefNames[146]; break;}
			case 147: if(PredefNames[147] != null){name = PredefNames[147]; break;}
			case 148: if(PredefNames[148] != null){name = PredefNames[148]; break;}
			case 149: if(PredefNames[149] != null){name = PredefNames[149]; break;}
			case 150: if(PredefNames[150] != null){name = PredefNames[150]; break;}
			case 151: if(PredefNames[151] != null){name = PredefNames[151]; break;}
			case 152: if(PredefNames[152] != null){name = PredefNames[152]; break;}
			case 153: if(PredefNames[153] != null){name = PredefNames[153]; break;}
			case 154: if(PredefNames[154] != null){name = PredefNames[154]; break;}
			case 155: if(PredefNames[155] != null){name = PredefNames[155]; break;}
			case 156: if(PredefNames[156] != null){name = PredefNames[156]; break;}
			case 157: if(PredefNames[157] != null){name = PredefNames[157]; break;}
			case 158: if(PredefNames[158] != null){name = PredefNames[158]; break;}
			case 159: if(PredefNames[159] != null){name = PredefNames[159]; break;}
			case 160: if(PredefNames[160] != null){name = PredefNames[160]; break;}
			case 161: if(PredefNames[161] != null){name = PredefNames[161]; break;}
			case 162: if(PredefNames[162] != null){name = PredefNames[162]; break;}
			case 163: if(PredefNames[163] != null){name = PredefNames[163]; break;}
			case 164: if(PredefNames[164] != null){name = PredefNames[164]; break;}
			case 165: if(PredefNames[165] != null){name = PredefNames[165]; break;}
			case 166: if(PredefNames[166] != null){name = PredefNames[166]; break;}
			case 167: if(PredefNames[167] != null){name = PredefNames[167]; break;}
			case 168: if(PredefNames[168] != null){name = PredefNames[168]; break;}
			case 169: if(PredefNames[169] != null){name = PredefNames[169]; break;}
			case 170: if(PredefNames[170] != null){name = PredefNames[170]; break;}
			case 171: if(PredefNames[171] != null){name = PredefNames[171]; break;}
			case 172: if(PredefNames[172] != null){name = PredefNames[172]; break;}
			case 173: if(PredefNames[173] != null){name = PredefNames[173]; break;}
			case 174: if(PredefNames[174] != null){name = PredefNames[174]; break;}
			case 175: if(PredefNames[175] != null){name = PredefNames[175]; break;}
			case 176: if(PredefNames[176] != null){name = PredefNames[176]; break;}
			case 177: if(PredefNames[177] != null){name = PredefNames[177]; break;}
			case 178: if(PredefNames[178] != null){name = PredefNames[178]; break;}
			case 179: if(PredefNames[179] != null){name = PredefNames[179]; break;}
			case 180: if(PredefNames[180] != null){name = PredefNames[180]; break;}
			case 181: if(PredefNames[181] != null){name = PredefNames[181]; break;}
			case 182: if(PredefNames[182] != null){name = PredefNames[182]; break;}
			case 183: if(PredefNames[183] != null){name = PredefNames[183]; break;}
			case 184: if(PredefNames[184] != null){name = PredefNames[184]; break;}
			case 185: if(PredefNames[185] != null){name = PredefNames[185]; break;}
			case 186: if(PredefNames[186] != null){name = PredefNames[186]; break;}
			case 187: if(PredefNames[187] != null){name = PredefNames[187]; break;}
			case 188: if(PredefNames[188] != null){name = PredefNames[188]; break;}
			case 189: if(PredefNames[189] != null){name = PredefNames[189]; break;}
				
			}
	
	return name;
}

}

