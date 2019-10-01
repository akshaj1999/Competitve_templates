import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
public class Solution{
   public static void primeFactors(int n,HashMap<Integer,Integer> map) 
    { 
        while (n%2==0) 
        { 
            if(map.get(2)==null)
            {
              map.put(2,1);
            }
            else
              map.put(2,map.get(2)+1);

            n /= 2; 
        } 
  
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            while (n%i == 0) 
            { 
                if(map.get(i)==null)
                  map.put(i,1);
                else
                  map.put(i,map.get(i)+1);
                n /= i; 
            } 
        } 

        if (n > 2) 
          {
            if(map.get(n)==null)
              map.put(n,1);
            else
              map.put(n,map.get(n)+1); 
          }
    } 
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int t = cin.nextInt();
        StringBuffer ans = new StringBuffer();
        while(t-->0)
        {
        
        }
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
  
  
