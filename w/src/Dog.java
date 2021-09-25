public class Dog extends Animal{
    public Dog() {

    }
    public static void shout() {
        System.out.println("汪汪");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
    }
}
