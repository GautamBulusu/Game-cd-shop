 
import java.util.*;
public class gamecdshop
{
    //master file
    int m_id[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,0,0,0,0,0,0,0,0};
    int m_qty[]={20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,0,0,0,0,0,0,0,0};
    int m_cost[]={2000,2500,2700,2000,2500,2000,2500,2000,1500,2500,2700,2000,3000,2000,2500,2000,2000,2500,2700,2000,2500,2000
        ,2500,2000,0,0,0,0,0,0,0,0};
    char m_scrap[]={'n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n',0,0,0,0,0,0,0,0};

    String m_contype[]={"PS4      ","PS4      ","PS4      ","PS4      ","PS4      ","PS4      ","PS4      ","PS4      ","Xbox oneS","Xbox oneS","Xbox oneS","Xbox oneS",
            "Xbox oneS","Xbox oneS","Xbox oneS","Xbox oneS","PC       ","PC       ","PC       ","PC       ","PC       ","PC       ","PC       ","PC       ","","","","","","","",""};   
    String m_cdtype[]={"adventure","adventure","adventure","adventure","sport    ","sport    ","sport    ","sport    ","adventure"
        ,"adventure","adventure","adventure","sport    ","sport    ","sport    ","sport    ","adventure","adventure","adventure","adventure","sport    ","sport     ","sport    ","sport    ","","","","","","","",""};
    String m_cdname[]={"GTA 5                      ","watch dogs 2                ","uncharted 4                ","assassin's creed:black flag","fifa 17                     ",
            "fifa 16                   ","pes 2017                    ","pes 2016                     ","GTA-liberty city           ","watch dogs                ","dishonored 2               ","assassin's creed:syndicate  ","fifa 18                     ","fifa 16                 "

        ,"pes 2017                    ","pes 2016                    ","GTA 5                       ","watch dogs 2               ","dishonored 2               ","assassin's creed:unity      ","fifa 17                     ","fifa 16                     ","pes 2017                       ","pes 2016                       ","","","","","","","",""};

    int mid = 25;
    int mind = 24;

    //transaction file
    int c_id[]={1,2,3,0,0,0,0,0,0,0};
    int c_mid[]={1,5,10,0,0,0,0,0,0,0};
    int c_qty[]={1,2,1,0,0,0,0,0,0,0};

    int c_amt[]={2000,5000,2500,0,0,0,0,0,0,0};
    int c_gst[]={200,500,250,0,0,0,0,0,0,0};
    int c_bill[]={2200,5500,2750,0,0,0,0,0,0,0};
    char c_scrap[]={'n','n','n',0,0,0,0,0,0,0};

    String c_contype[]={"PS4      ","PS4       ","Xbox oneS","","","","","","",""};
    String c_cdtype[]={"adventure","sport    ","adventure","","","","","","",""};
    String c_cdname[]={"GTA 5       ","fifa17      ","watch dogs 2","","","","","","",""};
    String c_custname[]={"gareth sanchez","lionel aveiro ","alexis bale   ","","","","","","",""};

    long c_custpno[]={933480307,969376267,702163905,0,0,0,0,0,0,0};

    int cno=4;
    int c_ind=3;
    int out=0;
    int again=0;
    int ai=24;

    boolean flag=false;

    Scanner ob=new Scanner(System.in);

