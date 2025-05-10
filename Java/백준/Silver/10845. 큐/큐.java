import java.util.*;

public class Main{
  static Scanner scanner = new Scanner(System.in);
  private static class QueueUtil{
    static int[] queue = new int [10000];
    static int front = 0;
    static int rear = 0;

    private static int order(){
      return scanner.nextInt();
    }
    private static void run(int orders){
      while(orders != 0){
        String temp = scanner.next();
        switch(temp){
          case "push":{
            push(scanner.nextInt());
            orders--;
            break;
          }
          case "pop":{
            pop();
            orders--;
            break;
          }
          case "size":{
            size();
            orders--;
            break;
          }
          case "empty":{
            empty();
            orders--;
            break;
          }
          case "front":{
            frontUtil();
            orders--;
            break;
          }
          case "back":{
            backUtil();
            orders--;
            break;
          }
        } 
      }
    }
    private static void push(int data){
      queue[rear++] = data;
    }
    private static void pop(){
      if(front == rear){
        System.out.println("-1");
        return;
      }
      System.out.println(queue[front++]);
    }
    private static void size(){
      System.out.println(Math.abs(front - rear));
    }
    private static void empty(){
      if(rear == front){
        System.out.println("1");
        return;
      }
      System.out.println("0");
    }
    private static void frontUtil(){
      if(rear == front){
        System.out.println("-1");
        return;
      }
      System.out.println(queue[front]);
    }
    private static void backUtil(){
      if(rear == front){
        System.out.println("-1");
        return;
      }
      System.out.println(queue[rear-1]);
    }
  }
  public static void main(String args[]){
    int orders = QueueUtil.order();

    QueueUtil.run(orders);
  }
}
