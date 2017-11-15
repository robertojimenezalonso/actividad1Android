package com.example.roberto.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnReturn, btnEdit, btnSave;
    private EditText txtName, txtEmail, txtTlf, txtAddress;
    private DatePicker datePicker;

    private MainActivityEvent event;


    String name, email, adress;
    int tlf, day, month, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setEvent(new MainActivityEvent(this));

        this.btnReturn = (Button) this.findViewById(R.id.btnReturn);
        this.btnEdit = (Button) this.findViewById(R.id.btnEdit);
        this.btnSave = (Button) this.findViewById(R.id.btnSave);

        this.txtName = (EditText) this.findViewById(R.id.txtName);
        this.txtEmail = (EditText) this.findViewById(R.id.txtEmail);
        this.txtTlf = (EditText) this.findViewById(R.id.txtTlf);
        this.txtAddress = (EditText) this.findViewById(R.id.txtAddress);

        this.datePicker = (DatePicker) this.findViewById(R.id.datePicker);

        this.getBtnReturn().setText(R.string.btnReturn);
        this.getBtnEdit().setText(R.string.btnEdit);
        this.getBtnSave().setText(R.string.btnSave);

        this.isComponentEditable(false);

        this.getBtnEdit().setOnClickListener(this.getEvent());
        this.getBtnSave().setOnClickListener(this.getEvent());
        this.getBtnReturn().setOnClickListener(this.getEvent());

        this.setInfoCollect(true);
    }
    public void isComponentEditable(Boolean isTrueOrFalse) {
        this.getTxtName().setEnabled(isTrueOrFalse);
        this.getTxtEmail().setEnabled(isTrueOrFalse);
        this.getTxtTlf().setEnabled(isTrueOrFalse);
        this.getTxtAddress().setEnabled(isTrueOrFalse);
        this.getDatePicker().setCalendarViewShown(isTrueOrFalse);
        this.getDatePicker().setEnabled(isTrueOrFalse);
        this.getDatePicker().setActivated(isTrueOrFalse);
        this.getDatePicker().setClickable(isTrueOrFalse);
        this.getDatePicker().setSelected(isTrueOrFalse);

    }

    public void infoCollect() {

        this.setName(this.getTxtName().getText().toString());
        this.setEmail(this.getTxtEmail().getText().toString());
        this.setTlf(Integer.parseInt(this.getTxtTlf().getText().toString()));
        this.setAdress(this.getTxtAddress().getText().toString());
        this.setDay(this.getDatePicker().getDayOfMonth());
        this.setMonth(this.getDatePicker().getMonth());
        this.setYear(this.getDatePicker().getYear());
    }

    public void setInfoCollect(boolean init) {
        if (init) {
            this.getTxtName().setText(DataHolder.MyDataHolder.getNameUser());
            this.getTxtEmail().setText(DataHolder.MyDataHolder.getEmail());
            this.getTxtAddress().setText(DataHolder.MyDataHolder.getAddress());
            if (DataHolder.MyDataHolder.getTlf()!=0 && DataHolder.MyDataHolder.getDay()!=0 && DataHolder.MyDataHolder.getMonth()!=0 && DataHolder.MyDataHolder.getYear()!=0) {
                this.getTxtTlf().setText(String.valueOf(DataHolder.MyDataHolder.getTlf()));
                this.getDatePicker().init(DataHolder.MyDataHolder.getYear(), DataHolder.MyDataHolder.getMonth(), DataHolder.MyDataHolder.getDay(), null);
            }
        } else {
            this.getTxtName().setText(this.getName());
            this.getTxtEmail().setText(this.getEmail());
            this.getTxtTlf().setText(String.valueOf(this.getTlf()));
            this.getTxtAddress().setText(this.getAdress());
            this.getDatePicker().init(this.getYear(), this.getMonth(), this.getDay(), null);
        }

    }

    public Button getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(Button btnSave) {
        this.btnSave = btnSave;
    }

    public Button getBtnReturn() {
        return btnReturn;
    }

    public void setBtnReturn(Button btnReturn) {
        this.btnReturn = btnReturn;
    }

    public Button getBtnEdit() {
        return btnEdit;
    }

    public void setBtnEdit(Button btnEdit) {
        this.btnEdit = btnEdit;
    }

    public EditText getTxtName() {
        return txtName;
    }

    public void setTxtName(EditText txtName) {
        this.txtName = txtName;
    }

    public EditText getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(EditText txtEmail) {
        this.txtEmail = txtEmail;
    }

    public EditText getTxtTlf() {
        return txtTlf;
    }

    public void setTxtTlf(EditText txtTlf) {
        this.txtTlf = txtTlf;
    }

    public EditText getTxtAddress() {
        return txtAddress;
    }

    public void setTxtAddress(EditText txtAddress) {
        this.txtAddress = txtAddress;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    public MainActivityEvent getEvent() {
        return event;
    }

    public void setEvent(MainActivityEvent event) {
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        DataHolder.MyDataHolder.nameUser = name;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        DataHolder.MyDataHolder.email = email;
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        DataHolder.MyDataHolder.address = adress;
        this.adress = adress;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        DataHolder.MyDataHolder.tlf = tlf;
        this.tlf = tlf;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        DataHolder.MyDataHolder.day = day;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        DataHolder.MyDataHolder.month = month;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        DataHolder.MyDataHolder.year = year;
        this.year = year;
    }

}
