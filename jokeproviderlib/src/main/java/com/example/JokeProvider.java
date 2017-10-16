package com.example;

import java.util.Random;

public class JokeProvider {
        public String getJoke(String name) {
            Random random= new Random();
            int num=random.nextInt(4);
            String text="Hi "+name+"!\n";
            switch (num) {
                case 0:
                    text+="This is a funny joke 0";
                    break;
                case 1:
                    text+= "This is a funny joke 1";
                    break;
                case 2:
                    text+="This is a funny joke 2";
                    break;
                case 3:
                    text+="This is a funny joke 3";
                    break;
                default:
                    text+= "This is a funny joke";

            }
            return text;
        }

    }
