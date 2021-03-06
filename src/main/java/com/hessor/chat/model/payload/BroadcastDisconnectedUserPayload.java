package com.hessor.chat.model.payload;


import com.hessor.chat.model.Payload;

/**
 * Represents the payload of a WebSocket frame to broadcast details of a user who has connected to the chat.
 */
public class BroadcastDisconnectedUserPayload implements Payload {

    public static final String TYPE = "broadcastDisconnectedUser";

    private String username;

    public BroadcastDisconnectedUserPayload() {

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
