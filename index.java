import java.util.*;
class fashionshop {
	public static Scanner input = new Scanner (System.in);

	public static String [] order_ID_Array=new String [0]; //order_IDs store in this array
	public static String [] contact_Array=new String [0]; //customer contact number store in this array
	public static String [] size_t_Array=new String [0];  // T-shirts size in this array
	public static int [] qty_ofshirt_Array= new int [0]; // Quantity of shirts in this array
	public static double [] amount_Array= new double [0]; // All amounts in this array
	
	
	
	public static int [] status_Array = new int [0];
	
	
	
	public static final int PROCESSING  = 0;  //order status
	public static final int DELIVERING = 1;  //order status
	public static final int DELIVERED = 2; //order status
	
	public static int  order_status=-1; //order status
	
	public static String contact_number; // input contact number store
	public static String size; // input t-sirts size store
	public static int qty ;  // input qty store
	public static double amount; // amount store
	
	public static int xs_count=0; 
	public static int s_count=0;
	public static int m_count=0;
	public static int l_count=0;
	public static int xl_count=0;
	public static int xxl_count=0;
	
	public static double xs_amount;
	public static double s_amount;
	public static double m_amount;
	public static double l_amount;
	public static double xl_amount;
	public static double xxl_amount;
	public static double total_amount;
	
	public static double xs = 600.00; // to item report
	public static double s  = 800.00; // to item report
	public static double m  = 900.00; // to item report
	public static double l  =1000.00; // to item report
	public static double xl = 1100.00; //to item report
	public static double xxl= 1200.00; //to item report
	public static double xlamount=1000; //to item report

	public static int index; 
	
	public static String search_pnumber;   // seerch by number
	public static String input_order_ID;   // seerch order id 
	public static String delete_order_ID;  // delete by order id
	
	public static int increment_orderID=1;
	public static String orderID ;
	public static int x;
	
	public static String change_id;
	
	
	//public static String [] get_size= {"XS","S","M","L","Xl","XXL"};
	
	
	public static void main(String[] args){
		homepage();
		}

	public static void homepage(){
		
		System.out.println("\n\n\t/$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                          ");
        System.out.println("\t| $$_____/                | $$      |__/                           /$$__  $$| $$                          ");
        System.out.println("\t| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ ");
        System.out.println("\t| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$");
        System.out.println("\t| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$");
        System.out.println("\t| $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$");
        System.out.println("\t| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/");
        System.out.println("\t|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/ ");
        System.out.println("\t                                                                                               | $$      ");
        System.out.println("\t                                                                                               | $$      ");
        System.out.println("\t                                                                                              |__/      ");
    
		System.out.println("\n\n\t\t\t[1] PLACE ORDER\t\t\t\t\t[2] SEARCH CUTOMER\n");
		System.out.println("\t\t\t[3] SEARCH ORDER\t\t\t\t[4] VIEW REPORTS\n");
		System.out.println("\t\t\t[5] SET ORDER STATUS\t\t\t\t[6] DELETE ORDER\n");
		System.out.println("\t\t\t[7] EXIT \n");
		System.out.print("\n\t\tEnter your option : ");
		int option=input.nextInt();
		clearConsole();
		
		switch (option){
			case 1: place_order();break;
			case 2: search_customer();break;
			case 3: search_order();break;
			case 4: viwe_reports(); break;
			case 5:  change_status(); break;
			case 6: delete_order();break;
			case 7: System.exit(0);
			
			}
		}
		
		
	//===========================================Place order========================================================
	
		
	public static void place_order(){
	
	
        System.out.println("\t\t\t _____  __     _____  _____  _____    _____  _____  ____   _____  _____");
        System.out.println("\t\t\t|  _  ||  |   |  _  ||     ||   __|  |     || __  ||    \\ |   __|| __  |");
        System.out.println("\t\t\t|   __||  |__ |     ||   --||   __|  |  |  ||    -||  |  ||   __||    -|");
        System.out.println("\t\t\t|__|   |_____||__|__||_____||_____|  |_____||__|__||____/ |_____||__|__|");
   
	
		

		increment_id(); // call increment ID method ...
		
		contact_number_validate(); // call to check phone number ...
		
		System.out.print("\n\tEnter T-Shirt Size (XS/S/M/L/XL/XXL) : ");
		size=input.next().toUpperCase();
		
		
		
		System.out.print("\n\tEnter QTY \t\t\t     : ");
		qty=input.nextInt();
		
		extend_array(); // call to exetend array...
		
		switch (size){
			
			case "XS":
			amount = 600.00*qty; 
			break;
			case "S":
			amount = 800.00*qty; 
			break;
			case "M":
			amount = 900.00*qty; 
			break;
			case "L":
			amount = 1000*qty; 
			break;
			case "XL":
			amount = 1100*qty; 
			break;
			case "XXL":
			amount = 1200*qty;
			break;
			
			
			}
			
			System.out.println("\n\tAmount \t\t\t\t     : "+amount);
			 
		 
			System.out.print("\n\n\n\n\tDO you want to place this order (Y/N) ? : ");
			String yes_no=input.next();
			if(yes_no.equalsIgnoreCase("Y")){
				//order_status=pro;
				store_Arrays();   // store details in arrays...... 
				System.out.println("\n\t\tOrder Placed ...!");
				increment_orderID++;
				
				System.out.print("\n\n\tDO you want to place another order (Y/N) ? : ");
				String yes_no1=input.next();
				clearConsole();
				if(yes_no1.equalsIgnoreCase("Y")){
					place_order();
				}else{
					homepage();	
				}
			
			}else{
				System.out.println("\n\t\tOrder Not  Placed ...!");
				System.out.print("\n\n\n\n\tDO you want to place another order (Y/N) ? : ");
				 yes_no=input.next();
				 clearConsole();
				if(yes_no.equalsIgnoreCase("Y")){
					place_order();
					
				}else{
					homepage();
					}
			}
	}
	
	public static void increment_id() {
		String tag = "ODR#";
		orderID = tag + String.format("%05d", increment_orderID);
		System.out.println("\n\n\tEnter Order ID      \t\t: " + orderID + "\n\n");
	}
	
