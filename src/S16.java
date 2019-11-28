import java.util.*;

public class S16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        int size = scanner.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < size;++i) {
            if(map.containsKey(temp = scanner.nextInt())) {
                int tmp = map.get(temp);
                map.put(temp,tmp + 1);
            } else {
                map.put(temp,1);
            }
        }
        int num = temp;
        int maxCount = 1;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =(Map.Entry)iterator.next();
            Integer key = (Integer) entry.getKey();
            Integer val = (Integer)entry.getValue();
            if (val > maxCount) {
                maxCount = val;
                num = key;
            }
        }
        System.out.println(num + " " + maxCount);
    }
}
