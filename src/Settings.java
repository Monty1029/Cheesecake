import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

public class Settings {
	
	private HashMap<Integer, Integer> dpad;
	private int numChannels = 1;
	private int samplingRate = 44100; //Sampling rate of Game Boy sound is 44100 Hz
	private float volume = (float) 0.5;
	
	//4 channels with stereo sound (active high)
	private int ch1enable = 1;
	private int ch2enable = 1;
	private int ch3enable = 1;
	private int ch4enable = 1;
	
	public Settings() {
		dpad = new HashMap<Integer, Integer>();
		
		dpad.put(0x27, 0); //Button RIGHT (Right arrow)
		dpad.put(0x25, 1); //Button LEFT (Left arrow)
		dpad.put(0x26, 2); //Button UP (Up arrow)
		dpad.put(0x28, 3); //Button DOWN (Down arrow)
		dpad.put(0x59, 4); //Button A (X)
		dpad.put(0x5A, 5); //Button B (Z)
		dpad.put(0xA1, 6); //Button SELECT (R_SHIFT)
		dpad.put(0x0D, 7); //Button START (ENTER)
	}
	
	public HashMap<Integer, Integer> getDpad() {
		return dpad;
	}
	
	public boolean checkSettings() {
		return false;
	}
}
