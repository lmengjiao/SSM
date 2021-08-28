package spring18zuoye;

public class Liu2 implements Fang2{
    private boolean goole=false;

    public boolean isGoole() {
        return goole;
    }

    public void setGoole(boolean goole) {
        this.goole = goole;
    }

    @Override
    public boolean FangWen() {
        System.out.println("浏览器可以访问谷歌吗" + goole);
        return this.goole;
    }
}
