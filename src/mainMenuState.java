import java.awt.Font;
import java.io.InputStream;
import java.util.Random;

import javafx.embed.swing.JFXPanel;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.util.ResourceLoader;


public class mainMenuState extends BasicGameState implements KeyListener, MouseListener{

	Input i; //Get reference to instance of Input
	GameContainer gc;
	StateBasedGame og;
	String message = new String("TEST");
	boolean showMsg = false;
    TrueTypeFont comicNReg;
    TrueTypeFont comicNBold;
    TrueTypeFont comicNLight;
    String NewGame;
    String LoadGame;
    String Mods;
    String Config;
    String Quit;
    String WhatsSelected;
    int selectedMI;
    Color Flasher;
    Random randomGenerator = new Random();
    int transWaitTime = 100;
    boolean itemIsSelected = false;
    

	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		
		// JFX panel is needed to make JFX sounds work. it doesn't actually do anything other than that!
		JFXPanel fxPanel = new JFXPanel();
		fxPanel.isValid();
		
		// TODO Auto-generated method stub
		gc = container;
		og = game;
		i = container.getInput();
		
		try {
			InputStream inputStream = ResourceLoader.getResourceAsStream("Comic Neue/ComicNeue-Regular.ttf");
			InputStream inputStream2 = ResourceLoader.getResourceAsStream("Comic Neue/ComicNeue-Bold.ttf");
			InputStream inputStream3 = ResourceLoader.getResourceAsStream("Comic Neue/ComicNeue-Light.ttf");
			 
			Font awtFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
			awtFont = awtFont.deriveFont(24f); // set font size
			
			Font awtFont2 = Font.createFont(Font.TRUETYPE_FONT, inputStream2);
			awtFont2 = awtFont2.deriveFont(54f); // set font size
			
			Font awtFont3 = Font.createFont(Font.TRUETYPE_FONT, inputStream3);
			awtFont3 = awtFont3.deriveFont(24f); // set font size
			
			
			comicNReg = new TrueTypeFont(awtFont, true);
			comicNBold = new TrueTypeFont(awtFont2, true);
			comicNLight = new TrueTypeFont(awtFont3, true);
			
			} catch (Exception e) {
			e.printStackTrace();
			}  

	    NewGame = new String("New Game");
	    LoadGame = new String("Load");
	    Mods = new String("Mods");
	    Config = new String("Config");
	    Quit = new String("Quit");
	    WhatsSelected = new String("New Game");
	    selectedMI = 0;
		
