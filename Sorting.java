// ...................................Bubble sort...................................

public class Main
{
	public static void main(String[] args) {
		int [] arr = {76, 46, 3, 65, 2, 69};
		
		for(int i=0; i<arr.length; i++){
		    
		    int count = 0;
		    
		    for(int j=0; j<arr.length-1-i; j++){
		        
		        if(arr[j] > arr[j + 1 ]){
		            
		            int temp = arr[j];
		            arr[j] = arr[j + 1];
		            arr[j + 1] = temp;
		            count = 1;
		        }
		    }
		    if(count == 0){
		        break;
		    }
		}
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i] + " ");
		}
	}
}