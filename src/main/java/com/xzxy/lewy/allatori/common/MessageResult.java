package com.xzxy.lewy.allatori.common;

public class MessageResult<T> {

    private MessageHeader messageHeader;
    private T messageBody;

    public MessageResult(MessageHeader messageHeader) {
        this.messageHeader = messageHeader;
    }

    public MessageResult(T messageBody) {
        this(messageBody, getRight());
        this.messageBody = messageBody;
    }
    
    /**
     * 
     * @param code 返回码
     * @param desc 返回描述
     * @param messageBody 返回内容
     */
    public MessageResult(int code,String desc,T messageBody) {
        this.messageHeader = new MessageHeader(code,desc);
        this.messageBody = messageBody;
    }

    private MessageResult(T messageBody, MessageHeader messageHeader) {
        this.messageHeader = messageHeader;
        this.messageBody = messageBody;
    }

    private static MessageHeader getRight() {
        return new MessageHeader(1,"OK");
    }

    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    public T getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(T messageBody) {
        this.messageBody = messageBody;
    }
}
