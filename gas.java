package idealgaslawproject;

public class gas {
	
	private double pressure;
	private double volume;   
	private double R = 8.3144598;  //gas constant = 8.3144598(48) L kPa K−1 mol−1
	private double T; 
	private double n;
	
	
    //this is a setter
	public void setT(double T) {
		this.T = T;
	}
	
	public void setP(double P) {
		this.pressure = P;
	}
	
	public void setn(double n) {
		this.n = n;
	}	
	
	public void setv(double v) {
		this.volume = v;
	}	
	
	
	//this is a getter
	public double getP() {
		return pressure;
	}
	
	public double getV() {
		return volume;
	}

	
	public double getR() {
		return R;
	}
	
	public double getT() {
		return T;
	}
	
	public double getn() {
		return n;
	}
	
}

