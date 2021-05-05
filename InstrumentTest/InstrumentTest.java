public class InstrumentTest {

	public static void main(String[] args) {
		Instrument ins = new Guitar();
		ins.pluck();

	}

}
abstract class Instrument {
	abstract void use();
}
	
abstract class MusicalInstrument extends Instrument{
	abstract void play();
}

abstract class StringBasedInstrument extends MusicalInstrument {
	abstract void tuneString();
}

class Guitar extends StringBasedInstrument {
	void use() { System.out.println("Using Guitar..."); }
	void play() { System.out.println("Playing Guitar..."); }
	void tuneString() { System.out.println("Tuning Guitar..."); }
	void pluck() { System.out.println("PLucking the Guitar String..."); }
}
