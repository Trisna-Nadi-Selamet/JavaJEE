package demo.utils;

public class AppInsertion_sort {

	public static void main(String[]args) {
		
		int a[]={8,5,9,6,3,4,2,1,7,5};
        
		for(int i=0; i<a.length; i++){ //looping dengan jumlah array
            int min = a[i];
            int j = i;
            while((j>0) && (min<a[j-1])){
                a[j] = a[j-1];
                j--;
            }
            a[j] = min;
        }
        //mencetak hasil urut
        for(int h=0; h<a.length; h++){
            System.out.println(a[h] + ",");
        }
     
	}
}
