import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

public class fpsCamera {

	private Vector3f position = null;
	//y axis
	private float yaw = 0.0f;
	//x axis
	private float pitch = 0.0f;
	
	public fpsCamera(float x, float y, float z){
		position = new Vector3f(x,y,z);
	}
	
	public fpsCamera(){
		position = new Vector3f(0,0,0);
	}
	
	public void yaw(float amount){
		yaw += amount;
	}
	
	public void pitch(float amount){
		pitch += amount;
	}
	
	public void walkForward(float distance){
		position.x -= distance * (float)Math.sin(Math.toRadians(yaw));
	    position.z += distance * (float)Math.cos(Math.toRadians(yaw));
	
	}
	
	public void walkBackwards(float distance){
		position.x += distance * (float)Math.sin(Math.toRadians(yaw));
	    position.z -= distance * (float)Math.cos(Math.toRadians(yaw));
		
	}
	
	public void strafeLeft(float distance){
		position.x -= distance * (float)Math.sin(Math.toRadians(yaw-90));
	    position.z += distance * (float)Math.cos(Math.toRadians(yaw-90));
		
	}
	
	public void strafeRight(float distance){
		position.x -= distance * (float)Math.sin(Math.toRadians(yaw+90));
	    position.z += distance * (float)Math.cos(Math.toRadians(yaw+90));
		
		
	}
	
	public void flyUp(float distance){
		position.y += distance * (float)Math.sin(Math.toRadians(yaw));
	}
	
	public void flyDown(float distance){
		position.y -= distance * (float)Math.sin(Math.toRadians(yaw));
	}
	
	public Vector3f getPosition(){
		if (position != null ){
			return position;
		}else{
			return new Vector3f(0,0,0);
		}
	}
	
	public float getYaw(){
		return yaw;
	}
	
	public float getPitch(){
	return pitch;
	}
	
	
	
	
	
	
	
}//end class