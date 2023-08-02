public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();/*
        task4();
        task5(); */
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

}