package radnici;

public class RadnikPoDanu extends Radnik {

	private double cenaDana;
	private double brojDana;
	public RadnikPoDanu(String ime, String prezime, String jmbg, long ziroRacun, double cenaDana, double brojDana) {

		super(ime, prezime, jmbg, ziroRacun);
		this.cenaDana = cenaDana;
		this.brojDana = brojDana;
	}

	private double obracunajPlatu() {

		return cenaDana * brojDana;
	}

	@Override
	public void isplatiPlatu() {

		plata = obracunajPlatu();
		System.out.println("Radniku " + ime + " " + prezime + ", jmbg " + jmbg + " na ziro-racun " + ziroRacun + " legla je uplata od " + plata);

	}
}
