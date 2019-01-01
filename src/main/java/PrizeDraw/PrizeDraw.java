package PrizeDraw;

import java.util.*;
import java.util.stream.Collectors;

public class PrizeDraw {
    static int startValueOfAscii = 96;

    public static String nthRank(String st, Integer[] we, int n) {

        st = st.toLowerCase();
        String [] names = st.split(",");
        Map<String,Integer> nameValue = new HashMap<>();

        for(int i = 0; i < names.length; i++) {
            int actualNameValue = names[i].length();
            for(int j = 0; j < names[i].length(); j++) {
                actualNameValue += (int) names[i].charAt(j) - startValueOfAscii;
            }
            actualNameValue *= we[i];
            nameValue.put(names[i], actualNameValue);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<>(nameValue.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() > o2.getValue()) {
                    return -1;
                } else if (o1.getValue() < o2.getValue()) {
                    return 1;
                } else {
                    if(o1.getKey().charAt(0) > o1.getKey().charAt(0)) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        });

        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            sortedMap.put(aa.getKey(), aa.getValue());
        }

        List<String> nameSortedByValue = sortedMap.entrySet().stream()
                .map(m -> m.getKey())
                .collect(Collectors.toList());

        if(st.length() < 1) {
            return "No participants";
        } else if (n > names.length) {
            return "Not enough participants";
        }

        return nameSortedByValue.get(n - 1).substring(0, 1).toUpperCase() + nameSortedByValue.get(n - 1).substring(1);
    }
}