	public static void store_Arrays(){
		
			
			order_ID_Array[order_ID_Array.length-1]= orderID; 
			contact_Array[contact_Array.length-1]=contact_number;
			size_t_Array[size_t_Array.length-1] = size;
			qty_ofshirt_Array[qty_ofshirt_Array.length-1 ]= qty;
			amount_Array[amount_Array.length-1] = amount;	
			status_Array[status_Array.length-1] = PROCESSING ;
			
		}
	
	public static void contact_number_validate(){
		
		System.out.print("\n\tEnter Customer Phoner Number \t     : ");
		contact_number=input.next();
	
		
		/*if (contact_number.length() !=10 || contact_number.charAt(0)!='0'){
			System.out.println("\n\tInvalid phone number .... please try again");
			System.out.print("\n\n\tDo you want to enter phone number again (Y/N) ? : ");
			String yes_no=input.next();
			if(yes_no.equalsIgnoreCase("Y")){
				contact_number_validate();
				
				}else{
				homepage();	
					}
			
			}*/
	}
	
	public static void extend_array(){
		
		String [] temp_orderID=new String [order_ID_Array.length+1];
		String [] temp_contact = new String [contact_Array.length+1];
		String [] temp_size = new String [size_t_Array.length+1];
		int [] temp_qty = new int [qty_ofshirt_Array.length+1];
		double [] temp_amount =  new double [amount_Array.length+1];
		int [] temp_status = new int [status_Array.length+1];
		
		for (int i=0;i<contact_Array.length;i++){
			
			temp_orderID[i]=order_ID_Array[i];
			temp_contact[i]=contact_Array[i];
			temp_size[i]=size_t_Array[i];
			temp_qty[i]=qty_ofshirt_Array[i];
			temp_amount[i]=amount_Array[i];
			temp_status[i]=status_Array[i];
			
			}	
			
			order_ID_Array=temp_orderID;
			contact_Array=temp_contact;
			size_t_Array=temp_size;
			qty_ofshirt_Array=temp_qty;	
			amount_Array=temp_amount;
			status_Array=temp_status;
			
		
		}
	
	
	//====================================================Search customer ===============================================================
	
	
	public static void 	search_customer(){
		
        System.out.println("\t\t\t _____                      _      _____            _");
        System.out.println("\t\t\t|   __| ___  ___  ___  ___ | |_   |     | _ _  ___ | |_  ___  _____  ___  ___");
        System.out.println("\t\t\t|__   || -_|| .'||  _||  _||   |  |   --|| | ||_ -||  _|| . ||     || -_||  _|");
        System.out.println("\t\t\t|_____||___||__,||_|  |___||_|_|  |_____||___||___||_|  |___||_|_|_||___||_|");

		System.out.print("\n\n\n\n\tEnter your number  : ");
		search_pnumber=input.next();
		
		searchcustomerby_number();
		
	}
		
    public static void searchcustomerby_number() {
      
      
      boolean true_false=false;
		for (int i = 0; i < contact_Array.length; i++) {
		   
            if (search_pnumber.equals(contact_Array[i])) {
               true_false=true;
              
                if (size_t_Array[i].equals("XS")) {
                    xs_count += qty_ofshirt_Array[i];
                } else if (size_t_Array[i].equals("S")) {
                    s_count += qty_ofshirt_Array[i];
                } else if (size_t_Array[i].equals("M")) {
                    m_count += qty_ofshirt_Array[i];
                } else if (size_t_Array[i].equals("L")) {
                    l_count += qty_ofshirt_Array[i];
                } else if (size_t_Array[i].equals("XL")) {
                    xl_count += qty_ofshirt_Array[i];
                } else if (size_t_Array[i].equals("XXL")) {
                    xxl_count += qty_ofshirt_Array[i];
              
                }
            }
		}
            
			if(true_false==false){
			System.out.println("\n\t\tInvalid input ...");
            System.out.print("\n\n\n\tDo you want to search another customer report (Y/N)? ");
            String yes_no = input.next();
            clearConsole();
            if (yes_no.equalsIgnoreCase("Y")) {
                search_customer();
            } else {
                homepage();
            }
			}else{
				out_put();
				}
			}
			
	public static void out_put(){
		
		 xs_amount=xs_count*600;
		 s_amount=s_count*800;
		 m_amount=m_count*900;
		 l_amount=l_count*1000;
		 xl_amount=xl_count*1100;
		 xxl_amount=xxl_count*1200;
		 total_amount = xs_amount+ s_amount+ m_amount+ l_amount+ xl_amount+ xxl_amount;
		 
		System.out.println("\n\n");
		System.out.println("\t\t\t+---------------------------------------+");
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15s  |\n","Size","QTY","Amount");
		System.out.println("\t\t\t+---------------------------------------+");
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15.2f  |\n","XS",+xs_count,+xs_amount);
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15s  |\n","","","");
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15.2f  |\n","S",+s_count,+s_amount);
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15s  |\n","","","");
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15.2f  |\n","M",+m_count,+m_amount);
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15s  |\n","","","");
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15.2f  |\n","L",+l_count,+l_amount);
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15s  |\n","","","");
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15.2f  |\n","Xl",+xl_count,+xl_amount);
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15s  |\n","","","");
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15.2f  |\n","XXL",+xxl_count,+xxl_amount);
		System.out.printf("\t\t\t|  %-5s  |  %-5s  |  %-15s  |\n","","","");
		System.out.println("\t\t\t+---------------------------------------+");
		System.out.printf("\t\t\t| %-10s        |  %-15.2f  |\n","Total",+total_amount);
		System.out.println("\t\t\t+---------------------------------------+");
        
        
        System.out.print("\n\n\n\tDo you want to search another customer report (Y/N) ? : ");
		String yes_no=input.next();	
		clearConsole();
		if(yes_no.equalsIgnoreCase("Y")){
			get_oldCount();
			search_customer();

		}else{
			homepage();	
			}
        
	}

	public static void get_oldCount(){ // asing againg 0 value for count
		
	 xs_count=0;
	 s_count=0;
	 m_count=0;
	 l_count=0;
	 xl_count=0;
	 xxl_count=0;
	 
	 
		
		}
	
	
//====================================================search order==========================================================================
	
