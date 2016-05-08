import java.awt.event.KeyEvent;
import java.util.*;

public class Settings {
	
	private HashMap<Integer, Integer> dpad;
	private KeyEvent key;
	private int numChannels = 1;
	private int samplingRate = 44100; //Sampling rate of Game Boy sound is 44100 Hz
	private float masterVolumeControl = (float) 0.5;//Master volume control which adjusts the left and right outputs
	
	//4 channels with stereo sound (active high)
	private int ch1enable = 1; //Square 1
	private int ch2enable = 1; //Square 2
	private int ch3enable = 1; //Wave
	private int ch4enable = 1; //Noise
	
	public Settings() {
		dpad = new HashMap<Integer, Integer>();
		
		dpad.put(key.VK_RIGHT, 0); //Button RIGHT (Right arrow)
		dpad.put(key.VK_LEFT, 1); //Button LEFT (Left arrow)
		dpad.put(key.VK_UP, 2); //Button UP (Up arrow)
		dpad.put(key.VK_DOWN, 3); //Button DOWN (Down arrow)
		dpad.put(key.VK_X, 4); //Button A (X)
		dpad.put(key.VK_Z, 5); //Button B (Z)
		dpad.put(key.VK_SHIFT, 6); //Button SELECT (SHIFT)
		dpad.put(key.VK_ENTER, 7); //Button START (ENTER)
	}
	
	public HashMap<Integer, Integer> getDpad() {
		return dpad;
	}
	
	public boolean checkSettings() {
		return false;
	}
}
