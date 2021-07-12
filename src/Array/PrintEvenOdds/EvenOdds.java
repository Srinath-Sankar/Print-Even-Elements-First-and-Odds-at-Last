package Array.PrintEvenOdds;
public class EvenOdds {
    void print(int arraysize,int[]array){
        int start=0,end=arraysize-1;
        while(start<end){
            while(array[start]%2==0&&start<end) start++;
            while(array[end]%2==1&&start<end) end--;
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
    }
         for(int i=0;i<arraysize;i++) System.out.print(array[i]+" ");    
  }
}

