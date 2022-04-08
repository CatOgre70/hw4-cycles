package pro.sky;

public class Main {

    public static void main(String[] args) {

        // Task 1. Numbers
        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");

        i = 10;
        while(i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.print("\n");

        // Task 2. Fridays
        int firstFridayDay = 3;

        System.out.println("\nВ этом месяце первая пятница - это " + firstFridayDay + "-е число");
        i = firstFridayDay;
        do {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            i += 7;
        } while(i <= 31);

        // Task 3. Astronomy application
        int currentYear = 2077; // Cyberpunk forever!
        int minus200Years = currentYear - 200, plus100Years = currentYear + 100;

        System.out.println("\nСейчас " + currentYear + "-ой год, и с вами передача об астрономии\n"
                + "За последние 200 лет комета приближалась к Солнцу и Земле ");
        for(i = 0; i <= currentYear; i += 79){
            if( i >= minus200Years) {
                System.out.println("в " + i + "-ом году");
            }
        }
        System.out.println("В ближайшие 100 лет у нас с вами будет шанс увидеть комету");
        for(i = 0; i <= plus100Years; i += 79){
            if(i > currentYear) {
                System.out.println("в " + i + "-ом году\n");
            }
        }

        // Task 4. Ping - pong
        for(i = 1; i <= 30; i++){
            System.out.print(i + ": ");
            if(i % 15 == 0){
                System.out.println("ping pong");
            } else if(i % 5 == 0){
                System.out.println("pong");
            } else if(i % 3 == 0){
                System.out.println("ping");
            } else {
                System.out.println();
            }
        }

        // Task 5. Fibonacci numbers

        int x = 0, y = 1, z = x + y;
        int numberOfFibonacciNumbers = 10;
        System.out.print(x + ", " + y + ", " + z + ", ");
        for(i = 4; i < numberOfFibonacciNumbers; i++){
            x = y;
            y = z;
            z = x+y;
            System.out.print(z + ", ");
        }
        x = y;
        y = z;
        z = x+y;
        System.out.println(z);
    }
}
