package radnici;

public class RadnikPoSatu extends Radnik {

	private double cenaSata;
	private double brojSati;
	public RadnikPoSatu(String ime, String prezime, String jmbg, long ziroRacun, double cenaSata, double brojSati) {

		super(ime, prezime, jmbg, ziroRacun);
		this.cenaSata = cenaSata;
		this.brojSati = brojSati;
	}

	private double obracunajPlatu() {

		return cenaSata * brojSati;

	}

	@Override
	public void isplatiPlatu() {

		plata = obracunajPlatu();

		System.out.println("Radniku " + ime + " " + prezime + ", jmbg " + jmbg + " na ziro-racun " + ziroRacun + " legla je uplata od " + plata);
	}
}
