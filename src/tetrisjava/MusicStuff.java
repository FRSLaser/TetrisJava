package tetrisjava;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicStuff 
{
    void playMusic(String MusicLocation)
    {
        try 
        {
            File musicPath = new File (MusicLocation);
            
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                
              
            }
            else 
            {
               System.out.println("Can't find file");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
