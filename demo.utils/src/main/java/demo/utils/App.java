package demo.utils;

public class App {
	
	static final String wa = "Billi"; //object static final
	static final int karyawan = 5;
	String nama ,umur; // variable local
	
	String department = "IT";
	String jabatan = "Head IT";
	
	
	public static void main (String [] args) { //static void main
		
		
		App getData = new App();// Membuat Objek dari Class App
		getData.getIdentitas(); //memangambil objek dari void getIdentitas
		
		
		System.out.println("Departemen = "+getData.getDepartment());//mengembalikan objek dari return getDepartment
		System.out.println("Jabatan = "+getData.getJabatan()); //mengembalikan objek dari return getJabatan
		
		
		while(true) {
			
			if(wa!=null || wa.equals(wa)) {
				
			try {
				getData(wa);
				Integer time = checkData();
				Thread.sleep(time);
			} catch (Exception e) {
				// TODO: handle exception
			 System.out.print(e.toString());
			}	
		}
			System.out.println("Pesan selesai dikirim ");
			break;
	 }
		
	}

	
	public static Integer checkData() { //return with parameter
		Integer time = 60000;//time
		return time;
	}
	public static void getData(String check) { //void with parameter
		
		for(int i = 1; i <= karyawan; i++) {
		if(check.equals("Billi")) //check	
			try {
				Thread.sleep(10000);
				System.out.println("Pesan dikirim ke karyawan "+ i +" = pesan dari "+ check);
				//Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.print(e.toString());
			}
		else {
			System.out.println("Pesan tidak dikirim ke karyawan");
			break;
		  }
		}
	}
	
	void getIdentitas() { //void tanpa parameter
		nama = "Billi";
		umur = "17";
		System.out.println("Nama saya = "+ nama);
		System.out.println("Umur saya = "+ umur);
	}
	
	String getDepartment() { //return tanpa parameter
		return department;
	}
	String getJabatan() { //return tanpa parameter
		return jabatan;
	}
	
}
