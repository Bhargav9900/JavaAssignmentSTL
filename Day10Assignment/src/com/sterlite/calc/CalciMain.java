package com.sterlite.calc;

import com.sterlite.calc.threads.CalculatorThread;
import com.sterlite.calc.threads.TotalReaderThread;

public class CalciMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {10,50,45,34,-23};
		
		Data data = new Data(arr);
		
		CalculatorThread calciTh = new CalculatorThread(data);
		
		TotalReaderThread readerTh = new TotalReaderThread(data);
		
		readerTh.start();
		calciTh.start();
		
	}

}
