package spring18zuoye;

public class Liu1 {

    private boolean goole=false;

    public boolean isGoole() {
        return goole;
    }

    public boolean setGoole(boolean goole) {
        this.goole = goole;
        return goole;
    }

    public void FangWen(){
        System.out.println("浏览器可以访问谷歌吗？" + this.goole);
    }
}
