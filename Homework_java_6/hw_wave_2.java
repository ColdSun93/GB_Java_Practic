package Homework_java_6;
import java.util.LinkedList;
import java.util.Queue;

public class hw_wave_2 {

    public static void main(String[] args) {

        var mg = new MapGenerator();
        System.out.println(new MapPrinter().rawData(mg.getMap()));
        var lee = new WaveAlgorithm(mg.getMap());
        lee.getRoadToExit(new Point2D(3, 3));      
        lee.getRoadToIn(new Point2D(10, 10));
        System.out.println(
            new MapPrinter().rawData(
                mg.getMap()) 
        );

    }
}


    class Point2D {
        int x, y;

        public Point2D(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return String.format("x: %d  y: %d", x, y);
        }
    }

    class MapGenerator {
        int[][] map;

        public MapGenerator() {
            int[][] map = {
                    { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                    { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                    { -1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                    { -1, 00, 00, 00, -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
                    { -1, 00, 00, 00, -1, 00, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
                    { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1 },
                    { -1, -1, -1, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1 },
                    { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, -1, -1, 00, 00, -1 },
                    { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                    { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
                    { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
                    { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                    { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, -1, 00, 00, 00, -1 },
                    { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
                    { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
            };

            this.map = map;
        }

        public int[][] getMap() {
            return map;
        }

        public void setCat(Point2D pos) {
            map[pos.x][pos.y] = -2;
        }

        public void setExit(Point2D pos) {
            map[pos.x][pos.y] = -3;
        }
    }

    class MapPrinter {

        public MapPrinter() {
        }

        public String rawData(int[][] map) {
            StringBuilder sb = new StringBuilder();

            for (int row = 0; row < map.length; row++) {
                for (int col = 0; col < map[row].length; col++) {
                    sb.append(String.format("%5d", map[row][col]));
                }
                sb.append("\n");
            }
            for (int i = 0; i < 3; i++) {
                sb.append("\n");
            }

            return sb.toString();
        }
    }

        
    class WaveAlgorithm {
        int[][] map;

        public WaveAlgorithm(int[][] map) {
            this.map = map;
        }

        public void getRoadToExit(Point2D startPoint) {
            Queue<Point2D> queue = new LinkedList<Point2D>();
            queue.add(startPoint);
            map[startPoint.x][startPoint.y] = 1;

            while (queue.size() != 0) {
                Point2D p = queue.remove();

                if (map[p.x - 1][p.y] == 0) {
                    queue.add(new Point2D(p.x - 1, p.y));
                    map[p.x - 1][p.y] = map[p.x][p.y] + 1;
                }
                if (map[p.x][p.y - 1] == 0) {
                    queue.add(new Point2D(p.x, p.y - 1));
                    map[p.x][p.y - 1] = map[p.x][p.y] + 1;
                }
                if (map[p.x + 1][p.y] == 0) {
                    queue.add(new Point2D(p.x + 1, p.y));
                    map[p.x + 1][p.y] = map[p.x][p.y] + 1;
                }
                if (map[p.x][p.y + 1] == 0) {
                    queue.add(new Point2D(p.x, p.y + 1));
                    map[p.x][p.y + 1] = map[p.x][p.y] + 1;
                }
            }
        }

        public void getRoadToIn(Point2D exit) { //маршрут строиться через "-3"
                        
            Queue<Point2D> queue = new LinkedList<Point2D>();
            queue.add(exit);
            int tempZnach = map[exit.x][exit.y];
  
            while (queue.size() != 0) {
                Point2D p = queue.remove();
            
                if (map[p.x - 1][p.y] == tempZnach-1) {
                    queue.add(new Point2D(p.x - 1, p.y));
                    map[p.x][p.y] = -3;
                    tempZnach = map[p.x - 1][p.y];
                }
                if (map[p.x][p.y - 1] == tempZnach-1) {
                    queue.add(new Point2D(p.x, p.y - 1));
                    map[p.x][p.y] = -3;
                    tempZnach = map[p.x][p.y - 1];
                }
                if (map[p.x + 1][p.y] == tempZnach-1) {
                    queue.add(new Point2D(p.x + 1, p.y));
                    map[p.x][p.y] = -3;
                    tempZnach = map[p.x + 1][p.y];
                }
                if (map[p.x][p.y + 1] == tempZnach-1) {
                    queue.add(new Point2D(p.x, p.y + 1));
                    map[p.x][p.y] = -3;
                    tempZnach = map[p.x][p.y + 1];
                }
            }

        }

    }
