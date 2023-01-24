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

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog: " + dog);
        System.out.println("cat: " + cat);
        System.out.println("paper: " + paper);


// Этот код присваивает значения 8.0, 3.6 и 763789 соответственно переменным dog, cat и paper, а затем выводит значения этих переменных в консоль.
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog: " + dog);
        System.out.println("cat: " + cat);
        System.out.println("paper: " + paper);
  // Этот код увеличивает значение каждой перечисленной в прошлой задаче переменной на 4, а затем выводит значения этих переменных в консоль.
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog: " + dog);
        System.out.println("cat: " + cat);
        System.out.println("paper: " + paper);

// Этот код уменьшает значение каждой переменной, а затем выводит значения этих переменных в консоль.
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend: " + friend);
        friend += 2;
        System.out.println("friend: " + friend);
        friend /= 7;
        System.out.println("friend: " + friend);
//В данном коде, мы инициализировали переменную friend значением 19, увеличили ее значение на 2 и поделили ее значение на 7. После каждой операции мы выводим значение переменной в консоль.

    }
    public static void task5 () {
        var frog = 3.5;
        System.out.println("frog: " + frog);
        frog *= 10;
        System.out.println("frog: " + frog);
        frog /= 3.5;
        System.out.println("frog: " + frog);
        frog += 4;
        System.out.println("frog: " + frog);
//В данном коде, мы инициализировали переменную frog значением 3.5, увеличили ее значение в 10 раз, поделили ее значение на 3.5 и добавили к последнему значению переменной 4. После каждой операции мы выводим значение переменной в консоль.

    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var weightDifference = boxer2 - boxer1;
        System.out.println("Total weight: " + totalWeight);
        System.out.println("Weight difference: " + weightDifference);


    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;

// Вычитание из большего веса меньшего
        var weightDifference1 = boxer2 - boxer1;
        System.out.println("Weight difference 1: " + weightDifference1);

// С помощью функции остаток от деления
        var weightDifference2 = boxer2 % boxer1;
        System.out.println("Weight difference 2: " + weightDifference2);



    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hoursWorked = 640;
        var hoursPerWorker = 8;

// количество сотрудников в компании
        var numberOfWorkers = hoursWorked / hoursPerWorker;
        System.out.println("Всего работников в компании — " + numberOfWorkers + " человек");

// дополнительное количество сотрудников в компании
        var additionalWorkers = 94;

// общее количество сотрудников в компании
        var totalWorkers = numberOfWorkers + additionalWorkers;

// общее количество часов работы, которое должно быть поделено между сотрудниками
        var totalHours = totalWorkers * hoursPerWorker;
        System.out.println("Если в компании работает " + totalWorkers + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");




    }
}