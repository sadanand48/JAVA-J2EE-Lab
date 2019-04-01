import java.util.*;
public class DriverClass {

		Queue<PhoneCall> q;
		ArrayList<PhoneCall> l,a;
		int c;
		Scanner sc;
		
		DriverClass(){
			q=new LinkedList<PhoneCall>();
			l=new ArrayList<PhoneCall>();
			a=new ArrayList<PhoneCall>();
			sc=new Scanner(System.in);
		}
		
	void getData() {
		int n,count=0;
		System.out.println("Enter number of calls");
		n=sc.nextInt();
		while(count!=n) {
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter number");
			String number=sc.next();
			System.out.println("Enter time");
			String time=sc.next();
			PhoneCall p=new PhoneCall(time,name,number);
			q.add(p);
			a.add(p);
			l.add(p);
			count++;
			}
		c=count;
		
	}
	
	void displayA() {
		boolean b=true;
		int ch,i=0;
		while(b) {
			System.out.println("1:Display Current Call,2:Delete Current Call,3 :Next Call");
			ch=sc.nextInt();
			if(ch==1) {
				System.out.print(a.get(i));
			}
			else if(ch==2) {
				
				a.remove(i);
				i--;
			}
			else if(ch==3) {
				System.out.print(a.get(++i));
			}
			else  {
				b=false;
				System.exit(0);
				break;
				
			}
		}
	}
	
	void displayL() {
		if(c>2) {
			for(int i=0;i<c-2;i++)
				l.remove(i);
		}
		System.out.println(l);
	}
	void displayQ() {
		System.out.println(q);
	}
	public static void main(String args[]) {
		
		
			DriverClass d=new DriverClass();
			
			d.getData();
			d.displayQ();
			d.displayL();
			d.displayA();
		}
		
	}

