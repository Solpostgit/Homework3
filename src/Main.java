public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();/*
        task7();
        task8(); */
    }

    public static void task1 () {
        System.out.println("Task 1");
        byte months = 12;
        short days = 365;
        int years = 35000;
        long lightYears = 128000;
        float salt = 1.5f;
        double milk = 3.2;
        System.out.println("Значение переменной months с типом byte равно " + months);
        System.out.println("Значение переменной days с типом short равно " + days);
        System.out.println("Значение переменной years с типом int равно " + years);
        System.out.println("Значение переменной lightYears с типом long равно " + lightYears);
        System.out.println("Значение переменной salt с типом float равно " + salt + " кг");
        System.out.println("Значение переменной milk с типом double равно " + milk + " литра");
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Task 2 completed");
        float a = 27.12f;
        long b = 987678965549L;
        float a2 = 2.786f;
        short c = 569;
        short c2 = -159;
        short c3 = 27897;
        byte d = 67;
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Task 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short sheetsPaper = 480;
        byte student = (byte) (teacher1 + teacher2 + teacher3);
        int sheets = sheetsPaper / student;
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");
        System.out.println();
    }

    public static void task4 () {
        System.out.println("Task 4");
        byte machine2Min = 16;
        byte machine1Min = (byte) (machine2Min / 2);
        short job20Min = (short) (machine1Min * 20);
        int job24Hours = machine1Min * 1440;
        int job3Days = job24Hours * 24;
        int jobMonth = job24Hours * 30; // месяц равен 30 суток
        System.out.println("За 20 минут машина произвела " + job20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + job24Hours + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + job3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + jobMonth + " штук бутылок");
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Task 5");
        byte totalCansPaint = 120;
        byte WhitePaint = 2;
        byte BrownPaint = 4;
        byte classroomCans = (byte) (WhitePaint + BrownPaint);
        byte totalClassroom = (byte) (totalCansPaint / classroomCans);
        byte totalWhitePaint = (byte) (WhitePaint * totalClassroom);
        byte totalBrownPaint = (byte) (BrownPaint * totalClassroom);
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        System.out.println();
    }
    public static void task6 () {
        System.out.println("Task 6");
        byte bananaWeight = 80; // вес 1 банана 80 грамм
        byte bananaNumber = 5; // кол-во бананов в рецепте
        short milkWeight = 105; // вес 100 мл молока
        short milkNumber = 2; // кол-во 100 мл молока
        short iceCreamWeight = 100; //вес 1 брикета
        short iceCreamNumber = 2; // кол-во брикетов
        short eggWeight = 70; // вес 1 яйца
        short eggNumber = 4; // кол-во яиц
        int weightGrams = bananaWeight * bananaNumber + milkWeight * milkNumber + iceCreamWeight * iceCreamNumber + eggWeight * eggNumber;
        float weightKgs = weightGrams / 1000f;
        System.out.println("Завтрак спортсмена " + weightGrams + " грамм, или " + weightKgs + " кг");
        System.out.println();
    }

}