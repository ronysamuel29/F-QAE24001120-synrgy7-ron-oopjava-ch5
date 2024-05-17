package Challenge2b;

public class Main {
    public static void main(String[] args) {
        HondaJazz myJazz = new HondaJazz();
        ToyotaFortuner myFortuner = new ToyotaFortuner();
        SuzukiKatana myKatana = new SuzukiKatana();

        myJazz.moveForward();
        myJazz.activateEcoMode();

        myFortuner.moveForward();
        myFortuner.engage4WD();

        myKatana.moveForward();
        myKatana.popWheelie();
    }
}