	public static void search_order(){
		
	
        System.out.println("\t\t\t _____                      _      _____         _");
        System.out.println("\t\t\t|   __| ___  ___  ___  ___ | |_   |     | ___  _| | ___  ___");
        System.out.println("\t\t\t|__   || -_|| .'||  _||  _||   |  |  |  ||  _|| . || -_||  _|");
        System.out.println("\t\t\t|_____||___||__,||_|  |___||_|_|  |_____||_|  |___||___||_|");
  
		System.out.print("\n\n\n\tEnter Order ID   : ");
		input_order_ID = input.next();
		searchby_id();
		System.out.print("\n\n\tDo you want to search another order (Y/N)  ? : ");
				String yes_no=input.next();
				clearConsole();
				if(yes_no.equalsIgnoreCase("Y")){
					search_order();
			}else{
					homepage();
				}
		
		
		}	
		
	public static void searchby_id (){
		boolean x=false;
		for(int i=0;i<order_ID_Array.length;i++){
			if(input_order_ID.equals(order_ID_Array[i])){
				x=true;
				index=i;
			}
			
			}if(x==false){
				System.out.println("\n\t\tInvalid ID");
				System.out.print("\n\n\tDo you want to search another order (Y/N) ? : ");
				String yes_no=input.next();
				clearConsole();
				if(yes_no.equalsIgnoreCase("Y")){
					search_order();
				}else{
					homepage();
				}
			}else{
				customer_details();
				
			}
	}
	
	
	public static void customer_details(){   //=== all details=====//
		
		
		System.out.println("\n\tPhone number : "+contact_Array[index]);
		System.out.println("\n\tSize         : "+size_t_Array[index]);
		System.out.println("\n\tQTY          : "+qty_ofshirt_Array[index]);
		System.out.println("\n\tAmount       : "+amount_Array[index]);
		
		
	
			if(status_Array[index]==PROCESSING){
				System.out.println("\n\tStatus       : Processing ");
				
			}else if(status_Array[index]==DELIVERING){
				System.out.println("\n\tStatus       : Delivering ");
				
			}else{
				System.out.println("\n\tStatus       : Delivered");
					
			}
			
		
	}
	
	//======================================================Deleete order=====================================================================	
		
	public static void delete_order(){
		
        System.out.println("\t\t\t ____   _____  __     _____  _____  _____    _____         _");
        System.out.println("\t\t\t|    \\ |   __||  |   |   __||_   _||   __|  |     | ___  _| | ___  ___");
        System.out.println("\t\t\t|  |  ||   __||  |__ |   __|  | |  |   __|  |  |  ||  _|| . || -_||  _|");
        System.out.println("\t\t\t|____/ |_____||_____||_____|  |_|  |_____|  |_____||_|  |___||___||_|");
 
	
		System.out.print("\n\n\n\tEnter Order ID   : ");
		delete_order_ID = input.next();
		deleteby_id();
		System.out.print("\n\n\n\tDo you want to delete another order (Y/N)  ? : ");
				String yes_no=input.next();
				clearConsole();
				if(yes_no.equalsIgnoreCase("Y")){
					delete_order();
			}else{
					homepage();
				}
		
		
		}	
		
	public static void deleteby_id(){
		
		boolean true_false=false;
		for(int i=0;i<order_ID_Array.length;i++){
			if(delete_order_ID.equals(order_ID_Array[i])){
				true_false=true;
				index=i;
				
				
				}
			}if(true_false==false){
				System.out.println("\n\n\t\t\tInvaild ID...");
				System.out.print("\n\n\n\tDo you want to delete another  order (Y/N) ? :  ");
				String yes_no=input.next();
				clearConsole();
				if(yes_no.equalsIgnoreCase("Y")){
					delete_order();
				}else{
						homepage();
				}
			}else{
				customer_details();
				System.out.print("\n\n\n\tDo you want to delete this order (Y/N) ? : ");
				String yes_no=input.next();
				if(yes_no.equalsIgnoreCase("Y")){
					get_oldCount(); // assign again 0 value to count ( qty) 
					delete_details(); // delete details 
					
					System.out.println("\n\n\n\t\tOrder Deleted ...!");

					}else{
						System.out.println("\n\t\tOrder not deleted...!");
						}
				}
		
		}	
	
	public static void delete_details(){
		
		String [] del_order_id = new String [order_ID_Array.length-1];
		String [] del_contact_number = new String [contact_Array.length-1];
		String [] del_size = new String [size_t_Array.length-1];
		int [] del_qty = new int [qty_ofshirt_Array.length-1];
		double [] del_amount = new double [amount_Array.length-1]; 
		
		
		for (int i=0, j=0; i<order_ID_Array.length; i++){
			if(i!=index){
				del_order_id[j] = order_ID_Array[i];
				del_contact_number[j] = contact_Array[i];
				del_size[j] = size_t_Array[i];
				del_qty[j] = qty_ofshirt_Array[i];
				del_amount[j] = amount_Array[i];
				j++;
				
				}
			}
			
			order_ID_Array = del_order_id;
			contact_Array = del_contact_number;
			size_t_Array = del_size;
			qty_ofshirt_Array = del_qty;
			amount_Array = del_amount;
			
		
		
		}
	
	
	//=====================================================viwe reports===========================
	
		// customer reports//=============================
	
	public static void viwe_reports(){
		
		
		System.out.println("\n\t[1] Customer Reports");
		System.out.println("\n\t[2] Item reports");
		System.out.println("\n\t[3] Order reports");
		
		System.out.print("\n\n\tEnter option : ");
		int option = input.nextInt();
		clearConsole();
		
		switch (option){
			
			case 1: customer_reports();break;
			case 2: item_reports();break;
			case 3: order_reports();break;
			default:System.out.println("\n\n\tInvaild Option.....");
			
			
			
			}
		
		}
	
	public static void customer_reports(){
		
		System.out.println("\n\t[1] Best in Customers ");
		System.out.println("\n\t[2] View Customers ");
		System.out.println("\n\t[3] All Customer Reports ");
		
		System.out.print("\n\n\tEnter your Option : ");
		int option=input.nextInt();
		clearConsole();
		
		switch (option){
			
			case 1: best_customer_rep();break;
			case 2: viwe_customer_rep();break;
			case 3: all_customer_rep();break;
			
			}
		
		
 		}
	
