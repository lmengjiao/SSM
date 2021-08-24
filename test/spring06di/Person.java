package spring06di;
/*
人是我们的主体类 人需要依赖手机
 */
public class Person {
    public Person(){
        System.out.println("人在容器中诞生了");
    }

//    //人依赖手机 所以人就拥有了手机
//    private Phone phone;
////    //get set 暴漏给别人看
////    public Phone getPhone() {
////        return phone;
////    }
////
////    public void setPhone(Phone phone) {
////        this.phone = phone;
////    }

    //依赖抽象的接口
    private PlayGame playGame;

    public PlayGame getPlayGame() {
        return playGame;
    }

    public void setPlayGame(PlayGame playGame) {
        this.playGame = playGame;
    }

    public void play(){
        System.out.println("人玩的方法");
//        phone.game();
        playGame.game();
    }
}
