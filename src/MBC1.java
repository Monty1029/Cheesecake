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
		//Enables RAM
		if (add < 0x2000) {
			if ((b & 0xA) != 0xA) {
				ramEnabled = false;
			}
		}
		//Selects ROM bank
		else if (add < 0x4000) {
			romBank &= 0x7f;
			romBank = b & 0x1F;
			
			if (romBank == 0x00 || romBank == 0x20 || romBank == 0x40 || romBank == 0x60) {
				romBank++;
				/*
				 * Switch ROM banks
				 */
			}
		}
		//Selects RAM bank
		else if (add < 0x6000) {
			b &= 3;
			
			if (romRamMode == 0) {
				romBank |= (b << 5);
				/*
				 * Switch ROM banks
				 */
			}
			else {
				/*
				 * Switch RAM banks
				 */
			}
		}
		//Selects ROM or RAM mode
		else if (add < 0x8000) {
			romRamMode = b & 1;
		}
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
