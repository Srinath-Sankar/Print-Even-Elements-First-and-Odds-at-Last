package Array.PrintEvenOdds;
public class EvenOdds {
    void print(int arraysize,int[]array){
        for(int i=0;i<arraysize;i++){
            if(array[i]%2==0) System.out.print(array[i]+" ");   
        }
        for(int i=0;i<arraysize;i++){
            if(array[i]%2==1) System.out.print(array[i]+" ");
        }

    }
    
}