	               //best in customer//
	
	public static void best_customer_rep(){
			
        System.out.println("\t\t\t    ____            __               __                           ");
        System.out.println("\t\t\t   / __ )___  _____/ /_   __________/ /_____  ____ ___  ___  _____");
        System.out.println("\t\t\t  / __  / _ \\/ ___/ __/  / ___/ ___/ __/ __ \\/ __ `__ \\/ _ \\/ ___/");
        System.out.println("\t\t\t / /_/ /  __(__  ) /_   / /__(__  ) /_/ /_/ / / / / / /  __/ /    ");
        System.out.println("\t\t\t/_____/\\___/____/\\__/   \\___/____/\\__/\\____/_/ /_/ /_/\\___/_/     ");
		System.out.println("\n\t\t````````````````````````````````````````````````````````````````````````````````````````````````````");
    	System.out.println("\n\n\n");
    	
    	best_customer();
    	
    	
    	System.out.print("\n\n\n\tTo access the Menu, Please enter 0 : ");
		String yes_no= input.next();
		if(yes_no.equals("0")){
			clearConsole();
			homepage();
			
			}else{
			System.out.println("\n\t\t\tInavalid input .....!");	
			best_customer_rep();
		}
	}
		
    public static void best_customer(){
			
		int order_count=order_ID_Array.length;
    	 if(order_count==0){
			System.out.println("NO order place....!");
			
			}
		
    
    	
		String [] temp_customer = new String [contact_Array.length];  // make 3 arrays for get all of values
		int [] temp_all_qty = new int [qty_ofshirt_Array.length];
		double [] temp_total_amount = new double [amount_Array.length];
		
		int unique_count = 0;  // get same numbers count
		
		
		
		for (int i=0;i<order_ID_Array.length;i++){
			String cust_id = contact_Array[i];   
			boolean found = false; 
				
			for(int j=0;j<unique_count;j++){
				if(temp_customer[j].equals(cust_id)){
					temp_all_qty[j] +=qty_ofshirt_Array[i];
					temp_total_amount [j] += amount_Array[i];
					found=true;
					break;
					
					}
				}
				
				if(!found){
					temp_customer[unique_count]= cust_id;
					temp_all_qty[unique_count]=qty_ofshirt_Array[i];
					temp_total_amount[unique_count]=amount_Array[i];
					unique_count++;
					}
			
			}
			
			
			
		bubble_sort(temp_customer, temp_all_qty , temp_total_amount , unique_count); // call to soat method	
		
		System.out.print("\t\t\t+-----------------------+-----------+-------------------------+");
		System.out.printf("\n\t\t\t|   %-17s   |  %-7s  |   %-20s  |","Customer ID","All Qty","Total amount");
		System.out.print("\n\t\t\t+-----------------------+-----------+-------------------------+");

		for(int i=0;i<unique_count;i++){
			
			if (temp_customer[i]!=null && temp_all_qty[i]!=0 && temp_total_amount[i]!=0.0 ){ // remove null
					System.out.printf("\n\t\t\t|   %-17s   |  %-7s  |   %-20s  |",temp_customer[i],+temp_all_qty[i],+temp_total_amount[i]);
				}
			
		

		
		
		}System.out.print("\n\t\t\t+-----------------------+-----------+-------------------------+");
		
			
		}
    	
	public static void bubble_sort(String [] temp_customer, int [] temp_all_qty , double [] temp_total , int unique){
		
		for(int i=0; i<unique-1; i++){
			for(int j=0; j<unique-1-i; j++){
				if(temp_total[j]<temp_total[j+1]){
					
					double t=temp_total[j];
					temp_total[j]=temp_total[j+1];
					temp_total[j+1]=t;
					
					int qty1=temp_all_qty[j];
					temp_all_qty[j]=temp_all_qty[j+1];
					temp_all_qty[j+1]=qty1;
					
					String id=temp_customer[j];
					temp_customer[j]=temp_customer[j+1];
					temp_customer[j+1]=id;
					
				}	
				
			}

		}
	}


				 // viwe cutomer//				
	
	public static void viwe_customer_rep(){
	
        System.out.println("\t\t\t       _    ___                 ______           __                                    ");
        System.out.println("\t\t\t      | |  / (_)__ _      __   / ____/_  _______/ /_____  ____ ___  ___  __________    ");
        System.out.println("\t\t\t      | | / / / _ \\ | /| / /  / /   / / / / ___/ __/ __ \\/ __ `__ \\/ _ \\/ ___/ ___/    ");
        System.out.println("\t\t\t      | |/ / /  __/ |/ |/ /  / /___/ /_/ (__  ) /_/ /_/ / / / / / /  __/ /  (__  )     ");
        System.out.println("\t\t\t      |___/_/\\___/|__/|__/   \\____/\\__,_/____/\\__/\\____/_/ /_/ /_/\\___/_/  /____/      ");
    	System.out.println("\n\t\t````````````````````````````````````````````````````````````````````````````````````````````````````");
    	System.out.println("\n\n\n");
    	
    	viwe_customer();
    	
    	System.out.print("\n\n\n\tTo access the Menu, Please enter 0 : ");
		String yes_no= input.next();
		if(yes_no.equals("0")){
			clearConsole();
			homepage();
			}else{
			System.out.println("\n\t\t\tInavalid input .....!");	
			viwe_customer_rep();
		}
	}
    	
