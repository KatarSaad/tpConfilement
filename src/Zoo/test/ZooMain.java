package Zoo.test;

public class ZooMain {
public static void main(String args[])
{
Cat cat =new Cat("Micho","cat","miaw");
Dog dog=new Dog("rex","berger","haab");
Animal zoo[]=new Animal[2];
zoo[0]=cat;
zoo[1]=dog;
zoo[1].makeSound();
zoo[0].makeSound();
}
}

