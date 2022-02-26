package number;

public class Prime{
    int n;

    public Prime(int n){
        this.n = n;
    }

    public boolean isPrime(){
        boolean flag = true;
        if(n == 2){
            flag = true;
        }else if(n == 1 || (n&1)==0){
            flag = false; 
        }else{
            for(int i=3; i*i<=n; i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return flag;
    }
    
}