    static void main()
    {
        int ch=0;
        gamecdshop sc=new gamecdshop();

        do
        {
            sc.out=0;

            System.out.println("\f");
            System.out.println("\t\t\t\t\tWELCOME TO -------->X GAMES");

            System.out.println("\t\t\t\t\t1.ENQUIRY");
            System.out.println("\t\t\t\t\t2.SALE");
            System.out.println("\t\t\t\t\t3.ADD PRODUCT");

            System.out.println("\t\t\t\t\t4.REMOVE PRODUCT");
            System.out.println("\t\t\t\t\t5.CHANGE COST");
            System.out.println("\t\t\t\t\t6.CHANGE QUANTITY");

            System.out.println("\t\t\t\t\t7.CHANGE CD NAME");
            System.out.println("\t\t\t\t\t8.CHANGE CONSOLE NAME");
            System.out.println("\t\t\t\t\t9.REPORTS");

            System.out.println("\t\t\t\t\t10.BILL");
            System.out.println("\t\t\t\t\t11.EXIT");

            System.out.println("enter your choice");
            ch=sc.ob.nextInt();

            switch(ch)
            {
                case 1:
                sc.enq();
                break;

                case 2:
                sc.sale();
                break;

                case 3:
                sc.add();
                break;

                case 4:
                sc.remove();
                break;

                case 5:
                sc.modifycost();
                break;

                case 6:
                sc.modifyqty();
                break;

                case 7:
                sc.modifycdname();
                break;

                case 8:
                sc.modifyconname();
                break;

                case 9:
                sc.report();
                break;

                case 10:
                sc.bill();
                break;

                case 11:
                sc.c_ind++;
                sc.cno++;
                sc.out=1;
                sc.again=0;

                break;

                default:
                System.out.println("invalid choice");
                break;
            }

            if(sc.out==0)
            {
                System.out.println("press 1 to remain in main menu");
                sc.again=sc.ob.nextInt();
            }

        }while(sc.again==1);

        System.out.println();
        System.out.println("TTTTTTTT   H     H       A      N    N     K     K    S S S S                       ");
        System.out.println("   T       H     H      A A     N N  N     K   K      S                           ");
        System.out.println("   T       HHHHHHH     AAAAA    N  N N     K K        S S S S                        ");
        System.out.println("   T       H     H    A     A   N   NN     K   K            S               ");
        System.out.println("   T       H     H   A       A  N    N     K     K    S S S S                ");
        System.out.println();

        System.out.println("THANK YOU VISIT AGAIN!");
    }

    void enq()
    {
        loading();

        System.out.println("\f");
        System.out.println("\t\t\t\t\tENQUIRY COUNTER");
        System.out.println("ID\tcon cat\t\tcd cat\t\tcd name\t\t\t\tqty\t\t\t\tcost");

        for(int i=0;i<mid;i++)
        {

            if(m_id[i]>0 && m_scrap[i]=='n')
            {
                System.out.println(m_id[i]+"\t"+m_contype[i]+"\t"+m_cdtype[i]+"\t"+m_cdname[i]+"\t"+m_qty[i]+"\t\t\t\t "+m_cost[i]);        
            }

        }

    }

    void sale()
    {
        loading();
        ob.nextLine();
        System.out.println("pls enter your name");
        String name=ob.nextLine();
        int laname=name.length();
        if(laname<13)
        {
            int xx=13-laname;
            for(int ii=0;ii<xx;ii++)
            {
                name=name+" ";
            }
        }
        System.out.println("enter your phone no. ");
        long pno=ob.nextLong();
        int pid;
        int qty;
        int i;
        boolean flagid = false;
        boolean flagqty = false;
        int againsales;
        do
        {
            flagid = false;
            flagqty = false;

            System.out.println("\f");

            enq();

            System.out.println("Customer ID --> "+cno + "\n");

            System.out.println("Enter product ID");
            pid=ob.nextInt();

            for(i=0;i<m_id.length;i++)
            {

                if(m_id[i] == pid)
                {
                    flagid = true;
                    System.out.println("Enter qty");
                    qty=ob.nextInt();    

                    if(m_qty[i] >= qty)
                    {
                        c_id[c_ind] = cno;

                        c_mid[c_ind]=m_id[i];
                        c_qty[c_ind]=qty;
                        c_amt[c_ind]=m_cost[i]*qty;
                        c_gst[c_ind]=(10*c_amt[c_ind])/100;
                        c_bill[c_ind]=c_amt[c_ind]+c_bill[c_ind];
                        c_scrap[c_ind]='n';
                        c_contype[c_ind]=m_contype[i];
                        c_cdtype[c_ind]=m_cdtype[i];
                        c_cdname[c_ind]=m_cdname[i];
                        c_custname[c_ind]=name;
                        c_custpno[c_ind]=pno;

                        flagqty = true;
                    }
                    else
                    {
                        System.out.println("Insufficient qty");
                        break;
                    }
                }
            }

            if(flagid == false)
            {
                System.out.println("Invalid ID entered");
            }

            System.out.println("Press 1 to remain in Sales");
            againsales = ob.nextInt();

        }while(againsales==1);
        again = 1;
        out = 1;

    }

