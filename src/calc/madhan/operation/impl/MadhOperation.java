package calc.madhan.operation.impl;

import calc.madhan.operation.Operation;

public class MadhOperation implements Operation {

	@Override
	public double apply(double a, double b) {
		return 2 * (a + b);
	}

	// 50 line public method
	// db - load data -> 20 line
	// process data -> 20 line
	// combine data -> 9
	// return combined data -> last line

	// 4 line public method
	// first line -> load data
	// second processdata(data)
	// third line combinedata(processeddata)
	// return combined data

	// 20 line private method -> loaddata

	// 20 line private method -> process data

	// 10 line private method -> combine data

}
