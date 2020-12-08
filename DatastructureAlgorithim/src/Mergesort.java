public class Mergesort {
public void sort(int arr[],int l,int r) {
	if(l<r) {
		int m=(l+r)/2;
		sort(arr, l, m);
		sort(arr, m+1, r);	
		merge(arr, l, m, r);
	}
}
public void merge(int arr[],int l,int m,int r) {
		int n1=m-l+1;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i]=arr[l+i];
		}
		for (int i = 0; i <n2; i++) {
			R[i]=arr[m+1+i];
		}
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
	}
public static void display(int arr[]) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
		System.out.println();
	}
	
}
public static void main(String[] args) {
	int arr[] = { 12, 11, 13, 5, 6, 7 };
	Mergesort m=new Mergesort();
	m.sort(arr, 0, arr.length-1);
	display(arr);
}





}

