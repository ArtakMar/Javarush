

/* 
НОД
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.

Требования:
1. Программа должна считывать с клавиатуры 2 строки.
2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NOD {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a <= 0) throw new NumberFormatException();
        int b = Integer.parseInt(reader.readLine());
        if (b <= 0) throw new NumberFormatException();
        int c = (a > b) ? b : a;
        int result = 1;
        for (int i = 1; i<=c ; i++) if (a%i == 0 && b%i == 0) result = i;
        System.out.println(result);

        reader.close();
    }

}
