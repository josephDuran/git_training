import java.util.Scanner;
public class If{
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	String hola = scanner.nextLine();
	boolean a=true; 
	if (a == true){// si 
		System.out.println("Hola "+hola);
	}else{
		System.out.println("Adéu");
	}
 }
}
