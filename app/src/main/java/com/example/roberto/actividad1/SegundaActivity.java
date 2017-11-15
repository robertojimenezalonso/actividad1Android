package com.example.roberto.actividad1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by roberto on 15/11/17.
 */

public class SegundaActivity extends AppCompatActivity {
    private String title[];
    private String text[];

    private Button btnBack;
    private Button btnNext;
    private Button btnProfile;
    private EditText txtTitleText;
    private EditText txtText;

    public int pos;

    private SegundaActivityEvents event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_activity);
        this.setPos(0);

        this.setTitle(new String[4]);
        this.setText(new String[4]);
        this.setEvent(new SegundaActivityEvents(this));
        this.infoCollect();

        this.btnBack = (Button) this.findViewById(R.id.btnBack);
        this.btnNext = (Button) this.findViewById(R.id.btnNext);
        this.btnProfile = (Button) this.findViewById(R.id.btnProfile);
        this.txtTitleText = (EditText) this.findViewById(R.id.txtTitleText);
        this.txtText = (EditText) this.findViewById(R.id.mitxttext);
        this.getBtnBack().setText(R.string.btnBack);
        this.getBtnNext().setText(R.string.btnNext);
        this.getBtnProfile().setText(R.string.btnProfile);
        this.getBtnBack().setOnClickListener(this.getEvent());
        this.getBtnNext().setOnClickListener(this.getEvent());
        this.getBtnProfile().setOnClickListener(this.getEvent());
        this.setEditableText(this.getPos());
        this.isComponentEditable(false);


    }

    public void isComponentEditable(Boolean isTrueOrFalse) {
        this.getTxtTitleText().setEnabled(isTrueOrFalse);
        this.getTxtText().setEnabled(isTrueOrFalse);

    }

    public void infoCollect() {
        this.getTitleText()[0]=this.getString(R.string.t1);
        this.getTitleText()[1]=this.getString(R.string.t2);
        this.getTitleText()[2]=this.getString(R.string.t3);
        this.getTitleText()[3]=this.getString(R.string.t4);

        this.getText()[0]=this.getString(R.string.info1);
        this.getText()[1]=this.getString(R.string.info2);
        this.getText()[2]=this.getString(R.string.info3);
        this.getText()[3]=this.getString(R.string.info4);

    }

    public void setEditableText(int pos) {
        this.getTxtTitleText().setText(this.getTitleText()[pos]);
        this.getTxtText().setText(this.getText()[pos]);
    }


    public SegundaActivityEvents getEvent() {
        return event;
    }

    public void setEvent(SegundaActivityEvents event) {
        this.event = event;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Button getBtnProfile() {
        return btnProfile;
    }

    public void setBtnProfile(Button btnProfile) {
        this.btnProfile = btnProfile;
    }

    public Button getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(Button btnBack) {
        this.btnBack = btnBack;
    }

    public Button getBtnNext() {
        return btnNext;
    }

    public void setBtnNext(Button btnNext) {
        this.btnNext = btnNext;
    }

    public EditText getTxtTitleText() {
        return txtTitleText;
    }

    public void setTxtTitleText(EditText txtTitleText) {
        this.txtTitleText = txtTitleText;
    }

    public EditText getTxtText() {
        return txtText;
    }

    public void setTxtText(EditText txtText) {
        this.txtText = txtText;
    }

    public String[] getTitleText() {
        return this.title;
    }

    public void setTitle(String[] title) {
        this.title = title;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

}
