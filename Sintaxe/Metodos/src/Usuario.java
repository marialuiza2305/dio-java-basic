public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? -> Novo Status " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada? -> Novo Status " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual? -> Novo Status " + smartTv.volume);

        smartTv.mudarCanal(40);
        System.out.println("Canal atual? -> Novo Status " + smartTv.canal);
    }
}
