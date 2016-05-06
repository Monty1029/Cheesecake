/*	Memory Bank Controller 1
 * 
 *	Handles bank switching in memory
 */
public class MBC1 {
	
	private int romBank = 1;
	private int romRamMode = 0;
	
	private boolean ramEnabled = false;
	
	private int numRamBanks = 0;
	private int ramSize;
	private byte ram[][] = null;
	
	private boolean hasRam;
	private boolean saveable;
	
	public MBC1(boolean hasRam, boolean saveable) {
		this.hasRam = hasRam;
		this.saveable = saveable;
	}
	
	public void initialize() {
		
	}
	
	public void write(int add, byte b) {
		
	}
	
	public void loadRam() {
		
	}
	
	public void saveRam() {
		
	}
	
	public int getNumRamBanks() {
		return numRamBanks;
	}
	
	public boolean hasSramOrBattery() {
		return saveable;
	}
	
	public byte[][] getRam() {
		return hasRam ? ram : null;
	}
}
