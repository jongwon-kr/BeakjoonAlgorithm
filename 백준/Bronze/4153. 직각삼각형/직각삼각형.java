import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> sides = new ArrayList<>();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 3; i++){
                int length = Integer.parseInt(st.nextToken());
                sides.add(length);
            }
            if(sides.get(0) == 0){
                break;
            }
            sides.sort(Comparator.comparingInt((Integer i)-> i));
            int a = sides.get(0);
            int b = sides.get(1);
            int c = sides.get(2);

            if(((a*a)+(b*b))== c*c){
                bw.write("right\n");
            }else{
                bw.write("wrong\n");
            }
            sides.clear();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
