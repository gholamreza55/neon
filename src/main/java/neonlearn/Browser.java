package neonlearn;

public class Browser {
    public void navigate(String adress){
        String ip = findIpAdress(adress);
        String html = sendHtmpRequest(ip);
        System.out.println(html);
        System.out.println(ip);
    }

    private String sendHtmpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAdress(String adress) {
        return "127.8.70.1";
    }
}