    void add()
    {

        System.out.println("\f");

        enq();
        m_scrap[mind]='n';

        System.out.println("YOUR ID IS "+mid);
        m_id[mind]=mid;

        System.out.println("enter the qty");
        int a=ob.nextInt();
        m_qty[mind]=a;

        System.out.println("enter the cost");
        int b=ob.nextInt();
        m_cost[mind]=b;

        ob.nextLine();
        System.out.println("enter the console type");
        String s=ob.nextLine();

        int l=s.length();
        if(l<10)
        {
            int g=9-l;
            for(int ddlj=0;ddlj<=g;ddlj++)
            {
                s=s+" ";
            }
        }
        m_contype[mind]=s;

        System.out.println("enter the cd type");
        String s1=ob.nextLine();
        int l1=s1.length();
        if(l1<10)
        {
            int g1=9-l1;
            for(int ddlj1=0;ddlj1<=g1;ddlj1++)
            {
                s1=s1+" ";
            }
        }
        m_cdtype[mind]=s1;

        System.out.println("enter the cd name");
        String s2=ob.nextLine();
        int l2=s2.length();
        if(l2<27)
        {
            int g2=9-l;
            for(int ddlj2=0;ddlj2<=g2;ddlj2++)
            {
                s2=s2+" ";
            }
        }
        m_cdname[mind]=s2;

        loading();
        System.out.println("\f");
        enq();

        System.out.println("YOUR PRODUCT HAS BEEN SUCCESFULLY ADDED");
        enq();
        mind++;mid++;
    }

    void remove()
    {
        loading();
        int again = 0;
        do
        {

            System.out.println("\f");
            System.out.println("\t\t\t\t\tENQUIRY COUNTER");
            System.out.println("\t\t\tID\t\tcon cat\t\tcd cat\t\tcd name\t\tqty\t\tcost");

            for(int i=0;i<mid;i++)
            {
                if(m_id[i]>0 && m_scrap[i]=='n')
                {
                    System.out.println("\t\t\t"+m_id[i]+"\t\t"+m_contype[i]+"\t\t"+m_cdtype[i]+"\t\t"+m_cdname[i]+"\t\t"+m_qty[i]+"\t\t"+m_cost[i]);        
                }
            }

            System.out.println("Enter the Product Id : ");
            int pid = ob.nextInt();

            boolean flag = false;

            for(int i = 0;i < m_id.length; i++)
            {

                if(m_id[i] == pid)
                {
                    flag = true;
                    m_scrap[i] = 'y';
                    loading();
                    System.out.println("product has been removed...");
                    enq();
                    break;
                }

            }

            if(flag == false)
            {
                System.out.println("Invalid Product ID..!!");
            }

            System.out.println("Press 1 if you want to continue scrap");

            

        }while(again==1);

        out = 1;
        this.again = 1;

    }

    void modifycost()
    {
        loading();
        int again=0;
        do
        {

            System.out.println("\f");
            enq();


            boolean flag=false;
            System.out.println("enter the  product id whose cost you want to modify");
            int a=ob.nextInt();

            for(int i=0;i<m_id.length;i++)
            {

                if(m_id[i]==a && m_scrap[i]=='n')
                {
                    flag=true;
                    System.out.println("The current cost ---> " + m_cost[i]);
                    System.out.println("enter the changed cost of the product");

                    int b=ob.nextInt();
                    m_cost[i]=b;

                    loading();
                    System.out.println("cost successfully changed");

                    break;
                }

            }

            if(flag==false)
            {
                System.out.println("wrong id entered");
            }

            System.out.println("enter '1' to continue.else enter any other number");
            again=ob.nextInt();

        }while(again==1);

        this.again=1;
        out=1;
    }

    void modifyqty()
    {
        loading();
        int again=0;
        do
        {

            System.out.println("\f");
            enq();


            boolean flag=false;
            System.out.println("enter the  product id whose quantity you want to modify");
            int a=ob.nextInt();

            for(int i=0;i<m_id.length;i++)
            {

                if(m_id[i]==a && m_scrap[i]=='n')
                {
                    flag=true;
                    System.out.println("The current quantity ---> " + m_qty[i]);
                    System.out.println("enter the changed quantity of the product");

                    int b=ob.nextInt();
                    m_qty[i]=b;

                    loading();
                    System.out.println("quantity successfully changed");

                    break;
                }

            }

            if(flag==false)
            {
                System.out.println("wrong id entered");
            }

            System.out.println("enter '1' to continue.else enter any other number");
            again=ob.nextInt();

        }while(again==1);

        this.again=1;
        out=1;
    }

