import java.io.*;
import java.util.*;
class Stack{
    int[] arr;
    int top = -1;

    Stack(int n){
        arr = new int[n];
    }
    void push(int n){arr[++top] = n;}
    int pop(){
        if(top == -1) return -1;
        return arr[top--];
    }
    int size(){ return top+1;}
    boolean empty(){ return top == -1; }
    int top(){
        if(top == -1) return -1;
        return arr[top];
    }
}
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        Stack stack = new Stack(n);

        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String token = st.nextToken();
            if(token.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(token.equals("top")){
                bw.write(stack.top()+"\n");
            }else if(token.equals("size")){
                bw.write(stack.size()+"\n");
            }else if(token.equals("empty")){
                bw.write((stack.empty()?"1":"0")+"\n");
            }else if(token.equals("pop")){
                bw.write(stack.pop()+"\n");
            }
        }
        bw.flush();
    }
}