
public class AlgRekursionTestProgs {
	***************************************************************************
	Diese Datei enthaelt 7 Java-Programme namens Rekursion01_Tst bis
	Rekursion07_Tst, die von Anfang an compilierbar und lauffaehig
	sein sollten. Die Programme sind durch Sternchen-Zeilen voneinander
	getrennt. Jedes Programm dient dazu, eine oder mehrere rekursive
	Methoden zu testen (insgesamt sind das 14 Methoden).
	Die Ruempfe dieser Methoden sollen von Ihnen ergaenzt werden.
	Sie bestehen anfangs jeweils nur aus einer Zeile, die mit
	MUSS ERSETZT WERDEN gekennzeichnet ist.
	***************************************************************************
	// Datei Rekursion01_Tst.java
	/* ------------------------------------------------------------------------
	Dieses Programm Rekursion01_Tst enthaelt die 3 rekursiven Methoden
	fiboR (Fibonacci-Zahlen), anzWeisen12 (Treppen steigen mit 1 oder 2 Stufen
	auf einemal) und anzWeisen13 (Treppen steigen mit 1, 2 oder 3 Stufen auf
	einmal) und testet sie.
	------------------------------------------------------------------------ */
	
	***************************************************************************
	// Datei Rekursion02_Tst.java
	/* ------------------------------------------------------------------------
	Dieses Programm Rekursion02_Tst enthaelt die 6 rekursiven Methoden
	zehner_Ziffer, anz_10_er_Ziffern, als_10_er_Zahl
	  b_er_Ziffer,  anz_b_er_Ziffern,  als_b_er_Zahl
	und testet sie.

	Alle Methoden haben mit Ziffern von Zahlen zu tun, die in verschiedenen
	Zahlensystemen (Stellenwertsystemen) dargestellt sind.
	------------------------------------------------------------------------ */

	***************************************************************************

	***************************************************************************
	// Datei Rekursion04_Tst.java
	/* ------------------------------------------------------------------------
	Dieses Programm Rekursion04_Tst enthaelt die 3 rekursiven Methoden
	add, mul und pot und testet sie.

	Alle drei Methoden verlassen sich darauf, dass ihre Paramter m un n
	nicht negativ sind. Sie benutzen die Operationen + und - (Addition und
	Subtraktion) nur dazu, um 1 zu addieren bzw. zu subtrahieren. Die Methoden
	koennen als Definitionen der Operationen Addition, Multiplikation und
	Potenzierung (von natürlichen Zahlen) verstanden werden.
	------------------------------------------------------------------------ */

