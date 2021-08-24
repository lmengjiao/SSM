package spring07chizuoye;

public class LuoSiFen implements Chide{
    public LuoSiFen(){
        System.out.println("螺蛳粉诞生了");
    }

    @Override
    public void chide() {
        System.out.println("吃螺蛳粉");
    }
}
