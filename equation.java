//Yang Zhou
//10/6/2016
//this is a simple program of the ideal gas law.
//select the parameter you want to calculate,
//and then put in the known parameters in the dialogs.



//this is the main program

package idealgaslawproject;
import javax.swing.JOptionPane;


public class equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gas gas1 = new gas();
		
		//the following lines are used to set the parameters
		
		
		Object[] possibleValues = { "temperature", "pressure", "volume","amount of gas"};
		String selectedValue = (String)JOptionPane.showInputDialog(null,
		"Calculate:", "Output",
		JOptionPane.INFORMATION_MESSAGE, null,
		possibleValues, possibleValues[0]);
		
		//set temperature here, unit: K
		if (selectedValue != "temperature") {
			String a = JOptionPane.showInputDialog("temperature (K):") ;
			double b = Double.parseDouble(a);
			gas1.setT(b);}
			//gas1.setT(273.15);  //for testing
		
		
		//set amount of substance of gas, unit: mole
		if (selectedValue != "amount of gas") {
			String c = JOptionPane.showInputDialog("amount of substance of gas (mol):") ;
			double d = Double.parseDouble(c);
			gas1.setn(d);}
		//gas1.setn(1);   //for testing
		
		
		//set pressure here, unit: kPa
		if (selectedValue != "pressure") {
			String e = JOptionPane.showInputDialog("pressure (kPa):") ;
			double f = Double.parseDouble(e);
			gas1.setP(f);}		
		//gas1.setP(101.325);   //for testing
		
		
		//set volume here, unit: L
		if (selectedValue != "volume") {
			String g = JOptionPane.showInputDialog("volume (L):") ;
			double h = Double.parseDouble(g);
			gas1.setv(h);}
		//gas1.setv(22.41410);   //for testing
		
		
		// calculate parameters based on PV=nRT
		if (selectedValue == "pressure") {
				double P =  gas1.getn() * gas1.getR() * gas1.getT() / gas1.getV();  
				gas1.setP( P );
		}
		
		if (selectedValue == "volume") {
			double V =  gas1.getn() * gas1.getR() * gas1.getT() / gas1.getP() ; 
			gas1.setv( V );
	}
		
		if (selectedValue == "amount of gas") {
			double n = gas1.getV() * gas1.getP() / (gas1.getR() * gas1.getT());
			gas1.setn( n );
	}
		
		if (selectedValue == "temperature") {
			double t = gas1.getV() * gas1.getP() / (gas1.getR() * gas1.getn());
			gas1.setT( t );
	}

		
		System.out.println("the temperature is:" + gas1.getT() + " K");
		
		System.out.println("the pressure is:" + gas1.getP() + " kPa");
		
		System.out.println("the volume is:" + gas1.getV() + " L");
		
		System.out.println("the vamount of substance of gas is:" + gas1.getn() + " mol");
		
		
		if (gas1.getP() *  gas1.getV() == gas1.getR() * gas1.getT() * gas1.getn()) {
			System.out.println("the equation is true");
		}
		

	}

}
