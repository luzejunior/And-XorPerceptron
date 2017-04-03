/*

Author: Luzenildo de Sousa Batista Junior
E-Mail: luzejunior94@gmail.com

License:

MIT License

Copyright (c) 2016 Luzenildo de Sousa Batista Junior

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