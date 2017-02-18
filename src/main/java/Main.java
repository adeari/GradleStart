import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
    	port(8080);
    	staticFileLocation("/js");
        get("/", (req, res) -> "jik odi dassst World");
        get("/hello", (req, res) -> "Hello sdss World<script src=\"ini.js\"></script>");
    }
}