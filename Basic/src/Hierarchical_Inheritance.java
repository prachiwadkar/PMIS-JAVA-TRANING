
    class shape {
        String color = "blue";

    }

    class circle extends shape{
        void drawCircle(){
            System.out.println("drawing  " + color + " a circle");
        }
    }

    class Rectangle extends shape{
        void drawRectangle(){
            System.out.println("drawing " + color + " a rectangle");
        }
    }


    public class Hierarchical_Inheritance {
        public static void main() {
            circle c = new circle();
            Rectangle r = new Rectangle();

            c.drawCircle();
            r.drawRectangle();

        }
    }

