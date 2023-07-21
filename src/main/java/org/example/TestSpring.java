package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(MusicGenre.CLASSICAL);
        player.playMusic(MusicGenre.ROCK);

        context.close();
    }
}
