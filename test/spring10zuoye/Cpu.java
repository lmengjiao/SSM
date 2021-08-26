package spring10zuoye;

public class Cpu {
    public Cpu(){
        System.out.println("cpu诞生了");
    }

    //属性注入
//    private Keyboard keyboard;
//
//    public Keyboard getKeyboard() {
//        return keyboard;
//    }
//
//    public void setKeyboard(Keyboard keyboard) {
//        this.keyboard = keyboard;
//    }

    //构造注入
//    private Keyboard keyboard;
////    public Cpu(Keyboard keyboard){
////        this.keyboard=keyboard;
////    }

    //自动注入
    private Keyboard keyboard;

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void start(){
        System.out.println("cpu开始工作");
        keyboard.play();
    }
}
