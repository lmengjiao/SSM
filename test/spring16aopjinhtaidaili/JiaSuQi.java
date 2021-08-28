package spring16aopjinhtaidaili;
//代理对象 用于增强目标对象的方法
/*
游戏 游戏加速器
被告人 律师
 */
public class JiaSuQi {
    //谁依赖谁 谁就拥有了谁
    private Game game; //代理类是主体 代理对象依赖目标对象
    private int ws;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }

    //代理对象的方法 要和目标对象一样
    public void conNet(){
        //这个方法要承接目标对象的方法
        int wangsu = game.getWangsu(); //目标对象的网速
        this.ws=wangsu-400;
        System.out.println("现在打游戏的网速 = " + this.ws);
    }
}
