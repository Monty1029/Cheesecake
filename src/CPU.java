//CPU
public class CPU implements Component{
	
	private static final int CLOCK = 4194304; //Frequency of Z80 microprocessor (4194304 Hz)
	
	//Flags
	private static final int Z = 0x80; //Zero flag
	private static final int N = 0x40; //Operation flag
	private static final int H = 0x20; //Half-carry flag
	private static final int C = 0x10; //Carry flag
	
	//8-bit registers
	private static final int R_A = 0; //Accumulator
	private static final int R_F = 1; //Status register
	//General purpose registers
	private static final int R_B = 2;
	private static final int R_C = 3;
	private static final int R_D = 4;
	private static final int R_E = 5;
	private static final int R_H = 6;
	private static final int R_L = 7;
	
	//16-bit registers
	private static final int R_AF = 0;
	private static final int R_BC = 2;
	private static final int R_DE = 4;
	private static final int R_HL = 6;
	private static final int R_SP = 8; //Stack pointer
	
	private static final byte[] reg = new byte[8]; //Register memory
	private int pc; //Program counter
	private int sp; //Stack pointer
	
	public CPU() {
		generateInstructions();
	}
	
	public void generateInstructions() {
		InstructionGenerator instrGen = new InstructionGenerator(this);
	}
	
	public byte[] getRegister() {
		return reg;
	}
	
	public void link() {
		
	}
}
