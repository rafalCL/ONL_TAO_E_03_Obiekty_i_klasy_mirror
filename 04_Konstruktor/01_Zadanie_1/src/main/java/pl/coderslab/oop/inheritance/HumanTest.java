package pl.coderslab.oop.inheritance;

public class HumanTest {
    public static void main(String[] args) {
        // objectsExample();
        // instanceOfExample();
//        settingInstanceAttributes();
    }

    private static void settingInstanceAttributes() {
        Child child1 = new Child();
        Child child2 = new Child("Adrianna");
        Child child3 = new Child("Aleks", "Dolly Doll");
    }

    private static void instanceOfExample(){
        Human humanObj = new Human();
        Child childObj = new Child();
        if(childObj instanceof Child){
            System.out.println("childObj is an instance of class Child");
        }
        if(humanObj instanceof Child){ // nope!
            System.out.println("humanObj is an instance of class Child");
        }
        if(childObj instanceof Human){
            System.out.println("childObj is an instance of class Human");
        }
    }

    private static void objectsExample() {
        Human ala = new Human();
        ala.setName("Ala");
        System.out.println(ala.getName());

        Child child = new Child();
        child.setName("Robert");
        System.out.println(child.getName());
    }
}
