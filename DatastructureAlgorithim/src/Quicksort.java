
public class Quicksort {
public static int partition(int arr[],int l,int r) {
	int i=l-1;
	int pivot=arr[r];
	for (int j = 0; j < arr.length; j++) {
		if(arr[j]<=pivot) {
			i++;
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	int temp=arr[i+1];
	arr[i+1]=arr[r];
	arr[r]=temp;
	
	
	return i+1;
	
}
public static void sort(int arr[],int l,int r) {
	if(l<r) {
		int pi=partition(arr, l, r);
		sort(arr, l, pi-1);
		sort(arr, pi-1, r);
	}
}
public void display(int arr[]) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
		System.out.println();
	}
}
public static void main(String[] args) {
	int arr[]= {10,80,30,90,40,50,70};
	Quicksort q=new Quicksort();
	q.partition(arr, 0, arr.length-1);
	q.display(arr);
}
}
