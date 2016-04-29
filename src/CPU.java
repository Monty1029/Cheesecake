
public class CPU implements Component{
	
	public static final int CLOCK = 4194304; //Frequency of Z80 microprocessor (4194304 Hz)
	
	//Flags
	public static final int z = 0x80; //Zero flag
	public static final int n = 0x40; //Operation flag
	public static final int h = 0x20; //Half-carry flag
	public static final int c = 0x10; //Carry flag
}
