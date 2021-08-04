package Zoo.test;

public class Majom extends Animal {
    public Majom(String name ,String race ,String sound ){
        super(name,race ,sound);
    }
    public void makeSound (){
        System.out.println(getSound());
    }

}
