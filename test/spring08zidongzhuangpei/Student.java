package spring08zidongzhuangpei;
//主体类
public class Student {
    private GameInterface gameInterface;

    public GameInterface getGameInterface() {
        return gameInterface;
    }

    public void setGameInterface(GameInterface gameInterface) {
        this.gameInterface = gameInterface;
    }
        private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Student(){
        System.out.println("学生诞生了");
    }

    public void play(){
        System.out.println("我是玩的方法");
       // computer.game();
        gameInterface.game();
    }
}
