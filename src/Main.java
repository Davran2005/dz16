import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark("Akula"), new Shark("Akula"), new Shark("Akula"),
                new Eagle("Степной орел"), new Eagle("Беркут"), new Eagle("Орёл-могильник "),
                new Turtle("Леонардо"), new Turtle("Рафаэле"), new Turtle("Микеланджело"),};
        Shark[] sharks = new Shark[3];
        Turtle[] turtles = new Turtle[3];
        Eagle[] eagles = new Eagle[3];

        int a = 0;
        int b = 0;
        int e = 0;
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                sharks[a] = (Shark) animal;
                a++;
            } else if (animal instanceof Turtle) {
                turtles[b] = (Turtle) animal;
                b++;
            } else if (animal instanceof Eagle) {
                eagles[e] = (Eagle) animal;
                e++;
            }
        }

        for (Animal animal1 : animals) {
            if (animal1.getClass() == Shark.class) {
                ((Shark) animal1).attack();
            } else if (animal1.getClass() == Turtle.class) {
                ((Turtle) animal1).swim();
            } else if (animal1.getClass() == Eagle.class) {
                ((Eagle) animal1).fly();
            } else {
            }

        }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));
    }
}

