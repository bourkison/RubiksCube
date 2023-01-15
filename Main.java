/**
 * rubik
 */
public class Main {
    static Cube cube;

    public static void main(String[] args) {
        cube = new Cube(6, 3, 3);
        System.out.println(cube.stringifyCube());
    }
}