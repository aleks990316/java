import java.util.Scanner;

public class Yasha {
    public static void main(String[] args) {
        double N, M, X, Y;   
        Scanner in = new Scanner(System.in);
        //считываем данные
        N = in.nextDouble();
        M = in.nextDouble();
        X = in.nextDouble();
        Y = in.nextDouble();
        //определяем, какой из бортиков является длинным
        if (M > N){
            double temp = M;
            M = N;
            N = temp;
        }
        /*бортики не могут быть нулевой или отрицательной
        длины, расстояния до бортиков не могут быть
        отрицательными, а также больше размеров бассейна
        */
        if (N <= 0 || M <= 0 || X < 0 || Y < 0 ||
                X > M || Y > N){
            System.out.println("Incorrect data");
            return;
        }
        //определяем, до какого из длинных бортиков ближе
        if (M - X < X) 
            X = M - X;
        //определяем, до какого из коротких бортиков ближе
        if (N - Y < Y)
            Y = N - Y;
        /*определяем, до длинного или короткого
        бортика ближе*/
        if (X < Y)
            System.out.println(X);
        else
            System.out.println(Y);
    }
}
