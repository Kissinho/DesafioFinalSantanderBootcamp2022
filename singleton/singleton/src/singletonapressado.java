public class singletonapressado {
    public static singletonapressado instancia = new singletonapressado();
    private singletonapressado(){
      super();
    }
    public static singletonapressado getInstancia(){
   
      return instancia;
    }
  }
  