package radnici;

public class RadnikFiksno extends Radnik {

	public RadnikFiksno(String ime, String prezime, String jmbg, long ziroRacun, double plata) {

		super(ime, prezime, jmbg, ziroRacun);
		this.plata = plata;
	}

	@Override
	public void isplatiPlatu() {

		System.out.println("Radniku " + ime + " " + prezime + ", jmbg " + jmbg + " na ziro-racun " + ziroRacun + " legla je uplata od " + plata);
	}
}
