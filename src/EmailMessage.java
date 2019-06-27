public class EmailMessage extends Message {
    private String messageBody;

    public EmailMessage(){
        messageBody = "";
        setSender("Jennifer");
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    String SubmitContent() {
        String status = "";
        status = SendEmail(getSender(), getReceiver(), getMessageBody());
        return status;
    }

    private String SendEmail(String sender, String receiver, String messageBody2) {
        // code to send the email and set return status goes here
        return "Message Sent";
    }
}
