public class Break_Contininue {
    public static void main(String[] args) {

        for (int i=0; i<=15; i++) {
           if (i%2==0) { // i%2 - возвращает остаток от деления на 2
               continue;
           }
           System.out.println("это не четное число"+i);
       }
    }
}
