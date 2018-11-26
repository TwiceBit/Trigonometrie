
public class Trigonometrie {

	public static double Trigonometrie(double a, double b, double c, char winkel, double wink) {

		if (winkel == 'a') {
			double ak = 0;
			double gk = 0;
			double hp = 0;
			if (a != 0) {
				gk = a;
			}
			if (b != 0) {
				ak = b;
			}
			if (c != 0) {
				hp = c;
			}

			if (gk != 0 && hp != 0) {
				double akgk = gk / hp;
				double sin = Math.asin(akgk);
				return Math.toDegrees(sin);
			}

		} else if (winkel == 'ß') {
			double ak = 0;
			double gk = 0;
			double hp = 0;
			if (a != 0) {
				ak = a;
			}
			if (b != 0) {
				gk = b;
			}
			if (c != 0) {
				hp = c;
			}

			if (hp != 0 && ak != 0) {
				double akhp = ak / hp;
				double cos = Math.acos(akhp);
				return Math.toDegrees(cos);
			}

		} else if (winkel == 'y') {
			double ak = 0;
			double gk = 0;
			double hp = 0;
			if (a != 0 && b != 0) {
				if (a < b) {
					ak = b;
					gk = a;

				} else {
					ak = a;
					gk = b;
				}
			}

			if (c != 0) {
				hp = c;
			}

			if (ak != 0 && gk != 0) {
				double div = gk / ak;
				double tan = Math.atan(div);
				return Math.toDegrees(tan);
			}

		}
		return 0;

	}

}
