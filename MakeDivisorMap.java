import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo{
   static void makeDivisorsmap(int n,HashMap<Integer,Integer> map) 
    { 
        if(map.get(1)==null)
          map.put(1,1);
        else
          map.put(1,map.get(1)+1);
         
         if(n==1)
          return;
         
         if(map.get(n)==null)
          map.put(n,1);
        else
          map.put(n,map.get(n)+1);

        for (int i=2; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                if (n/i == i) 
                    {
                      if(map.get(i)==null)
                      {
                        map.put(i,1);
                      }
                      else
                      {
                        map.put(i,map.get(i)+1);
                      }
                    }
       
                else 
                {
                  if(map.get(i)==null)
                      {
                        map.put(i,1);
                      }
                      else
                      {
                        map.put(i,map.get(i)+1);
                      }

                    //System.out.printf("%d %d ", i, n/i); 
                    if(map.get(n/i)==null)
                      {
                        map.put(n/i,1);
                      }
                      else
                      {
                        map.put(n/i,map.get(n/i)+1);
                      }
                }
            } 
        } 
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
  
  