	public static void viwe_customer(){
		
		
		
		
		String [] temp_customer = new String [contact_Array.length];  // make 3 arrays for get all of values
		int [] temp_all_qty = new int [qty_ofshirt_Array.length];
		double [] temp_total_amount = new double [amount_Array.length];
		
		int unique_count = 0;
		
		
		
		for (int i=0;i<order_ID_Array.length;i++){
			String cust_id = contact_Array[i];   
			boolean found = false; 
				
			for(int j=0;j<unique_count;j++){
				if(temp_customer[j].equals(cust_id)){
					temp_all_qty[j] +=qty_ofshirt_Array[i];
					temp_total_amount [j] += amount_Array[i];
					found=true;
					break;
					
					}
				}
				
				if(!found){
					temp_customer[unique_count]= cust_id;
					temp_all_qty[unique_count]=qty_ofshirt_Array[i];
					temp_total_amount[unique_count]=amount_Array[i];
					unique_count++;
					}
			
			}
		
		System.out.print("\t\t\t+-----------------------+-----------+-------------------------+");
		System.out.printf("\n\t\t\t|   %-17s   |  %-7s  |   %-20s  |","Customer ID","All Qty","Total amount");
		System.out.print("\n\t\t\t+-----------------------+-----------+-------------------------+");
		

		
		
		for(int i=0;i<unique_count;i++){ // ceeck 0 to unique count 
			if( temp_customer[i]!= null && temp_all_qty[i] !=0 && temp_total_amount[i]!=0.0){ // remove null values in the table 

			
			System.out.printf("\n\t\t\t|   %-17s   |  %-7s  |   %-20s  |",temp_customer[i],+temp_all_qty[i],+temp_total_amount[i]);

				}	
		
	
		}
		System.out.print("\n\t\t\t+-----------------------+-----------+-------------------------+");
		
	}

				// all customer//
		
		
	public static void all_customer_rep(){
		
	
        System.out.println("\t\t\t   ___   ____  _____         __                       ___                    __    ");
        System.out.println("\t\t\t  / _ | / / / / ___/_ _____ / /____  __ _  ___ ____  / _ \\___ ___  ___  ____/ /_   ");
        System.out.println("\t\t\t / __ |/ / / / /__/ // (_-</ __/ _ \\/  ' \\/ -_) __/ / , _/ -_) _ \\/ _ \\/ __/ __/   ");
        System.out.println("\t\t\t/_/ |_/_/_/  \\___/\\_,_/___/\\__/\\___/_/_/_/\\__/_/   /_/|_|\\__/ .__/\\___/_/  \\__/    ");
        System.out.println("\t\t\t                                                           /_/                    ");
		System.out.println("\t\t````````````````````````````````````````````````````````````````````````````````````````````````\n\n\n");	
		
		all_customer();
		
		
    	System.out.print("\n\n\n\tTo access the Menu, Please enter 0 : ");
		String yes_no= input.next();
		if(yes_no.equals("0")){
			clearConsole();
			homepage();
			
			}else{
			System.out.println("\n\t\t\tInavalid input .....!");	
			best_customer_rep();
		}
		
	}	
		
	public static void all_customer(){
		
		
		
		String [] temp_customer = new String [contact_Array.length];  // make 4 arrays for get all of values
		double [] total_amount = new double [amount_Array.length];		
		int [][] size_count = new int [size_t_Array.length][6];
		
		int unique_count = 0;
		
		for (int i=0;i<order_ID_Array.length;i++){
			String cust_id = contact_Array[i];   
			boolean found = false; 
				
				
				
			for(int j=0;j<unique_count;j++){
				if(temp_customer[j].equals(cust_id)){
					size_count[j][size(size_t_Array[i])]+=  qty_ofshirt_Array[i];
					total_amount [j] += amount_Array[i];
					found=true;
					break;
					
					}
				}
				
				if(!found){
					temp_customer[unique_count]= cust_id;
					size_count[unique_count][size(size_t_Array[i])]=qty_ofshirt_Array[i];
					total_amount[unique_count]=amount_Array[i];
					unique_count++;
				}
			
			}
			
			
		System.out.print("\t\t+------------------+--------+---------+--------+---------+--------+---------+------------------+");
		System.out.printf("\n\t\t|  %-14s  |  %-4s  |   %-4s  |  %-4s  |   %-4s  |  %-4s  |   %-4s  |  %-14s  |","Phone number","XS","S","M","L","XL","XXL","Totl");
		System.out.print("\n\t\t+------------------+--------+---------+--------+---------+--------+---------+------------------+");
		
	
		for (int i=0;i<unique_count;i++){
						System.out.printf("\n\t\t|  %-14s  |  %-4s  |   %-4s  |  %-4s  |   %-4s  |  %-4s  |   %-4s  |  %-14s  |",temp_customer[i],+size_count[i][0],+size_count[i][1],+size_count[i][2],+size_count[i][3],+size_count[i][4],+size_count[i][5],+total_amount[i]);

				
		}
		

		
	
		System.out.println("\n\t\t+------------------+--------+---------+--------+---------+--------+---------+------------------+");

	}	
		
	public static int size(String size){
	
		switch (size){
			
			case "XS" :return 0;
			case "S" : return 1;
			case "M" : return 2;
			case "L" :return 3;
			case "XL" : return 4;
			case "XXL" : return 5;
			default : return -1;
		
		}
		
	}	
	
	
	// items rep//======================================
	
	public static void item_reports(){
		
		System.out.println("\n\t[1] Best Selling Categories Sorted by QTY");
		System.out.println("\n\t[2] Best Selling Categories Sorted by Amount");
		
		System.out.print("\n\n\tEnter your Option : ");
		int option = input.nextInt();
		clearConsole();
		
		switch (option){
			
			case 1: sort_by_qty(); break;
			case 2: sort_by_amount();break;
			default:System.out.println("Invalid input......!");
			
			}
		}
	
			//======sort by qty=====//
			
	public static void sort_by_qty(){
		
        System.out.println("\n\t\t\t   _____            __           __   __             ____  ________  __   ");
        System.out.println("\t\t\t  / ___/____  _____/ /____  ____/ /  / /_  __  __   / __ \\/_  __/\\ \\/ /   ");
        System.out.println("\t\t\t  \\__ \\/ __ \\/ ___/ __/ _ \\/ __  /  / __ \\/ / / /  / / / / / /    \\  /    ");
        System.out.println("\t\t\t ___/ / /_/ / /  / /_/  __/ /_/ /  / /_/ / /_/ /  / /_/ / / /     / /     ");
        System.out.println("\t\t\t/____/\\____/_/   \\__/\\___/\\__,_/  /_.___/\\__, /   \\___\\_\\/_/     /_/      ");
        System.out.println("\t\t\t                                        /____/                            ");
		System.out.println("\t\t`````````````````````````````````````````````````````````````````````````````````````````");
		System.out.println("\n\n\n");
		
		sort_qty();
		
		
		System.out.print("\n\n\n\tTo access the Menu, Please enter 0 : ");
		String yes_no= input.next();
		if(yes_no.equals("0")){
			clearConsole();
			homepage();
			}else{
			System.out.println("\n\t\t\tInavalid input .....!");	
			best_customer_rep();
		}
	}
		
