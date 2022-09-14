package Day3_Assignment;

public class Fib {
	private int start, end;

	public Fib(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void printFibInRange() {
		if (start < 1 || end < 1) {
			System.out.println("Range should be in Between 1 to Infinity");
		} else if (start > end) {
			System.out.println("Start should be greater than end");
		} else {
			int currFirst = 0;
			int currSec = 1, nextSec;
			int i = 1;

			while (i <= end) {
				if (i >= start)
					System.out.println(currFirst + " ");
				nextSec = currFirst + currSec;
				currFirst = currSec;
				currSec = nextSec;
				i++;
			}

		}
	}
}
