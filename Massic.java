import java.util.Scanner;

public class Massic {
    public static void main (String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        //считываем данные
        n = in.nextInt();
        //размер массива не может быть отрицательным
        if (n < 0){
            System.out.println("Incorrect data");
            return;
        }
        int mass[] = new int[n];
        for (int i = 0; i < n; i++)
            mass[i] = in.nextInt();
        /*перебираем весь массив, сравнивая каждый элемент с 
        элементами массива, в том числе и с самим собой, поэтому если элемент
        встречается менее 2 раз, то выводим его*/
        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; (j < n) & (count < 2); j++)
                if (mass[j] == mass[i]) count++;
            if (count < 2) System.out.print(mass[i] + " ");
        }
        //перенос строки
        System.out.println();
    }
}
