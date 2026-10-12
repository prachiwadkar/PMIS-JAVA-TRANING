
class Battery {
    int battery;

    Battery(int battery) {
        this.battery = battery;
    }

    void drain() {
        battery = battery - 100;
        System.out.println("Remaining battery: " + battery + "%");
    }
}

class Camera {
    int pix;

    Camera(int pix) {
        this.pix = pix;
    }

    void takePhoto() {
        System.out.println("Click! Captured a photo with " + pix + " MP sensor");
    }
}

class Phone {
    String brand;
    Battery battery;
    Camera camera;

    Phone(String brand, Battery battery, Camera camera) {
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }

    void snapPicture() {
        System.out.println("[" + brand + "] is active");
        camera.takePhoto();
        battery.drain();
    }
}

public class Practice {
    public static void main(String[] args) {
        Battery phbattery = new Battery(250);
        Camera phcam = new Camera(450);

        Phone motorola = new Phone("Pixel", phbattery, phcam);

        motorola.snapPicture();
    }
}
