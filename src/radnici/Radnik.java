package radnici;

public abstract class Radnik {

	protected String ime;
	protected String prezime;
	protected String jmbg;
	protected long ziroRacun;
	protected double plata;

	public Radnik(String ime, String prezime, String jmbg, long ziroRacun) {

		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.ziroRacun = ziroRacun;
	}

	public abstract void isplatiPlatu();
}
