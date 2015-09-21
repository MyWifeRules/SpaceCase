import javafx.embed.swing.JFXPanel;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;


public class devScreenState extends BasicGameState implements KeyListener{

	Image devImage;
	Input i; //Get reference to instance of Input
	StateBasedGame og;
	GameContainer gc;
	  
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		// TODO Auto-generated method stub

		
		// JFX panel is needed to make JFX sounds work. it doesn't actually do anything other than that!
		JFXPanel fxPanel = new JFXPanel();
		fxPanel.isValid();
		
		og = game;
		gc = container;
		devImage = new Image("tpg.png");
		devImage = devImage.getScaledCopy(gc.getScreenWidth(), gc.getHeight());
		i = container.getInput();
		i.addKeyListener(this);
	}

	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		g.drawImage(devImage, 0, 0);

	}

	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		// TODO Auto-generated method stub

	}

	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}
 public void keyPressed(int key, char c)
  {
	 //System.out.println("A key was pressed! " + String.valueOf(c));
	 if(key == Input.KEY_ESCAPE)
	 {
		 gc.exit();
	 }
	 
	 //if(key == Input.KEY_SPACE)
	 //{
	//	 og.enterState(1,  new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
	// i.removeKeyListener(this);
	// }
	 i.removeKeyListener(this);
	 og.enterState(1,  new FadeOutTransition(Color.white), new FadeInTransition(Color.black));

  
  }
 
 @Override
 public boolean isAcceptingInput() {
     return true;
 }
 
}//end class