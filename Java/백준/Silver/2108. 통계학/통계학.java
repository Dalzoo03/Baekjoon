import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = sc.nextInt();
        int [] arr = new int[count];
        for(int i = 0; i < count; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;
        for(int i = 0; i < count; i++){
            sum += arr[i];
        }

        // 최빈값이 문제
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < count; i++){
            Integer num = map.get(arr[i]);
            if(num == null){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], num + 1);
            }
        }


        System.out.println(Math.round((double) sum / count));

        System.out.println(arr[count/2]);


        int maxCount = -1;
        for(int i = 0; i<count; i++){
            if(map.get(arr[i]) > maxCount){
                maxCount = map.get(arr[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key) == maxCount){
                list.add(key);
            }
        }
        Collections.sort(list);

        if(list.size() > 1){
            System.out.println(list.get(1));
        }
        else{
            System.out.println(list.get(0));
        }



        if(count == 1){
            System.out.println("0");
        }
        else{
            System.out.println(arr[count-1] - arr[0]);
        }

    }
}