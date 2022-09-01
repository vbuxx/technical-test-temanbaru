import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Soal3Test {

    public int perkalianSederhana(int j, int k){

//        Soal3.A Kesalahan yang menyebabkan Error adalah antara lain:
//            1.Deklarasi variabel hasil tanpa inisiasi nilai awal
//            2.Terdapat variabel total yang belum dideklarasikan

        int hasil = 0; //Set nilai awal hasil = 0
        while(j>0){
            hasil+=k; //Rename total dengan hasil
            j--;
        }
        return hasil;
    }

    @Test
    void testSoal3(){
        int result = perkalianSederhana(5,4);
        Assertions.assertEquals(20,result); //Test berjalan normal
    }

}
