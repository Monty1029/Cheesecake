
public abstract class Channel {
	
	protected byte sr0;
	protected byte sr1;
	protected byte sr2;
	protected byte sr3;
	protected byte sr4;
	
	protected int zeroFlagTrigger = 0x80;
	
	abstract void write(int add, byte b);
	abstract byte read(int add);
	abstract void reset();
	
}
