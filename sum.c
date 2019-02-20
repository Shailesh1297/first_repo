#include<stdio.h>


void main()

{
    int x,i,sum=0;
    
scanf("%d",&x);
   
 int arr[x];
    
for(i=0;i<x;i++)
   
 {
      
  scanf("%d",&arr[i]);
      
  sum=sum+arr[i];
      
  }
       
 printf("%d",sum);
   
 }