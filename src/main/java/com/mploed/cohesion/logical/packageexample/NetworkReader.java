package com.mploed.cohesion.logical.packageexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class NetworkReader {
    public String readFromWebsite(String websiteURL) {
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(websiteURL);
            URLConnection conn = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                content.append(inputLine);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}