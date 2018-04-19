import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
	import java.util.Date;
public class er {
	
	    public static void main(String []args) throws IOException, ParseException
	    {
	        String date;
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        date=br.readLine();
	        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(date);
	        System.out.println(date+"\t"+date1);
	        
	    }
	}
