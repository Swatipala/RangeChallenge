package com.pojo;

public class Range {

	private int min_range;
	private int max_range;

	public Range(int min_range, int max_range) {
		super();
		this.min_range = min_range;
		this.max_range = max_range;
	}

	public int getMin_range() {
		return min_range;
	}

	public void setMin_range(int min_range) {
		this.min_range = min_range;
	}

	public int getMax_range() {
		return max_range;
	}

	public void setMax_range(int max_range) {
		this.max_range = max_range;
	}

	@Override
	public String toString() {
		return "Range [min_range=" + min_range + ", max_range=" + max_range + "]";
	}

}
