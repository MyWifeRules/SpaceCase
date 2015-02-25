import java.io.File;
import java.util.Random;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class SoundManager 

{
	Random ran = new Random();
	Media med1 = new Media(new File("resources/music/admiralbob77_-_The_Broken.mp3").toURI().toString());
	Media med2 = new Media(new File("resources/music/doxent_-_Forgotten_Land.mp3").toURI().toString());
	Media med3 = new Media(new File("resources/music/duncan_beattie_-_sevenhundredbeats.mp3").toURI().toString());
	Media med4 = new Media(new File("resources/music/Essa - Loop 7.wav").toURI().toString());
	Media med5 = new Media(new File("resources/music/flatwound_-_The_Long_Goodbye.mp3").toURI().toString());
	Media med6 = new Media(new File("resources/music/grapes_-_I_dunno.mp3").toURI().toString());
	Media med7 = new Media(new File("resources/music/gurdonark_-_Emergence_Sci_Fi_Mid-Tempo_Pack.mp3").toURI().toString());
	Media med8 = new Media(new File("resources/music/Kevin Pellegrini - Dark Ambient.wav").toURI().toString());
	Media med9 = new Media(new File("resources/music/Melotone - Ambient Melody In G Major 120 BPM.wav").toURI().toString());
	Media med10 = new Media(new File("resources/music/morgantj_-_The_Right_Voice_(MorganTJ_Whirlwind_Remix).mp3").toURI().toString());
	Media med11 = new Media(new File("resources/music/onlymeith_-_Truth_.mp3").toURI().toString());
	Media med12 = new Media(new File("resources/music/snowflake_-_Ethereal_Space.mp3").toURI().toString());
	Media med13 = new Media(new File("resources/music/spinmeister_-_Moments_in_Space_1.mp3").toURI().toString());
	Media med14 = new Media(new File("resources/music/Steve O'brien 58-ambient-orchestral-piece.mp3").toURI().toString());
	Media med15 = new Media(new File("resources/music/Steve O'brien easypiece6.wav").toURI().toString());
	Media med16 = new Media(new File("resources/music/Steve O'brien epic4.mp3").toURI().toString());
	Media med17 = new Media(new File("resources/music/Steve O'brien guitarminiatureno1indmajor.mp3").toURI().toString());

	MediaPlayer mediaPlayer;
	int randomSong;
	
	public SoundManager()
	{
        randomSong = 1 + ran.nextInt(17);
        
		 switch (randomSong) {
	        case 0:
	    	mediaPlayer = new MediaPlayer(med1);
	       	break;
	       	
	        case 1:
	    	mediaPlayer = new MediaPlayer(med1);
	        break;
	        
	        case 2:
	    	mediaPlayer = new MediaPlayer(med2);
	        break;
	       	    
	        case 3:
	    	mediaPlayer = new MediaPlayer(med3);
	        break;
	       	    
	        case 4:
	        mediaPlayer = new MediaPlayer(med4);
		    break;
	       	    
	        case 5:
	    	mediaPlayer = new MediaPlayer(med5);
	        break;
   	    
            case 6:
		    mediaPlayer = new MediaPlayer(med6);
			break;
				    
			case 7:
			mediaPlayer = new MediaPlayer(med7);
			break;
			   
			case 8:
			mediaPlayer = new MediaPlayer(med8);
			break;
			   
			case 9:
			mediaPlayer = new MediaPlayer(med9);
			break;
			   
			case 10:
			mediaPlayer = new MediaPlayer(med10);
			break;
			   
			case 11:
			mediaPlayer = new MediaPlayer(med11);
			break;
			   
			case 12:
			mediaPlayer = new MediaPlayer(med12);
			break;
			   
			case 13:
			mediaPlayer = new MediaPlayer(med13);
			break;
			   
			case 14:
			mediaPlayer = new MediaPlayer(med14);
			break;
			   
			case 15:
			mediaPlayer = new MediaPlayer(med15);
			break;
   
			case 16:
			mediaPlayer = new MediaPlayer(med16);
			break;
   
			case 17:
			mediaPlayer = new MediaPlayer(med17);
			break;
	        
	        default: 
			mediaPlayer = new MediaPlayer(med1);
	        break;
	    /* Using a RNG, choose a random song from our 17 choices. If something
	     *  goes wrong and the choice is 0 or something out of bounds, we go with
	     *  choice #1.
		 */
		 }
        
	}

	public void startPlayingSong(String nameOfSong)
	{
		 switch (nameOfSong) {
	        case "":
	    	mediaPlayer = new MediaPlayer(med1);
	       	break;
	       	
	        case "admiralbob77_-_The_Broken.mp3":
	    	mediaPlayer = new MediaPlayer(med1);
	        break;
	        
	        case "doxent_-_Forgotten_Land.mp3":
	    	mediaPlayer = new MediaPlayer(med2);
	        break;
	       	    
	        case "duncan_beattie_-_sevenhundredbeats.mp3":
	    	mediaPlayer = new MediaPlayer(med3);
	        break;
	       	    
	        case "Essa - Loop 7.wav":
	        mediaPlayer = new MediaPlayer(med4);
		    break;
	       	    
	        case "flatwound_-_The_Long_Goodbye.mp3":
	    	mediaPlayer = new MediaPlayer(med5);
	        break;
	    
            case "grapes_-_I_dunno.mp3":
		    mediaPlayer = new MediaPlayer(med6);
			break;
				    
			case "gurdonark_-_Emergence_Sci_Fi_Mid-Tempo_Pack.mp3":
			mediaPlayer = new MediaPlayer(med7);
			break;
			   
			case "Kevin Pellegrini - Dark Ambient.wav":
			mediaPlayer = new MediaPlayer(med8);
			break;
			   
			case "Melotone - Ambient Melody In G Major 120 BPM.wav":
			mediaPlayer = new MediaPlayer(med9);
			break;
			   
			case "morgantj_-_The_Right_Voice_(MorganTJ_Whirlwind_Remix).mp3":
			mediaPlayer = new MediaPlayer(med10);
			break;
			   
			case "onlymeith_-_Truth_.mp3":
			mediaPlayer = new MediaPlayer(med11);
			break;
			   
			case "snowflake_-_Ethereal_Space.mp3":
			mediaPlayer = new MediaPlayer(med12);
			break;
			   
			case "spinmeister_-_Moments_in_Space_1.mp3":
			mediaPlayer = new MediaPlayer(med13);
			break;
			   
			case "Steve O'brien 58-ambient-orchestral-piece.mp3":
			mediaPlayer = new MediaPlayer(med14);
			break;
			   
			case "Steve O'brien easypiece6.wav":
			mediaPlayer = new MediaPlayer(med15);
			break;

			case "Steve O'brien epic4.mp3":
			mediaPlayer = new MediaPlayer(med16);
			break;

			case "Steve O'brien guitarminiatureno1indmajor.mp3":
			mediaPlayer = new MediaPlayer(med17);
			break;
	        
	        default: 
			mediaPlayer = new MediaPlayer(med1);
	        break;
		 }
	}
	
	public void stopPlayingSong()
	{
		if(mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING)
		{
			mediaPlayer.stop();
		}
	}
		 
	public void startPlayingSE(String nameOfEffect)
	{
		
	}
	
	public void stopPlayingSE(String nameOfEffect)
	{
		
	}
	
	public void loadSound(String soundName)
	{
		
	}
	
	public void testingPlay()
	{

		   mediaPlayer.play();
		   //System.out.println("we called PLAY, is there music?");
	}
	
	public void testingStop()
	{
		if(mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING)
		{
			mediaPlayer.stop();
		}
	}
}
