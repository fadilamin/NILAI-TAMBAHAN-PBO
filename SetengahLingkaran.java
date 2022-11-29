
package lingkaran;


public class SetengahLingkaran implements Lingkaran{
    
    double result;
    public SetengahLingkaran(){
        result = 0;
    }
    
    @Override
    public void hitungLuas() {
        double luas1 = (PANJANG / 2 * LEBAR) - (Math.PI * (PANJANG / 2) * (PANJANG / 2) / 4);
        
        result = 2 * luas1;
    }
    
    @Override
    public void tampilkanLuas() {
        System.out.println("luas nya adalah : " + this.getResult());
    }
    
    public double getResult(){
        return result;
    }
}
