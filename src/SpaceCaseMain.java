import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javafx.embed.swing.JFXPanel;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GLContext;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

import org.newdawn.slick.Input;

import de.matthiasmann.twl.GUI;
import de.matthiasmann.twl.renderer.lwjgl.LWJGLRenderer;
import de.matthiasmann.twl.theme.ThemeManager;

public class SpaceCaseMain extends StateBasedGame implements Game, KeyListener{

	static SpaceCaseMain scm;
    static LWJGLRenderer renderer;
	static ThemeManager theme;
	static Input i;
	static GUI gooey;
	static int width = 800;
	static int height = 600;
	
	public SpaceCaseMain(String title) 
	{
		super(title);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = screenSize.width;
		height = screenSize.height;
		// JFX panel is needed to make JFX sounds work. it doesn't actually do anything other than that!
		JFXPanel fxPanel = new JFXPanel();
		fxPanel.isValid();
		// TODO Auto-generated constructor stub
	}
	
	public SpaceCaseMain(String title, int w, int h) 
	{
		super(title);
		width = w;
		height = h;
		
		// JFX panel is needed to make JFX sounds work. it doesn't actually do anything other than that!
		JFXPanel fxPanel = new JFXPanel();
		fxPanel.isValid();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		scm = new SpaceCaseMain("SpaceCase Test!");
		
		
		try {
			//Display.setDisplayMode(new DisplayMode(1366, 768));
	        Display.setTitle("SpaceCase ver 0.01");
	        Display.setVSyncEnabled(true);
			Display.create();
		} catch (LWJGLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		 
		
		try {
		
			renderer = new LWJGLRenderer();
		} catch (LWJGLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		 try {
			GLContext.useContext(scm);
			//GLContext.useContext(Display.getDrawable());
		} catch (LWJGLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
	
		try {
			theme = ThemeManager.createThemeManager(SpaceCaseMain.class.getResource("gameui.xml"), renderer);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Failed to load gameui.xml");
			e1.printStackTrace();
		}
		gooey = new GUI(renderer);
		gooey.applyTheme(theme);
		//i = dbz.getContainer().getInput();
		//go to main menu, new game, load game, settings
		
		try {//try to start game.
			
AppGameContainer container = new AppGameContainer(scm, scm.getWidth(), scm.getHeight(),true);
              AppGameContainer.enableSharedContext();
          container.start();
	     } 
		  catch (SlickException e) 
		     {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            System.out.println("sc isnt initialized yet?");
	           }
		
		scm.enterState(0, new FadeOutTransition(Color.white), new FadeInTransition(Color.white));

	}

	public boolean closeRequested() {
		// TODO Auto-generated method stub
		System.out.println("Buh-bye!");
		System.exit(0);
		return false;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}


	public void initStatesList(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		addState(new devScreenState());
		addState(new mainMenuState());
		addState(new mainGameEngine());
		
	}
	
	public LWJGLRenderer getRenderer()
	{
		return renderer;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}

	

	
}
