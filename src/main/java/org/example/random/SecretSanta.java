package org.example.random;

import java.util.*;

public class SecretSanta {

    // [Avi,Eran,Ben,Lora]
    // can be Avi->Eran, Eran -> Ben ,Ben ->Lora , Lora ->Avi

    public Map<String, String> secretSantaMap(List<String> names){
        List <String> senders = new ArrayList<>(names);
        List <String> receivers = new ArrayList<>(names);
        Map<String, String> secretSantaMap = new HashMap<>();

        String lastRecipient = names.get(names.size()-1);
        for ( String sender : names ) {
            String receiver = null;
            while ( receiver==null || receiver.equals(sender) || receiver.equals(lastRecipient)) {
                receiver = receivers.get(new Random().nextInt(names.size()));
            }
            secretSantaMap.put(sender,receiver);
            System.out.println(sender + " will give to " + receiver);

            lastRecipient=receiver;
        }
        /*
        names.stream().forEach( name->{
                String sender = senders.get(new Random().nextInt(senders.size()));
                String receiver = receivers.get(new Random().nextInt(senders.size()));
                String lastRecipient = names.get(names.size()-1;
                while ( receiver.equals(sender) || !receiver.equals(lastRecipient)) {
                    receiver = receivers.get(new Random().nextInt(senders.size()));
                }
                secretSantaMap.put(sender,receiver);
                senders.remove(sender);
                receivers.remove(receiver);
                lastRecipient=receiver;

                System.out.println(sender + " will give to " + receiver);

                }
        );
*/
        return secretSantaMap;

    }

    public Map<String, String> secretSantaMap1(List<String> names){
        List <String> senders = new ArrayList<>(names);
        List <String> recievers = new ArrayList<>(names);
        Map<String, String> secretSantaMap = new HashMap<>();

        String lastReciver = names.get(names.size()-1);
        for ( String sender : senders ){
            String reciver = null;
            while ( reciver == null || sender.equals(reciver) || reciver.equals(lastReciver)) {
                reciver = recievers.get(new Random().nextInt(senders.size()));
            }
            secretSantaMap.put(sender,reciver);
            lastReciver=reciver;
        }
        return secretSantaMap;

    }
}