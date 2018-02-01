package codility;

public class Task1 {
	
		public boolean find(int[] a){
			int i=0,j=a.length-1,mid,count=0;
			
			while(i<j){
				mid=(i+j)/2;
				if((a[i]<a[mid]) && (a[mid]<a[j])){
					return true;
				}
				else{
					
					if(a[i]>a[mid]){
						count++;
						int temp=a[i];
						a[i]=a[mid];
						a[mid]=temp;
						}
					else{
						count++;
						int temp=a[mid];
						a[mid]=a[j];
						a[j]=temp;
					}
					
				}
				if(count>1)
					return false;
				i++;
				j--;
				
			}
			return false;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a={1,5,3,3,7};  //true
		//int[] a={1,3,5,3,4};    //false
		int[] a={1,5,6,3,9,8,0};
		Task1 t=new Task1();
		boolean flag=t.find(a);
		System.out.println(flag);
	}

}
