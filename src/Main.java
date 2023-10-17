import radnici.Radnik;
import radnici.RadnikFiksno;
import radnici.RadnikPoDanu;
import radnici.RadnikPoSatu;

public class Main {

	public static void dajPlatu(Radnik[] radnici) {

		for (int i = 0; i < radnici.length; i++) {

			radnici[i].isplatiPlatu();
		}
	}

	public static void main(String[] args) {

		Radnik radnikPoSatu = new RadnikPoSatu("Ana", "Anic", "1204997710123", 1509090909, 50, 100);
		Radnik radnikPoDanu = new RadnikPoDanu("Mara", "Maric", "1202985712838", 1809090908, 150, 15);
		Radnik radnikFiksno = new RadnikFiksno("Mika", "Mikic", "2306988712929", 1300909090, 100000);

		Radnik[] radnici = {radnikPoSatu, radnikPoDanu, radnikFiksno};

		dajPlatu(radnici);
		}
}