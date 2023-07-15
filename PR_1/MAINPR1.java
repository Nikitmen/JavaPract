package sem2.PR_1;

public class MAINPR1 implements Comparator  {
    public static void main(String[] args) {
        MAINPR1 a = new MAINPR1();
        int[] array1 ={1, 2, 4};
        int[] array2 ={1, 2, 3};
        a.srav(array1,array2);
    }
    @Override
    public void srav(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            System.out.println("Равны");
        }
        else System.out.println("Не равны");
    }
}
