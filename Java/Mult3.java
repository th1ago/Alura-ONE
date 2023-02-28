// Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.

public class Mult3 {
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
