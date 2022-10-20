package demo.utils;

public class App {
	
	static  String wa = "Trisna"; //object static final
	static  int karyawan = 5;
	
//	String nama ,umur; // variable local
//	String department = "IT";
//	String jabatan = "Head IT";
	
	
	public static void main (String [] args) { //static void main
		
		
		//App getData = new App();// Membuat Objek dari Class App
		//getData.getIdentitas(); //memangambil objek dari void getIdentitas
		
		
		//System.out.println("Departemen = "+getData.getDepartment());//mengembalikan objek dari return getDepartment
		//System.out.println("Jabatan = "+getData.getJabatan()); //mengembalikan objek dari return getJabatan
		
		
		while(true) {
			
			if(wa!=null) {
			try {
				
				System.out.println("Sedang buka WA, check wa trisna....");
				Thread.sleep(10000);
				getData(wa);
				Integer time = checkData();
				Thread.sleep(time);
			} catch (Exception e) {
				// TODO: handle exception
			 System.out.print(e.toString());
			}	
			if(wa.equals("Trisna"))System.out.println("Pesan selesai dikirim browhhh");
		  } 
			if(!wa.equals("Trisna")) System.out.println("Pesan dari trisna tidak ada.... ");
			break;
	     }
		
	}

	
	 static Integer checkData() { //return with parameter
		Integer time = 60000;//time
		return time;
	}
	 static void getData(String check)  { //void with parameter
		
		for(int i = 1; i <= karyawan; i++) {
		if(check.equals("Trisna")) //check	
			try {
				Thread.sleep(20000);
				System.out.println("Billi mengirimkan pesan wa "+check+ " ke karyawan "+ i );
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.print(e.toString());
			}
		   else {
			System.out.println("Pesan tidak dikirim ke karyawan,karena bukan pesan dari trisna");
			break;
		  }
		}
	}
	
//	void getIdentitas() { //void tanpa parameter
//		nama = "Billi";
//		umur = "17";
//		System.out.println("Nama saya = "+ nama);
//		System.out.println("Umur saya = "+ umur);
//	}
//	
//	String getDepartment() { //return tanpa parameter
//		return department;
//	}
//	String getJabatan() { //return tanpa parameter
//		return jabatan;
//	}
	
}
