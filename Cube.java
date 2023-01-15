public class Cube {
    enum Color {
        WHITE,
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE
    }

    Color[][][] cube;

    public Cube(int faces, int rows, int columns) {
        this.cube = new Color[faces][rows][columns];

        for (int i = 0; i < faces; i++) {
            Color color;

            switch (i) {
                case 0:
                    color = Color.WHITE;
                    break;
                case 1:
                    color = Color.RED;
                    break;
                case 2:
                    color = Color.ORANGE;
                    break;
                case 3:
                    color = Color.YELLOW;
                    break;
                case 4:
                    color = Color.GREEN;
                    break;
                case 5:
                    color = Color.BLUE;
                    break;
                default:
                    color = Color.WHITE;
                    break;
            }

            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    cube[i][j][k] = color;
                }
            }
        }
    }

    public String stringifyCube() {
        String cubeStringified = "";

        int i = 0;
        for (Color[][] face : cube) {
            cubeStringified += stringifyFace(i) + ":\n";

            for (Color[] row : face) {
                for (Color square : row) {
                    cubeStringified += stringifySquare(square);
                }
                cubeStringified += "\n";
            }
            cubeStringified += "\n\n";
            i++;
        }

        return cubeStringified;
    }

    private String stringifySquare(Color c) {
        switch (c) {
            case WHITE:
                return "W";
            case RED:
                return "R";
            case ORANGE:
                return "O";
            case YELLOW:
                return "Y";
            case GREEN:
                return "G";
            case BLUE:
                return "B";
            default:
                return "Err";
        }
    }

    private String stringifyFace(int i) {
        switch (i) {
            case 0:
                return "Front";
            case 1:
                return "Left";
            case 2:
                return "Right";
            case 3:
                return "Back";
            case 4:
                return "Top";
            case 5:
                return "Bottom";
            default:
                return "Err";
        }
    }
}
