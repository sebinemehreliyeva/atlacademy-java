public class Solution {
    public boolean check(Object[] a, Object x) {

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) return true;


        }
        return false;
    }
}


