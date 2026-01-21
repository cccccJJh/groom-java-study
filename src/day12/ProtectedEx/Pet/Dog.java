package day12.ProtectedEx;

public class Dog  extends Animal{

    public void introduce(){
        this.name = "바둑이";
        this.age = 3;
        this.breath();

        System.out.println(name + "는 " + age +"살입니다.");
    }
}
