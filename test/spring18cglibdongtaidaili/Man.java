package spring18cglibdongtaidaili;

public class Man {
    private int gaokaofenshu=300;

    public int getGaokaofenshu() {
        return gaokaofenshu;
    }

    public void setGaokaofenshu(int gaokaofenshu) {
        this.gaokaofenshu = gaokaofenshu;
    }

    public int dream(){
        System.out.println("高考分数 = " + this.gaokaofenshu);
        return this.gaokaofenshu;
    }
}
