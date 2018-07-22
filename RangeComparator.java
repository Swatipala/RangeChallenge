package com.util;

import java.util.Comparator;

import com.pojo.Range;

public class RangeComparator implements Comparator<Range> {

	@Override
	public int compare(Range o1, Range o2) {
		// TODO Auto-generated method stub
		return o1.getMin_range() - o2.getMin_range();
	}

}
