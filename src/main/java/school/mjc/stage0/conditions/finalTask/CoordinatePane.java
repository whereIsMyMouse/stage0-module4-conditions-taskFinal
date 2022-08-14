package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String message = "";
        message = (x == 0 && y == 0) ? "zero" :
                (message = (x > 0 && y > 0) ? "first" :
                        (message = (x < 0 && y > 0) ? "second" :
                                (message = (x < 0 && y < 0) ? "third" : "fourth")));
        System.out.println(message);
    }
}


