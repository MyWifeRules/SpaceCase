import static org.lwjgl.opengl.GL11.GL_DEPTH_TEST;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

import javafx.embed.swing.JFXPanel;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.ResourceLoader;
import org.lwjgl.util.glu.Sphere;

import de.matthiasmann.twl.renderer.lwjgl.LWJGLRenderer;

public class mainGameEngine extends BasicGameState implements KeyListener, MouseListener{

	/*
	 * I still need to change this class to use fpsCamera for movement, and translate cubes using
	 * tesseract methods rather than manually. need to change opengl methods to use face class 
	 * methods for texture and vertex locations.
	 * 
	 * 
	 */
	
	/** position of quad */
	float x = 0, y = 0, z = 0;
	/** angle of quad rotation */
	float rotation = 0;
	fpsCamera firstPlayer = new fpsCamera(x,y,z);
	/** time at last frame */
	long lastFrame;
	
	/** frames per second */
	int fps;
	/** last fps time */
	long lastFPS;

	Input i; //Get reference to instance of Input
	StateBasedGame og;
	static GameContainer gc;
    static LWJGLRenderer renderer;
    boolean running = false;
    static SoundManager sm;
    tessaract testie = new tessaract("Bedrock", 0,0,0,1);
    Texture test1;
    TrueTypeFont testx, testy, testz;
    String xpos,ypos,zpos;
    Sphere sTest;
	Mouse mouse;
    tessaract testicle = new tessaract(TessaractType.Bedrock,0,0,0,0,0);
    
    /*public static void main(String[] argv) {
		mainGameEngine mainGameEngine = new mainGameEngine();
		mainGameEngine.start();
	}*/
	
	public void start() {
      
	  running = true;
      System.out.print("MGE Started"+ getTime() + "\n");
      
      sm = new SoundManager();
      sm.testingPlay();
      //test sounds
      
      
		 try {
			GLContext.useContext(gc);
		} catch (LWJGLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		initGL(); // init OpenGL
		getDelta(); // call once before loop to initialise lastFrame
		lastFPS = getTime(); // call before loop to initialise fps timer

		 i.addKeyListener(this);
		 
		if (running == true)
		{
		while (!Display.isCloseRequested()) {
			int delta = getDelta();
			
			update(delta);
			renderGL();

			Display.update();
			Display.sync(60); // cap fps to 60fps
		}
// this block interferes with every other state for some reason
		Display.destroy();
		}
	}
	
	public void update(int delta) {
		// rotate quad
		//rotation += 0.15f * delta;
	/*	if (Keyboard.isKeyDown(Keyboard.KEY_W))	z += 0.05f * delta;
		if (Keyboard.isKeyDown(Keyboard.KEY_A))	rotation += 0.05f * delta;
		if (Keyboard.isKeyDown(Keyboard.KEY_S))	z -= 0.05f * delta;
		if (Keyboard.isKeyDown(Keyboard.KEY_D))	rotation -= 0.05f * delta;
		*/
		if (Keyboard.isKeyDown(Keyboard.KEY_W))	firstPlayer.walkForward(0.05f * delta);;
		if (Keyboard.isKeyDown(Keyboard.KEY_A))	firstPlayer.yaw(0.05f * delta);
		if (Keyboard.isKeyDown(Keyboard.KEY_S))	firstPlayer.walkBackwards(-0.05f * delta);
		if (Keyboard.isKeyDown(Keyboard.KEY_D))	firstPlayer.yaw(-0.05f * delta);
		
		if (Keyboard.isKeyDown(Keyboard.KEY_LEFT)) firstPlayer.strafeLeft(-0.01f * delta);
		if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) firstPlayer.strafeRight(0.01f * delta);
		if (Keyboard.isKeyDown(Keyboard.KEY_UP)) firstPlayer.flyUp(0.01f * delta);
		if (Keyboard.isKeyDown(Keyboard.KEY_DOWN)) firstPlayer.flyDown(0.01f * delta);

		if (Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {quitGame();}

		if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) 
		{
			System.out.println("x = " + firstPlayer.getPosition().x);
			System.out.println("y = " + firstPlayer.getPosition().y);
			System.out.println("z = " + firstPlayer.getPosition().x);
			System.out.println("Rotation = " + rotation);
			
		}

		
		// keep quad on the screen
		/*if (x < 0) x = 0;
		if (x > 1600) x = 1599;
		if (y < 0) y = 0;
		if (y > 900) y = 899;*/
		
		updateFPS(); // update FPS Counter
	}
	
