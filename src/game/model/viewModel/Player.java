package game.model.viewModel;


import java.net.InetAddress;
import java.security.PublicKey;

public class Player {

    private int id;
    private InetAddress ip;
    private int port;
    private String name;
    private PublicKey publicKey;

    public Player(int id, InetAddress ip, int port, String name, PublicKey publicKey) {
        this.id = id;
        this.ip = ip;
        this.port = port;
        this.name = name;
        this.publicKey = publicKey;
    }

    public int getId() {
        return id;
    }

    public InetAddress getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public String getName() {
        return name;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }
}