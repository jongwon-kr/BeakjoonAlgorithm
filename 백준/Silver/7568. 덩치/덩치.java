import java.io.*;
import java.util.*;

public class Main {

    static class Person {
        int w;
        int h;
        int rank = 1;

        public Person(int w, int h, int index) {
            this.w = w;
            this.h = h;
        }
    }

    static int N;
    static ArrayList<Person> pList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            Person p = new Person(w, h, i);
            pList.add(p);
        }

        for(int i = 0; i < pList.size(); i++){
            Person p = pList.get(i);
            for(Person tempP : pList){
                if(p.w < tempP.w && p.h < tempP.h){
                    p.rank++;
                }
            }
            bw.write(p.rank+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
