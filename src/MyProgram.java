public class MyProgram {

    public static void main(String[] args) {
        String host = "localhost";
        String user = "testuser";
        String pass = "Passw0rd";
        dbconn.DbConnNew verbindung = new dbconn.DbConnNew(host, user, pass);
    }
}
