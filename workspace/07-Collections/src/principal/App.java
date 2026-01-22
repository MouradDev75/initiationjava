package principal;

import java.util.*;

public class App {
    public static void main(String[] args) {
        /*
        package java.util.collection: se sont des tableaux dynamiques qui peuvent contenir que des objets
        pour les types de base, utilisez leur wrapper.
        2 types de collections: tableau et mapping
        les collections de types tableau (ArrayList, List, Set, Stack, Queue): dérivent de l'interface Collection
         */

        System.out.println("*********** ArrayList:");
        /*
        est une collection ordonnée avec doublons autorisés. Peut être polymorphique ou fortement typée
        ArrayList<String>: fortement typée
        ArrayList: polymorphique
         */
        ArrayList myArrayList = new ArrayList();

        System.out.println("taille: "+myArrayList.size());

        //ajouts
        myArrayList.add("test");
        myArrayList.add(true);
        myArrayList.add(10);

        myArrayList.add(0, 15.6);

        //modifications
        myArrayList.set(0, "toto");


        //suppression:
        System.out.println("myArray contient toto? "+myArrayList.contains("toto")); //true

        myArrayList.remove("toto");

        System.out.println("myArray contient toto après remove? "+myArrayList.contains("toto")); //false
        System.out.println("index de 10: "+myArrayList.indexOf(10));

        Integer i = 10;

        myArrayList.remove(i);

        myArrayList.add("demo");
        myArrayList.add("demo");
        myArrayList.add("demo");

        for(Object o : myArrayList){
            System.out.println(o);
        }

        //supprimer toutes les occurences de demo
        myArrayList.remove("demo"); //supprime la première occurence

        System.out.println(myArrayList.contains("demo")); //true

        ArrayList toRemove = new ArrayList();
        toRemove.add("demo");

        myArrayList.removeAll(toRemove);

        System.out.println("contient demo après removeAll: "+myArrayList.contains("demo"));

        System.out.println("************* List:");
        /*
        collection fortement typée, ordonnée avec doublons autorisés
         */
        List<String> myList = new ArrayList<>();

        myList.add("chaine1");
        myList.add("chaine2");

        System.out.println("taille: "+myList.size());
        System.out.println("contient chaine1: "+myList.contains("chaine1"));

        //for each
        for(String s : myList){
            System.out.println(s);
        }

        //for
        for (int j = 0; j < myList.size(); j++) {
            System.out.println(myList.get(j));
        }

        System.out.println("************* Set:");
        /*
        Set: collection fortement typée, non ordonnée sans doublons
         */
        Set<Integer> entiers = new HashSet<>();


        entiers.add(10);
        entiers.add(10);
        entiers.add(20);
        entiers.add(20);
        entiers.add(30);

        System.out.println("taille: "+entiers.size()); //3

        for(Integer x : entiers){
            System.out.println(x);
        }
        System.out.println("*********** Stack:");
        /*
        collection ordonnée avec doublons autorisés. Fonctionnement LIFO: last in first out
        permet les 2 stockages: polymorphique et fortement typé
         */

        Stack<String> myStack = new Stack();

        System.out.println("taille: "+myStack.size());

        myStack.add("test1");
        myStack.add("test2");
        myStack.add("test3");

        myStack.pop(); //supprime le dernier par défaut

        System.out.println("contient test3 après pop: "+myStack.contains("test3")); //false
        System.out.println("prochain élément à supprimer: "+myStack.peek()); //test2

        System.out.println("**************** Queue:");
        /*
        collection ordonnée, avec doublons autorisés. Fonctionnement FIFO: first in first out
        permet les 2 stockages: polymorphique et fortement typée
         */
        Queue<Integer> myIntergers = new LinkedList<>();
        System.out.println(myIntergers.size());

        myIntergers.add(10);
        myIntergers.add(20);
        myIntergers.add(20);
        myIntergers.add(30);

        myIntergers.poll(); //supprime le premier par défaut

        System.out.println("contient 10: "+myIntergers.contains(10)); //false
        System.out.println("prochaine élément à supprimer: "+myIntergers.peek()); //20

        System.out.println("******************* Iterator");
        /*
        objet permettant de parcourir une collection de type tableau sans tenir compte de son type, de son index ni du type des éléments qu'elle contient
         */

        System.out.println("____ arraylist iterator:");

        Iterator myIterator = myArrayList.iterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        System.out.println("____ list iterator:");

        myIterator = myList.iterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        System.out.println("____ set iterator:");

        myIterator = entiers.iterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        System.out.println("____ stack iterator:");

        myIterator = myStack.iterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        System.out.println("____ queue iterator:");

        myIterator = myIntergers.iterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        System.out.println("******************** Map");
        /*
        Map est une collection non ordonnée qui fonctionne par association clé:valeur
        Dans une Map, les clés sont uniques
         */
        Map<String,String> myMap = new HashMap<>();
        System.out.println("taille: "+myMap.size());

        myMap.put("server", "192.168.1.15");
        myMap.put("port", "8080");
        myMap.put("user", "admin");
        myMap.put("password", "@@pwd@@");
        myMap.put("password", "??pwd??");// clé existante -> valeur associée écrasée

        if(myMap.containsKey("password")){
            System.out.println(myMap.get("password"));
        }

        System.out.println("************************ parcourir une map:");
        System.out.println("__parcourir les valeurs:");

        for(String v: myMap.values()){
            System.out.println(v);
        }

        System.out.println("__parcourir les clés:");

        for(String cle: myMap.keySet()){
            System.out.println("Clé: "+cle+" Valeur: "+myMap.get(cle));
        }

        /*
        pratique pour gérer les params de config. ou bien pour classer des objets par catégorie
         */




    }//fin du main

    public static void parcourirCollection(Collection collection){
        Iterator myIterator = collection.iterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }


}
