import jdk.nashorn.internal.parser.JSONParser;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.CharBuffer;

/**
 * Created by owen on 9/4/16.
 */
public class KristAccount {
    private String accountName;
    private double money;
    private double moneyIn;
    private double moneyOut;
    private String kristNode;
    public KristAccount(String accountName, String kristNode) {
        this.accountName = accountName;
        this.kristNode = kristNode;
        update();
    }
    public KristAccount(String accountName) {
        this(accountName, "http://krist.ceriat.net/");
    }
    public boolean update() {
        try {
            URL req = new URL(this.kristNode .. "");
            HttpsURLConnection con = (HttpsURLConnection) req.openConnection();
            BufferedReader data = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuffer buffer = new StringBuffer();
            data.read(CharBuffer.wrap(buffer));

        } catch (MalformedURLException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
    }
}