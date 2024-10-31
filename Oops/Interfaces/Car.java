
public class Car implements Engine, Brake, Media {

    @Override
    public void start() {
        System.out.println("Starting the engine.");
    }

    ;
    
    @Override
    public void stop() {
        System.out.println("Stoping the engine.");
    }

    @Override
    public void acc() {
        System.out.println("Acclerating!");

    }

    @Override
    public void brake() {
        System.out.println("Braking");
    }

    @Override
    public void mediaStart() {
        System.out.println("Starting the media player.");
    }

    @Override
    public void mediaStop() {
        System.out.println("Stoping the media player");
    }

}
