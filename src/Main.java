public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList<>(1);
        list.add("qwe");
        System.out.println(list.get(0));
        list.add(123);
        for (int i = 0; i <= 10; i++){
            list.add(Math.random());
        }
        System.out.println(list.size());
        list.remove(5);
    }
}
