package com.example.roberto.actividad1;

import android.content.Intent;
import android.view.View;

/**
 * Created by roberto on 15/11/17.
 */

public class SegundaActivityEvents implements View.OnClickListener {
    private SegundaActivity segundaActivity;

    public SegundaActivityEvents(SegundaActivity secondActivity) {
        this.segundaActivity = secondActivity;
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnProfile) {
            Intent intent = new Intent(this.segundaActivity, MainActivity.class);
            this.segundaActivity.startActivity(intent);
            this.segundaActivity.finish();

        } else if (view.getId() == R.id.btnBack) {
            this.segundaActivity.setPos(--this.segundaActivity.pos);
            if (this.segundaActivity.getPos() < 0) {
                this.segundaActivity.setPos(3);
            }
            this.segundaActivity.setEditableText(this.segundaActivity.getPos());


        } else if (view.getId() == R.id.btnNext) {
            this.segundaActivity.setPos(++this.segundaActivity.pos);
            if (this.segundaActivity.getPos() > 3) {
                this.segundaActivity.setPos(0);
            }

            this.segundaActivity.setEditableText(this.segundaActivity.getPos());

        }

    }
}
