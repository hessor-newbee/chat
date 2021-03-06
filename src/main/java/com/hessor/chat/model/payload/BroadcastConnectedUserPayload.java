package com.hessor.chat.model.payload;


import com.hessor.chat.model.Payload;

/**
 * Represents the payload of a WebSocket frame to broadcast details of a user who has connected to the chat.
 */
public class BroadcastConnectedUserPayload implements Payload {

    public static final String TYPE = "broadcastConnectedUser";

    private String username;

    public BroadcastConnectedUserPayload() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
