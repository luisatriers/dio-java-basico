public class SmartTv {

    //características (argumentos)
    
    boolean ligada = false;
    int canal = 1;
    int volume = 10;


    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void mudarCanal(int proximoCanal){
        canal = proximoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;   
    }
}