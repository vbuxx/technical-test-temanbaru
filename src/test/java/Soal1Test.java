import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;

public class Soal1Test {
    public int soalSatu(String str) {
        char[] strArr = str.toCharArray();
        int s = 0, i = 0, a = 0, p = 0;
        for (int j = 0; j < strArr.length; j++) {
            char selected = strArr[j];
            switch (selected){
            case 'S':
                s++;
                break;
            case 'I':
                i++;
                break;
            case 'A':
                a++;
                break;
            case 'P':
                p++;
                break;
            default:
            }
        }
        System.out.println("S: "+ s + " | I: " + i + " | A: " + a + " | P: " + p);
        ArrayList<Integer> findMin = new ArrayList<Integer>();
        findMin.add(s);
        findMin.add(i);
        findMin.add(a / 2);
        findMin.add(p);
        Collections.sort(findMin);
        System.out.println("Ada " + findMin.get(0) + " kata SIAPA ");
        return findMin.get(0);
    }

    @Test
    void testSoal1() {
        int result = soalSatu("USOMAANAPAIUMASYDNIP");
        Assertions.assertEquals(2, result);
    }

}
