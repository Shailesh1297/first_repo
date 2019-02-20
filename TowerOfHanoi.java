import java.util.*;
/**
 *
 * @author UCHIHA
 */
public class TowersOfHanoi {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
	 static int step;
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        Stack<Integer>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        Stack<Integer>st3=new Stack<>();
        int n,count=0;
        
        System.out.print("Enter Number of Disc:");
        n=scan.nextInt();
        for(int i=n;i>0;i--)
        {
               Integer x=new Integer(i);
                st1.push(x);
        }
        
   
	 try{
        
        if(n%2==1)
        {
                    while(count!=n)
                    {
                        System.out.println("Stack 1:"+st1);
                        System.out.println("Stack 2:"+st2);
                         System.out.println("Stack 3:"+st3);
                         System.out.println("");
                        //A------>C
                        if(st3.empty())
                        {
                            st3.push(st1.pop());
                            count++;
                        }
                        else
                        {
                            if(st1.empty()||st3.empty())
                            {
                                if(st1.empty())
                                {
                                    st1.push(st3.pop());
                                    count--;
                                }
                                else
                                {
                                    st3.push(st2.pop());
                                    count++;
                                }
                                
                            }
                            else
                            
                            {
                                if(st1.peek()>st3.peek())
                                {
                                st1.push(st3.pop());
                                count--;
                                }
                                    else
                                    {
                                    st3.push(st1.pop());
                                    count++;
                                     }
                            }
                           }//A->C
						   step++;
                                
                           System.out.println("Stack 1:"+st1);
                            System.out.println("Stack 2:"+st2);
                             System.out.println("Stack 3:"+st3);   
                             System.out.println("");
                        
                        //A---------->B
                        if(st2.empty())
                        {
                            
                            st2.push(st1.pop());
                            
                            
                        }
                        else
                        {
                            
                            
                            if(st1.empty()||st2.empty())
                            {
                                if(st1.empty())
                                {
                                    st1.push(st2.pop());
                                    
                                }
                                else
                                {
                                    st2.push(st1.pop());
                                    
                                }
                                
                            }
                            else
                            {
                                    if(st2.peek()>st1.peek())
                                    {
                                        st2.push(st1.pop());
                                    }
                                    else
                                    {
                                        st1.push(st2.pop());
                                    }
                                
                            }
                        }//A->B
						step++;
                        
                        System.out.println("Stack 1:"+st1);
                        System.out.println("Stack 2:"+st2);
                        System.out.println("Stack 3:"+st3);
                        System.out.println("");
                        
                        //B---------------->C
                       
                        if(st2.empty()||st3.empty())
                            {
                                if(st2.empty())
                                {
                                    st2.push(st3.pop());
                                    count--;
                                }
                                else
                                {
                                    st3.push(st2.pop());
                                    count++;
                                }
                                
                            }
                        else
                        {
                        if(st2.peek()>st3.peek())
                        {
                            st2.push(st3.pop());
                            count--;
                            
                        }
                        else
                        {
                            st3.push(st2.pop());
                            count++;
                        }
                        }//B-->C  
						step++;
    }
}
                  //Even case  
        
        else
        {           
             while(count!=n)
                    {
                         System.out.println("Stack 1:"+st1);
                            System.out.println("Stack 2:"+st2);
                             System.out.println("Stack 3:"+st3);   
                             System.out.println("");
                        //A---------->B
                        if(st2.empty())
                        {
                            st2.push(st1.pop());
                            
                        }
                        else
                        {
                            
                            
                            if(st1.empty()||st2.empty())
                            {
                                if(st1.empty())
                                {
                                    st1.push(st2.pop());
                                    
                                }
                                else
                                {
                                    st2.push(st1.pop());
                                    
                                }
                                
                            }
                            else
                            {
                                    if(st2.peek()>st1.peek())
                                    {
                                        st2.push(st1.pop());
                                    }
                                    else
                                    {
                                        st1.push(st2.pop());
                                    }
                                
                            }
                        }//A->B
						step++;
						
						System.out.println("Stack 1:"+st1);
                            System.out.println("Stack 2:"+st2);
                             System.out.println("Stack 3:"+st3);   
                             System.out.println("");
                        
                        //A------>C
                        if(st3.empty())
                        {
                            st3.push(st1.pop());
                            count++;
                        }
                        else
                        {
                            if(st1.empty()||st3.empty())
                            {
                                if(st1.empty())
                                {
                                    st1.push(st3.pop());
                                    count--;
                                }
                                else
                                {
                                    st3.push(st2.pop());
                                    count++;
                                }
                                
                            }
                            else
                            
                            {
                                if(st1.peek()>st3.peek())
                                {
                                st1.push(st3.pop());
                                count--;
                                }
                                    else
                                    {
                                    st3.push(st1.pop());
                                    count++;
                                     }
                            }
                           }//A->C
						   step++;
						   System.out.println("Stack 1:"+st1);
                            System.out.println("Stack 2:"+st2);
                             System.out.println("Stack 3:"+st3);   
                             System.out.println("");

                         //B---------------->C
                       
                        if(st2.empty()||st3.empty())
                            {
                                if(st2.empty())
                                {
                                    st2.push(st3.pop());
                                    count--;
                                }
                                else
                                {
                                    st3.push(st2.pop());
                                    count++;
                                }
                                
                            }
                        else
                        {
                        if(st2.peek()>st3.peek())
                        {
                            st2.push(st3.pop());
                            count--;
                            
                        }
                        else
                        {
                            st3.push(st2.pop());
                            count++;
                        }
                        }//B-->C  
						step++;
                        

                    }
}
            
        
        
      
        
     System.out.println("Stack 1:"+st1);
     System.out.println("Stack 2:"+st2);
     System.out.println("Stack 3:"+st3);
	 }
	 catch(Exception e)
		{
		 
		}
		System.out.println("");
		System.out.println("STEPS: "+step);
	}
    
}
