
//*package java;

import lingkaran.Lingkaran;
import lingkaran.LuasSetengah;
import lingkaran.SetengahLingkaran;

public class Main {

    public static void main(String[] args) {
        Lingkaran circle_satu = new SetengahLingkaran();
        LuasSetengah luassatu = new LuasSetengah(circle_satu);
        
        luassatu.hitung();
        luassatu.tampilkan();
        
     
    }
}
