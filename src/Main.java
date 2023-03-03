 public class Main {
    static int hw = 6 ;
    public static void main(String[] args) {
        HWtitle();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        hwСompleted();
    }
    public static void HWtitle() {

        System.out.println("Hello!");
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ №" + hw);
        System.out.println(" ");
    }
    public static void task1 () {
        System.out.println("Задача 1");
        System.out.println("Выводим целые чиса от 1 до 10:");
        for (int i=1; i<=10; i=i+1) {
            System.out.println(i);
        }
        System.out.println("");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        System.out.println("Выводим числа от 10 до 1 в порядке убывания:");
          for (int j=10; j>=1; j=j-1) {
            System.out.println(j);
        }
        System.out.println(" ");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        System.out.println("Выводим четные числа на числовом отрезке от 0 до 17");
        System.out.println("Примечание: 0 считаем четным числом");
        for (int i=0; i<=17; i=i+2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

    }

    public static void task4() {
        System.out.println("Задача 4");
        System.out.println("Выводим числа от 10 до -10 в убывающем порядке");
        for (int i=10; i>=-10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int year1 = 1904 ;
        int year2 = 2096 ;
        boolean intercalary ;
        for (int i=year1 ; i <= year2 ; i++) {
            intercalary = ((i % 4 == 0) && (i % 100 != 0 )) || (i % 400 ==0 ) ;
            if (intercalary) {
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println("");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int base = 7 ;
        int number = 0 ;
        System.out.println("Положительные числа из первой сотни, кратные " + base + ":");
        for (int i = 1; i <= 14; i++) {
            number = base * i ;
            System.out.print(number + " ");
        }
        System.out.println(" ");
        System.out.println("");
    }

    public static void task7 () {
        int number = 0, base = 2 ;
        System.out.println("Задача 7");
        System.out.println("Степени числа " + base +":");
        for (int i=0; i<10; i++) {
            number = 1 ;
            for (int j=1;j<=i;j++) {
                number = number * base ;
            }
            System.out.print(number + " ");
        }
        System.out.println("\n");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int can = 0 ; // "банка"
        int fee = 29000 ; // ежемесячный взнос в банку
        for (int m=1; m<=12 ; m++) {
            can = can + fee ;
            System.out.println("Месяц " + m +", сумма накоплений равна " + can + " рублей" );
        }
        System.out.println(" ");
    }


    public static void task9() {
        System.out.println("Задача 9");
        int deposit = 0 ;
        int fee = 29000 ;
        int rate = 12 ;
         for (int m=1; m<=12 ; m++) {
            deposit = deposit + (deposit*rate/12)/100 + fee ;
            System.out.println("Месяц " + m +", сумма накоплений равна " + deposit + " рублей" );
        }
        System.out.println(" ");
    }

    public static void task10() {
        System.out.println("Задача 10");
        int base = 2 ;
        for (int i=1; i <= 10 ; i++) {
            System.out.print(base + "*" + i + "=" + base*i + "\t");
            if (i==5) {
                System.out.println("");
            }
        }

        System.out.println("\n");
    }

    public static void hwСompleted() {
        System.out.println("Домашнее задание " + hw +" выполнено");
        System.out.println(" ");
    }

}