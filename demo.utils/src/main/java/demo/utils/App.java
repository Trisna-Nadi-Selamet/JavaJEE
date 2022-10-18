package demo.utils;

public class App {
	static final String data = "Bill"; //object static final
	
	
	public static void main (String [] args) { //static void main
		while(true) {
			try {
				getData(data );
				Integer time = checkData();
				Thread.sleep(time);
			} catch (Exception e) {
				// TODO: handle exception
			 System.out.print(e.toString());
			}	
		}
	}

	
	public static Integer checkData() { //return with parameter
		Integer time = 60000;
		//time;
		return time;
	}
	public static void getData(String check) { //void with parameter
		//check ;
		if(check.equals("Billi")) {
			System.out.println("Data sama = "+ check);
		}else {
			System.out.println("Data beda = "+check);
		}
		
	}
}
