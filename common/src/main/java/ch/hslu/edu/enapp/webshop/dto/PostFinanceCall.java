package ch.hslu.edu.enapp.webshop.dto;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PostFinanceCall {

    private int AMOUNT;
    private String CARDNO;
    private String CURRENCY;
    private String OPERATION;
    private int ORDERID;
    private String PSPID;
    private String SHA_PASSW;
    private String USERID;
    private String PSWD;
    private String ED;
    private String CVC;


    public PostFinanceCall(int AMOUNT, String CARDNO, String CURRENCY, String OPERATION,
                           int ORDERID, String PSPID, String SHA_PASSW, String USERID, String PSWD, String ED, String CVC) {
        this.AMOUNT = AMOUNT;
        this.CARDNO = CARDNO;
        this.CURRENCY = CURRENCY;
        this.OPERATION = OPERATION;
        this.ORDERID = ORDERID;
        this.PSPID = PSPID;
        this.SHA_PASSW = SHA_PASSW;
        this.USERID = USERID;
        this.PSWD = PSWD;
        this.ED = ED;
        this.CVC = CVC;
    }


    public MultivaluedMap<String,String> getCallObject(){
        MultivaluedMap<String, String> formData = new MultivaluedHashMap<>();
        formData.add("AMOUNT", String.valueOf(AMOUNT));
        formData.add("CARDNO", CARDNO);
        formData.add("CURRENCY", CURRENCY);
        formData.add("CVC", CVC);
        formData.add("ED", ED);
        formData.add("ORDERID", String.valueOf(ORDERID));
        formData.add("PSPID", PSPID);
        formData.add("PSWD", PSWD);
        formData.add("USERID", USERID);
        formData.add("SHASIGN", getSecurityDigest());

        return formData;
    }

    public String getCallObjectString(){
        StringBuilder sb = new StringBuilder();
        sb.append("AMOUNT=" + AMOUNT + "&");
        sb.append("CARDNO=" + CARDNO + "&");
        sb.append("CURRENCY=" + CURRENCY + "&");
        sb.append("CVC=" + CVC + "&");
        sb.append("ED=" + ED + "&");
        sb.append("ORDERID=" + ORDERID + "&");
        sb.append("PSPID=" + PSPID + "&");
        sb.append("PSWD=" + PSWD + "&");
        sb.append("USERID=" + USERID + "&");
        sb.append("SHASIGN=" + getSecurityDigest());
        return sb.toString();
    }


    private String getSecurityDigest(){

        StringBuilder sb = new StringBuilder();

        sb.append("AMOUNT=" + AMOUNT + SHA_PASSW);
        sb.append("CARDNO=" + CARDNO + SHA_PASSW);
        sb.append("CURRENCY=" + CURRENCY + SHA_PASSW);
        sb.append("CVC=" + CVC + SHA_PASSW);
        sb.append("ED=" + ED + SHA_PASSW);
        sb.append("ORDERID=" + ORDERID + SHA_PASSW);
        sb.append("PSPID=" + PSPID + SHA_PASSW);
        sb.append("PSWD=" + PSWD + SHA_PASSW);
        sb.append("USERID=" + USERID + SHA_PASSW);
        String k = sb.toString();
        return encryptThisString(k);
    }

    private String encryptThisString(String input) {
        try {
            // getInstance() method is called with algorithm SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation

            return byteArrayToHexString(messageDigest);
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private String byteArrayToHexString(byte[] b) {
        String result = "";
        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }
        return result;
    }

    public int getAMOUNT() {
        return AMOUNT;
    }

    public String getCARDNO() {
        return CARDNO;
    }

    public String getCURRENCY() {
        return CURRENCY;
    }

    public String getRES() {
        return OPERATION;
    }

    public int getORDERID() {
        return ORDERID;
    }

    public String getMyPSPID() {
        return PSPID;
    }
}
