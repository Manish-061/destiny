package oop;

interface Camera{
    void takePhoto();
}

interface MusicPlayer{
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer{
    @Override
    public void takePhoto(){
        System.out.println("Taking Photo .....");
    }

    @Override
    public void playMusic(){
        System.out.println("Playing Music");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.playMusic();
    }
}
