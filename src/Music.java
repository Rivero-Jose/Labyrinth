import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
public class Music implements LineListener {
	boolean playCompleted;
	boolean b = true;
	public void music1(){
InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("Bad Apple 8-bit.wav"));
Maze M = new Maze();
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = AudioSystem.getClip();
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
            
            audioClip.loop(9999);
            if(b == true){
            M.setLevel(10000,300,1000,60,20,100);
            M.START();
            b = false;
            }
            
            
			while (!playCompleted) {
                // wait for the playback completes
				audioClip.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
			audioClip.close();
             
       }catch (UnsupportedAudioFileException ex) {
        	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
        	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
        	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
            ex.printStackTrace();
        }
        
	}
	public void music2(){
InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("Bad Apple English.wav"));
Maze M = new Maze();
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = AudioSystem.getClip();
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
            
            audioClip.start();
           
            
            
			while (!playCompleted) {
                // wait for the playback completes
				audioClip.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
			audioClip.close();
             
       }catch (UnsupportedAudioFileException ex) {
        	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
        	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
        	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
            ex.printStackTrace();
        }
	}
	public void music3(){
InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("Normal Battle Music.wav"));
Maze M = new Maze();
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = AudioSystem.getClip();
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
            
            audioClip.loop(9999);
            if(b == true){
            	M.setLevel(4000,500,5000,40,40,150);
                M.START();
                b = false;
                }
            
            
			while (!playCompleted) {
                // wait for the playback completes
				audioClip.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
			audioClip.close();
             
       }catch (UnsupportedAudioFileException ex) {
        	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
        	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
        	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
            ex.printStackTrace();
        }
	}
	public void music4(){
InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("Boss Battle Music.wav"));
Maze M = new Maze();
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = AudioSystem.getClip();
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
            
            audioClip.loop(9999);
            if(b == true){
            	M.setLevel(1000,1000,10000,30,60,200);
                M.START();
                b = false;
                }
            
            
			while (!playCompleted) {
                // wait for the playback completes
				audioClip.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
			audioClip.close();
             
       }catch (UnsupportedAudioFileException ex) {
        	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
        	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
        	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
            ex.printStackTrace();
        }
	}
	public void music5(){
InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("ImFinished.wav"));
Maze M = new Maze();
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = AudioSystem.getClip();
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
            
            audioClip.start();
            M.gameover();
            
            
			while (!playCompleted) {
                // wait for the playback completes
				audioClip.start();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
			audioClip.close();
             
       }catch (UnsupportedAudioFileException ex) {
        	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
        	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
        	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
            ex.printStackTrace();
        }
	}
	
	
	public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
        
        //if (type == LineEvent.Type.OPEN) {
        //    JOptionPane.showMessageDialog(null,"Playback started.");
             
        //} else if (type == LineEvent.Type.STOP) {
          //  playCompleted = true;
            //JOptionPane.showMessageDialog(null,"Playback completed.");
        //}
 
    }
}
