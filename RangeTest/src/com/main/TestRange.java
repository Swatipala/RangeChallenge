package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.pojo.Range;
import com.util.RangeComparator;

public class TestRange {

	public static void main(String args[]) {
		List<Range> inputRange = new ArrayList<>();
		inputRange.add(new Range(94133,94133));
		inputRange.add(new Range(94200,94299));
		inputRange.add(new Range(94226,94399));
		System.out.println("Input Ranges: "+ inputRange);
		TestRange finalRange = new TestRange();
		System.out.println("Merged Ranges:  "+finalRange.mergeRange(inputRange));
		
	}

	private List<Range>  mergeRange(List<Range> inputRange) {
		if(!isValid(inputRange)) {
			return inputRange;
		}
			Collections.sort(inputRange,new RangeComparator());
			List<Range> mergeList = new ArrayList<>();
			Range preRange = inputRange.get(0);
			for(Range currRange : inputRange) {
				if(preRange.getMax_range()>=currRange.getMin_range()) {
					Range mergeRange = new Range(preRange.getMin_range(),Math.max(preRange.getMax_range(),currRange.getMax_range()));
					preRange=mergeRange;
				} else {
					mergeList.add(preRange);
					preRange = currRange;
				}
			
		}
			
			mergeList.add(preRange);
			
		return mergeList;
	}

	private boolean isValid(List<Range> inputRange) {
		boolean flag =false;
		if(null !=inputRange &&  inputRange.size()!=0) {
			flag = true;
		}
		
		return flag;
	}
	
	
}
