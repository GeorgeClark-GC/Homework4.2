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
        int speed = 47;
        if (speed <= 60) {
            System.out.println("Если скорость авто " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость авто " + speed + ", то нужно выплатить штраф");
        }
        int age2 = 23;
        if (age2 >=2 && age2 <=6) {
            System.out.println("Если человеку " + age2 + " лет, то он должен ходить в детский сад");
        }
        else if (age2 >=7 && age2 <=17){
            System.out.println("Если человеку " + age2 + " лет, то он должен ходить в школу");
        } else if (age2 >=18 && age2 <=24) {
            System.out.println("Если человеку " + age2 + " лет, то он должен ходить в институт");
        } else if (age > 24) {
            System.out.println("Если человеку " + age2 + " лет, то он должен ходить на работу");
        }
    }
    }