    void modifycdname()
    {

        int again=0;
        do
        {

            System.out.println("\f");
            enq();


            boolean flag=false;
            System.out.println("enter the  product id whose cdname you want to modify");
            int a=ob.nextInt();

            for(int i=0;i<m_id.length;i++)
            {

                if(m_id[i]==a && m_scrap[i]=='n')
                {
                    flag=true;
                    System.out.println("The current name ---> " + m_cdname[i]);
                    System.out.println("enter the changed name of the product");
                    ob.nextLine();
                    String b=ob.nextLine();
                    if(b.length()<28)
                    {
                        for(int ii=0;ii<28-b.length();ii++)
                        {
                            b=b+" ";
                        }
                    }
                    m_cdname[i]=b;

                    loading();
                    System.out.println("name successfully changed");

                    break;
                }

            }

            if(flag==false)
            {
                System.out.println("wrong id entered");
            }

            System.out.println("enter '1' to continue.else enter any other number");
            again=ob.nextInt();

        }while(again==1);

        this.again=1;
        out=1;
    }

    void modifyconname()
    {

        int again=0;
        do
        {

            System.out.println("\f");
            enq();


            boolean flag=false;
            System.out.println("enter the  product id whose console name you want to modify");
            int a=ob.nextInt();

            for(int i=0;i<m_id.length;i++)
            {

                if(m_id[i]==a && m_scrap[i]=='n')
                {
                    flag=true;
                    System.out.println("The current name ---> " + m_contype[i]);
                    System.out.println("enter the changed console name of the product");
                    ob.nextLine();
                    String b=ob.nextLine();
                    if(b.length()<10)
                    {
                        for(int ii=0;ii<28-b.length();ii++)
                        {
                            b=b+" ";
                        }
                    }
                    m_contype[i]=b;

                    loading();
                    System.out.println("console name successfully changed");

                    break;
                }

            }

            if(flag==false)
            {
                System.out.println("wrong id entered");
            }

            System.out.println("enter '1' to continue.else enter any other number");
            again=ob.nextInt();

        }while(again==1);

        this.again=1;
        out=1;
    }

    void report()
    {
        loading();
        System.out.println("\f");
        System.out.println("customer reports---------------------------->");

        System.out.println("\t\t\tCID\t\tcust name\t\tcust pno\t\tcon cat\t\t\tcd cat\t\t\tcd name\t\t\tqty\t\tamount\t\tgst\t\tbill");
        for(int i=0;i<10;i++)
        {
            if(c_scrap[i]=='n')
            {
                System.out.println("\t\t\t"+c_id[i]+"\t\t"+c_custname[i]+"\t\t"+c_custpno[i]+"\t\t"+c_contype[i]+"\t\t"+c_cdtype[i]+"\t\t"+c_cdname[i]+"\t\t"+c_qty[i]+"\t\t"+c_amt[i]+"\t\t"+c_gst[i]+"\t\t"+c_bill[i]);  
            }
        }
    }

    void bill()
    {
        while(true)
        {
            System.out.println("\f");
            
            System.out.println("your bill is "+c_bill[c_ind]);
            

        }
    }

    void loading()
    {                
        System.out.println("\f");

        for(int i=0;i<3;i++)
        {
            System.out.println("\f");
            System.out.println("\t\t\t\t                ◙◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t                ◘◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◙◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t                ◘◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◙◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t                ◘◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◙                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t                ◘◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◙                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                            ");
            System.out.println("\t\t\t\t                ◘◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◙                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                            ");
            System.out.println("\t\t\t\t                ◘◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");
            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◙                                             ");
            System.out.println("\t\t\t\t                ◘◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");
            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t                ◘◘◘◙                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t                ◘◘◙◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t                ◘◙◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t                ◙◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◙     ◘                                             ");
            System.out.println("\t\t\t\t                ◘◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t              ◙       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t                ◘◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");

            delay1();
            System.out.println("\f");

            System.out.println("\t\t\t\t                ◘◘◘◘                                               ");
            System.out.println("\t\t\t\t               ◙     ◘                                             ");
            System.out.println("\t\t\t\t              ◘       ◘                                           ");
            System.out.println("\t\t\t\t               ◘     ◘                                             ");
            System.out.println("\t\t\t\t                ◘◘◘◘                                             ");
            System.out.println("\t\t\t          PLEASE WAIT");
            delay1();
            System.out.println("\f");

        }

    }

    void delay1()
    {
        for(long i=0;i<999999999;i=i+51)
        {    
        }

    }

}
//thank you
