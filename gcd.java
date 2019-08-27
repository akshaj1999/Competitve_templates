import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 

class Demo {
    public static int countDivisors(long n) 
    { 
        int count = 0;
        for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                
                if (n/i == i) 
                   count++;
       
                else // Otherwise print both 
                  count+=2;
            } 
        } 
        return count;
    } 

    static long gcd(long a, long b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b);  
      
} 
long findGCD(long arr[],long n) 
{ 
    long result = arr[0]; 
    for (int i = 1; i < n; i++) 
        result = gcd(arr[i], result); 
  
    return result; 
} 
 static long lcm(long a,long b) 
    { 
        return (a*b)/gcd(a, b); 
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
