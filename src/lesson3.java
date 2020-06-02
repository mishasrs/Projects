public class lesson3 {
    public static void main(String[] args) {
        int b = 5;
        // сылочный тип данных string (строки)
        String myString = "Hello my string"; // является классом, поэтому пишется с Большой буквы
                                             // отличается от примитивных типов данных тем что
                                             // ссылается на объект, а не хранит его
        String space = " ";
        String name = "Bob";

        System.out.println(myString+space+name); // объеденили строки с помощью "+"
        System.out.println("Hello my string" + " " + "Bob"); // объеденили объекты прямо в методе
        System.out.println("Hello my string " + b); // объеденили сылочный и целочисленный типы данных
    }
}
