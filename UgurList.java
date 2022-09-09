public class UgurList<E> {
    private Object[] obj = new Object[1];

    public void add(E e) {
        if (obj[obj.length - 1] == null) {

            obj[obj.length - 1] = e;

        } else {
            increase();
            obj[obj.length - 1] = e;
        }
    }

    public int size() {
        return obj.length;
    }

    public E get(int index) {
        try{
        return (E) obj[index];}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index is not available");
            return null;
        }
    }

    private void increase() {
        Object[] objInstance = new Object[obj.length + 1];

        for (int i = 0; i < obj.length; i++) {

            objInstance[i] = obj[i];

        }

        this.obj = objInstance;

    }

}
