import java.util.Scanner;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;


public class WebServiceIPLocator {

	public static void main(String[] args) {
			System.out.println("please enter ip");
			Scanner reader = new Scanner(System.in);
			String ipAddress = reader.next();
		
			//String ipAddress = args[0];
			
			/*Which class/service to use first? Look at wsdl:service in WSDL*/
			GeoIPService objGeoIPService = new GeoIPService();
			
			/*Look at wsdl:port for next step*/
			GeoIPServiceSoap objGeoIPServiceSoap = objGeoIPService.getGeoIPServiceSoap();
			GeoIP objGeoIP = objGeoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println("Country Name for "+ipAddress+" is "+objGeoIP.getCountryName());
		

	}

}
