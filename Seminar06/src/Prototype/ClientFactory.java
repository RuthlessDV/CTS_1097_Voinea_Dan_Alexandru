package Prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientFactory {
    Map<String, Client> clienti;

    public ClientFactory(){
        this.clienti = new HashMap<>();
    }
    public Client getClient(String numarTelefon){
        Client client = clienti.get(numarTelefon);
        if (client == null){
            Scanner scanner = new Scanner(System.in);
            String nume = scanner.nextLine();

            client = new Client(nume, numarTelefon);
            
        }
        return (Client) client.cloneaza();
    }
}
