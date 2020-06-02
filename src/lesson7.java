import java.util.Scanner;  // автоматически подключается при написании класса

public class lesson7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // System.in это стандартный поток входных данных
                                            // Scanner - это класс
                                            // С помощью слова new мы создаем новый объект класса Scanner
        System.out.println("Введите число");
        int a = s.nextInt();
        System.out.println("Вы ввели " + a);
    }
}