	class Rekursion04_Tst {
	   // ---------------------------------------------------------------------
	   static int add(int m, int n) {
	      // Liefert die Summe von m und n:
	      if (n == 0) {
	         return m;                 // m + 0 = m
	      } else {
	         return (add(m, n-1)) + 1; // m + n = (m + (n-1)) + 1
	      }
	   }
	   // ---------------------------------------------------------------------
	   static int mul(int m, int n) {
	      // Liefert das Produkt von m und n:

	      return -1; // MUSS ERSETZT WERDEN
	   }
	   // ---------------------------------------------------------------------
	   static int pot(int m, int n) {
	      // Liefert die n-te Potenz von m (d.h. den Wert m hoch n):

	      return -1; // MUSS ERSETZT WERDEN
	   }
	   // ---------------------------------------------------------------------
	   static private int anzFehler = 0;
	   // ---------------------------------------------------------------------
	   static private void tst_add(int m, int n, int soll) {
	      int ist = add(m, n);

	      String text = " <--- OK";
	      if (ist != soll) {
	         text = " <--- Fehler?";
	         anzFehler++;
	      }

	      printf("add(%d, %d), ist:%4d, soll:%4d %s%n", m, n, ist, soll, text);
	   }
	   // ---------------------------------------------------------------------
	   static private void tst_mul(int m, int n, int soll) {
	      int ist = mul(m, n);

	      String text = " <--- OK";
	      if (ist != soll) {
	         text = " <--- Fehler?";
	         anzFehler++;
	      }

	      printf("add(%d, %d), ist:%4d, soll:%4d %s%n", m, n, ist, soll, text);
	   }
	   // ---------------------------------------------------------------------
	   static private void tst_pot(int m, int n, int soll) {
	      int ist = pot(m, n);

	      String text = " <--- OK";
	      if (ist != soll) {
	         text = " <--- Fehler?";
	         anzFehler++;
	      }

	      printf("add(%d, %d), ist:%4d, soll:%4d %s%n", m, n, ist, soll, text);
	   }
	   // ---------------------------------------------------------------------
	   static public void main(String[] args) {
	      printf("Rekursion04_Tst: Jetzt geht es los!%n");
	      printf("-------------------------------%n");
	      tst_add(0, 3,    3);
	      tst_add(5, 0,    5);
	      tst_add(1, 3,    4);
	      tst_add(3, 1,    4);
	      tst_add(3, 5,    8);
	      tst_add(5, 3,    8);
	      printf("-------------------------------%n");
	      tst_mul(0, 3,    0);
	      tst_mul(5, 0,    0);
	      tst_mul(1, 3,    3);
	      tst_mul(3, 1,    3);
	      tst_mul(3, 5,   15);
	      tst_mul(5, 3,   15);
	      printf("-------------------------------%n");
	      tst_pot(0, 3,    0);
	      tst_pot(5, 0,    1);
	      tst_pot(1, 3,    1);
	      tst_pot(3, 1,    3);
	      tst_pot(3, 2,    9);
	      tst_pot(5, 3,  125);
	      tst_pot(4, 5, 1024);
	      printf("--------------------------------%n");
	      printf("Anzahl Fehler: %d%n", anzFehler);
	      printf("--------------------------------%n");
	      printf("Rekursion04_Tst: Das war's erstmal!%n%n");
	   } // main
	   // ---------------------------------------------------------------------
	   // Eine Methode mit einem kurzen Namen:
	   static void printf(String f, Object... v) {System.out.printf(f, v);}
	   // ---------------------------------------------------------------------
	} // class Rekursion04_Tst
	/* ------------------------------------------------------------------------
	Ausgabe (Wenn alles OK ist):

	Rekursion04_Tst: Jetzt geht es los!
	-------------------------------
	add(0, 3), ist:   3, soll:   3  <--- OK
	add(5, 0), ist:   5, soll:   5  <--- OK
	add(1, 3), ist:   4, soll:   4  <--- OK
	add(3, 1), ist:   4, soll:   4  <--- OK
	add(3, 5), ist:   8, soll:   8  <--- OK
	add(5, 3), ist:   8, soll:   8  <--- OK
	-------------------------------
	add(0, 3), ist:   0, soll:   0  <--- OK
	add(5, 0), ist:   0, soll:   0  <--- OK
	add(1, 3), ist:   3, soll:   3  <--- OK
	add(3, 1), ist:   3, soll:   3  <--- OK
	add(3, 5), ist:  15, soll:  15  <--- OK
	add(5, 3), ist:  15, soll:  15  <--- OK
	-------------------------------
	add(0, 3), ist:   0, soll:   0  <--- OK
	add(5, 0), ist:   1, soll:   1  <--- OK
	add(1, 3), ist:   1, soll:   1  <--- OK
	add(3, 1), ist:   3, soll:   3  <--- OK
	add(3, 2), ist:   9, soll:   9  <--- OK
	add(5, 3), ist: 125, soll: 125  <--- OK
	add(4, 5), ist:1024, soll:1024  <--- OK
	--------------------------------
	Anzahl Fehler: 0
	--------------------------------
	Rekursion04_Tst: Das war's erstmal!
	------------------------------------------------------------------------ */
	***************************************************************************
	// Datei Rekursion05_Tst.java
	/* ------------------------------------------------------------------------
	Dieses Programm Rekursion05_Tst enthaelt 2 rekursiven Methoden namens
	anzRobos und testet sie.

	Die Methoden berechnen das Wachstum von Gruppen von Robotern, die
	Roboter bauen.
	------------------------------------------------------------------------ */
	class Rekursion05_Tst {
	   // ---------------------------------------------------------------------
	   static long anzRobos(long tage) {
	      // Liefert die Anzahl der Roboter, die wir nach tage vielen
	      // Produktionstagen haben, wenn wir mit 3 Robotern beginnen und
	      // 3 Roboter gemeinsam an einem Tag einen weiteren Roboter bauen.
	      //
	      // Beispiele:
	      // anzRobos(0) ist gleich 3
	      // anzRobos(1) ist gleich 4
	      // anzRobos(2) ist gleich 5
	      // anzRobos(3) ist gleich 6
	      // anzRobos(4) ist gleich 8

	      return -1; // MUSS ERSETZT WERDEN
	   }
	   // ---------------------------------------------------------------------
	   static long anzRobos(long n, long tage) {
	      // Liefert die Anzahl der Roboter, die wir nach tage vielen
	      // Produktionstagen haben, wenn wir mit n Robotern beginnen und
	      // n Roboter gemeinsam an einem Tag einen weiteren Roboter bauen.
	      //
	      // Beispiele:
	      // anzRobos(3, 0) ist gleich  3
	      // anzRobos(3, 1) ist gleich  4
	      // anzRobos(3, 2) ist gleich  5
	      // anzRobos(3, 3) ist gleich  6
	      // anzRobos(3, 4) ist gleich  8
	      //
	      // anzRobos(2, 0) ist gleich  2
	      // anzRobos(2, 1) ist gleich  3
	      // anzRobos(2, 2) ist gleich  4
	      // anzRobos(2, 3) ist gleich  6
	      //
	      // anzRobos(5, 0) ist gleich  5
	      // anzRobos(5, 5) ist gleich 10
	      // anzRobos(5, 6) ist gleich 12

	      return -1; // MUSS ERSETZT WERDEN
	   }
	   // ---------------------------------------------------------------------
	   static private int anzFehler = 0;
	   // ---------------------------------------------------------------------
	   static private void tst3(long tage, long soll) {
	      long ist = anzRobos(tage);

	      String text = " <--- OK";
	      if (ist != soll) {
	         text = " <--- Fehler?";
	         anzFehler++;
	      }

	      printf("anzRobos(%2d),      ist:%,13d, soll:%,13d %s%n",
	         tage, ist, soll, text);
	   }
	   // ---------------------------------------------------------------------
	   static private void tstn(long n, long tage, long soll) {
	      long ist = anzRobos(n, tage);

	      String text = " <--- OK";
	      if (ist != soll) {
	         text = " <--- Fehler?";
	         anzFehler++;
	      }

	      printf("anzRobos(%2d, %3d), ist:%,13d, soll:%,13d %s%n",
	         n, tage, ist, soll, text);
	   }
	   // ---------------------------------------------------------------------
	   static public void main(String[] args) {
	      printf("Rekursion05_Tst: Jetzt geht es los!%n");
	      printf("-----------------------------------%n");
	      tst3( 0,          3);
	      tst3( 1,          4);
	      tst3( 2,          5);
	      tst3( 3,          6);
	      tst3( 4,          8);
	      tst3( 5,         10);
	      tst3(10,         38);
	      tst3(20,        656);
	      tst3(30,      11628);
	      tst3(40,     206472);
	      tst3(50,    3666461);
	      tst3(60,   65107996);
	      tst3(70, 1156169984);
	      printf("-------------------------------%n");
	      tstn(2,  0,          2);
	      tstn(2,  1,          3);
	      tstn(2,  2,          4);
	      tstn(2,  3,          6);
	      tstn(2,  4,          9);
	      tstn(2,  5,         13);
	      tstn(2, 10,         94);
	      tstn(2, 20,       5395);
	      tstn(2, 30,     311073);
	      tstn(2, 40,   17937985);
	      tstn(2, 50, 1034394552);
	      printf("-------------------------------%n");
	      tstn(5,   0,          5);
	      tstn(5,   1,          6);
	      tstn(5,   2,          7);
	      tstn(5,   3,          8);
	      tstn(5,   4,          9);
	      tstn(5,   5,         10);
	      tstn(5,   6,         12);
	      tstn(5,  10,         22);
	      tstn(5,  20,        126);
	      tstn(5,  30,        772);
	      tstn(5,  40,       4770);
	      tstn(5,  50,      29523);
	      tstn(5,  60,     182787);
	      tstn(5,  70,    1131754);
	      tstn(5,  80,    7007508);
	      tstn(5,  90,   43388630);
	      tstn(5, 100,  268650952);
	      tstn(5, 110, 1663415874);
	      printf("-----------------------------------%n");
	      printf("Anzahl Fehler: %d%n", anzFehler);
	      printf("-----------------------------------%n");
	      printf("Rekursion05_Tst: Das war's erstmal!%n%n");
	   } // main
	   // ---------------------------------------------------------------------
	   // Eine Methode mit einem kurzen Namen:
	   static void printf(String f, Object... v) {System.out.printf(f, v);}
	   // ---------------------------------------------------------------------
	} // class Rekursion05_Tst
	/* ------------------------------------------------------------------------
	Ausgabe:

	Rekursion05_Tst: Jetzt geht es los!
	-----------------------------------
	anzRobos( 0),      ist:            3, soll:            3  <--- OK
	anzRobos( 1),      ist:            4, soll:            4  <--- OK
	anzRobos( 2),      ist:            5, soll:            5  <--- OK
	anzRobos( 3),      ist:            6, soll:            6  <--- OK
	anzRobos( 4),      ist:            8, soll:            8  <--- OK
	anzRobos( 5),      ist:           10, soll:           10  <--- OK
	anzRobos(10),      ist:           38, soll:           38  <--- OK
	anzRobos(20),      ist:          656, soll:          656  <--- OK
	anzRobos(30),      ist:       11.628, soll:       11.628  <--- OK
	anzRobos(40),      ist:      206.472, soll:      206.472  <--- OK
	anzRobos(50),      ist:    3.666.461, soll:    3.666.461  <--- OK
	anzRobos(60),      ist:   65.107.996, soll:   65.107.996  <--- OK
	anzRobos(70),      ist:1.156.169.984, soll:1.156.169.984  <--- OK
	-------------------------------
	anzRobos( 2,   0), ist:            2, soll:            2  <--- OK
	anzRobos( 2,   1), ist:            3, soll:            3  <--- OK
	anzRobos( 2,   2), ist:            4, soll:            4  <--- OK
	anzRobos( 2,   3), ist:            6, soll:            6  <--- OK
	anzRobos( 2,   4), ist:            9, soll:            9  <--- OK
	anzRobos( 2,   5), ist:           13, soll:           13  <--- OK
	anzRobos( 2,  10), ist:           94, soll:           94  <--- OK
	anzRobos( 2,  20), ist:        5.395, soll:        5.395  <--- OK
	anzRobos( 2,  30), ist:      311.073, soll:      311.073  <--- OK
	anzRobos( 2,  40), ist:   17.937.985, soll:   17.937.985  <--- OK
	anzRobos( 2,  50), ist:1.034.394.552, soll:1.034.394.552  <--- OK
	-------------------------------
	anzRobos( 5,   0), ist:            5, soll:            5  <--- OK
	anzRobos( 5,   1), ist:            6, soll:            6  <--- OK
	anzRobos( 5,   2), ist:            7, soll:            7  <--- OK
	anzRobos( 5,   3), ist:            8, soll:            8  <--- OK
	anzRobos( 5,   4), ist:            9, soll:            9  <--- OK
	anzRobos( 5,   5), ist:           10, soll:           10  <--- OK
	anzRobos( 5,   6), ist:           12, soll:           12  <--- OK
	anzRobos( 5,  10), ist:           22, soll:           22  <--- OK
	anzRobos( 5,  20), ist:          126, soll:          126  <--- OK
	anzRobos( 5,  30), ist:          772, soll:          772  <--- OK
	anzRobos( 5,  40), ist:        4.770, soll:        4.770  <--- OK
	anzRobos( 5,  50), ist:       29.523, soll:       29.523  <--- OK
	anzRobos( 5,  60), ist:      182.787, soll:      182.787  <--- OK
	anzRobos( 5,  70), ist:    1.131.754, soll:    1.131.754  <--- OK
	anzRobos( 5,  80), ist:    7.007.508, soll:    7.007.508  <--- OK
	anzRobos( 5,  90), ist:   43.388.630, soll:   43.388.630  <--- OK
	anzRobos( 5, 100), ist:  268.650.952, soll:  268.650.952  <--- OK
	anzRobos( 5, 110), ist:1.663.415.874, soll:1.663.415.874  <--- OK
	-----------------------------------
	Anzahl Fehler: 0
	-----------------------------------
	Rekursion05_Tst: Das war's erstmal!
	------------------------------------------------------------------------ */
	***************************************************************************
	// Datei Rekursion06_Tst.java
	/* -------------------------------------------------------------------------
	Dieses Programm Rekursion06_Tst enthaelt die 2 rekursiven Methoden
	anzWege und AnzPlusbaeume und testet sie.
	------------------------------------------------------------------------- */
	class Rekursion06_Tst {
	   // ----------------------------------------------------------------------
	   public static int anzWege(int x, int y) {
	      // x und y sollen nicht-negativ sein.
	      // Liefert die Anzahl der kuerzesten Wege, die in einem Rechtecksgitter
	      // vom Ursprung (0, 0) zum Punkt (x, y) fuehren.
	      // Beispiele:
	      // anzWege(0, 0) ist gleich  1  (von (0,0) nach (0,0) gibt es  1 Weg )
	      // anzWege(0, 1) ist gleich  1  (von (0,0) nach (0,1) gibt es  1 Weg )
	      // anzWege(1, 0) ist gleich  1  (von (0,0) nach (1,0) gibt es  1 Weg )
	      // anzWege(1, 1) ist gleich  2  (von (0,0) nach (1,1) gibt es  2 Wege)
	      // anzWege(2, 1) ist gleich  3  (von (0,0) nach (2,1) gibt es  3 Wege)
	      // anzWege(3, 4) ist gleich 10  (von (0,0) nach (3,4) gibt es 10 Wege)

	      return -1; // MUSS ERSETZT WERDEN
	   }
	   // ----------------------------------------------------------------------
	   static long anzPlusbaeume(int n) {
	      // Liefert die Anzahl der Plusbaeume die den Wert n haben. Dabei
	      // sollte n positiv (groesser gleich 1) sein.
	      //
	      // Beispiele:
	      // anzPlusbaeume(1) ist gleich 1
	      // anzPlusbaeume(2) ist gleich 2
	      // anzPlusbaeume(3) ist gleich 5
	      // anzPlusbaeume(6) ist gleich 188

	      return -1; // MUSS ERSETZT WERDEN
	   }
	   // ----------------------------------------------------------------------
	   static private int anzFehler = 0;
	   // ----------------------------------------------------------------------
	   static private void tst_anzWege(int x, int y, int soll) {
	      int ist = anzWege(x, y);

	      String text = " <--- OK";
	      if (ist != soll) {
	         text = " <--- Fehler?";
	         anzFehler++;
	      }

	      printf("anzWege(%d, %d), ist:%4d, soll:%4d %s%n",
	         x, y, ist, soll, text);
	   }
	   // ----------------------------------------------------------------------
	   static private void aus_anzWege() {
	      // Gibt die Anzahl von Wegen zwischen zwei Punkten in einem
	      // Rechteck-Gitter als ASCII-Gaphik aus

	      printf("Anzahl der Wege zwischen zwei%n");
	      printf("Punkten in einem Rechteck-Gitter:%n");
	      printf("---------------------------------%n");
	      final int MAX = 6;
	      for (int y=MAX; y>=0; y--) {
	         printf("%d-", y);
	         for (int x=0; x<=MAX; x++) {
	            printf("%4d", anzWege(x, y));
	         }
	         printf("%n");
	      }
	      printf("%n     |   |   |   |   |   |   |");
	      printf("%n     0   1   2   3   4   5   6%n");
	   }
	   // ----------------------------------------------------------------------
	   static private void tst_anzPlusbaeume(int n, long soll) {
	      long ist = anzPlusbaeume(n);

	      String text = " <--- OK";
	      if (ist != soll) {
	         text = " <--- Fehler?";
	         anzFehler++;
	      }

	      printf("anzPlusbaeume(%2d), ist:%13d, soll:%13d %s%n",
	         n, ist, soll, text);
	   }
	   // ----------------------------------------------------------------------
	   static public void main(String[] args) {

	      printf("Rekursion06_Tst: Das war's erstmal!%n%n");
	      printf("-----------------------------------%n");
	      tst_anzWege(0, 0,   1);
	      tst_anzWege(0, 1,   1);
	      tst_anzWege(0, 2,   1);
	      tst_anzWege(0, 3,   1);
	      tst_anzWege(0, 4,   1);
	      tst_anzWege(0, 5,   1);
	      printf("%n");
	      tst_anzWege(1, 0,   1);
	      tst_anzWege(1, 1,   2);
	      tst_anzWege(1, 2,   3);
	      tst_anzWege(1, 3,   4);
	      tst_anzWege(1, 4,   5);
	      tst_anzWege(1, 5,   6);
	      printf("%n");
	      tst_anzWege(2, 0,   1);
	      tst_anzWege(2, 1,   3);
	      tst_anzWege(2, 2,   6);
	      tst_anzWege(2, 3,  10);
	      tst_anzWege(2, 4,  15);
	      tst_anzWege(2, 5,  21);
	      printf("%n");
	      tst_anzWege(3, 0,   1);
	      tst_anzWege(3, 1,   4);
	      tst_anzWege(3, 2,  10);
	      tst_anzWege(3, 3,  20);
	      tst_anzWege(3, 4,  35);
	      tst_anzWege(3, 5,  56);
	      printf("%n");
	      tst_anzWege(4, 0,   1);
	      tst_anzWege(4, 1,   5);
	      tst_anzWege(4, 2,  15);
	      tst_anzWege(4, 3,  35);
	      tst_anzWege(4, 4,  70);
	      tst_anzWege(4, 5, 126);
	      printf("%n");
	      tst_anzWege(5, 0,   1);
	      tst_anzWege(5, 1,   6);
	      tst_anzWege(5, 2,  21);
	      tst_anzWege(5, 3,  56);
	      tst_anzWege(5, 4, 126);
	      tst_anzWege(5, 5, 252);
	      printf("----------------------------------%n");
	      aus_anzWege();
	      printf("----------------------------------%n");
	      tst_anzPlusbaeume( 1,            1L);
	      tst_anzPlusbaeume( 2,            2L);
	      tst_anzPlusbaeume( 3,            5L);
	      tst_anzPlusbaeume( 4,           15L);
	      tst_anzPlusbaeume( 5,           51L);
	      tst_anzPlusbaeume( 6,          188L);
	      tst_anzPlusbaeume( 7,          731L);
	      tst_anzPlusbaeume( 8,         2950L);
	      tst_anzPlusbaeume( 9,        12235L);
	      tst_anzPlusbaeume(10,        51822L);
	      tst_anzPlusbaeume(11,       223191L);
	      tst_anzPlusbaeume(12,       974427L);
	      tst_anzPlusbaeume(13,      4302645L);
	      tst_anzPlusbaeume(14,     19181100L);
	      tst_anzPlusbaeume(15,     86211885L);
	      tst_anzPlusbaeume(16,    390248055L);
	      tst_anzPlusbaeume(17,   1777495635L);
	      tst_anzPlusbaeume(18,   8140539950L);
	      tst_anzPlusbaeume(19,  37463689775L);
	      tst_anzPlusbaeume(20, 173164232965L);
	      printf("-----------------------------------%n");
	      printf("Anzahl Fehler: %d%n", anzFehler);
	      printf("-----------------------------------%n");
	      printf("Rekursion06_Tst: Das war's erstmal!%n%n");
	   } // main
	   // ----------------------------------------------------------------------
	   // Eine Methode mit einem kurzen Namen:
	   static void printf(String f, Object... v) {System.out.printf(f, v);}
	   // ----------------------------------------------------------------------
	} // class Rekursion06_Tst
	/* -------------------------------------------------------------------------
	Ausgabe (wenn alles OK ist):

	Rekursion06: Jetzt geht es los!
	----------------------------------
	anzWege(0, 0), ist:   1, soll:   1  <--- OK
	anzWege(0, 1), ist:   1, soll:   1  <--- OK
	anzWege(0, 2), ist:   1, soll:   1  <--- OK
	anzWege(0, 3), ist:   1, soll:   1  <--- OK
	anzWege(0, 4), ist:   1, soll:   1  <--- OK
	anzWege(0, 5), ist:   1, soll:   1  <--- OK

	anzWege(1, 0), ist:   1, soll:   1  <--- OK
	anzWege(1, 1), ist:   2, soll:   2  <--- OK
	anzWege(1, 2), ist:   3, soll:   3  <--- OK
	anzWege(1, 3), ist:   4, soll:   4  <--- OK
	anzWege(1, 4), ist:   5, soll:   5  <--- OK
	anzWege(1, 5), ist:   6, soll:   6  <--- OK

	anzWege(2, 0), ist:   1, soll:   1  <--- OK
	anzWege(2, 1), ist:   3, soll:   3  <--- OK
	anzWege(2, 2), ist:   6, soll:   6  <--- OK
	anzWege(2, 3), ist:  10, soll:  10  <--- OK
	anzWege(2, 4), ist:  15, soll:  15  <--- OK
	anzWege(2, 5), ist:  21, soll:  21  <--- OK

	anzWege(3, 0), ist:   1, soll:   1  <--- OK
	anzWege(3, 1), ist:   4, soll:   4  <--- OK
	anzWege(3, 2), ist:  10, soll:  10  <--- OK
	anzWege(3, 3), ist:  20, soll:  20  <--- OK
	anzWege(3, 4), ist:  35, soll:  35  <--- OK
	anzWege(3, 5), ist:  56, soll:  56  <--- OK

	anzWege(4, 0), ist:   1, soll:   1  <--- OK
	anzWege(4, 1), ist:   5, soll:   5  <--- OK
	anzWege(4, 2), ist:  15, soll:  15  <--- OK
	anzWege(4, 3), ist:  35, soll:  35  <--- OK
	anzWege(4, 4), ist:  70, soll:  70  <--- OK
	anzWege(4, 5), ist: 126, soll: 126  <--- OK

	anzWege(5, 0), ist:   1, soll:   1  <--- OK
	anzWege(5, 1), ist:   6, soll:   6  <--- OK
	anzWege(5, 2), ist:  21, soll:  21  <--- OK
	anzWege(5, 3), ist:  56, soll:  56  <--- OK
	anzWege(5, 4), ist: 126, soll: 126  <--- OK
	anzWege(5, 5), ist: 252, soll: 252  <--- OK
	----------------------------------
	Anzahl der Wege zwischen zwei
	Punkten in einem Rechteck-Gitter:
	---------------------------------
	6-   1   7  28  84 210 462 924
	5-   1   6  21  56 126 252 462
	4-   1   5  15  35  70 126 210
	3-   1   4  10  20  35  56  84
	2-   1   3   6  10  15  21  28
	1-   1   2   3   4   5   6   7
	0-   1   1   1   1   1   1   1

	     |   |   |   |   |   |   |
	     0   1   2   3   4   5   6
	----------------------------------
	anzPlusbaeume( 1), ist:               1, soll:               1  <--- OK
	anzPlusbaeume( 2), ist:               2, soll:               2  <--- OK
	anzPlusbaeume( 3), ist:               5, soll:               5  <--- OK
	anzPlusbaeume( 4), ist:              15, soll:              15  <--- OK
	anzPlusbaeume( 5), ist:              51, soll:              51  <--- OK
	anzPlusbaeume( 6), ist:             188, soll:             188  <--- OK
	anzPlusbaeume( 7), ist:             731, soll:             731  <--- OK
	anzPlusbaeume( 8), ist:           2.950, soll:           2.950  <--- OK
	anzPlusbaeume( 9), ist:          12.235, soll:          12.235  <--- OK
	anzPlusbaeume(10), ist:          51.822, soll:          51.822  <--- OK
	anzPlusbaeume(11), ist:         223.191, soll:         223.191  <--- OK
	anzPlusbaeume(12), ist:         974.427, soll:         974.427  <--- OK
	anzPlusbaeume(13), ist:       4.302.645, soll:       4.302.645  <--- OK
	anzPlusbaeume(14), ist:      19.181.100, soll:      19.181.100  <--- OK
	anzPlusbaeume(15), ist:      86.211.885, soll:      86.211.885  <--- OK
	anzPlusbaeume(16), ist:     390.248.055, soll:     390.248.055  <--- OK
	anzPlusbaeume(17), ist:   1.777.495.635, soll:   1.777.495.635  <--- OK
	anzPlusbaeume(18), ist:   8.140.539.950, soll:   8.140.539.950  <--- OK
	anzPlusbaeume(19), ist:  37.463.689.775, soll:  37.463.689.775  <--- OK
	anzPlusbaeume(20), ist: 173.164.232.965, soll: 173.164.232.965  <--- OK
	----------------------------------
	Anzahl Fehler: 0
	----------------------------------
	Rekursion06: Das war's erstmal!
	------------------------------------------------------------------------- */
	***************************************************************************
	// Datei Rekursion07_Tst.java
	/* ------------------------------------------------------------------------
	Dieses Programm Rekursion07_Tst enthaelt die rekursive Methode binSuch
	und testet sie.

	Die Methode sucht in einer sortierten Reihungen eine bestimmte Komponente.
	------------------------------------------------------------------------ */
	import java.util.Arrays;

