package br.com.selat.records;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class App {
    public static void main(String[] args) throws JsonProcessingException {

        Gson gson = new Gson();
        ObjectMapper mapper = new ObjectMapper();

        PhoneRecord phoneRecord = new PhoneRecord("50", "12321321");
        System.out.println("Prefix: " + phoneRecord.prefix());
        System.out.println("Number: " + phoneRecord.number());

        // NOT WORKING WITH GSON YET
//        PhoneRecord phoneRecord2 = gson.fromJson("""
//                {
//                    "prefix": "40",
//                    "number": "12312414"
//                }
//                """, PhoneRecord.class);
//        System.out.println("Prefix 2: " + phoneRecord2.prefix());
//        System.out.println("Number 2: " + phoneRecord2.number());

        // WITH JACKSON WORKS FINE
        PhoneRecord phoneRecord3 = mapper.readValue("""
                {
                    "prefix": "30",
                    "number": "11322312414"
                }
                """, PhoneRecord.class);
        System.out.println("Prefix 2: " + phoneRecord3.prefix());
        System.out.println("Number 2: " + phoneRecord3.number());


        // SERIALIZATION
        System.out.println("GSON: " + gson.toJson(phoneRecord));
        System.out.println("JACKSON: " + mapper.writeValueAsString(phoneRecord));

        // ReCORD WHITH SAME VALUES THAN phoneRecord
        PhoneRecord phoneRecord4 = new PhoneRecord("50", "12321321");
        System.out.println("TO String: " + phoneRecord4 + " " + phoneRecord4);
        System.out.println("IS EQUALS: " + (phoneRecord4 == phoneRecord4));
    }
}
