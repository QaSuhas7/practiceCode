package array;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = { 2, 5, 7, 11, 15, 20, 45 };
		int[] b = { 2, 3, 5, 8, 9, 10, 11 };
		int s1 = a.length;
		int s2 = b.length;
		int c = a.length + b.length;
		int[] x = new int[c];     // New Array Declared
		for (int i = 0; i < s1; i++) {   // First Array
			for (int j = 0; j < s2; j++) {
				for(int k=0;k<x.length;k++) {
					 
					while(i<s1 && j<s2) {
						if(a[i]<b[j]) {
							x[k]=a[i];
							i++;
							k++;
						}
						else {
							x[k]=b[j];
							j++;
							k++;
							
						}
					}
					while(i<s1) {
						x[k++]=a[i++];
					}
					 while(j<s2) {
						 x[k++]=b[j++];
					 }
				}
			   }
			}
		  for(int l=0;l<c;l++) {
			  System.out.print(x[l]+"|");
		  }
		}

	}


