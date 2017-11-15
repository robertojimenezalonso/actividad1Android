package com.example.roberto.actividad1;

import android.content.Intent;
import android.view.View;

/**
 * Created by roberto on 15/11/17.
 */

public class MainActivityEvent implements View.OnClickListener {

    private MainActivity mainActivity;



    public MainActivityEvent(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnEdit) {
            this.mainActivity.getBtnEdit().setVisibility(View.GONE);
            this.mainActivity.getBtnSave().setVisibility(View.VISIBLE);

            this.mainActivity.isComponentEditable(true);

        } else if (view.getId() == R.id.btnSave) {

            this.mainActivity.infoCollect();

            this.mainActivity.getBtnSave().setVisibility(View.GONE);
            this.mainActivity.getBtnEdit().setVisibility(View.VISIBLE);
            this.mainActivity.isComponentEditable(false);

            this.mainActivity.setInfoCollect(false);

        }else if(view.getId() == R.id.btnReturn){

            Intent intent = new Intent(this.mainActivity, SegundaActivity.class);
            this.mainActivity.startActivity(intent);
            this.mainActivity.finish();
        }

    }
}
