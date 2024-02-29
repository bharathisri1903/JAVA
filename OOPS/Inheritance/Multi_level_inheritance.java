class WhatsApp_1{
    String version="WhatsApp version 1";
    void text_chat(){
        System.out.println("Text feature is available");
    }
    void emoji(){
        System.out.println("Emoji feature is available");
    }
}

class WhatsApp_2 extends WhatsApp_1{
    String version="WhatsApp version 2";
    void status(){
        System.out.println("Status feature is available");
    }
    void video_calls(){
        System.out.println("Video call feature is available");
    }
}

class WhatsApp_3 extends WhatsApp_2{
    String version="WhatsApp version 3";
    void payments(){
        System.out.println("Payments feature is available");
    }
    void avatar(){
        System.out.println("Avatar feature is available");
    }
}

public class Multi_level_inheritance{
    public static void main(String args[])
    {
        WhatsApp_3 WhatsApp=new WhatsApp_3();
        System.out.println(WhatsApp.version);
        WhatsApp.payments();
        WhatsApp.avatar();
        WhatsApp.status();
        WhatsApp.video_calls();
        WhatsApp.text_chat();
        WhatsApp.emoji();
    }
}