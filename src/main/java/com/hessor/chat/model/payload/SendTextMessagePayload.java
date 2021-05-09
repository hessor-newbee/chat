package com.hessor.chat.model.payload;


import com.hessor.chat.model.Payload;

/**
 * Payload with details of a message sent by the client.
 */
public class SendTextMessagePayload implements Payload {

    public static final String TYPE = "sendTextMessage";

    private String content;

    public SendTextMessagePayload() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
