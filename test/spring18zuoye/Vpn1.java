package spring18zuoye;

public class Vpn1 {
    private Liu1 liu1;
    private boolean goole;

    public Liu1 getLiu1() {
        return liu1;
    }

    public void setLiu1(Liu1 liu1) {
        this.liu1 = liu1;
    }

    public boolean isGoole() {
        return goole;
    }

    public void setGoole(boolean goole) {
        this.goole = goole;
    }

    public void FangWen(){
       boolean goole=liu1.setGoole(true);
       this.goole=true;
        System.out.println("vpn可以访问谷歌吗？" + this.goole);
    }
}
