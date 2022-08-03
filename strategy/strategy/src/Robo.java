public class Robo {
    
    private iinterface strategy;

    public void setStrategy(iinterface comportamento){
        this.strategy = comportamento;
    }
    public void mover(){
        strategy.mover();
    }
}