	/** 
	 * Calculate how many milliseconds have passed 
	 * since last frame.
	 * 
	 * @return milliseconds passed since last frame 
	 */
	public int getDelta() {
	    long time = getTime();
	    int delta = (int) (time - lastFrame);
	    lastFrame = time;
	 
	    return delta;
	}
	
	/**
	 * Get the accurate system time
	 * 
	 * @return The system time in milliseconds
	 */
	public long getTime() {
	    return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}
	
	/**
	 * Calculate the FPS and set it in the title bar
	 */
	public void updateFPS() {
		if (getTime() - lastFPS > 1000) {
			Display.setTitle("FPS: " + fps);
			fps = 0;
			lastFPS += 1000;
		}
		fps++;
	}
	
	public void initGL() {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GLU.gluPerspective(90.0f, 1600f/900f, 0.1f, 500f);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glEnable(GL_DEPTH_TEST);
		GL11.glLoadIdentity();
	}

	public void renderGL() {
		xpos = Float.toString(firstPlayer.getPosition().x);
		ypos = Float.toString(firstPlayer.getPosition().y);
		zpos = Float.toString(firstPlayer.getPosition().z);
		
		
		GL11.glEnable(GL11.GL_TEXTURE_2D);//enable textures
		test1.bind();//bind our test texture
		// Clear The Screen And The Depth Buffer
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

		// R,G,B,A Set The Color To Blue One Time Only
		GL11.glColor3f(1.0f, 1.0f, 1.0f);
		GL11.glLoadIdentity();
		GL11.glTranslatef(firstPlayer.getPosition().x, firstPlayer.getPosition().y,-10.0f);
		GL11.glRotatef(firstPlayer.getYaw(), 0f, 1f, 0f);
		// draw quad
		GL11.glPushMatrix();
		
		testicle.setPosition(firstPlayer.getPosition().x, firstPlayer.getPosition().y, firstPlayer.getPosition().z, firstPlayer.getPitch());
		
		//RENDER ENGINE GOES HERE!
		
		
			/*This is the old direct render.
			 * GL11.glBegin(GL11.GL_QUADS);
			
			    GL11.glTexCoord2f(0, 0); // top left
				GL11.glVertex3f(firstPlayer.getPosition().x - 1, firstPlayer.getPosition().y - 1,firstPlayer.getPosition().z);
			    
                GL11.glTexCoord2f(0, 1); // bottom left 
				GL11.glVertex3f(firstPlayer.getPosition().x + 1, firstPlayer.getPosition().y - 1,firstPlayer.getPosition().z);
                
                GL11.glTexCoord2f(1, 1); // bottom right
				GL11.glVertex3f(firstPlayer.getPosition().x + 1, firstPlayer.getPosition().y + 1,firstPlayer.getPosition().z);
                
                GL11.glTexCoord2f(1, 0); // top right
				GL11.glVertex3f(firstPlayer.getPosition().x - 1, firstPlayer.getPosition().y + 1,firstPlayer.getPosition().z);
                //end face front
			
				GL11.glEnd();
			
			GL11.glBegin(GL11.GL_QUADS);
			
		    GL11.glTexCoord2f(0, 0); // top left
			GL11.glVertex3f(x - 1, y - 1,z-2);
		    
            GL11.glTexCoord2f(0, 1); // bottom left 
			GL11.glVertex3f(x + 1, y - 1,z-2);
            
            GL11.glTexCoord2f(1, 1); // bottom right
			GL11.glVertex3f(x + 1, y + 1,z-2);
            
            GL11.glTexCoord2f(1, 0); // top right
			GL11.glVertex3f(x - 1, y + 1,z-2);
            //end face back
			GL11.glEnd();
			
GL11.glBegin(GL11.GL_QUADS);
			
		    GL11.glTexCoord2f(0, 0); // top left
			GL11.glVertex3f(x - 1, y + 1,z-2);
		    
            GL11.glTexCoord2f(0, 1); // bottom left 
			GL11.glVertex3f(x + 1, y + 1,z-2);
            
            GL11.glTexCoord2f(1, 1); // bottom right
			GL11.glVertex3f(x + 1, y + 1,z);
            
            GL11.glTexCoord2f(1, 0); // top right
			GL11.glVertex3f(x - 1, y + 1,z);
            //end face top
			GL11.glEnd();
			

GL11.glBegin(GL11.GL_QUADS);
			
		    GL11.glTexCoord2f(0, 0); // top left
			GL11.glVertex3f(x - 1, y - 1,z-2);
		    
            GL11.glTexCoord2f(0, 1); // bottom left 
			GL11.glVertex3f(x + 1, y - 1,z-2);
            
            GL11.glTexCoord2f(1, 1); // bottom right
			GL11.glVertex3f(x + 1, y - 1,z);
            
            GL11.glTexCoord2f(1, 0); // top right
			GL11.glVertex3f(x - 1, y - 1,z);
            //end face bottom
			GL11.glEnd();
			

GL11.glBegin(GL11.GL_QUADS);

			GL11.glTexCoord2f(0, 0); // top left
			GL11.glVertex3f(x - 1, y + 1,z-2);

			GL11.glTexCoord2f(0, 1); // bottom left 
			GL11.glVertex3f(x - 1, y + 1,z);

			GL11.glTexCoord2f(1, 1); // bottom right
			GL11.glVertex3f(x - 1, y - 1,z);

			GL11.glTexCoord2f(1, 0); // top right
			GL11.glVertex3f(x - 1, y - 1,z-2);
            //end face left
			GL11.glEnd();

			
GL11.glBegin(GL11.GL_QUADS);

			GL11.glTexCoord2f(0, 0); // top left
			GL11.glVertex3f(x + 1, y + 1,z-2);

			GL11.glTexCoord2f(0, 1); // bottom left 
			GL11.glVertex3f(x + 1, y + 1,z);

			GL11.glTexCoord2f(1, 1); // bottom right
			GL11.glVertex3f(x + 1, y - 1,z);

			GL11.glTexCoord2f(1, 0); // top right
			GL11.glVertex3f(x + 1, y - 1,z-2);
            //end face 
			GL11.glEnd();
			
			
		GL11.glPopMatrix();

		*/

		testx.drawString(100, 100, xpos, Color.white);
		testy.drawString(100, 120, ypos, Color.white);
		testz.drawString(100,140,zpos,Color.white);
	}

