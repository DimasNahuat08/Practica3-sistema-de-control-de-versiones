package e1_s_o;
import java.util.Scanner;

public class E1_S_O {


    public static void main(String[] args) {
        
        System.out.println("escriba una palabra para deletrear: ");
        String palabra= "";
        Scanner s = new Scanner(System.in);
        palabra = s.nextLine();
        int i=0;
        int cont = 0;
        while(i < palabra.length()){
          cont = cont + 1;
            System.out.println("letra: "+cont+"="+palabra.substring(0+i,1+i));
            i= i+1;
        }
    }
    
}
