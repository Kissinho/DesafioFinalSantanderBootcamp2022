public class App {
  public static App instancia;
  private App(){
    super();
  }
  public static App getInstancia(){
    if(instancia == null){
        instancia = new App();
    }
    return instancia;
  }
}
