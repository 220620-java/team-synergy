import com.revature.ds.List;
import com.revature.colby.TangArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List arrayList = new TangArrayList(new Integer[]{1,2,3});
        System.out.println(String.format("ArrayList: %s", arrayList.toString()));

        System.out.println("Adding 4 to the end of the list");
        arrayList.add(4);
        System.out.println(String.format("ArrayList: %s", arrayList.toString()));

        System.out.println(String.format("ArrayList[3] = %d", arrayList.get(3)));
        System.out.println(String.format("ArrayList has 3 at Index %d %s", arrayList.indexOf(3), arrayList.toString()));

        System.out.println("Deleting index 1 in the list");
        arrayList.delete(1);
        System.out.println(String.format("ArrayList: %s", arrayList.toString()));
    }
}
