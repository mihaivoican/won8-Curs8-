package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
//Al ex de colectie e Queue
public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.priority - o2.priority;
            }
        });

        priorityQueue.add(new Person(1, "First first"));
        priorityQueue.add(new Person(1, "Second first"));
        priorityQueue.add(new Person(0, "First zero"));
        priorityQueue.add(new Person(0, "Second zero"));
        priorityQueue.add(new Person(-1, "First minus one"));

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll().name);
        }
    }
}
class Person {
    int priority;
    String name;

    public Person(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}
