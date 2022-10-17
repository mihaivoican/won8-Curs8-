package homework11;

import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("John", 12, "black");
        Person p2 = new Person("Martha", 20, "brown");
        Person p3 = new Person("Mark", 20, "brown");

        System.out.println(getAllNames(Arrays.asList(p1, p2)));
//        System.out.println(getAllNames(null));

        System.out.println(mapByHairColour(Arrays.asList(p1, p2, p3)));

        Map<Range, List<Employ>> rangeListMap = mapBySalaryRange(null);
        for (Range range : rangeListMap.keySet()) {
            List<Employ> employs = rangeListMap.get(range);
        }
        for (List<Employ> employs : rangeListMap.values()) {
            // no access to the key
        }
        for (Map.Entry<Range, List<Employ>> entry : rangeListMap.entrySet()) {
            Range key = entry.getKey();
            List<Employ> value = entry.getValue();
        }
    }

    public static List<String> getAllNames(List<Person> personList) {
        if (personList == null) {
           throw new RuntimeException("List is null");
        }
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            result.add(person.name());
        }
        return result;
    }

    //2.4 extract a map from person's hair colour to their name (String->List<String>)
    public static Map<String, List<String>> mapByHairColour(List<Person> personList) {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : personList) {
            result.putIfAbsent(person.hairColour(), new ArrayList<>());
            result.get(person.hairColour()).add(person.name());
        }
        return result;
    }

    //  3.3 calculate the sum of all salaries for all employees
    public static long calculateAllSalaries(List<Employ> employs) {
        if (employs == null) {
            return 0;
        }
        long result = 0;
        for (Employ employ : employs) {
            result += employ.getSalary();
        }
        return result;
    }

    // map employs based on salary range 0-999 1000-4999 5000-9999 9999+
    public static Map<Range, List<Employ>> mapBySalaryRange(List<Employ> employs) {
        if (employs == null) {
            return new HashMap<>();
        }
        Map<Range, List<Employ>> result = new HashMap<>();
        for (Employ employ : employs) {
            Range range = getRange(employ.getSalary());
            result.putIfAbsent(range, new ArrayList<>());
            result.get(range).add(employ);
        }
        return result;
    }

    public static Range getRange(int salary) {
        if (salary < 1000) {
            return Range.RANGE1;
        } else if (salary < 5000) {
            return Range.RANGE2;
        } else if (salary < 10000) {
            return Range.RANGE3;
        } else {
            return Range.RANGE4;
        }
    }
}

enum Range {
    RANGE1(0, 999),
    RANGE2(1000, 4999),
    RANGE3(5000, 9999),
    RANGE4(10000, Integer.MAX_VALUE);
    private int start;
    private int end;

    Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }
}
