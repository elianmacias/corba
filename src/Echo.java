
import corba.EchoServicePOA;
import org.omg.CORBA.ORB;

public class Echo extends EchoServicePOA{
    
    private ORB orb;
    
    public void setORB(ORB orb_val){
        orb = orb_val;
    }

    @Override
    public String echo(String x) {
        return "Elian Macias echo ===> "  + x ;
    }
    
}
