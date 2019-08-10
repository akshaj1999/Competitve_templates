
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo {
  static long N = 1000000007L;
  static long exponentiation(long base, long exp) 
    { 
        long t = 1L; 
        while (exp > 0) { 
            if (exp % 2 != 0) 
                t = (t * base) % N; 
  
            base = (base * base) % N; 
            exp /= 2; 
        } 
        return t % N; 
    } 

    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
       int t = cin.nextInt();
       StringBuffer ans = new StringBuffer();
       while(t-->0)
       {

       }
       System.out.print(ans);
       }
   

        
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
 
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
 
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
 
            return tokenizer.nextToken("\n");
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
         
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
  } 