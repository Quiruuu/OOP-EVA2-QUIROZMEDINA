package eva2_17_interfaces_2;
public class EVA2_17_INTERFACES_2 {
    public static void main(String[] args) {
      
    }
    
}

interface IntA{
    void A();
}
interface IntB{
    public abstract void B();
}
interface IntC extends IntA, IntB{
    public abstract void C();
}

class Prueba implements IntC{

    @Override
    public void C() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void A() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void B() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}