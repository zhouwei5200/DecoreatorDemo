package com.example.zhou.decoratordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //步行去上班
        walk();
        //骑车去上班
        ride();
        /**
         * 走到一半累了，然后打的去上班
         */
        walkAndText();



    }

    private void walkAndText() {
        /**
         * 先是步行，最后走到一半累了，然后打车去上班
         */
        ConcreteConponent concreteConponent = new ConcreteConponent();
        ConcreteDecotatorWalk concreteDecotatorWalk = new ConcreteDecotatorWalk();
        concreteDecotatorWalk.setConponent(concreteConponent);
        ConcreteConponentText concreteConponentText = new ConcreteConponentText();
        concreteConponentText.setConponent(concreteDecotatorWalk);
        concreteConponentText.Operation();
    }

    private void ride() {
        //骑车去上班
        ConcreteConponent concreteConponent = new ConcreteConponent();

        ConcreteDecotatorRide concreteDecotatorB = new ConcreteDecotatorRide();
        concreteDecotatorB.setConponent(concreteConponent);
        concreteDecotatorB.Operation();
    }

    private void walk() {
        //步行去上班
        ConcreteConponent concreteConponent = new ConcreteConponent();
        ConcreteDecotatorWalk concreteDecotatorWalk = new ConcreteDecotatorWalk();
        concreteDecotatorWalk.setConponent(concreteConponent);
        concreteConponent.Operation();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
