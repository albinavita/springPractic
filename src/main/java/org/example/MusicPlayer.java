package org.example;

import org.example.ClassicalMusic;
import org.example.MusicGenre;
import org.example.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        /*
         *случайное целое число между 0 и 2
         * для выбора номера песни из списка
         */

        int randomNumber = random.nextInt(3);

        switch (genre) {
            case CLASSICAL:
                System.out.println(classicalMusic.getSong().get(randomNumber));
                break;
            case ROCK:
                System.out.println(rockMusic.getSong().get(randomNumber));
                break;
            default:
                System.out.println("Неизвестный жанр");
        }
    }
}
