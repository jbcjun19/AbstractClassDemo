public class Main {
    public static void main(String[]args){

        EmailMessage emailMsg = new EmailMessage();

//        emailMsg.setSender("Jennifer");
        emailMsg.setReceiver("Sherry");

        emailMsg.setMessageBody("What's for lunch tomorrow?");

        String status = emailMsg.SubmitContent();
        System.out.println(status);

    }
}
