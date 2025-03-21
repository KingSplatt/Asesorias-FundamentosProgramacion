import java.util.Scanner;

public class AgregandoTareas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = 0;
        int n = sc.nextInt();
        int p = sc.nextInt();
        for( int i = 0; i < n ; i++ ){
            int tarea = sc.nextInt();
            if (tarea >= p){
                r++;
            }
        }
        System.out.println("Respuesta: " + r);
    }
}