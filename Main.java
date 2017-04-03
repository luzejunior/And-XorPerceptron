import java.util.*;

public class Main{
	public static void main(String[] args) {
		Neuron A = new Neuron(0);
		Neuron B = new Neuron(0);
		
		OPNeuron And = new OPNeuron(A, B, 0.6);
		OPNeuron Or = new OPNeuron(A, B, 1.1);
		OPNeuron Xor = new OPNeuron(And, Or);

		System.out.println(And.toString());
		System.out.println(Or.toString());
		System.out.println(Xor.toString());
	}
}

class Neuron{
	public int value;
	public double sinaptics;

	public Neuron(int x){
	value = x;
	}

	public void setSinaptics(double w){
		sinaptics = w;
	}

	public double mult(){
		return value*sinaptics;
	}
}

class OPNeuron{
	public double result;
	public int bool;

	public OPNeuron(Neuron A, Neuron B, double OPSinaptic){
		A.setSinaptics(OPSinaptic);
		B.setSinaptics(OPSinaptic);
		result = (A.mult()) + (B.mult());
		testOP();
	}

	public OPNeuron(OPNeuron Op1, OPNeuron Op2){
		result = ((Op1.bool)*(-2)) + ((Op2.bool)*1.1);
		testOP();
	}

	public void testOP(){
		if(result > 1){
			bool = 1;
		}else{
			bool = 0;
		}
	}

	public String toString(){
		return "Resultado final: " + bool;
	}
}