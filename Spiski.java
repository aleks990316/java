import java.util.Scanner;

public class Spiski {
    //сортировка пузырьком
    private static void sort_bubble(int [] arr){
        boolean needIteration = true;
        while (needIteration){
            needIteration = false;
            for (int i = 1; i < arr.length; i++){
                if (arr[i] < arr[i-1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                    needIteration = true;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int N, M, max;
        Scanner in = new Scanner(System.in);
        //считываем данные и проверяем их корректность
        N = in.nextInt();
        if (N < 0){
            System.out.println("Incorrect data");
            return;
        }
        int s1[] = new int[N];
        for (int i = 0; i < N; i++)
            s1[i] = in.nextInt();
        M = in.nextInt();
        if (M < 0) {
            System.out.println("Incorrect data");
        }
        int s2[] = new int[M];
        for (int i = 0; i < M; i++)
            s2[i] = in.nextInt();
        sort_bubble(s1);
        sort_bubble(s2);
        //если массив не пустой, то в нем есть элемент
        if (N > 0){
            /*проверяем первый элемент на принадлженость 
            второму списку*/
             for (int j = 0; j < M; j++)
                 if (s1[0] == s2[j]) {
                     System.out.print(s1[0] + " ");
                     break;
                 }
             /* проверянм на принадлежность остальные
             элемеенты. если текущий проверяемый элемент
             совпалает с предыдушим, то элемент с таким
             значением мы уже проверили, следовательно,
             переходим к следующей итерации
             */
             for (int i = 1; i < N; i++) {
                 if (s1[i] == s1[i - 1]) continue;
                 for (int j = 0; j < M; j++)
                     if (s1[i] == s2[j]) {
                         System.out.print(s1[i] + " ");
                         break;
                     }
             }
                 
        }
        //перевод строки
        System.out.println();
    }
}
