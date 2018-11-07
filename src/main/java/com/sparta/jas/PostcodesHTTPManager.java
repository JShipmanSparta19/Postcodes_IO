package com.sparta.jas;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class PostcodesHTTPManager {
    private String baseURI;
    private String postcode;

    public PostcodesHTTPManager(String postcodeLookup){
        baseURI = "http://api.postcodes.io/postcodes/" + postcodeLookup;
    }

    public void setPostcode(){
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet requestPostcode = new HttpGet(baseURI);
            CloseableHttpResponse response = httpClient.execute(requestPostcode);
            postcode = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPostcode() {
        return postcode;
    }
}
