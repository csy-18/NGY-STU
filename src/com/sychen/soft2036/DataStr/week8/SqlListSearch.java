package DataStr.week8;

/**
 * @ClassName SqlListSearch
 * @Description TODO
 * @Author csy
 * @Date 2020-11-26
 */
public class SqlListSearch {
    final int MAXN = 100;
    RecType[] REC;
    int n;

    public void CreateRec(int[] a) {
        REC = new RecType[MAXN];
        for (int i = 0; i < a.length; i++) {
            REC[i] = new RecType(a[i]);
        }
        n = a.length;
    }

    public void Disp() {
        for (int i = 0; i < n; i++) {
            System.out.println(REC[i].key + " ");
        }
    }

    public static void main(String[] args) {

    }

}

class RecType {
    int key;
    String data;

    public RecType(int d) {
        key = d;
    }

}
