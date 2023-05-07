package org.example.random;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class PlayWithStream {

    public void playWithStream () throws IOException {

        List<Song> myStr = Arrays.asList(new Song("bob",1.234) , new Song("dylan",7.87), new Song("me", 5.76));
        Map<Double,String> myHashMap = myStr.stream().collect(Collectors.toMap(x->x.length , x->x.name ));
        myHashMap.entrySet().stream().forEach(System.out::println);
        List<Node> nodes = myStr.stream().map(x->
                {
                    Node nd= new Node(x.length.intValue());
                    nd.value = x.length.intValue();
                    return nd;
                }
                ).collect(Collectors.toList());
    }
}
