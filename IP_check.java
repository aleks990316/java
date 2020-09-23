import java.util.Scanner;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;
public class IP_check {
    
    public static boolean test(String testString){  
        //регулярное выражение для IP-адреса
        String check = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-5][0-5])\\."
        + "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-5][0-5])\\."
        + "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-5][0-5])\\."
        + "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-5][0-5])";
        //проверка на строки на соответсвие регулярному выражению
        Pattern p = Pattern.compile(check);  
        Matcher m = p.matcher(testString);  
        return m.matches();  
    }
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        //считываем данные
        String IP = in.nextLine(), sub_IP;
        int i = 0, j = IP.length();
        //проходим все пробелы, стоящие спереди
        while (i < j && IP.charAt(i) == ' ')
            i++;
        j--;
        //проходим все пробелы, стоящие сзади
        while (j > i && IP.charAt(j) == ' ')
            j--;
        j++;
        //если строка не пуста и не состоит из полностью из пробелов
        if (i < j) {
          //выделяем подстроку без пробелов
          sub_IP = IP.substring(i, j);
          //если строка есть IP-адрес
          if (test(sub_IP))
              System.out.println("YES");
          else
              System.out.println("NO");
        }
        else
            System.out.println("NO");
    }
}
