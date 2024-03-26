package com.org.integrationprojcet.social.kakao.dto;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ToString
public class KakaoProfile {
    private Integer id;
    private LocalDateTime connectedAt;
    private String nickname;

    public KakaoProfile(String jsonResponseBody){
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(jsonResponseBody);

        this.id = element.getAsJsonObject().get("id").getAsInt();

        String connected_at = element.getAsJsonObject().get("connected_at").getAsString();
        connected_at = connected_at.substring(0, connected_at.length() - 1);
        LocalDateTime connectDateTime = LocalDateTime.parse(connected_at, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
        this.connectedAt = connectDateTime;

        JsonObject properties = element.getAsJsonObject().get("properties").getAsJsonObject();
        this.nickname = properties.getAsJsonObject().get("nickname").getAsString();
    }
}
