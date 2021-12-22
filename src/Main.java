public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "German Shepherd", 5);
        dog.setAge(dog.getAge() + 1);
        System.out.println(dog.getAge());
    }
}