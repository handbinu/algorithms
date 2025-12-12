import java.io.*;
import java.util.*;
class Queue{
    int front = 0, rear = 0, QueueSize;
    int[] queue;
    Queue(int i){
        QueueSize = i;
        queue = new int[QueueSize];
    }
    void push(int i){ queue[rear++] = i;}
    int pop(){if(front==rear) return -1; return queue[front++];}
    int size(){return rear - front;}
    boolean empty(){ return front == rear;}
    int front(){ if(front==rear) return -1; return queue[front];}
    int back(){ if(front==rear) return -1; return queue[rear - 1];}
}
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Queue q = new Queue(n);
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String acc = st.nextToken();

            if(acc.equals("push")){
                q.push(Integer.parseInt(st.nextToken()));
            } else if(acc.equals("pop")){
                bw.write(q.pop() + "\n");
            } else if(acc.equals("size")){
                bw.write(q.size() + "\n");
            } else if(acc.equals("empty")){
                bw.write((q.empty()?"1":"0") + "\n");
            } else if(acc.equals("front")){
                bw.write(q.front() + "\n");
            } else if(acc.equals("back")){
                bw.write(q.back()+ "\n");
            }
        }
        bw.flush();
    }
}