import java.util.Scanner;

class User {
    private String name;
    private int age;
    static String stringNameAge;

    public String getName() {
        return name;
    }

    public void setName(String a) {
        name = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        stringNameAge = name + ", возраст " + age + " лет";
        return stringNameAge;
    }

}


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя первого пользователя");
        Scanner scan = new Scanner(System.in);
        String name1 = scan.next();
        System.out.println("Введите возраст первого пользователя");
        int age1 = scan.nextInt();
        User user1 = new User(name1, age1);
        String str1 = user1.toString();

        System.out.println("Введите имя второго пользователя");
        String name2 = scan.next();
        System.out.println("Введите возраст второго пользователя");
        int age2 = scan.nextInt();
        User user2 = new User(name2, age2);
        String str2 = user2.toString();

        if (age2 < age1) {
            System.out.println(str2);
        } else {
            System.out.println(str1);
        }
    }
}