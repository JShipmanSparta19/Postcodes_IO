package com.sparta.jas;

import org.json.simple.JSONObject;

public class PostcodeParser {
    private JSONObject postcode;

    public PostcodeParser(String postcodeLookup){
        PostcodesHTTPManager postcodesHTTPManager = new PostcodesHTTPManager(postcodeLookup);
        JSONFactory jsonFactory = new JSONFactory();

        postcodesHTTPManager.setPostcode();
        jsonFactory.setPostcodesJSON(postcodesHTTPManager.getPostcode());

        postcode = (JSONObject) jsonFactory.getPostcodesJSON().get("result");
    }

    public JSONObject getPostcodeObject() {
        return postcode;
    }

    public String getPostcodeString(){
        return postcode.get("postcode").toString();
    }

    public String getCountry(){
        return postcode.get("country").toString();
    }

    public String getEuroElectoralRegion(){
        return postcode.get("european_electoral_region").toString();
    }

    public String getPrimaryCareTrust(){
        return postcode.get("primary_care_trust").toString();
    }

    public String getRegion(){
        return postcode.get("region").toString();
    }

    public String getConstituency(){
        return postcode.get("parliamentary_constituency").toString();
    }

    public String getDistrict(){
        return postcode.get("admin_district").toString();
    }

    public String getWard(){
        return postcode.get("admin_ward").toString();
    }

    public String getCounty(){
        return postcode.get("admin_county").toString();
    }

    public String getParish(){
        return postcode.get("parish").toString();
    }

    public long getQuality(){
        return (Long) postcode.get("quality");
    }
}
