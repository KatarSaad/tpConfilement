package Zoo.test;

public class Cat extends Animal {
    public Cat(String name,String race ,String sound ){
        super(name,race,sound);

    }
    public void makeSound(){
        System.out.println(getSound());
    }

}
