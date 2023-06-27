
public class App {

	public static void main(String[] args) {
		double altezzaRettangolo1 = 5;
		double larghezzaRettangolo1 = 10;
		Rettangolo rettangolo1 = new Rettangolo(altezzaRettangolo1, larghezzaRettangolo1);

		double altezzaRettangolo2 = 3;
		double larghezzaRettangolo2 = 7;
		Rettangolo rettangolo2 = new Rettangolo(altezzaRettangolo2, larghezzaRettangolo2);


		System.out.println("Risultati per due rettangoli:");
		stampaDueRettangoli(rettangolo1, rettangolo2);
	}

	public static void stampaRettangolo(Rettangolo rettangolo) {
		double perimetro = rettangolo.calcolaPerimetro();
		double area = rettangolo.calcolaArea();
		System.out.println("Rettangolo:");
		System.out.println("Altezza: " + rettangolo.altezza);
		System.out.println("Larghezza: " + rettangolo.larghezza);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
		System.out.println();
	}

	public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
		System.out.println("Primo rettangolo:");
		stampaRettangolo(rettangolo1);

		System.out.println("Secondo rettangolo:");
		stampaRettangolo(rettangolo2);

		double perimetroTotale = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();
		double areaTotale = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();

		System.out.println("Somma dei perimetri: " + perimetroTotale);
		System.out.println("Somma delle aree: " + areaTotale);
	}
}
