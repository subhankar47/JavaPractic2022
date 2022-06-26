package OOPsConcepts;

abstract class Bike {
    abstract void run();

    abstract void fast();

    abstract void veryfast();

    public void slow() {
        System.out.println("Run like a Scooter");
    }
}
abstract  class Audi extends  Bike{
    @Override
    void run() {
        System.out.println("Running speed is 250");
    }
}
abstract  class Bugati extends Audi{
    @Override
    void fast() {
        System.out.println("Running speed is 300");
    }
}
 class AbstractNinja extends Bugati {
     @Override
     void veryfast() {
         System.out.println("Running speed is 350");
     }
     public static void main(String[] args){
         AbstractNinja obj = new AbstractNinja();
         obj.run();
         obj.fast();
         obj.veryfast();
         obj.slow();
     }
 }
