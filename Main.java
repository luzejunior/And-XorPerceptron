import java.util.*;

class Neuron{
	public int value;
	public float sinaptics;

	public Neuron(int x){
	value = x;
	}

	public void setSinaptics(float w){
		sinaptics = w;
	}

	public float mult(){
		return value*sinaptics;
	}
}

class OPNeuron{
	public double result;
	public int bool;

	public OPNeuron(Neuron A, Neuron B, float OPSinaptic){
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
}