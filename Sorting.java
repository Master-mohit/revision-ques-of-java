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

// ........................SELECTION SORT....................................

int arr [] = {29, 10, 14, 37, 13};
		
for(int i =0; i<arr.length; i++){
	 int min = i;
	for(int j = i+1; j<arr.length; j++){
		if(arr[j] < arr[min]){
			min = j;
		}
	}
	int temp = arr[min];
	arr[min] = arr[i];
	arr[i] = temp;
}
for(int i=0; i<arr.length; i++){
	System.out.print(arr[i] + " ");
}


// ...................................Insertion sort.............................

int[] arr = {29, 10, 14, 37, 13};
	    
for(int i=1; i<arr.length; i++){
	int current = arr[i];
	int j = i-1;
	
	while(j >= 0 && arr[j] > current){
		arr[j+1] = arr[j];
		j--;
	}
	   arr[j+1] = current;
}
for(int i=0; i<arr.length; i++){
	System.out.print(arr[i]+ " ");
}


//  ..........MERGE SORT.....(devide and conquer)...

public class Main
{
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        
        while(idx1 <= mid && idx2 <= ei ){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else {
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++] = arr[idx1++]; 
        }
        
        while(idx2 <= ei){
             merged[x++] = arr[idx2++];
        }
        
        for(int i=0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
        
    }
    public static void devide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        devide(arr , si, mid);
        devide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
        
    }
    
	public static void main(String[] args) {
	  int arr[] = {3,7,34,9,7,8};
	  int n =  arr.length;
	  devide(arr, 0, n-1);
	  
	  for(int i=0; i<n; i++){
	      System.out.print(arr[i] + " ");
	  }
	  System.out.println();
	}
}