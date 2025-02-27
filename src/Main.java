public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }


        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }


        for (int i = 0; i < 17; i+= 2){
            System.out.println(i);
        }


        for (int i = 10; i >= -10; i -= 1){
            System.out.println(i);
        }


        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является високосым.");
        }


        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }


        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }


        for (int i = 1; i <= 12; i++){
            int sum = i * 29000 + i * 29000 / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }


        for (int i = 1; i <= 10; i++){
            System.out.println(2 + "*" + i + "=" + 2 * i);
        }
    }
}