package at.qcademy.tasks.oop.Final;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public interface Jsonfiable {
    String toJson();

    default String toPrettyJson() {
        JsonElement json = JsonParser.parseString(toJson());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(json);
    }
}