	    Flasher = new Color(Color.white);
	}

	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		//if(showMsg)
		   //{
		//g.drawString(message, 400, 400);
		//gc.sleep(1000);
		//showMsg = false;
        //   }
		//else{g.drawString("No Keys Hit!", 400, 400);}
		
		//g.scale(1.2f,1.2f);
		//int copySelectedMI = selectedMI;
		comicNBold.drawString(400f, 150f, "SpaceCase", Color.white);
		//comicNBold.drawString(500f, 600f, WhatsSelected, Color.white);
		//comicNBold.drawString(500f, 640f, String.valueOf(copySelectedMI), Color.white);
		
		if (WhatsSelected == "New Game")
		{

			comicNReg.drawString(500f, 250f, NewGame, Flasher);
		}
		else
		{
			comicNReg.drawString(500f, 250f, NewGame, Color.white);
		}
		
		if (WhatsSelected == "Load")
		{

			comicNReg.drawString(500f, 300f, LoadGame, Flasher);
		}
		else
		{
			comicNReg.drawString(500f, 300f, LoadGame, Color.white);
		}
		
		if (WhatsSelected == "Mods")
		{

			comicNReg.drawString(500f, 350f, Mods, Flasher);
		}
		else
		{
			comicNReg.drawString(500f, 350f, Mods, Color.white);
		}
		
		if (WhatsSelected == "Config")
		{

			comicNReg.drawString(500f, 400f, Config, Flasher);
		}
		else
		{
			comicNReg.drawString(500f, 400f, Config, Color.white);
		}
		
		if (WhatsSelected == "Quit")
		{

			comicNReg.drawString(500f, 450f, Quit, Flasher);
		}
		else
		{
			comicNReg.drawString(500f, 450f, Quit, Color.white);
		}
		
}

	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		// TODO Auto-generated method stub

		// int waitTime = transWaitTime +delta;
		//what to do on menu item selection should go here
		switch (selectedMI) {
        case 0:
       	    WhatsSelected = "New Game";	
       	if (itemIsSelected == true)
       	{
       		i.removeKeyListener(this);
       		og.enterState(2,  new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
       	    
       	} 
       	break;
        case 1:
       	    WhatsSelected = "Load";
        	if (itemIsSelected == true)
        	{
        	//i.addKeyListener(this);
        	}
            break;
       	    
       	    //start game loading algorithm
           
        case 2:
       	    WhatsSelected = "Mods";
        	if (itemIsSelected == true)
        	{
        	//i.addKeyListener(this);
        	}
            break;
       	    
       	    //open menu to manage Mods
        case 3:
       	    WhatsSelected = "Config";
        	if (itemIsSelected == true)
        	{
        	//i.addKeyListener(this);
        	}
            break;
       	    
       	    //open config menu
        case 4:
       	    WhatsSelected = "Quit";
       	    //exit the game, maybe give a message
  			 while (itemIsSelected == true)
  			 {
       	      //if(delta >= waitTime)
       	      //  {
	       	         itemIsSelected = false;
	       		     gc.exit();
	       		     System.out.println("Are we Exited?"+ "\n");
	                 break;
       	       // }
  			 }
            break;
        default: 
       	    //selectedMI = 0;
            break;
    }

		

        int red = randomGenerator.nextInt(255);
        int green = randomGenerator.nextInt(255);
        int blue = randomGenerator.nextInt(255);
        Flasher = new Color(red,green,blue);
		
       
       /* if (i.isKeyDown(Input.KEY_DOWN)) 
        {
        	selectedMI +=1;
        	if (selectedMI >=5)
        	{
        		selectedMI = 0;
        	} 
        }
        if (i.isKeyDown(Input.KEY_UP)) 
        {
        	selectedMI -=1;
        	if (selectedMI < 0)
        	{
        		selectedMI = 4;
        	}
        }
         */
		
}
	
	
	 public void keyPressed(int key, char c)
{
		// message = "Key " + String.valueOf(c) + " was pressed!";
		//showMsg = true; 
		 if(key == Input.KEY_ESCAPE)
		 {
			 gc.exit();
		 }

		 if(key == Input.KEY_SPACE)
		 { 
			 itemIsSelected = false;
  			 //i.addKeyListener(this);
		 }
		 
	if (itemIsSelected == false)	
	{
		 if(key == Input.KEY_SPACE)
		 { 
	     
		 }
		 
		 if(key == Input.KEY_UP)
		 {
			 switch (selectedMI) {
		        case 0:
		        selectedMI = 4;
		       	break;
		       	
		        case 1:
			    selectedMI = 0;
		        break;
		        
		        case 2:
			    selectedMI = 1;
		        break;
		       	    
		        case 3:
		        selectedMI = 2;
		        break;
		       	    
		        case 4:
		        selectedMI = 3;
		        break;
		        
		        default: 
		        selectedMI = 0;
		        break;
		    }
			 //System.out.println(String.valueOf(selectedMI));
		 }
		 
		 if(key == Input.KEY_DOWN)
		 {

			 switch (selectedMI) {
		        case 0:
		        selectedMI = 1;
		       	break;
		       	
		        case 1:
			    selectedMI = 2;
		        break;
		        
		        case 2:
			    selectedMI = 3;
		        break;
		       	    
		        case 3:
		        selectedMI = 4;
		        break;
		       	    
		        case 4:
		        selectedMI = 0;
		        break;
		        
		        default: 
		        selectedMI = 0;
		        break;
		    }
			 //System.out.println(String.valueOf(selectedMI));
		 }
		 if(key == Input.KEY_LEFT)
		 {
			 if (selectedMI >= 0)
			 { 
				 selectedMI -=1;
		     }
			 if (selectedMI < 0)
			 {
				 selectedMI = 4;
			 }
		 }
		 
		 if(key == Input.KEY_RIGHT)
		 {
			 if (selectedMI <5)
			 {
				 selectedMI +=1;
			 }
			 if (selectedMI >= 5)
			 {
				 selectedMI = 0;
			 }
		 }

		 if(key == Input.KEY_ENTER)
		 {
			 itemIsSelected = true;
			 //i.removeKeyListener(this);
		 }
		 
		 
	}//end if ItemIsSelected == false	 
}
	
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}



}
