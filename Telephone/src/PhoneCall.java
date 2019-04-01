
import java.time.*;
public class PhoneCall {
	String time,caller_name,phone;
public PhoneCall(String time, String caller_name, String phone) {
		super();
		this.time = time;
		this.caller_name = caller_name;
		this.phone = phone;
	}

public String toString() {
	return "Caller name: "  + caller_name + "\n"+ "Number :" + phone +  "\n" + "Time:" + time;
}



}
