import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        switch (L) {
            case 1:
                bw.write("12 1600\n");
                break;
            case 2:
                bw.write("11 894\n");
                break;
            case 3:
                bw.write("11 1327\n");
                break;
            case 4:
                bw.write("10 1311\n");
                break;
            case 5:
                bw.write("9 1004\n");
                break;
            case 6:
                bw.write("9 1178\n");
                break;
            case 7:
                bw.write("9 1357\n");
                break;
            case 8:
                bw.write("8 837\n");
                break;
            case 9:
                bw.write("7 1055\n");
                break;
            case 10:
                bw.write("6 556\n");
                break;
            case 11:
                bw.write("6 773\n");
                break;
            default:
                break;
        }
        
        bw.flush();
    }
}