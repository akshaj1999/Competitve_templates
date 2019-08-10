import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 

class Pair
{
   int x;
   int y;

   public Pair(int x,int y)
   {
    this.x = x;
    this.y = y;
   }
}
class Compare
{
   static void comparee(Pair arr[],int n)
   {
    // Sorting on x
    Arrays.sort(arr,new Comparator<Pair>(){
      @Override public int compare(Pair p1,Pair p2)
      {
        return p1.x - p2.x;
      }
    });
    // Sorting on y

    // Arrays.sort(arr,new Comparator<Pair>(){
    //   @Override public int compare(Pair p1,Pair p2)
    //   {
    //     return p1.y - p2.y;
    //   }
    // });

   }
}

class Demo {


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