	@Override
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {		
		
		// JFX panel is needed to make JFX sounds work. it doesn't actually do anything other than that!
		JFXPanel fxPanel = new JFXPanel();
		fxPanel.isValid();
		
		InputStream inputStream = ResourceLoader.getResourceAsStream("Comic Neue/ComicNeue-Regular.ttf");
		Font awtFont = null;
	  try {
			awtFont = Font.createFont(Font.TRUETYPE_FONT, inputStream);
		} catch (FontFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	  
		testx = new TrueTypeFont(awtFont,true);
		testy= new TrueTypeFont(awtFont,true);
		testz = new TrueTypeFont(awtFont, true);
		
		xpos = "0";
		ypos = "0";
		zpos = "0";
	   
	    sTest = new Sphere();
		og = game;
		gc = container;
		i = container.getInput();
		try {
			test1 = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("resources/textures/netherrack.png"));
		} catch (IOException e) {
			System.out.println("Texture STONE Failed to load for some reason..."+ getTime() + "\n");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      System.out.print("MGE init'ed "+ getTime() + "\n");
		try {
			mouse.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		renderGL();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		update(delta);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 2;
	}
	
	 public void keyPressed(int key, char c)
	 {

	      System.out.print("MGE keypress detected! "+ getTime() + "\n");
		 if(key == Input.KEY_ESCAPE)
		 {
			 System.out.print("Did we exit gracefully? "+ getTime() + "\n");
			 running = false;
			 sm.testingStop();
			 System.exit(0);
			 gc.exit();
		 }
		 
		 
		 
	 }//end keypressed

	 public void quitGame()
	 {
         i.removeAllListeners();
		 System.out.print("Did we exit gracefully? "+ getTime() + "\n");
		 running = false;
		 sm.testingStop();
		 System.exit(0);
		 gc.exit();
	 }
	 
	public void enter(GameContainer container, StateBasedGame game)
			throws SlickException
	{
		start();
	}
	
}//end class