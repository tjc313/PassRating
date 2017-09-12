package pkgMain;

public class PR {
	private double Comp;
	private int TD;
	private int Att;
	private int Yards;
	private int INT;
	
	public PR() {
		this.Comp = 0;
		this.TD = 0;
		this.Att = 0;
		this.Yards = 0;
		this.INT = 0;
	}
	public PR(double Comp, int TD, int Att, int Yards, int INT) {
		this.Comp = Comp;
		this.TD = TD;
		this.Att = Att;
		this.Yards = Yards;
		this.INT = INT;
	}
	public double fA() {
		return ((Comp/Att) - 0.3) * 5;
	}
	public double fB() {
		return ((Yards/Att) - 3) * 0.25;
	}
	public double fC() {
		return (TD/Att) * 20;
	}
	public double fD() {
		return 2.375 - ((INT/Att) * 25);
	}
	public double fPR() {
		return ((fA()+fB()+fC()+fD())/6);
	}

}
