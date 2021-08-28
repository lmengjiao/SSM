package spring18zuoye;

public class Liu3 {
    public boolean goole=false;

    public boolean isGoole() {
        return goole;
    }

    public void setGoole(boolean goole) {
        this.goole = goole;
    }

    public boolean Fang(){
        System.out.println("浏览器是否可以访问谷歌" + this.goole);
        return this.goole;
    }
}
