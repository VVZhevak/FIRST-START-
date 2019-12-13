import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); // System.in стандартный входящий поток данных
        System.out.println("введите число");
        int x =s.nextInt();
        System.out.println("вы ввели "+x);

    }
}
