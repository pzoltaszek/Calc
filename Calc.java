import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Calc extends Applet implements ActionListener {

	private static final long serialVersionUID = 1L;

	String msg = "";
	Button z, a, b, c, d, e, f, g, h, i, dodaj, odejmij, mnozenie, dzielenie, rownaSie, clear;
	TextField pole;
	String DoWyswietlenia1 = "";
	String drugaDoOdczytu = "";
	Integer Doobliczen1 = null;
	Integer Doobliczen2 = null;
	Integer pierwsza = null;
	Integer druga = null;
	Integer suma = null;
	boolean rownaSieF = false;
	boolean dodajF = false;
	boolean odejmijF = false;
	boolean mnozenieF = false;
	boolean dzielenieF = false;

	public void init() {
		setLayout(new FlowLayout());
		z = new Button("0");
		a = new Button("1");
		b = new Button("2");
		c = new Button("3");
		d = new Button("4");
		e = new Button("5");
		f = new Button("6");
		g = new Button("7");
		h = new Button("8");
		i = new Button("9");

		dodaj = new Button("+");
		odejmij = new Button("-");
		mnozenie = new Button("*");
		dzielenie = new Button("/");
		rownaSie = new Button("=");
		clear = new Button("C");
		pole = new TextField(10);

		add(pole);
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
		add(g);
		add(h);
		add(i);
		add(z);
		add(dodaj);
		add(odejmij);
		add(mnozenie);
		add(dzielenie);
		add(rownaSie);
		add(clear);

		z.addActionListener(this);
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		e.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		i.addActionListener(this);

		dodaj.addActionListener(this);
		odejmij.addActionListener(this);
		mnozenie.addActionListener(this);
		dzielenie.addActionListener(this);
		rownaSie.addActionListener(this);
		clear.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae) {
		Object source = ae.getSource();

		// ***************** pierwsza liczba**************
		if (dodajF == false && odejmijF == false && mnozenieF == false && dzielenieF == false) {
			if (source == z) {
				pierwsza = 0;
				DoWyswietlenia1 += String.valueOf(pierwsza);
			}
			if (source == a) {
				pierwsza = 1;
				DoWyswietlenia1 += String.valueOf(pierwsza);
			}
			if (source == b) {
				pierwsza = 2;
				DoWyswietlenia1 += String.valueOf(pierwsza);
			}
			if (source == c) {
				pierwsza = 3;
				DoWyswietlenia1 += String.valueOf(pierwsza);
			}
			if (source == d) {
				pierwsza = 4;
				DoWyswietlenia1 += String.valueOf(pierwsza);
			}
			if (source == e) {
				pierwsza = 5;
				DoWyswietlenia1 += String.valueOf(pierwsza);
			}
			if (source == f) {
				pierwsza = 6;
				DoWyswietlenia1 += String.valueOf(pierwsza);
			}
			if (source == g) {
				pierwsza = 7;
				DoWyswietlenia1 += String.valueOf(pierwsza);
			}
			if (source == h) {
				pierwsza = 8;
				DoWyswietlenia1 += String.valueOf(pierwsza);
			}
			if (source == i) {
				pierwsza = 9;
				DoWyswietlenia1 += String.valueOf(pierwsza);
			}
			if (source == dodaj) {
				try {
					dodajF = true;
					Doobliczen1 = Integer.valueOf(DoWyswietlenia1);
					DoWyswietlenia1 += "+";
				} catch (Exception exc) {
					msg = "najpierw wybierz liczbe";
					repaint();
					dodajF = false;
				}
			}
			if (source == odejmij) {
				try {
					odejmijF = true;
					Doobliczen1 = Integer.valueOf(DoWyswietlenia1);
					DoWyswietlenia1 += "-";
				} catch (Exception exc) {
					msg = "najpierw wybierz liczbe";
					repaint();
					odejmijF = false;
				}
			}
			if (source == mnozenie) {
				try {
					mnozenieF = true;
					Doobliczen1 = Integer.valueOf(DoWyswietlenia1);
					DoWyswietlenia1 += "*";
				} catch (Exception exc) {
					msg = "najpierw wybierz liczbe";
					repaint();
					mnozenieF = false;
				}
			}
			if (source == dzielenie) {
				try {
					dzielenieF = true;
					Doobliczen1 = Integer.valueOf(DoWyswietlenia1);
					DoWyswietlenia1 += "/";
				} catch (Exception exc) {
					msg = "najpierw wybierz liczbe";
					repaint();
					dzielenieF = true;
				}
			}
		}
		// ************************* druga liczba*****************
		if (dodajF == true || odejmijF == true || mnozenieF == true || dzielenieF == true) {
			if (source == z) {
				druga = 0;
				DoWyswietlenia1 += String.valueOf(druga);
				drugaDoOdczytu += String.valueOf(druga);
			}
			if (source == a) {
				druga = 1;
				DoWyswietlenia1 += String.valueOf(druga);
				drugaDoOdczytu += String.valueOf(druga);
			}
			if (source == b) {
				druga = 2;
				DoWyswietlenia1 += String.valueOf(druga);
				drugaDoOdczytu += String.valueOf(druga);
			}
			if (source == c) {
				druga = 3;
				DoWyswietlenia1 += String.valueOf(druga);
				drugaDoOdczytu += String.valueOf(druga);
			}
			if (source == d) {
				druga = 4;
				DoWyswietlenia1 += String.valueOf(druga);
				drugaDoOdczytu += String.valueOf(druga);
			}
			if (source == e) {
				druga = 5;
				DoWyswietlenia1 += String.valueOf(druga);
				drugaDoOdczytu += String.valueOf(druga);
			}
			if (source == f) {
				druga = 6;
				DoWyswietlenia1 += String.valueOf(druga);
				drugaDoOdczytu += String.valueOf(druga);
			}
			if (source == g) {
				druga = 7;
				DoWyswietlenia1 += String.valueOf(druga);
				drugaDoOdczytu += String.valueOf(druga);
			}
			if (source == h) {
				druga = 8;
				DoWyswietlenia1 += String.valueOf(druga);
				drugaDoOdczytu += String.valueOf(druga);
			}
			if (source == i) {
				druga = 9;
				DoWyswietlenia1 += String.valueOf(druga);
				drugaDoOdczytu += String.valueOf(druga);
			}
			if (source == rownaSie) {
				try{
				rownaSieF = true;
				Doobliczen2 = Integer.valueOf(drugaDoOdczytu);
				msg = "";
				} catch (Exception exc){
					msg = "najpierw wybierz liczbe";
					rownaSieF = false;
					dodajF = false;
					odejmijF = false;
					mnozenieF = false;
					dzielenieF = false;
				}
			}

			// *************************dzialania *******************
			if (rownaSieF) {
				if (dodajF) {
					suma = null;
					suma = Doobliczen1 + Doobliczen2;
					DoWyswietlenia1 = String.valueOf(suma);
					msg = "";
					repaint();
				}
				if (odejmijF) {
					suma = Doobliczen1 - Doobliczen2;
					DoWyswietlenia1 = String.valueOf(suma);
					msg = "";
					repaint();
				}
				if (mnozenieF) {
					suma = Doobliczen1 * Doobliczen2;
					DoWyswietlenia1 = String.valueOf(suma);
					msg = "";
					repaint();
				}
				if (dzielenieF) {
					try {
						suma = Doobliczen1 / Doobliczen2;
					} catch (Exception exc) {
						msg = "nie dziel przez 0!";
						suma = 0;
					}
					DoWyswietlenia1 = String.valueOf(suma);
					repaint();
				}
				// ***************** dodawanie kolejnej
				if (source == dodaj) {
					dodajF = true;
					odejmijF = false;
					mnozenieF = false;
					dzielenieF = false;
					pierwsza = suma;
					Doobliczen1 = suma;
					suma = null;
					druga = null;
					Doobliczen2 = null;
					DoWyswietlenia1 += "+";
					rownaSieF = false;
					drugaDoOdczytu = "";
					msg = "";
				}
				// ***************** odejmowanie kolejnej
				if (source == odejmij) {
					odejmijF = true;
					dodajF = false;
					mnozenieF = false;
					dzielenieF = false;
					pierwsza = suma;
					Doobliczen1 = suma;
					suma = null;
					druga = null;
					Doobliczen2 = null;
					DoWyswietlenia1 += "-";
					rownaSieF = false;
					drugaDoOdczytu = "";
					msg = "";
				}
				// ************** mnozenie kolejnej
				if (source == mnozenie) {
					odejmijF = false;
					dodajF = false;
					mnozenieF = true;
					dzielenieF = false;
					pierwsza = suma;
					Doobliczen1 = suma;
					suma = null;
					druga = null;
					Doobliczen2 = null;
					DoWyswietlenia1 += "*";
					rownaSieF = false;
					drugaDoOdczytu = "";
					msg = "";
				}
				// ************** dzielenie kolejnej
				if (source == dzielenie) {
					odejmijF = false;
					dodajF = false;
					mnozenieF = false;
					dzielenieF = true;
					pierwsza = suma;
					Doobliczen1 = suma;
					suma = null;
					druga = null;
					Doobliczen2 = null;
					DoWyswietlenia1 += "/";
					rownaSieF = false;
					drugaDoOdczytu = "";
					msg = "";
				}
			}
		}
		// **************** przycisk CLEAR *******************
		if (source == clear) {
			msg = "wyczyszczono";
			pierwsza = null;
			druga = null;
			Doobliczen1 = null;
			Doobliczen2 = null;
			suma = null;
			rownaSieF = false;
			dodajF = false;
			odejmijF = false;
			mnozenieF = false;
			dzielenieF = false;
			DoWyswietlenia1 = "";
			drugaDoOdczytu = "";
			repaint();
		}
		pole.setText(DoWyswietlenia1);
	}

	public void paint(Graphics g) {
		g.setFont(new Font("moja", Font.BOLD, 14));
		g.setColor(Color.BLUE);
		g.drawString(msg, 10, 120);
		setBackground(Color.LIGHT_GRAY);
		

	}
}
