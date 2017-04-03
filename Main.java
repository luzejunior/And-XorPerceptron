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
	public float result;

	public OPNeuron(Neuron A, Neuron B, float OPSinaptic){
		A.setSinaptics(OPSinaptic);
		B.setSinaptics(OPSinaptic);
		result = (A.mult()) + (B.mult());
	}

	public int testOP(){
		if(result > 1){
			return 1;
		}else{
			return 0;
		}
	}
}