	class Rekursion07_Tst {
	   // ---------------------------------------------------------------------
	   static int binSuch(long[] r, long n, int von, int bis) {
	      // Verlaesst sich darauf, dass
	      // 1. r keine Doppelgaenger enthaelt (der Einfachheit halber)
	      // 2. r aufsteigend sortiert ist
	      // 3. von und bis Indizes der Reihung r sind.
	      // Sucht in der Teilreihung r[von..bis] nach n.
	      // Wird n gefunden, so wird der Index i von n (d.h. der Index i fuer
	      // den n == r[i] gilt) als Ergebnis geliefert.
	      // Sonst wird der Index i geliefert, an dem n eingefuegt werden
	      // sollte (damit r nach dem Einfuegen weiterhin sortiert ist).
	      //
	      // Hinweis: Wenn n groesser ist als alle Komponenten der Teilreihung
	      // r[von..bis], dann wird bis+1 als Ergebnis geliefert. bis+1 ist
	      // offensichtlich kein Index der Teilreihung r[von..bis] und
	      // moeglicherweise auch groesser als alle Indizes der Reihung r.
	      //
	      // Beispiele:
	      // long[]    r1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
	      // final int GI = r1.length-1; // Groesster Index von r1
	      // binSuch(r1, 10, 0, GI) ist gleich 0
	      // binSuch(r1, 20, 0, GI) ist gleich 1
	      // binSuch(r1, 30, 0, GI) ist gleich 2
	      // binSuch(r1, 90, 0, GI) ist gleich 8
	      // binSuch(r1,  5, 0, GI) ist gleich 0
	      // binSuch(r1, 15, 0, GI) ist gleich 1
	      // binSuch(r1, 25, 0, GI) ist gleich 2
	      // binSuch(r1, 35, 0, GI) ist gleich 3
	      // binSuch(r1, 95, 0, GI) ist gleich 9 // 9 ist kein Index von r1

	      return -1; // MUSS ERSETZT WERDEN
	   }
	   // ---------------------------------------------------------------------
	   static long[] r1        = {10, 20, 30, 40, 50, 60, 70, 80, 90};
	   static int    anzFehler = 0;
	   // ---------------------------------------------------------------------
	   static private void tst(long n, int von, int bis, int soll) {
	      int ist = binSuch(r1, n, von, bis);

	      String text = " <--- OK";
	      if (ist != soll) {
	         text = " <--- Fehler?";
	         anzFehler++;
	      }

	      printf("binSuch(r1, %2d, %d, %d), ist: %d, soll:%d %s%n",
	         n, von, bis, ist, soll, text);
	   }
	   // ---------------------------------------------------------------------
	   static public void main(String[] args) {
	      printf("Rekursion07_Tst: Jetzt geht es los!%n");
	      printf("-------------------------------------%n");

	      printf("r1: %s%n", Arrays.toString(r1));
	      printf("-------------------------------------%n");
	      printf("Komponenten, die in r1 vorhanden sind:%n%n");
	      tst(10, 0, 8, 0);
	      tst(20, 0, 8, 1);
	      tst(30, 0, 8, 2);
	      tst(40, 0, 8, 3);
	      tst(50, 0, 8, 4);
	      tst(60, 0, 8, 5);
	      tst(70, 0, 8, 6);
	      tst(80, 0, 8, 7);
	      tst(90, 0, 8, 8);
	      printf("-------------------------------------%n");
	      printf("Komponenten, die in r1 NICHT vorhanden sind:%n%n");
	      tst( 5, 0, 8, 0);
	      tst(15, 0, 8, 1);
	      tst(25, 0, 8, 2);
	      tst(35, 0, 8, 3);
	      tst(45, 0, 8, 4);
	      tst(55, 0, 8, 5);
	      tst(65, 0, 8, 6);
	      tst(75, 0, 8, 7);
	      tst(85, 0, 8, 8);
	      tst(95, 0, 8, 9);
	      printf("-------------------------------------%n");
	      printf("Komponenten, die in r1[2..6] vorhanden sind:%n%n");
	      tst(30, 2, 6, 2);
	      tst(40, 2, 6, 3);
	      tst(50, 2, 6, 4);
	      tst(60, 2, 6, 5);
	      tst(70, 2, 6, 6);
	      printf("-------------------------------------%n");
	      printf("Komponenten, die in r1[2..6] NICHT vorhanden sind:%n%n");
	      tst(25, 2, 6, 2);
	      tst(35, 2, 6, 3);
	      tst(45, 2, 6, 4);
	      tst(55, 2, 6, 5);
	      tst(65, 2, 6, 6);
	      tst(75, 2, 6, 7);
	      printf("-----------------------------------%n");
	      printf("Anzahl Fehler: %d%n", anzFehler);
	      printf("-----------------------------------%n");
	      printf("Rekursion07_Tst: Das war's erstmal!%n%n");
	   } // main
	   // ---------------------------------------------------------------------
	   // Eine Methode mit einem kurzen Namen:
	   static void printf(String f, Object... v) {System.out.printf(f, v);}
	   // ---------------------------------------------------------------------
	} // class Rekursion07_Tst
	/* ------------------------------------------------------------------------
	Ausgabe (wenn alles OK ist):

	Rekursion07_Tst: Jetzt geht es los!
	-------------------------------------
	r1: [10, 20, 30, 40, 50, 60, 70, 80, 90]
	-------------------------------------
	Komponenten, die in r1 vorhanden sind:

	binSuch(r1, 10, 0, 8), ist: 0, soll:0  <--- OK
	binSuch(r1, 20, 0, 8), ist: 1, soll:1  <--- OK
	binSuch(r1, 30, 0, 8), ist: 2, soll:2  <--- OK
	binSuch(r1, 40, 0, 8), ist: 3, soll:3  <--- OK
	binSuch(r1, 50, 0, 8), ist: 4, soll:4  <--- OK
	binSuch(r1, 60, 0, 8), ist: 5, soll:5  <--- OK
	binSuch(r1, 70, 0, 8), ist: 6, soll:6  <--- OK
	binSuch(r1, 80, 0, 8), ist: 7, soll:7  <--- OK
	binSuch(r1, 90, 0, 8), ist: 8, soll:8  <--- OK
	-------------------------------------
	Komponenten, die in r1 NICHT vorhanden sind:

	binSuch(r1,  5, 0, 8), ist: 0, soll:0  <--- OK
	binSuch(r1, 15, 0, 8), ist: 1, soll:1  <--- OK
	binSuch(r1, 25, 0, 8), ist: 2, soll:2  <--- OK
	binSuch(r1, 35, 0, 8), ist: 3, soll:3  <--- OK
	binSuch(r1, 45, 0, 8), ist: 4, soll:4  <--- OK
	binSuch(r1, 55, 0, 8), ist: 5, soll:5  <--- OK
	binSuch(r1, 65, 0, 8), ist: 6, soll:6  <--- OK
	binSuch(r1, 75, 0, 8), ist: 7, soll:7  <--- OK
	binSuch(r1, 85, 0, 8), ist: 8, soll:8  <--- OK
	binSuch(r1, 95, 0, 8), ist: 9, soll:9  <--- OK
	-------------------------------------
	Komponenten, die in r1[2..6] vorhanden sind:

	binSuch(r1, 30, 2, 6), ist: 2, soll:2  <--- OK
	binSuch(r1, 40, 2, 6), ist: 3, soll:3  <--- OK
	binSuch(r1, 50, 2, 6), ist: 4, soll:4  <--- OK
	binSuch(r1, 60, 2, 6), ist: 5, soll:5  <--- OK
	binSuch(r1, 70, 2, 6), ist: 6, soll:6  <--- OK
	-------------------------------------
	Komponenten, die in r1[2..6] NICHT vorhanden sind:

	binSuch(r1, 25, 2, 6), ist: 2, soll:2  <--- OK
	binSuch(r1, 35, 2, 6), ist: 3, soll:3  <--- OK
	binSuch(r1, 45, 2, 6), ist: 4, soll:4  <--- OK
	binSuch(r1, 55, 2, 6), ist: 5, soll:5  <--- OK
	binSuch(r1, 65, 2, 6), ist: 6, soll:6  <--- OK
	binSuch(r1, 75, 2, 6), ist: 7, soll:7  <--- OK
	-------------------------------------
	Anzahl Fehler: 0
	-------------------------------------
	Rekursion07_Tst: Das war's erstmal!
	------------------------------------------------------------------------ */
	***************************************************************************
}
