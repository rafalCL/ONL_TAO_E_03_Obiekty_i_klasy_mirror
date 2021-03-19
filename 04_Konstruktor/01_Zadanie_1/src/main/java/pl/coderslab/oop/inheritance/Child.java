package pl.coderslab.oop.inheritance;

public class Child extends Human {
    private String toy;

    public Child(){
        super();
    }

    public Child(String name){
        super(name);
    }

    public Child(String name, String toy){
        super(name);
        this.toy = toy;
    }

    @Override
    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public void play(String toy){
        System.out.println("Playing with "+toy);
    }
}
