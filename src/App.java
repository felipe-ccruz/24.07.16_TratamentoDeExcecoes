import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // TRY  CATCH
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");

        for(int i = 0; i < 3; i++){
            try {
                int position = sc.nextInt();
                sc.nextLine();
                System.out.println(vect[position]);
    
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Você colocou um index inexistente.");
    
            } catch (InputMismatchException e){
                System.out.println("Letras não são aceitas como index.");
                sc.nextLine();

            }
        }
        sc.close();
    }
}
