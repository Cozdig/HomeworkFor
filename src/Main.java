public class Main {
    public static void main(String[] args) {
        //1
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        //2
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        //3
        for (int i = 0; i < 17; i+= 2){
            System.out.println(i);
        }
        //4
        for (int i = 10; i > -11; i -= 1){
            System.out.println(i);
        }
        //5
        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является високосым.");
        }
        //6
        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }
        //7
        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }
        //8-9
        for (int i = 1; i <= 12; i++){
            int sum = i * 29000 + i * 29000 / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        //10
        for (int i = 1; i <= 10; i++){
            System.out.println(2 + "*" + i + "=" + 2 * i);
        }
    }
}