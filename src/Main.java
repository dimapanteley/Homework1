public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var box = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(box);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача 2");
        var box = 8.0;
        var cat = 3.6;
        var paper = 763789;
        box = box + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(box);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача 3");
        var box = 8.0;
        var cat = 3.6;
        var paper = 763789;
        box = box - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(box);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }
    public static void task5(){
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog= frog* 10;
        System.out.println(frog);
        frog=frog / 3.5;
        System.out.println(frog);
        frog=frog+ 4;
        System.out.println(frog);
    }
    public static void task6(){
        System.out.println("Задача 6");
        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var sumWeight = fighter1 + fighter2;
        System.out.println("Суммарный вес бойцов "+sumWeight+" кг.");
        var diffWeight= fighter1 - fighter2;
        System.out.println("Разница в весе бойцов "+diffWeight+" кг.");
    }
    public static void task7(){
        System.out.println("Задача 7");
        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var diffWeight= fighter2 - fighter1;
        System.out.println("Разница в весе бойцов "+diffWeight+" кг.");
        diffWeight= fighter2%fighter1;
        System.out.println("Разница в весе бойцов "+diffWeight+" кг.");
    }
    public static void task8(){
        System.out.println("Задача 8");
        var vremya = 640;
        var sotrydniki = vremya/8;
        System.out.println("Всего работников в компании — "+sotrydniki+ " человек");
        sotrydniki = sotrydniki + 94;
        vremya= sotrydniki*8;
        System.out.println("Если в компании работает " + sotrydniki+" человек, то всего " + vremya +" часов работы может быть поделено между сотрудниками");

    }

}