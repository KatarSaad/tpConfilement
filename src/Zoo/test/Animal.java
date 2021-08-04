package Zoo.test;

public abstract class Animal {
    private String  name;
    private String race ;
    private String sound ;

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }
    public void setSound(String sound){
        this.sound=sound;
    }
    public Animal(String name ,String race ,String sound){
        setName(name);
        setSound(sound);
        setRace(race);

    }

    public String getName() {
        return this.name;
    }
    public String getRace(){
        return this.race;
    }
    public String getSound(){
        return this.sound;
    }
    public abstract void makeSound();
}
