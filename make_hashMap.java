import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo{
     
     public static Map make_hashmap(String str)
     {
        Map<Character,Integer> map = new HashMap<>();
        int length = str.length();
        for(int i=0;i<length;i++)
        {
            if(map.get(str.charAt(i))!=null)
            {
                int temp = map.get(str.charAt(i));
                map.put(str.charAt(i),temp+1);
            }
            else
            {
                map.put(str.charAt(i),1);
            }
        }
        return map;
     }

     public static Map array_map(int arr[])
     {
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<arr.length;i++)
      {
         if(map.get(arr[i])!=null)
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
      }
      return map;
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
