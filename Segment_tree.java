import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 

class SegmentTree
{
  private class Node{
    long data;
    int startInterval;
    int endInterval;
    Node left;
    Node right;
  }
  Node root;
  public SegmentTree(int[] arr)
  {
    this.root = constructTree(arr,0,arr.length-1);
  }
  private Node constructTree(int[] arr,int si,int ei)
  {
    if(si==ei)
    {
      Node leafNode = new Node();
      leafNode.data = arr[si];
      leafNode.startInterval = si;
      leafNode.endInterval = ei;
      return leafNode;
    }
    Node node = new Node();
    node.startInterval = si;
    node.endInterval = ei;
    
    int mid = (si+ei)/2;

    node.left = this.constructTree(arr,si,mid);
    
    node.right = this.constructTree(arr,mid+1,ei);
    
    node.data = node.left.data + node.right.data;
    
    return node;
  }
  public long query(int qsi,int qei)
  {
    return this.query(this.root,qsi,qei);
  }
  private long query(Node node,int qsi,int qei)
  {
    if(node.startInterval>=qsi && node.endInterval<=qei)
    {
      return node.data;
    }
    else if(node.startInterval>qei || node.endInterval<qsi)
    {
      return 0;
    }
    else
    {
      long leftans = this.query(node.left,qsi,qei);
      long rightans = this.query(node.right,qsi,qei);
      return leftans+rightans;
    }
  }
  public void update(int index,int newValue)
  {
     this.root.data = this.update(this.root,index,newValue);
  }
  private long update(Node node,int index,int newValue)
  {
    if(index>=node.startInterval && index<=node.endInterval)
    {
      if(index==node.startInterval && index==node.endInterval)
      {
          node.data = newValue;
      }else{
         long leftValue = this.update(node.left,index,newValue);
         long rightValue = this.update(node.right,index,newValue);
         node.data = leftValue + rightValue;
      }
    }
  return node.data;
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
