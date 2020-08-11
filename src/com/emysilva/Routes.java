package com.emysilva;

import java.util.ArrayList;
import java.util.List;

public class Routes {

    public static String findRoutes(String[][] routes) {
        List<String> theRoutes = new ArrayList<>();
        StringBuilder toReturn = new StringBuilder();

        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                System.out.println(routes[i][j]);

                if (theRoutes.contains(routes[i][j])) {
                    theRoutes.remove(routes[i][j]);
                    theRoutes.add(routes[i][j]);
                } else {
                    theRoutes.add(routes[i][j]);
                }
            }
        }

        for (String item : theRoutes) {
            if (item.equals(theRoutes.get(theRoutes.size() - 1))) {
                toReturn.append(item);
            } else {
                toReturn.append(item).append(", ");
            }
        }
        return toReturn.toString();
    }
}
