import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = MyList.toList(new Integer[]{1, 2, 3});
        List<String> stringList = MyList.toList(new String[]{"Sriman", "Singh"});
    }
}

class MyList {

    public static <T> List<T> toList(T [] arra){
        List<T> list = new ArrayList<>();
        for (T element : arra)
            list.add(element);
        return list;
    }
}
