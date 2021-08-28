package spring16aopjinhtaidaili;

public class LvShi {
    private BeiGaoren beiGaoren;
    private int bh;

    public BeiGaoren getBeiGaoren() {
        return beiGaoren;
    }

    public void setBeiGaoren(BeiGaoren beiGaoren) {
        this.beiGaoren = beiGaoren;
    }

    public int getBh() {
        return bh;
    }

    public void setBh(int bh) {
        this.bh = bh;
    }

    public void ChengGong(){
        int bianHU = beiGaoren.getBianHU();
        this.bh=bianHU+60;
        System.out.println("胜诉的成功率" + this.bh);
    }
}
