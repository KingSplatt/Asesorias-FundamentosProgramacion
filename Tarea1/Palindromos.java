import java.util.Scanner;

public class Palindromos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        String aux = "";
        
        for (int i = palabra.length()-1; i >= 0; i--) {
            aux = aux+ palabra.charAt(i);
        } 
        
        if(aux.equals(palabra)){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }
}