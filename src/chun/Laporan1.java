package chun;

public class Laporan1 {
	
static String cun= "Welcome Laporan 1 \n"; //berikan penjelasan
	
public static void main(String[] args) {
        
		System.out.println(cun); //berikan penjelasan
       
        biodata(); //berikan penjelasan
        aritmatika(); //berikan penjelasan

    }
	
	public static void aritmatika() //berikan penjelasan
	{
		//buat variabel untuk menampung data
		 int a=3,b=4,c=1; 
	        double d=0;
	       
	        System.out.println("\n=== Operasi Aritmatika ===\n");
	        //tambah
	        c=a+b; //berikan penjelasan
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
	        //modulus //berikan penjelasan lengkap
	        c=a%b;
	        System.out.println("Hasil dari "+a+"mod"+b+"="+c);
	        
	}
	
	public static void biodata() //berikan penjelasan
	{
		String name ="Rasimah"; //berikan penjelasan
		String nim ="60200112028";
		System.out.println("Nama "+name+ "\nNim  "+nim);
	}

}

