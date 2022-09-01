import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Soal4Test {
    public int soalEmpat(int Ruby, int Topaz, int Permata) {

        int s = 0, t = 0, p = 0;
        s=Ruby/2;
        t=Topaz/2;
        p=Permata/2;
        s*=1000000;
        t*=1250000;
        p*=5000000;
        ArrayList<Integer> findMin = new ArrayList<Integer>();
        findMin.add(s);
        findMin.add(t);
        findMin.add(p);
        Collections.sort(findMin);
        return findMin.get(findMin.size()-1);
    }

    @Test
    void testSoal4() {
        int result = soalEmpat(5,3,1);
        //Diharapkan 2jt karena tiap jenis hanya dapat dijual perpasang dimana hasilnya Ruby 2000000, Topaz 1250000, dan Ruby 0 (karena jumlah Ruby tidak sampai 1 pasang)
        Assertions.assertEquals(2000000, result);
    }

}
