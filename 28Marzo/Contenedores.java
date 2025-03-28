



import java.lang.reflect.Array;
import java.util.*;


public class Contenedores{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
    
        String nombre = "Isidro";
        nombre.length();

        System.out.println("Tamaño n "+nombre.length());

        //System.out.println(nombre.charAt(nombre.length()-1));
        for (int i = nombre.length()-1; i >= 0 ; i--) {
            System.out.println(nombre.charAt(i));
        }

    }
}