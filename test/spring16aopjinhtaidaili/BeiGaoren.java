package spring16aopjinhtaidaili;

public class BeiGaoren {
    private int BianHU=20;

    public int getBianHU() {
        return BianHU;
    }

    public void setBianHU(int bianHU) {
        BianHU = bianHU;
    }

    public void ChengGong(){
        System.out.println("律师胜诉的成功率" + this.BianHU);
    }
}
