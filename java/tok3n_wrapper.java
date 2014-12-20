/************************************************
*
*           Tok3n wrapper client for APIv2
*           By Tok3n solucions SAPI CV
*           September 2014
* 
*   Basic usage:
* 
* 
* 
* 
*************************************************/

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;

/*   Tok3n REST Client
 * Wrapper generate a service URL 
 * send parameters to the Tok3n.js API
 *
 * @ Alexandro Colorado
 */

public class Tok3nClient { 

    public static void ValidateAuth(String[] args) throws ProtocolException, IOException {
	try {

	     URL url= new URL("http://secure.tok3n.com/api_v2_iframe/tok3n.js");
	     HttpURLConnection conn= (HttpURLConnection) url.openConnection();
	     conn.setRequestMethod("POST");
	     conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
	     conn.setRequestProperty("Content-Laguage", "en-US");
	     conn.setDoOutput(true);
	     conn.setUseCaches(false);
	     conn.setDoInput(true);
	     DataOutputStream wr = new DataOutputStream (
		     con.getOutputStream ());
	     wr.writeBytes (urlParameters);
	     wr.flush ();
	     wr.close ();

	if ( conn.getResponseCode() != 200) {
	    throw new RuntimeException("Failed: HTTP error code : " +
		    conn.getResponseCode());
	}

	BufferedReader br = new BufferedReader( new InputStreamReader(
		    (conn.getInputStream())));

	String output;
	System.out.println("Output from Server .... \n");
	while ((output = br.readLine()) != null) {
	    System.out.println(output);
	}
	conn.disconnect();
    } catch (MalformedURLException e) {
	e.printStackTrace();
    } catch (IOException e) {
	e.printStackTrace();
    }
}
}
