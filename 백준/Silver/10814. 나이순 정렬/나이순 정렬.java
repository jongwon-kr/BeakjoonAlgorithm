import java.io.*;
import java.util.*;

public class Main {

    static class Person {
        int index;
        String name;
        int age;

        public Person(String name, int age, int index) {
            this.index = index;
            this.name = name;
            this.age = age;
        }

        public void printPerson() {
            System.out.println(age + " " + name);
        }
    }

    static int N;
    static ArrayList<Person> people = new ArrayList();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            int index = i + 1;
            Person p = new Person(name, age, index);
            people.add(p);
        }

        people.sort(Comparator.comparingInt((Person p) -> p.age).thenComparingInt((Person p) -> p.index));

        people.stream().forEach((Person p) -> p.printPerson());
    }
}
