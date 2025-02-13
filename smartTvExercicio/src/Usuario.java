public class Usuario {
    public static void main(String[] args){
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(25);
        
        System.out.println("Novo Status -> \n");
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

    }
}
