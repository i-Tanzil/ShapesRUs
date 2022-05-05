public interface Printable {
    public default void print(){
        return;
    };

    static void sPrint(Object[] o) {
        for (int i = 0; i < o.length; i++) {
        }
    }
}
