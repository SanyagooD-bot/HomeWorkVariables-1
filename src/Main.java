public class Main {
    public static void main(String[] args) {

        System.out.println("_________Задание 1___________");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 363789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("_____________________________");

        System.out.println("_________Задание 2___________");
        // Я увеличил значение переменных через вывод
        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);

        System.out.println("_____________________________");

        System.out.println("_________Задание 3___________");
        //Сделал уменьшение как было в подсказке
        var dog1 = dog - 3.5;
        var cat1 = cat - 1.6;
        var paper1 = paper - 7639;
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);

        System.out.println("_____________________________");

        System.out.println("_________Задание 4___________");

        var friend = 19;
        var friend1 = friend + 2;
        var friend2 = friend1 / 7;
        System.out.println("Переменная friend = " + friend);
        System.out.println("Переменная friend + 2 = " + friend1);
        System.out.println("Переменная friend / 7 = " + friend2);

        System.out.println("_____________________________");

        System.out.println("_________Задание 5___________");
        var frog = 3.5;
        var frog1 = frog * 10;
        var frog2 = frog1 / 3.5;
        var frog3 = frog2 + 4;
        System.out.println("Переменная frog = " + frog);
        System.out.println("Переменная frog * 10 = " + frog1);
        System.out.println("Переменная (frog * 10)/3.5 = " + frog2);
        System.out.println("Переменная ((frog * 10)/3.5)) + 4  = " + frog3);

        System.out.println("_____________________________");

        System.out.println("_________Задание 6___________");
        var weightBox1 = 78.2;
        var weightBox2 = 82.7;

        var weightBox = weightBox1 + weightBox2;
        var weightBox0 = weightBox2 - weightBox1;

        System.out.println("Общая масса бойцов равна + " + weightBox + " кг");
        System.out.println("Разница между массами бойцов равна = " + weightBox0 + " кг");

        System.out.println("_____________________________");

        System.out.println("_________Задание 7___________");
        var weight = weightBox2 % weightBox1;

        System.out.println("Остаток от деления между двумя весами = " + weight + " кг");

        System.out.println("_____________________________");

        System.out.println("_________Задание 8___________");
        System.out.println("1)");

        var time = 650;
        var worker1 = 8;
        var workerAll = time / worker1;
        System.out.println("Всего работников в компании - " + workerAll + " человек");

        System.out.println("2)");

        var worker2 = workerAll + 94;
        var time2 = worker2 * worker1;

        System.out.println("Если в компании работает " + worker2 + " человек, то всего "
        + time2 + " часов работы может быть поделено между сотрудниками");

        System.out.println("_____________________________");







    }
}