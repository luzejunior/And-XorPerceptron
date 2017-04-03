/*

Author: Luzenildo de Sousa Batista Junior
E-Mail: luzejunior94@gmail.com

License:

MIT License

Copyright (c) 2017 Luzenildo de Sousa Batista Junior

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

*/

//Imports
import java.util.*;

//Main class:
public class Main{
	public static void main(String[] args) {

		//Neurons:
		Neuron A = new Neuron(0);
		Neuron B = new Neuron(0);
		
		//Operations And, Or and Xor.
		OPNeuron And = new OPNeuron(A, B, 0.6);
		OPNeuron Or = new OPNeuron(A, B, 1.1);
		OPNeuron Xor = new OPNeuron(And, Or);

		//Prints:
		System.out.println("And " + And.toString());
		System.out.println("Or " + Or.toString());
		System.out.println("Xor " + Xor.toString());
	}
}

//Neuron Class:
class Neuron{

	//Variables:
	public int value;
	public double sinaptics;

	//Class Constructor.
	public Neuron(int x){
	value = x;
	}

	//Method to set sinaptics.
	public void setSinaptics(double w){
		sinaptics = w;
	}

	//Method to multiply the sinaptics with the binary value.
	public double mult(){
		return value*sinaptics;
	}
}

//Operations Class:
class OPNeuron{

	//Variables:
	public double result;
	public int bool;

	//Class constructor for create an neuron with two other neurons.
	public OPNeuron(Neuron A, Neuron B, double OPSinaptic){
		A.setSinaptics(OPSinaptic);
		B.setSinaptics(OPSinaptic);
		result = (A.mult()) + (B.mult());
		testOP();
	}

	//Class constructor for create an neuron with the results of operations from two other neurons.
	public OPNeuron(OPNeuron Op1, OPNeuron Op2){
		result = ((Op1.bool)*(-2)) + ((Op2.bool)*1.1);
		testOP();
	}

	//Method to test the result of operations and do the respective result to the boolean binary condition.
	public void testOP(){
		if(result > 1){
			bool = 1;
		}else{
			bool = 0;
		}
	}

	//To String method
	public String toString(){
		return "Resultado final: " + bool;
	}
}