	import java.util.*;
	import java.util.Scanner;

	class ClothStore
	{
		public static void As(){
			slog ref = new slog();
		  ref.id();
		}
	   
		static {
	System.out.println("-----------------------------");
	System.out.println("_______");
			System.out.println(" WELCOME ");
		  System.out.println("    TO THE ");
	 System.out.println("       CLOTHSTORE");
	System.out.println("________");  System.out.println("-----------------------------");
		   }
		public static void main(String[] args)
		{
		  As();

			}
	}

	class execution extends slog{
		public   void Execution(){
	 System.out.println("please select again");
	System.out.println("________");    st();
			 }   
		public void login()
		{
			ClothStore.As();       
		}
	}   

	//--++++LOGIN PROCESS---++++

	interface login {
		public  void id(); 
	}

	class slog extends ClothStore implements  login
	{
		public void id(){
	 System.out.println("Enter Name");
	 System.out.println("____");
	Scanner sc = new Scanner (System.in);
			String id = sc.next();

		System.out.println("Enter password");
		System.out.println("_____");
			int psw = sc.nextInt();
		if (psw <= 9999 && psw >=0000)
			{
	 System.out.println("successfully login");
	System.out.println("_____");
			st();
				}else {
	System.out.println("Wrong Input Enter again ");
	System.out.println("_______");	 
				   id();}
		}
		
		public void st(){	
	System.out.println("Enter 1 for men \n ______ \n Enter 2 for womens \n ________ \n Enter 3 for kids \n _______ \n Enter 4 for Home & Living \n _______\n Enter 5 for Beauty Products \n _______ ");
	System.out.println("Enter 0 to go back_");
	Scanner sc = new Scanner (System.in);
		  Home home = new Home();	
			switch(sc.nextInt())
			{
				case 1:
				  home.xx(); 
				break;
				case 2:
			   home.xy();
				break;
				
				case 3:
				home.yy();
				break;
				case 0: 
	System.out.println("Enter 0 for go back");
			   id();
	break;
				default:
			   System.out.println("please enter right no.");
			st();
			}
		}
	}

	//--------Home page--------

	class Home extends slog{
	  public void xx(){
		  System.out.println("mens");
		  System.out.println("-----------");
	  System.out.println("select  \n ___\n   1 for TopWears \n ______ \n 2 for BottomWears \n ______\n 3 for Footwear \n ______\n 4 for innerwears \n______\n  5 for gadgets\n_______");
	System.out.println(" Enter 0 for go back");
			xxx();
	  }
	  public void xxx(){
	   Scanner sc = new Scanner(System.in);
		  men mn = new men(); 
		   int a = sc.nextInt();
		  switch (a){
			  case 1: 
		System.out.println("Topwear");
		System.out.println("____");
		mn.topwear();
		break;
		case 2:
		 System.out.println("BottomWear");
		 System.out.println("_____");
		 mn.bottomwear();
		 break;
		 case 3:
		  System.out.println("FootWear");
		  System.out.println("_____");
		  mn.footwear();
		  break;
		case 4:
	 System.out.println("InnerWear");
	 System.out.println("_____");
	 mn.innerwear();
		 break;
		case 5:
		System.out.println("Gadgets");
		System.out.println("____");
		mn.gadgets();
		break;
		case 0:
	 id();
		break;
		default:
	 System.out.println("please select again");
	   
				 xx();
		   
		   }
	  }
	  
	  public void xy()
	  {
		  System.out.println("womens");
		  System.out.println("_____");
	  }
	  
		  public void yy()
		  {
		   System.out.println("kids");
		System.out.println("_____");
		  }    
	  }
	   interface mens 
	   {
			public void topwear();
			public void bottomwear(); 
			public void footwear();
			public void innerwear();
			public void gadgets();   
	   }
	class men extends Home implements mens 
	 { 
			public void topwear(){
	  System.out.println("Enter 1 forT-Shirts");
	System.out.println("______");
	  System.out.println("Enter 2 for Casuals"); System.out.println("_______");
	System.out.println("Enter 3 for formals");  
	System.out.println("______");
	System.out.println("Enter 4 for Sweatshirts");
	System.out.println("_______");
	System.out.println("Enter 5 for Blazzers&Coats");
	System.out.println("______");
	System.out.println("Enter 6 for Jackets");
	 System.out.println("______");
	 System.out.println("Enter 9 to back")  ; 
	System.out.println("_______");
		  tpt();
		  
			  }
			public void tpt(){
	  Scanner sc = new Scanner(System.in);
		  
			switch (sc.nextInt())
			 {
				 case 1:
			System.out.println("T-Shirts");
		  System.out.println("_____");
			TshirtM mm = new TshirtM();
			mm.tsm();
			  break;
			  case 2:
			 System.out.println("CasualS");
		  System.out.println("_____");
			 casuals cs = new casuals();
			 cs.csm();
		  break;
		  case 3:
			System.out.println("FormalS");
	  System.out.println("_____");
				   break;
				   case 4:
			System.out.println("SweatShirts");
	  System.out.println("_____");
			break;
			case 5:
			System.out.println("Blazers&Coats");
	  System.out.println("_____"); 
			 break;
		  case 6:
			  System.out.println("Jackets");
	   System.out.println("_____");
			  break;
			  case 0:
			  System.out.println("Enter 0 for  Home page");
		System.out.println("_____");
			  As();
			  break;
			  case 9:
		   st();
		   break;
			  default:
	System.out.println("Input is incorrect please enter again");
			  tpt();
			 }
			}
			
			public void bottomwear(){
				
		 System.out.println("Enter 1 for Jeans"); 
	System.out.println("_______");
	System.out.println("Enter 2 for Trousers");
	System.out.println("_______");    
	  System.out.println("Enter 3 for Shorts");
	System.out.println("_______"); 
	   System.out.println("Enter 4 for Joggers");System.out.println("_______");
	 System.out.println("Enter 0 to go to Home "); 
	 System.out.println("_______");
			bpt();
			   }
			public void bpt(){
				
	   Scanner sc = new Scanner(System.in);
		  
			switch (sc.nextInt())
			 {
				 case 1:
			System.out.println("Jeans");
		 System.out.println("_____");
			  break;
			  case 2:
			 System.out.println("Trousers");
	   System.out.println("_____");
		  break;
		  case 3:
			System.out.println("Shorts");
	  System.out.println("_____");
				   break;
				   case 4:
			System.out.println("Joggers");
		  System.out.println("_____");
			break;
			  case 0:
			  System.out.println("Enter 0 for  Home page");
	   System.out.println("______");
			  ClothStore.As();
			  break;
			  default:
	System.out.println("Input is incorrect please enter again");
			  bpt();
			 }  
			}    
				
				  
			public void footwear(){
		System.out.println("1 for CasualS");
		System.out.println("_____");
		  System.out.println("2 for FormalS");
	   System.out.println("_____");
		 System.out.println("3 for SportsS");
	System.out.println("_____");
			System.out.println("4 for Sneakers");
	System.out.println("_____");
			  System.out.println("5 forFloaters");
	System.out.println("_____");
			System.out.println("Enter 0 to go to Home "); 
			System.out.println("_______");
			fpt();
			  }
			
			   public void fpt(){
				
	   Scanner sc = new Scanner(System.in);
		  
			switch (sc.nextInt())
			 {
				 case 1:
		   System.out.println("Casuals");
	  System.out.println("_____");
				 case 2:
			System.out.println("Formals");
	  System.out.println("_____");
			  break;
			  case 3:
			 System.out.println("Sports");
		 System.out.println("_____");
		  break;
		  case 4:
			System.out.println("Sneakers");
		System.out.println("_____");
				   break;
				   case 5:
			System.out.println("Floaters");
	   System.out.println("_____");
			break;
			  case 0:
			  System.out.println("Enter 0 for  Home page");
		 System.out.println("_________");
			  ClothStore.As();
			  break;
			  default:
	System.out.println("Input is incorrect please enter again");
			  fpt();
			 }  
			}  
			 
			public void innerwear(){
	 System.out.println("1 for Briefs&Trunks");
	 System.out.println("______");     
		  System.out.println("2 for Boxers");
	System.out.println("_____"); 
			 System.out.println("3 for Vests");
	 System.out.println("_____");
		 System.out.println("Enter 0 to go to Home ");  
	  System.out.println("_______");
			ipt();
			}
			
			   public void ipt(){
				
	   Scanner sc = new Scanner(System.in);
		  
			switch (sc.nextInt())
			 {
				 case 1:
		 System.out.println("Briefs&Trunks");
	  System.out.println("_____");
			  break;
			  case 2:
			 System.out.println("Boxers");
	   System.out.println("_____");
		  break;
		  case 3:
			System.out.println("Vests");
	   System.out.println("_____");
				   break;
				   
			  case 0:
			  System.out.println("Enter 0 for  Home page");
	  System.out.println("______");
			  ClothStore.As();
			  break;
			  default:
	System.out.println("Input is incorrect please enter again");
			  ipt();
			 }  
			}  
			public void gadgets(){
	  System.out.println("Smart Wearables");
	System.out.println("______");
		System.out.println("Fitness Gadgets");
	  System.out.println("_______");  
			System.out.println("HeadPhones");
	 System.out.println("_____");
	   System.out.println("Speakers");
	System.out.println("_____");
	  System.out.println("Enter 0 to go to Home "); 
	System.out.println("________");
			 gpt();
			}

	   public void gpt(){
				
	   Scanner sc = new Scanner(System.in);
		  
			switch (sc.nextInt())
			 {
				 case 1:
		System.out.println("Smart Wearables");
	  System.out.println("_______");   
			  break;
			  case 2:
		System.out.println("Fitness Gadgets");
	System.out.println("______");  
			 break;
		  case 3:
			System.out.println("HeadPhones");
	System.out.println("_______");         
					break;
				   case 4:
			System.out.println("Speakers");
	System.out.println("_____");      
			  break;
			  case 0:
			  System.out.println("Enter 0 for  Home page");
	System.out.println("_______");
			  ClothStore.As();
			  break;
			  default:
	System.out.println("Input is incorrect please enter again");
			  gpt();
			 }  
			}  
	   }

	class TopM extends men{


	}

	 class TshirtM extends TopM  {
	  
		
		public static void tsm() { 
	  
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter your size");
	  System.out.println("_____");   
				  int a =sc.nextInt();
			 tshm(a);
		}
		
		public static void tshm(double c) {
	 System.out.println("Available brands in price range of " +c);
	 System.out.println("_________");
	 System.out.println("with size ");
			if (c > 500 && c < 1000) { 
				System.out.println("Polo");
	   System.out.println("_____");
				System.out.println("Roadster");
		System.out.println("_____");
				System.out.println("Levis");
		System.out.println("_____");
			} else if (c > 1000 && c < 2000) {
			System.out.println("Kelvin Klein");
		System.out.println("_____");       
			   System.out.println("Van Hausen");
		System.out.println("_____");               System.out.println("Louis Philippe");
		System.out.println("_____");  
			  } else if (c < 5000 && c > 2000) {
				System.out.println("Nike");
	   System.out.println("_____");
				System.out.println("Lacoste");
		System.out.println("_____");     
				   System.out.println("GANT");
	  System.out.println("_____");
			  System.out.println("Antony Morato");
	  System.out.println("_____");
			Scanner sc = new Scanner(System.in);
	  System.out.println("Enter 1 to buy ");
	  System.out.println("_____");
	  System.out.println("Enter 2 for Add to cart");
	  System.out.println("______");
	 System.out.println("Enter 0 to go back "); 
	System.out.println("_______"); 
	 System.out.println("Enter any no. to go Home");
	 System.out.println("___________");
	 
		   switch (sc.nextInt())
		   {
			   case 1: 
			  Home h = new Home();
			  h.xx();
			   break;
			   case 2:
			   tshm(c);
			   break;
			   case 0:
			   men mn = new men();
			  mn.topwear();
			  break;
			  default:
				slog s = new slog();
			   s.st();
		   }
		 
			   }   
		}
	 
	  
	 public static void tshm(int a) {
	System.out.println("Available brands in size " + a);
		
			System.out.println("Polo");
		   System.out.println("_____"); 
			System.out.println("Roadster");
	System.out.println("_____");  
				 System.out.println("Levis");
	System.out.println("_____");   
				 System.out.println("Kelvin Klein");
	 System.out.println("_____"); 
				  System.out.println("Van Hausen");
	   System.out.println("_____");
		   System.out.println("Louis Philippe");
	  System.out.println("_____");
			System.out.println("Nike");
	  System.out.println("_____"); 
			 System.out.println("Lacoste");
	System.out.println("_____");   
				 System.out.println("GANT");
	 System.out.println("_____");    
		   System.out.println("Antony Morato");  
	System.out.println("_____");
	  System.out.println("Enter your price Range");
	  System.out.println("_______");
	 Scanner sc = new Scanner(System.in);
			double c = sc.nextDouble(); 
			tshm(c);
			
		   }
	}

	 class casuals extends TopM
	{
	  
		
		public static void csm()
			{ 
	  
		     Scanner sc = new Scanner(System.in);
			 System.out.println("Enter your size");
	         System.out.println("_______"); 
			 int a =sc.nextInt();
			 cshm(a);
		    } 
		
		public static void cshm(double c)
			{
	            System.out.println("Available brands in price range of " +c);
	            System.out.println("_________");
			}
	 public static void cshm(int a) {
	System.out.println("Available brands in size " + a);
		//    System.out.println("Colour: " + b);   
			System.out.println("Polo");
	  System.out.println("_____");
			System.out.println("Roadster");
	  System.out.println("_____");
			System.out.println("Levis");
	   System.out.println("_____");
			System.out.println("Kelvin Klein");
	   System.out.println("_____");
			System.out.println("Van Hausen");
	   System.out.println("_____");
			System.out.println("Louis Philippe");
		System.out.println("_____");
			System.out.println("Nike");
		System.out.println("_____");
			System.out.println("Lacoste");
		System.out.println("_____");
			System.out.println("GANT");
		System.out.println("_____");
			System.out.println("Antony Morato");
	   System.out.println("_____");
	 System.out.println("Enter your price Range");
	 System.out.println("_______");
	 Scanner sc = new Scanner(System.in);
			double c = sc.nextDouble(); 
			cshm(c);
			
		   }
	}
		
		
		
		




	class BottomM extends men {
		
	}


	class FootM extends men {
		
	}


	class InnerM extends men {
		
		
	}