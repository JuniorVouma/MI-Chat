package com.afzal.mi_chat;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MessagesActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages);
        getWindow().setBackgroundDrawable(null);

        setSlidingActionBarEnabled(true);

        ListView list = (ListView) findViewById(R.id.list);

        ArrayList<HashMap<String, String>> arrayList = populateArray();

        // To be switched to MessagesAdapter
        SimpleAdapter adapter = new SimpleAdapter(this, arrayList, R.layout.message_list_item, new String[] { "username", "timestamp", "message" }, new int[] {
                R.id.username,
                R.id.timestamp,
                R.id.message });

        list.setAdapter(adapter);

    }

    /*
     * To be removed later
     */
    private ArrayList<HashMap<String, String>> populateArray() {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<HashMap<String, String>>();
        String[][] array = {
                { "Defroster", "8:30:40 pm", "ponyo text me" },
                { "Jester", "8:30:42 pm", "plsbehonest" },
                { "Entropy", "8:30:44 pm", "Yeah" },
                { "Entropy", "8:30:48 pm", "I like you so much, you asshole" },
                { "Defroster", "8:30:49 pm", "why names not afzal bro" },
                { "Afzal", "8:30:51 pm", "ah, explains" },
                { "Jester", "8:30:53 pm", "lol" },
                { "Jimbojones", "8:31:02 pm", "lol" },
                { "Jimbojones", "8:31:15 pm", "her bad grammer is because she's from the middle east?" },
                { "Ponyo", "8:31:24 pm", "besides this is chat i really dont feel the need to write here like im writing an essay :/" },
                { "Afzal", "8:31:28 pm", "i didn't say what it explains" },
                { "Defroster", "8:31:32 pm", "i agree with ponyo" },
                { "Defroster", "8:31:35 pm", "talk as you please" },
                { "Afzal", "8:31:38 pm", "you might not even know what it explains" },
                { "Entropy", "8:31:39 pm", "You don't have to" },
                { "Entropy", "8:31:44 pm", "I don't type perfectly either" },
                { "Afzal", "8:31:53 pm", "jadoahfoajlkajsldhaofhaah" },
                { "Jimbojones", "8:31:53 pm", "ok" },
                { "Afzal", "8:31:54 pm", "see" },
                { "Jester", "8:32:02 pm", "her grammar isnt as bad as it was when she first got here" },
                { "romita_sur", "8:32:05 pm", "Defroster :D" },
                { "Afzal", "8:32:16 pm", "when did she get hurr?" },
                };

        HashMap<String, String> item;
        for (int i = 0; i < array.length; i++) {
            item = new HashMap<String, String>();
            item.put("username", array[i][0]);
            item.put("timestamp", array[i][1]);
            item.put("message", array[i][2]);
            arrayList.add(item);
        }
        return arrayList;
    }
}