	public static void sort_qty(){
		
		int order_count=order_ID_Array.length;
    	 if(order_count==0){
			System.out.println("NO order place....!");
			
			}
		
		
		
		String [] temp_size1={"XS","S","M","L","XL","XXL"};
		int [] temp_q= new int [6];
		
		
		if(order_ID_Array.length>=1){
			
		 for (int i=0 ;i<order_ID_Array.length;i++){
			
			 switch (size_t_Array[i]){
				 case "XS"  :temp_q [0] +=qty_ofshirt_Array[i]; break; // get count of each sizes
				 case "S"   :temp_q [1] +=qty_ofshirt_Array[i]; break; // get count of each sizes
				 case "M"   :temp_q [2] +=qty_ofshirt_Array[i]; break; // get count of each sizes
				 case "L"   :temp_q [3] +=qty_ofshirt_Array[i]; break; // get count of each sizes
				 case "XL"  :temp_q [4] +=qty_ofshirt_Array[i]; break; // get count of each sizes
				 case "XXL" :temp_q [5] +=qty_ofshirt_Array[i]; break; // get count of each sizes
				 
				 }
				 
			 }
			 
			 
			 for (int i=0; i <temp_size1.length-1; i++){
				 for (int j=0 ; j<temp_size1.length-1; j++){
					 if(temp_q[j]<temp_q[j+1]){
 
						 String c = temp_size1[j];
						 temp_size1[j] = temp_size1[j+1];
						 temp_size1[j+1]=c;
						 
						 int qtys= temp_q[j];
						 temp_q[j]=temp_q[j+1];
						 temp_q[j+1]=qtys; 
						 
						 }
					 
					 }
				 }	 
		 
			System.out.print("\n\t\t\t+-----------+-----------+-------------------------+");
			System.out.printf("\n\t\t\t|   %-5s   |  %-7s  |   %-20s  |","Size","Qty","Total amount");
			System.out.print("\n\t\t\t+-----------+-----------+-------------------------+");
			
			
			for (int i=0; i<temp_size1.length ; i++){
			
			System.out.printf("\n\t\t\t|   %-5s   |  %-7s  |   %-20s  |",temp_size1[i],+temp_q[i],+(double) temp_q[i]*(temp_size1[i].equals("XS")? xs : temp_size1[i].equals("S") ? s : temp_size1[i].equals("M") ? m : temp_size1[i].equals("L") ? l : temp_size1[i].equals("XXL") ? xxl : temp_size1[i].equals("XL") ? xl :0.00)); 
			
			}
			
			
			System.out.print("\n\t\t\t+-----------+-----------+-------------------------+");
			
			System.out.print("\n\n\n\tTo access the Menu, Please enter 0 : ");
			String yes_no= input.next();
			clearConsole();
			homepage();	
		}
		
		
	}	
		
			//======sort by amount=======//
	
	public static void sort_by_amount(){
	
        System.out.println("\n\t   _____            __           __   __             ___                                __       ");
        System.out.println("\t  / ___/____  _____/ /____  ____/ /  / /_  __  __   /   |  ____ ___  ____  __  ______  / /_      ");
        System.out.println("\t  \\__ \\/ __ \\/ ___/ __/ _ \\/ __  /  / __ \\/ / / /  / /| | / __ `__ \\/ __ \\/ / / / __ \\/ __/      ");
        System.out.println("\t ___/ / /_/ / /  / /_/  __/ /_/ /  / /_/ / /_/ /  / ___ |/ / / / / / /_/ / /_/ / / / / /_        ");
        System.out.println("\t/____/\\____/_/   \\__/\\___/\\__,_/  /_.___/\\__, /  /_/  |_/_/ /_/ /_/\\____/\\__,_/_/ /_/\\__/        ");
        System.out.println("\t                                        /____/                                                 ");
		System.out.println("\t``````````````````````````````````````````````````````````````````````````````````````````````````````````");
		System.out.println("\n\n\n");
			
			
		soat_amount();
		
		System.out.print("\n\n\n\tTo access the Menu, Please enter 0 : ");
		String yes_no= input.next();
		if(yes_no.equals("0")){
			clearConsole();
			homepage();
			}else{
			System.out.println("\n\t\t\tInavalid input .....!");	
			sort_by_amount();
		}
		
		
	}
	
	
	public static void soat_amount(){
		
		
		String [] temp_size1={"XS","S","M","L","XL","XXL"};
		int [] temp_q= new int [6];
		int [] temp_status=status_Array;
		
			
		 for (int i=0 ;i<order_ID_Array.length;i++){
			
			 switch (size_t_Array[i]){
				 case "XS"  :temp_q [0] +=qty_ofshirt_Array[i]; break; 
				 case "S"   :temp_q [1] +=qty_ofshirt_Array[i]; break;
				 case "M"   :temp_q [2] +=qty_ofshirt_Array[i]; break; 
				 case "L"   :temp_q [3] +=qty_ofshirt_Array[i]; break;
				 case "XL"  :temp_q [4] +=qty_ofshirt_Array[i]; break; 
				 case "XXL" :temp_q [5] +=qty_ofshirt_Array[i]; break;
				 
				 }
				 
			 }
			 
			 
			 for (int i=0; i <temp_size1.length-1; i++){
				 for (int j=0 ; j<temp_size1.length-1; j++){
				   double total= (double) temp_q[j]*(temp_size1[j].equals("XS")? xs : temp_size1[j].equals("S") ? s : temp_size1[j].equals("M") ? m : temp_size1[j].equals("L") ? l : temp_size1[j].equals("XXL") ? xxl : temp_size1[j].equals("XL") ? xl:0.00); 
					 
					 if(total < (double) temp_q[j+1]*(temp_size1[j+1].equals("XS")? xs :temp_size1[j+1].equals("XL") ? xl : temp_size1[j+1].equals("XXL") ? xxl :  temp_size1[j+1].equals("S") ? s : temp_size1[j+1].equals("M") ? m : temp_size1[j+1].equals("L") ? l :0.00)){
						 
						 
						 String c = temp_size1[j];
						 temp_size1[j] = temp_size1[j+1];
						 temp_size1[j+1]=c;
						 
						 int qtys= temp_q[j];
						 temp_q[j]=temp_q[j+1];
						 temp_q[j+1]=qtys; 
						 
						 int st=temp_status[j];
						 temp_status[j]=temp_status[j+1];
						 temp_status[j+1]=st;
						 
						 }
					 
					 }
				 }	 
		 
			System.out.print("\n\t\t\t+-----------+-----------+-------------------------+");
			System.out.printf("\n\t\t\t|   %-5s   |  %-7s  |   %-20s  |","Size","Qty","Total amount");
			System.out.print("\n\t\t\t+-----------+-----------+-------------------------+");
			
			
			for (int i=0; i<temp_size1.length ; i++){
				
				if(temp_size1[i]!=null && temp_q[i]!=0 ){
				
				System.out.printf("\n\t\t\t|   %-5s   |  %-7s  |   %-20s  |",temp_size1[i],+temp_q[i],+(double) temp_q[i]*(temp_size1[i].equals("XS")? xs : temp_size1[i].equals("S") ? s : temp_size1[i].equals("M") ? m : temp_size1[i].equals("L") ? l : temp_size1[i].equals("XXL") ? xxl : temp_size1[i].equals("XL") ? xl :0.00)); 

				}
			
			
			}
			
			
			System.out.print("\n\t\t\t+-----------+-----------+-------------------------+");
			
			System.out.print("\n\n\n\tTo access the Menu, Please enter 0 : ");
			String yes_no= input.next();
			homepage();	
		
		
	}
	
	
	//===========order reports//===================
	
	
	public static void order_reports(){
		
		
		System.out.println("\n\t[1] All Orders ");
		System.out.println("\n\t[2] Orders By Amount");
		
		System.out.print("\n\n\tEnter your Option : ");
		int option = input.nextInt();
		clearConsole();
		
		switch (option){
			
			case 1: all_orders(); break;
			case 2: order_by_amount();break;
			default: System.out.println("\n\t\t\tInvalid input......");break;
			
			}
		
		
		}
	
