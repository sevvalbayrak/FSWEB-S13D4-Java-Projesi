public class Main {
    public static void main(String[] args) {
        new Point(3, 1);
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);

        System.out.println("distance()= " + point.distance());

        System.out.println("************************************************");


        System.out.println("------player-------");

        Player player1 = new Player("Ali", 120, Weapon.AXE);
        System.out.println(player1);
        player1.loseHealth(30);
        System.out.println(player1);
        player1.loseHealth(100);
        System.out.println(player1);
        player1.restoreHealth(300);
        System.out.println(player1);

    }


}


