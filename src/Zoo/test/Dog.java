package Zoo.test;

public class Dog extends Animal{
    public Dog(String name,String race ,String sound){
        super(name,race,sound);

    }
    public void makeSound(){
        System.out.println(getSound());
    }


}
