package chun;

public class Laporan1 {
	
public static void main(String[] args) {
        
		System.out.println("WELCOME LAPORAN 1 \n");
       
        biodata();
        aritmatika();

    }
	
	public static void aritmatika()
	{
		//buat variabel untuk menampung data
		 int a=3,b=4,c=1;
	        double d=0;
	       
	        System.out.println("\n=== Operasi Aritmatika ===\n");
	        //tambah
	        c=a+b;
	        System.out.println("Hasil dari "+a+"+"+b+"="+c);
	        //kurang
	        c=a-b;
	        System.out.println("Hasil dari "+a+"-"+b+"="+c);
	        //kali
	        c=a*b;
	        System.out.println("Hasil dari "+a+"*"+b+"="+c);
	        //bagi
	        d=(double)a/b;
	        System.out.println("Hasil dari "+a+"/"+b+"="+d);
	        //modulus
	        c=a%b;
	        System.out.println("Hasil dari "+a+"mod"+b+"="+c);
	        
	}
	
	public static void biodata()
	{
		String name ="Rasimah";
		String nim ="60200112028";
		System.out.println("Nama "+name+ "\nNim  "+nim);
	}

}

