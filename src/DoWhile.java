import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //создали объект класса сканер и передали ей входной поток c
        int value;  //декларирование переменной value
        do{ //однократное обязательное выполнение цикла
            System.out.println("Введите 5");
            value=scanner.nextInt();
        } while(value!=5);{ //условие окончания цикла
            System.out.println("Вы ввели 5!!!"); //вывод на экран
        }
    }
}
