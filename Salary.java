import java.util.*;
public class Salary {
	public static void main(String ar[])
	{
		Scanner in=new Scanner(System.in);
		String array[][]= {{"101","A","eng","20000","3000","1200"},{"102","B","se","25000","5000","2000"},
				{"103","c","clerk","28500","2500","1000"},{"104","D","prog","4000","3000","1200"},
				{"105","E","man","40000","12000","3500"},{"106","F","se","25450","5000","2500"},
				{"107","G","E","21000","3000","1200"}};
		
		
		String arrays[][]= {{"eng","e","2200"},{"sc","s","2500"},{"clerk","e","1800"},{"prog","p","3200"},{
			"mang","m","4000"},{"se","s","2500"},{"Eng","E","2200"}};
		 String shopping[][]={{"Jeans","1500"},
		 {"sweatshirt","2000"},{"ultimate nutrition protein","3600"},{"mi band","1980"},{"snickers","2999"}
		 };
		
	
	System.out.println("WELCOME TO YOUR SALARY SLIP POSTER");
	System.out.println("ENTER YOUR USER NAME AND PASSWORD");
	String username=in.next();
	String password=in.next();
	String panel[]= {"rahul","@Rahul1998"};
	Scanner inp=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{		
		if(username.equals(panel[0])&&password.equals(panel[1]))
		{  
	System.out.println("ENTER YOUR EMPLOY NUMBER TO SEARCH YOUR SALARY SLIP");
	int c=inp.nextInt();
	switch(c)
	{
	case 101:
		int basic=Integer.parseInt(array[0][3]);
		System.out.println(basic);
		int hra=Integer.parseInt(array[0][4]);
		System.out.println(hra);
		int it=Integer.parseInt(array[0][5]);
		System.out.println(it);
		int da=Integer.parseInt(arrays[0][2]);
		System.out.println(da);
		double gross=basic+hra+da-it;
		System.out.println("your gross salary is"+(gross));
		double y=(20.0/100.0)*gross;
		System.out.println("20 percent of your gross salary is"+y);
		if(y<basic)
		{
			int z;
			do
			{
			System.out.println("you have sufficent money for shopping");
			System.out.println("1. jean");
			System.out.println("2. sweatshirt");
			System.out.println("3. ultimate nutrition protein");
			System.out.println("4. mi band");
			System.out.println("5. snickers");
			int w=Integer.parseInt(shopping[0][1]);
			int p=Integer.parseInt(shopping[1][1]);
			int o=Integer.parseInt(shopping[2][1]);
			int l=Integer.parseInt(shopping[3][1]);
			int k=Integer.parseInt(shopping[4][1]);
			System.out.println("choose any item above all these ");
			z=inp.nextInt();
			switch (z)
			{
			case 1:
				if(y>w)
				{
				System.out.println("item purchase");
				 y-=w;
				System.out.println(y);
				}
				else{
					System.out.println("insufficient balance");
				}
		break ;
			case 2:
				if(y>p)
				{
				System.out.println("item purchase");
				y-=p;
		System.out.println(y);
				}
				else{
					System.out.println("insufficient balance");
				}
		break;
			case 3:
				if(y>o)
				{
				System.out.println("item purchase");
				y-=o;
		System.out.println(y);
				}
				else{
			System.out.println("insufficient balance");
		}
		break;
			case 4:
				if(y>l)
				{
				System.out.println("item purchase");
			    y-=l;
		System.out.println(y);
				}
		else{
			System.out.println("insufficient balance");
		}
		break;
			case 5:
				if(y>k)
				{
				System.out.println("item purchase");
				y-=k;
		System.out.println(y);
				}
		else{
			System.out.println("insufficient balance");
		}
		break;
			case 6:
				break;
			}
		}while(z!=6);
		}
			else {
				System.out.println("you have insufficent money sorry");	
	}
	break;
	        
	        case 102:
			int basic1=Integer.parseInt(array[1][3]);
			System.out.println(basic1);
			int hra1=Integer.parseInt(array[1][4]);
			System.out.println(hra1);
			int it1=Integer.parseInt(array[1][5]);
			System.out.println(it1);
			int da1=Integer.parseInt(arrays[1][2]);
			System.out.println(da1);
			int gross1=basic1+hra1+da1-it1;	
			System.out.println("your gross salary is"+(gross1));
			
			
			double q=(20.0/100.0)*gross1;
			System.out.println("20 percent of your gross salary is"+q);
			if(q<basic1) { 
				int z;
				do {
			
				System.out.println("you have sufficent money for shopping");
				System.out.println("1. jean");
				System.out.println("2. sweatshirt");
				System.out.println("3. ultimate nutrition protein");
				System.out.println("4. mi band");
				System.out.println("5. snickers");
				int w=Integer.parseInt(shopping[0][1]);
				int p=Integer.parseInt(shopping[1][1]);
				int o=Integer.parseInt(shopping[2][1]);
				int l=Integer.parseInt(shopping[3][1]);
				int k=Integer.parseInt(shopping[4][1]);
				System.out.println("choose any item above all these ");
				
				 z=inp.nextInt();
				switch (z)
				{
				case 1:
					if(q>w) {
					System.out.println("item purchase");
				
					 q-=w;
					
			System.out.println(q);}
					else {
						System.out.println("insufficient balance");
					}
			break ;
				case 2:
					if(q>p) {
					System.out.println("item purchase");
				
					q-=p;
					System.out.println(q);}
			else {
				System.out.println("insufficient balance");
			}
	
			break;
				case 3:
					if(q>o)
					{
					System.out.println("item purchase");
					
					q-=o;
			System.out.println(q);}
					else {
						System.out.println("insufficient balanace");
					}
			break;
				case 4:
					if(q>l) {
					System.out.println("item purchase");
		
				    q-=l;
			System.out.println(q);}
					else {
						System.out.println("insufficent balance");
					}
			break;
				case 5:
					if(q>k) {
					System.out.println("item purchase");
				
					q-=k;
			System.out.println(q);}
					else {
						System.out.println("insufficient balance");
					}
			break;
				case 6:
					break;
			}
				}while(z!=6);
			}
				else {
					System.out.println("you have insufficent money sorry");	
		}
		break;
				case 103:
		int basic2=Integer.parseInt(array[2][3]);
		System.out.println(basic2);
		int hra2=Integer.parseInt(array[2][4]);
		System.out.println(hra2);
		int it2=Integer.parseInt(array[2][5]);
		System.out.println(it2);
		int da2=Integer.parseInt(arrays[2][2]);
		System.out.println(da2);
		int gross2=basic2+hra2+da2-it2;
		System.out.println("your gross salary is"+(gross2));
		double r=(20.0/100.0)*gross2;
		System.out.println("20 percent of your gross salary is"+r);
		if(r<basic2){
			int z;
			do {
			System.out.println("you have sufficent money for shopping");
			System.out.println("1. jean");
			System.out.println("2. sweatshirt");
			System.out.println("3. ultimate nutrition protein");
			System.out.println("4. mi band");
			System.out.println("5. snickers");
			int w=Integer.parseInt(shopping[0][1]);
			int p=Integer.parseInt(shopping[1][1]);
			int o=Integer.parseInt(shopping[2][1]);
			int l=Integer.parseInt(shopping[3][1]);
			int k=Integer.parseInt(shopping[4][1]);
			System.out.println("choose any item above all these ");
			
		 z=inp.nextInt();
			switch (z)
			{
			case 1:
				if(r>w) {
				System.out.println("item purchase");
			
				 r-=w;
				
		System.out.println(r);}
				else {
					System.out.println("insufficient balance");
				}
		break ;
			case 2:
				if(r>p)
				{
					
				
				System.out.println("item purchase");
				
				r-=p;
				
		System.out.println(r);}
				else {
					System.out.println("insufficient balance");
				}
		break;
			case 3:
				if(r>o) {
				
				System.out.println("item purchase");
		
				r-=o;
		System.out.println(r);}
				else {
					System.out.println("insufficient balance");
				}
		break;
			case 4:
				if(r>l)
				{
				System.out.println("item purchase");
			
			    r-=l;
		System.out.println(r);}
				else {
					System.out.println("insufficient balance");
				}
		break;
			case 5:
				if(r>k) {
					
				
				System.out.println("item purchase");
		
				r-=k;
		System.out.println(r);}
				else {
					System.out.println("insufficient balance");
				}
		break;
			case 6:
				break;
		}
		}while(z!=6);
		}
			else {
				System.out.println("you have insufficent money sorry");	
	}
	break;
			
   case 104:
		int basic3=Integer.parseInt(array[3][3]);
		System.out.println(basic3);
		int hra3=Integer.parseInt(array[3][4]);
		System.out.println(hra3);
		int it3=Integer.parseInt(array[3][5]);
		System.out.println(it3);
		int da3=Integer.parseInt(arrays[3][2]);
		System.out.println(da3);
		int gross3=basic3 +hra3+da3-it3;
		System.out.println("your gross salary is"+(gross3));
		double s=(20.0/100.0)*gross3;
		System.out.println("20 percent of your gross salary is"+s);
		if(s<basic3)
		{
			int z;
			do {
			System.out.println("you have sufficent money for shopping");
			System.out.println("1. jean");
			System.out.println("2. sweatshirt");
			System.out.println("3. ultimate nutrition protein");
			System.out.println("4. mi band");
			System.out.println("5. snickers");
			int w3=Integer.parseInt(shopping[0][1]);
			int p3=Integer.parseInt(shopping[1][1]);
			int o3=Integer.parseInt(shopping[2][1]);
			int l3=Integer.parseInt(shopping[3][1]);
			int k3=Integer.parseInt(shopping[4][1]);
			System.out.println("choose any item above all these ");
			
			 z=inp.nextInt();
			switch (z)
			{
			case 1:if(s>w3) {
				
			
				System.out.println("item purchase");
			
				s-=w3;
				
		System.out.println(s);}
			else {
				System.out.println("insuffcient balance");
			}
		break ;
			case 2:if(z>p3) {
				System.out.println("item purchase");
			
			s-=p3;
				
		System.out.println(s);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 3:
				if(s>o3) {
				System.out.println("item purchase");
			
			s-=o3;
		System.out.println(s);}
				else {
					System.out.println("insufficient balance");
				}
		break;
			case 4:if(s>l3) {
				System.out.println("item purchase");
				
				s-=l3;
		System.out.println(s);}
			else {
				System.out.println("insufficient");
			}
		break;
			case 5:if(s>k3) {
				System.out.println("item purchase");
		
				s-=k3;
		System.out.println(s);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 6:
			break;
}
		}while(z!=6);
			}
			else {
				System.out.println("you have insufficent money sorry");	
	}
	break;
  
	case 105:
		int basic4=Integer.parseInt(array[4][3]);
		System.out.println(basic4);
		int hra4=Integer.parseInt(array[4][4]);
		System.out.println(hra4);
		int it4=Integer.parseInt(array[4][5]);
		System.out.println(it4);
		int da4=Integer.parseInt(arrays[4][2]);
		System.out.println(da4);
		int gross4=basic4+hra4+da4-it4;
		System.out.println("your gross salary is"+(gross4));
		double t=(20.0/100.0)*gross4;
		System.out.println("20 percent of your gross salary is"+t);
		if(t<basic4)
		{
			int z;
			do {
			System.out.println("you have sufficent money for shopping");
			System.out.println("1. jean");
			System.out.println("2. sweatshirt");
			System.out.println("3. ultimate nutrition protein");
			System.out.println("4. mi band");
			System.out.println("5. snickers");
			int w4=Integer.parseInt(shopping[0][1]);
			int p4=Integer.parseInt(shopping[1][1]);
			int o4=Integer.parseInt(shopping[2][1]);
			int l4=Integer.parseInt(shopping[3][1]);
			int k4=Integer.parseInt(shopping[4][1]);
			System.out.println("choose any item above all these ");
			
		 z=inp.nextInt();
			switch (z)
			{
			case 1:if(t>w4) {
				System.out.println("item purchase");
		
			t=-w4;
				
		System.out.println(t);}
			else {
				System.out.println("insufficient balance");
			}
		break ;
			case 2:if(t>p4) {
				System.out.println("item purchase");
		
				t-=p4;
				
		System.out.println(t);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 3:
				if(t>o4) {
				System.out.println("item purchase");
			
				t-=o4;
		System.out.println(t);}
				else {
					System.out.println("insufficient balance");
				}
		break;
			case 4:
				if(t>l4) {
				System.out.println("item purchase");
				
				t-=l4;
		System.out.println(t);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 5:if(t>k4) {
				System.out.println("item purchase");
	
				t-=k4;
		System.out.println(t);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 6:
				break;
	
				
				
			}
			
			
		}while(z!=6);
	}
			else {
				System.out.println("you have insufficent money sorry");	
	}
	break;
		


	case 106:
		int basic5=Integer.parseInt(array[5][3]);
		System.out.println(basic5);
		int hra5=Integer.parseInt(array[5][4]);
		System.out.println(hra5);
		int it5=Integer.parseInt(array[5][5]);
		System.out.println(it5);
		int da5=Integer.parseInt(arrays[5][2]);
		System.out.println(da5);
		int gross5=basic5+hra5+da5-it5;
		System.out.println("your gross salary is"+(gross5));
	
		double u=(20.0/100.0)*gross5;
		System.out.println("20 percent of your gross salary is"+u);
		if(u<basic5)
		{
			int z;
			do {
				
			
			System.out.println("you have sufficent money for shopping");
			System.out.println("1. jean");
			System.out.println("2. sweatshirt");
			System.out.println("3. ultimate nutrition protein");
			System.out.println("4. mi band");
			System.out.println("5. snickers");
			int w=Integer.parseInt(shopping[0][1]);
			int p=Integer.parseInt(shopping[1][1]);
			int o=Integer.parseInt(shopping[2][1]);
			int l=Integer.parseInt(shopping[3][1]);
			int k=Integer.parseInt(shopping[4][1]);
			System.out.println("choose any item above all these ");
			
			 z=inp.nextInt();
			switch (z)
			{
			case 1:if(u>w) {
				System.out.println("item purchase");
			
				 u-=w;
				
		System.out.println(u);}
			else {
				System.out.println("insufficient balance");
			}
		break ;
			case 2:if(u>p) {
				System.out.println("item purchase");

				u-=p;
				
		System.out.println(u);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 3:if(u>o) {
				System.out.println("item purchase");
	
				u-=o;
		System.out.println(u);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 4:if(u>l) {
				System.out.println("item purchase");
		
			    u-=l;
		System.out.println(u);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 5:if(u>k) {
				System.out.println("item purchase");
		
				u-=k;
		System.out.println(u);}
			else {
				System.out.println("insufficient balance");
			}
		break;
		
			case 6:
				break;}
		}while(z!=6);}
			
			else {
				System.out.println("you have insufficent money sorry");	
	}
	break;
	        

	case 107:
		int basic6=Integer.parseInt(array[6][3]);
		System.out.println(basic6);
		int hra6=Integer.parseInt(array[6][4]);
		System.out.println(hra6);
		int it6=Integer.parseInt(array[6][5]);
		System.out.println(it6);
		int da6=Integer.parseInt(arrays[6][2]);
		System.out.println(da6);
		int gross6=basic6+hra6+da6-it6;
		System.out.println("your gross salary is"+(gross6));
		
		double v=(20.0/100.0)*gross6;
		System.out.println("20 percent of your gross salary is"+v);
		if(v<basic6)
		{
			int z;
			do {
			System.out.println("you have sufficent money for shopping");
			System.out.println("1. jean");
			System.out.println("2. sweatshirt");
			System.out.println("3. ultimate nutrition protein");
			System.out.println("4. mi band");
			System.out.println("5. snickers");
			System.out.println("6.  exit");
			int w=Integer.parseInt(shopping[0][1]);
			int p=Integer.parseInt(shopping[1][1]);
			int o=Integer.parseInt(shopping[2][1]);
			int l=Integer.parseInt(shopping[3][1]);
			int k=Integer.parseInt(shopping[4][1]);
			System.out.println("choose any item above all these ");
			
		 z=inp.nextInt();
			switch (z)
			{
			case 1:if(v>w) {
				System.out.println("item purchase");
			
				 v-=w;
				
		System.out.println(v);}
			else {
				System.out.println("insufficient balance");
			}
		break ;
			case 2:
				if(v>p) {
				System.out.println("item purchase");
		
				v-=p;
				
		System.out.println(v);}
				else {
					System.out.println("insufficient balannce");
				}
		break;
			case 3:if(v>o) {
				System.out.println("item purchase");
		
				v-=o;
		System.out.println(v);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 4:if(v>l) {
				System.out.println("item purchase");

			    v-=l;
		System.out.println(v);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 5:if(v>k) {
				
			
				System.out.println("item purchase");
				
				v-=k;
		System.out.println(v);}
			else {
				System.out.println("insufficient balance");
			}
		break;
			case 6:
				break;}
		}while(z!=6);}
			else {
				System.out.println("you have insufficent money sorry");	
				
	}
	break;
	}
	break;
		}
		
else{
{
	System.out.println("invalid u have"+(2-i)+" you have two more chances ");
	}

			
	}
	}
	}
}
