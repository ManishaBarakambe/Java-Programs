package chapter1;

	class NumberSeries {
	  
	    void printSeries() {
	        System.out.println("Series from 1 to 10:");
	        for (int i = 1; i <= 10; i++) {
	            System.out.print(i + " ");
	        }
	    }
	}

	public class P20 {
	    public static void main(String[] args) {
	    
	        NumberSeries series = new NumberSeries();

	        series.printSeries();
	    }
	}


