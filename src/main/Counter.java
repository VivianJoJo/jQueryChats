package main;

public class Counter {

	private static int count;

	public static int getCount() {
		return count++;
	}
}
