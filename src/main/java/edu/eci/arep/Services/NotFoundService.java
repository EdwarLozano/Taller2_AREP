package edu.eci.arep.Services;

public class NotFoundService implements Service{
    public String getHeader(){
        return "HTTP/1.1 Not Found" +
                "\r\n"
                + "Content-Type:text/html \r\n"
                + "\r\n";
    }
    public String getBody(){
        return "<html>"+
                "<body>"+
                ""+
                "<center><h1>ERROR página no encontrada :(</h1></center>"+
                ""+
                "</body>"+
                "</html>";
    }

}
