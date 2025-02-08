package com.metaarsenit.springboot_app.html;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GlobalState {

    public static final ArrayList<Map<String, String>> test = new ArrayList<Map<String, String>>();


    public static void add(String name, String ing1,  String ing2,  String ing3,  String ing4,  String ing5) {
        HashMap<String, String> record = new HashMap<String, String>();
        record.put("name", name);
        record.put("ing1", ing1);
        record.put("ing2", ing2);
        record.put("ing3", ing3);
        record.put("ing4", ing4);
        record.put("ing5", ing5);
        test.add(record);

    }

    public static void delete(String name) {
        for (int i = 0; i < test.size(); i++) {
            if (Objects.equals(test.get(i).get("name"), name)) {
                test.remove(i);
                break;
            }
        }
    }


}
