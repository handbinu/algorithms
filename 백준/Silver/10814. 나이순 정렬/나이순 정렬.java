import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Member{
    int age;
    String name;
    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Member> list = new ArrayList<>();

        for(int i =0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            list.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken()));
        }
        list.sort(Comparator.comparingInt(m -> m.age));
        for(Member i: list){
            bw.write(i.age+" "+i.name+"\n");
        }
        bw.flush();
    }
}