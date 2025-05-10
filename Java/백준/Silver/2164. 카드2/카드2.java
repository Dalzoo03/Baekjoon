import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int testcase = scanner.nextInt();

    int[] queue = new int [1000000];
    int front = 0;
    int rear = testcase;

    for(int i = 0; i < testcase; i++){
      queue[i] = i+1;
    }
    while(rear - front != 1){
      front++;
      queue[rear++] = queue[front++];
    }
    System.out.println(queue[front]);
  }
}
