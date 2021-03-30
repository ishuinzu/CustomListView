package com.ishuinzu.customlistview;

public class Contact {
    private String txtName;
    private String txtPhone;

    public Contact(String txtName, String txtPhone) {
        this.txtName = txtName;
        this.txtPhone = txtPhone;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtPhone() {
        return txtPhone;
    }

    public void setTxtPhone(String txtPhone) {
        this.txtPhone = txtPhone;
    }
}