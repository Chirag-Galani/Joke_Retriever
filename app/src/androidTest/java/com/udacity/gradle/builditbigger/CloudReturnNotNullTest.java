package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;

public class CloudReturnNotNullTest extends AndroidTestCase {
    public void isGCEResponseNull()
    {
        String TAG="CloudReturnNotNullTest";
        String joke = null;
        try {
            JokeRetreivalTask jokeRetreivalTask= new JokeRetreivalTask();
            jokeRetreivalTask.execute(new Pair<Context, String>(getContext(), "Manfred"));
           joke = jokeRetreivalTask.get();
            Log.d(TAG, "Joke= " + joke);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(joke);
//        assertEquals("hello", Echo.echo("hello", true));

    }
    }


