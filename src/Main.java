public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если человеку " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если человеку " + age + " лет, то он несовершеннолетний, нужно ещё немного подождать");
        }
        int temperature = 2;
        boolean putHat = temperature >= 5;
        if (putHat) {
            System.out.println("На улице тепло, " + temperature + " градусов, можно выходить без шапки");
        } else {
            System.out.println("На улице холодно, " + temperature + " градусов, нужно выйти в шапке");
        }
        int speed = 48;
        if (speed <= 60) {
            System.out.println("Если скорость авто " + speed + " км/ч, то можно ездить спокойно, скоростной режим в 60 км/ч не нарушен");
        } else {
            System.out.println("Если скорость авто " + speed + " км/ч, то нужно выплатить штраф, скоростной режим в 60 км/ч нарушен");
        }
        int age2 = 23;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если человеку " + age2 + " лет, то он должен ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если человеку " + age2 + " лет, то он должен ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если человеку " + age2 + " лет, то он должен ходить в институт");
        } else if (age2 > 24) {
            System.out.println("Если человеку " + age2 + " лет, то он должен ходить на работу");
        }
        int ageChild = 12;
        boolean parent = true;
        if (ageChild < 5) {
            System.out.println("Если возраст ребёнка " + ageChild + " года, то кататься на аттракционе нельзя");
        } else if (ageChild >=5 && ageChild <14 && parent == true) {
            System.out.println("Если возраст ребёнка " + ageChild + " лет, то кататься на аттракционе можно только в сопровождении родителя. Родитель присутствует, кататься на аттракционе можно");
        }
        else if (ageChild >=5 && ageChild <14 && parent == false) {
            System.out.println("Если возраст ребёнка " + ageChild + " лет, то на аттракционе можно только в сопровождении родителя. Родитель не присутствует, кататься на аттракционе нельзя");
        }else if (ageChild > 14) {
            System.out.println("Если возраст ребёнка " + ageChild + " лет, то кататься на аттракционе можно без сопровождения родителя");
        }
        int sittingPlace = 60;
        int standingPlace = 23;
        if (standingPlace < 42 && sittingPlace < 60)
        {
            System.out.println("В вагоне есть сидячие места и стоячие места");
        }
        else if (standingPlace < 42 && sittingPlace >= 60)
        {
            System.out.println("В вагоне есть стоячие места");
        } else if (standingPlace >= 42 && sittingPlace < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (standingPlace >= 42 && sittingPlace >= 60){
            System.out.println("В вагоне нет мест");
        }
        int one = 12;
        int two = 28;
        int three = 4;
        if (one >= two && one >= three)
        {
            System.out.println("Первое число больше");
        }
        else if (two >= one && two >= three) {
            System.out.println("Второе число больше");
        }
        else {
            System.out.println("Третье число больше");
        }
    }
    }