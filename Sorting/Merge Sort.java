import java.util.Scanner;
public class Main 
{
    public void mergeSort(int[] a,int first,int last)
    {
        Main obj=new Main();
        if(first==last)
        return;
        int mid=(first+last)/2;
        obj.mergeSort(a,first,mid);
        obj.mergeSort(a,mid+1,last);
        obj.merge(a,first,last,mid);
    }
    public void merge(int[] a,int first,int last,int mid)
    {
        int i,j,k;
        int[] temp=new int[100];
        i=first;
        j=mid+1;
        k=first;
        while(i<=mid && j<=last)
        {
            if(a[i]<=a[j])
            temp[k++]=a[i++];
            else
            temp[k++]=a[j++];
        }
        while(i<=mid)
        temp[k++]=a[i++];
        
        while(j<=last)
        temp[k++]=a[j++];
        
        for(i=first;i<=last;i++)
        a[i]=temp[i];
    }
    public static void main(String[] args) 
	{
	}
}