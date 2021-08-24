package spring07chizuoye;

public class Person {
    public Person(){
        System.out.println("吃货诞生了");
    }

    private Chide chide;

    public Chide getChide() {
        return chide;
    }

    public void setChide(Chide chide) {
        this.chide = chide;
    }

    public void Eat(){
        System.out.println("吃东西");
        chide.chide();
    }
}
