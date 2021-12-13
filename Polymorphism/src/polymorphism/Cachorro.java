package polymorphism;

public class Cachorro extends Mamifero {
    
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    
    @Override 
    public void locomover(){
        System.out.println("Andando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Auf!");
    }
    
}
