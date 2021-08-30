package spring21zuoye;

public class VideoServiceImpl1 implements VideoService1{
    @Override
    public void start() {
        System.out.println("视频开始了");
    }

    @Override
    public void stop() {
        System.out.println("视频暂停了");
    }

    @Override
    public void trans() {
        System.out.println("转金币");
    }

    @Override
    public void lose() {
        int i=3/0;
        System.out.println("视频丢失了");
    }
}
