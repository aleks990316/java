import java.util.Scanner;

public class Baiker {
        public static void main(String[] args) {
            int V, T, S;   
            final int MKAD_LEN = 109;
            Scanner in = new Scanner(System.in);
            //считываем данные
            V = in.nextInt();
            T = in.nextInt();
        //условия корректности входных данных
            if (V < -1000 || V > 1000 || T < 0 || T > 1000){
                System.out.println("Incorrect data");
                return;
            }
            /*определяем, как далеко байкер уехал от 
            0 километра, и в какую сторону*/
            S = V * T % MKAD_LEN;
            /*если он ехал в положетельном направлении, 
            то выражение в выводе примет S, иначе отнимет
            от длины МКАДА величину S
            */
            System.out.println((S + MKAD_LEN) % MKAD_LEN);
        }
}