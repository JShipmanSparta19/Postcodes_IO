package com.sparta.jas;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFactory {
    private JSONObject postcodesJSON;

    public JSONObject getPostcodesJSON() {
        return postcodesJSON;
    }

    public void setPostcodesJSON(String postcodes) {
        JSONParser jsonParser = new JSONParser();
        try {
            postcodesJSON = (JSONObject) jsonParser.parse(postcodes);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
