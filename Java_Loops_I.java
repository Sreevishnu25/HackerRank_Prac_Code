import java.io.*;



public class Java_Loops_I {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int i = 0;
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (i=1; i<=10; i++){
            System.out.println(N+" x "+ i + " = "+N*i);
        }

        bufferedReader.close();
    }
}
