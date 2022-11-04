import java.util.Scanner;
   
   public class Main {
	static Scanner castillo_scan = new Scanner(System.in);
	   
	   private static String Namef,NameM,NameL; 
	   private static double Gross,sss = 8,hdmf = 5,philhealth = 2,Totaldeduction,NetPay;
	
	public static void Input(){
		System.out.println("\t\t\t\t+-------------------------------------------------------+\t\t\t\t");
		System.out.println("\t\t\t\t==CODER:RICEO.CASTILLO=[A.K.A=ZEDY.ZEDI]=================\t\t\t\t");
		System.out.println("\t\t\t\t+-------------------------------------------------------+\t\t\t\t");
		System.out.print("\t\t\t\tINPUT FULLNAME:");
		Namef = castillo_scan.next();
		NameM = castillo_scan.next();
		NameL = castillo_scan.next();
		System.out.print("\t\t\t\tINPUT GROSS PAY: ");
		Gross = castillo_scan.nextDouble();
	}
	public static void Output(){
     String initial = NameM.substring(0,1);

        sss=sss*Gross/100;
		hdmf=hdmf*Gross/100;
		philhealth=philhealth*Gross/100;
	    Totaldeduction = sss + hdmf + philhealth;
	    NetPay =Gross - Totaldeduction;
		System.out.println(" ");
		System.out.println("\t\t\t\t+-------------------------------------------------------+\t\t\t\t");
		System.out.println("\t\t\t\t EMPLOYEE NAME:"+" "+Namef+" "+initial+"."+" "+NameL);
		System.out.println("\t\t\t\t+-------------------------------------------------------+\t\t\t\t");   
		System.out.println("\t\t\t\t SSS                :"+" "+sss); 
		System.out.println("\t\t\t\t HDMF            :"+" "+hdmf); 
        System.out.println("\t\t\t\t PHILHEALTH:"+" "+philhealth); 
		System.out.println("\t\t\t\t+-------------------------------------------------------+\t\t\t\t");
		System.out.println("\t\t\t\t DEDUCT:"+" "+Totaldeduction);                                         
		System.out.println("\t\t\t\t NETPAY:"+" "+NetPay);                                         
		System.out.println("\t\t\t\t+-------------------------------------------------------+\t\t\t\t");
		System.out.println("(\\_/)");
		System.out.println("(0_0) ~ Yamete");
		System.out.println("/>  >");

	}
	public static void main(String[] args) {
		Input();
		Output();
	}
}
//Gross - percentage
//CODER:RICEO CASTILLO