	                                           	//==========all orders=========//
	public static void all_orders(){
		

        System.out.println("\n\t\t\t\t    ___    ____   ____           __              ");
        System.out.println("\t\t\t\t   /   |  / / /  / __ \\_________/ /__  __________");
        System.out.println("\t\t\t\t  / /| | / / /  / / / / ___/ __  / _ \\/ ___/ ___/");
        System.out.println("\t\t\t\t / ___ |/ / /  / /_/ / /  / /_/ /  __/ /  (__  ) ");
        System.out.println("\t\t\t\t/_/  |_/_/_/   \\____/_/   \\__,_/\\___/_/  /____/  ");
		System.out.println("\t\t\t``````````````````````````````````````````````````````````````");
		System.out.println("\n\n\n");
		
		orders_all();
		
		System.out.print("\n\n\n\tTo access the Menu, Please enter 0 : ");
		String yes_no= input.next();
		if(yes_no.equals("0")){
			clearConsole();
			homepage();
			}else{
			System.out.println("\n\t\t\tInavalid input .....!");	
			all_orders();
		}
	}
		
	public static void  orders_all(){
		int [] temp_st=status_Array;
	
		System.out.print("\t\t+----------------+-------------------+----------+---------+-------------------+------------------+");
		System.out.printf("\n\t\t|   %-10s   |  %-15s  |   %-5s  |  %-5s  |  %-15s  |  %-14s  |","Order ID","Customer ID","Size","Qty"," amount","Status");
		System.out.print("\n\t\t+----------------+-------------------+----------+---------+-------------------+------------------+");
	
		for(int i=size_t_Array.length-1;i>=0;i--){
			
			if(order_ID_Array[i]!=null && contact_Array[i]!=null && size_t_Array[i]!=null && amount_Array[i]!=0.0){
				System.out.printf("\n\t\t|   %-10s   |  %-15s  |   %-5s  |  %-5s  |  %-15s  |  %-14s  |",order_ID_Array[i],contact_Array[i],size_t_Array[i],+qty_ofshirt_Array[i],+amount_Array[i],temp_st[i]==PROCESSING ? "Processing" : temp_st[i]==DELIVERING ? "Delivering" :"Delivered");


			}
			
		}
		
		System.out.print("\n\t\t+----------------+-------------------+----------+---------+-------------------+------------------+");
		
	}
	                                    //=========orders by amount=====//
	  
	public static void order_by_amount(){
	
        System.out.println("\n\t\t\t  ____         __              ___         ___                        __ ");
        System.out.println("\t\t\t / __ \\_______/ /__ _______   / _ )__ __  / _ | __ _  ___  __ _____  / /_");
        System.out.println("\t\t\t/ /_/ / __/ _  / -_) __(_-<  / _  / // / / __ |/  ' \\/ _ \\/ // / _ \\/ __/");
        System.out.println("\t\t\t\\____/_/  \\_,_/\\__/_/ /___/ /____/\\_, / /_/ |_/_/_/_/\\___/\\_,_/_//_/\\__/ ");
        System.out.println("\t\t\t                                 /___/                                  ");
		System.out.println("\t\t`````````````````````````````````````````````````````````````````````````````````````````````");
		System.out.println("\n\n\n");
		
		order_amount(); // call order by amount soat method
		
		System.out.print("\n\n\n\tTo access the Menu, Please enter 0 : ");
		String yes_no= input.next();
		if(yes_no.equals("0")){
			clearConsole();
			homepage();
			}else{
			System.out.println("\n\t\t\tInavalid input .....!");	
			order_by_amount();
		}
		
	}	
		
