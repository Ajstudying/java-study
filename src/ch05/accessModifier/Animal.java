package ch05.accessModifier;

public class Animal {
    //go(language)
    //var name String;      //protected
    //var Name String;      //public
    private String name;
    protected void eat(){
        System.out.println("The animal is eating");
    }
}
