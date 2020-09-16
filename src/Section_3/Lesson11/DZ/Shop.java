package Section_3.Lesson11.DZ;
class Shop<X> {

    public X[] array;
    public Shop(X[] array) {
        this.array = array; }

    public void printObject() {
        for (X x : array)
            System.out.print(x+" ");
    }
}