	public static void order_amount(){
			
		String [] temp_contact1 = contact_Array;  // create temp arrays to find details//
		String [] temp_size1 = size_t_Array;
		int [] temp_qty1 = qty_ofshirt_Array;
		double [] amount_soat = amount_Array;
		String [] temp_OID = order_ID_Array;
		int [] temp_st = status_Array;
		
		for(int i=0; i<order_ID_Array.length-1; i++){
			for(int j=0; j<order_ID_Array.length-1; j++){
				if(amount_soat[j]<amount_soat[j+1]){
					
					double t=amount_soat[j];        // soat amount 
					amount_soat[j]=amount_soat[j+1];
					amount_soat[j+1]=t;
					
					String order=temp_OID[j];      // soat order id to get same details
					temp_OID [j] = temp_OID[j+1];
					temp_OID[j+1] = order;
					
					String number = temp_contact1[j];   // soat contact nuber to get same details
					temp_contact1[j]= temp_contact1[j+1];
					temp_contact1[j+1]=number; 
					
					String size1=temp_size1[j];   // soat size to get same details
					temp_size1[j]=temp_size1[j+1];
					temp_size1[j+1]= size1;
					
					int qty1 = temp_qty1[j];   // soat qty to get same details
					temp_qty1[j]=temp_qty1[j+1];
					temp_qty1[j+1] =qty1; 
					
					
					int t_st=temp_st[j];
					temp_st[j] = temp_st[j+1];
					temp_st[j+1] = t_st;					
					
					}
			}
		}
		
		System.out.print("\t\t+----------------+-------------------+----------+---------+-------------------+------------------+");
		System.out.printf("\n\t\t|   %-10s   |  %-15s  |   %-5s  |  %-5s  |  %-15s  |  %-14s  |","Order ID","Customer ID","Size","Qty"," amount","Status");
		System.out.print("\n\t\t+----------------+-------------------+----------+---------+-------------------+------------------+");
	
	
		for(int i=0;i<order_ID_Array.length;i++){
			if(temp_OID!=null && temp_contact1!=null && temp_size1!=null  && temp_qty1[i]!=0 && amount_soat[i]!=0.0){
			
			System.out.printf("\n\t\t|   %-10s   |  %-15s  |   %-5s  |  %-5s  |  %-15s  |  %-14s  |",temp_OID[i],temp_contact1[i],temp_size1[i],+temp_qty1[i],+amount_soat[i],temp_st[i]==PROCESSING ? "Processing" : temp_st[i]==DELIVERING ? "Delivering" :"Delivered");

			}
			
	
		
			}
		System.out.print("\n\t\t+----------------+-------------------+----------+---------+-------------------+------------------+");
		
		
	}
	
	//=============================================cahnge order sattus ===============================
	
	public static void change_status(){
	
        System.out.println("\t\t  ____         __          ______       __              ");
        System.out.println("\t\t / __ \\_______/ /__ ____  / __/ /____ _/ /___ _____     ");
        System.out.println("\t\t/ /_/ / __/ _  / -_) __/ _\\ \\/ __/ _ `/ __/ // (_-<     ");
        System.out.println("\t\t\\____/_/  \\_,_/\\__/_/   /___/\\__/\\_,_/\\__/\\_,_/___/     ");
        System.out.println("\t\t                                                        ");
		System.out.println("\t\t````````````````````````````````````````````````````````````````");
		System.out.println("\n\n");
		
		System.out.print("\n\n\tEnter Order ID   : ");
		change_id = input.next();
		
		order_status_change();
		
		System.out.print("\n\n\tDo you want to Change anoter Order Status (Y/N) ? : ");
		String yes_no= input.next();
		if (yes_no.equalsIgnoreCase("Y")){
			clearConsole();
			change_status();
			get_oldCount();
			
			}else{
				clearConsole();
				homepage();	
			}
		
	}
	
	
	public static void order_status_change(){
		
		boolean true_=false;
		for (int i=0 ;i<order_ID_Array.length;i++){
			if(change_id.equals(order_ID_Array[i])){
				true_=true;
				index=i;
				
				}
			
		}
		
		if(true_==false){
			System.out.println("\n\n\tInvalid input ....!");
			System.out.print("\n\tDo you want to Change another Order Status again (Y/N) ?  :");	
			String yes=input.next();
			clearConsole();
			if(yes.equalsIgnoreCase("Y")){
				change_status();
			}else{
				clearConsole();
				homepage();
			}	
				
		}else{
			customer_details();
			System.out.print("\n\n\tDo you want to Change this Order (Y/N) ? : ");
			String yes=input.next();
			if(yes.equalsIgnoreCase("Y")){
				change_2();
			}else{
				System.out.print("\n\n\tDo you want to Change another Order (Y/N) ? : ");
				String yes1=input.next();
				if(yes1.equalsIgnoreCase("Y")){
					clearConsole();
					change_status();
					
				}else{
					clearConsole();
					homepage();
				}	
			}
				
		}
		
	}
	
	
	public static void change_2(){
	String option="";
	int index1=index;
		if(status_Array[index1]==PROCESSING){
			
			System.out.println("\n\t\t[1] Order Delivering");
			System.out.println("\n\t\t[2] Order Delivered");
			System.out.print("\n\tEnter yor Option : ");
			option = input.next();
			if(option.equals("1")){
				status_Array[index]=DELIVERING;
				System.out .println("\n\n\t\tStatus Updated ....!");
			}else{
				status_Array[index]=DELIVERED;
				System.out.println("\n\n\t\tStatus Updated ....!");
			}
			
			
			
		}else if (status_Array[index1]==DELIVERING){
			System.out.println("\n\t\t[1] Order Delivered");
			System.out.print("\n\tEnter yor Option : ");
			String option1=input.next();
			if(option.equals("1")){
				status_Array[index]=DELIVERED;
				System.out.println("\n\n\t\tStatus Updated ....!");

			}
		
		}else{
			System.out.println("\n\n\t\tCan't change this status, Order already Delivered ....!");
		}
		
		
	}	
		
	public final static void clearConsole() {  
     try { 
           final String os = System.getProperty("os.name");  
           if (os.contains("Windows")) { 
               new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor(); 
           } else { 
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
              } 
       } catch (final Exception e) { 
            e.printStackTrace(); 
            // Handle any exceptions. 
        } 
   }		
		
		
		
}	
	
